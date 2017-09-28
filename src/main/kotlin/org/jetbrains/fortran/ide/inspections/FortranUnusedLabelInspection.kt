package org.jetbrains.fortran.ide.inspections

import com.intellij.codeInspection.LocalInspectionTool
import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.codeInspection.ProblemsHolder
import com.intellij.openapi.application.runReadAction
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.util.PsiTreeUtil
import org.jetbrains.fortran.ide.inspections.fixes.SubstituteTextFix
import org.jetbrains.fortran.lang.psi.FortranFile
import org.jetbrains.fortran.lang.psi.FortranLabelDecl
import org.jetbrains.fortran.lang.psi.FortranProgramUnit
import org.jetbrains.fortran.lang.psi.FortranVisitor
import org.jetbrains.fortran.lang.psi.ext.smartPointer
import org.jetbrains.fortran.lang.psi.impl.FortranLabelDeclImpl
import org.jetbrains.fortran.lang.psi.impl.FortranLabelImpl
import org.jetbrains.fortran.lang.psi.mixin.FortranLabelImplMixin
import org.jetbrains.fortran.lang.resolve.FortranLabelReferenceImpl

class FortranUnusedLabelInspection : LocalInspectionTool() {
    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean): FortranVisitor {
        return object : FortranVisitor() {

            override fun visitLabelDecl(label: FortranLabelDecl) {
                // custom searcher for leading zeros
                val unit = runReadAction{ PsiTreeUtil.getParentOfType(label, FortranProgramUnit::class.java)}
                val results = runReadAction{ PsiTreeUtil.findChildrenOfType(unit, FortranLabelImpl::class.java)
                }.filter { (label as FortranLabelDeclImpl).getLabelValue() == it.getLabelValue() }
                        .map{ FortranLabelReferenceImpl(it as FortranLabelImplMixin) }

                if (results.isEmpty()) {
                    val lastElement = if (label.nextSibling.node.elementType != TokenType.WHITE_SPACE) label else label.nextSibling
                    if (runReadAction{ PsiTreeUtil.getParentOfType(label, PsiFile::class.java)} is FortranFile) {
                        holder.registerProblem(label, "Unused label declaration", ProblemHighlightType.LIKE_UNUSED_SYMBOL,
                                SubstituteTextFix(label.smartPointer(), lastElement.smartPointer(), "", "Delete label declaration"))
                    } else {
                        holder.registerProblem(label, "Unused label declaration", ProblemHighlightType.LIKE_UNUSED_SYMBOL,
                                SubstituteTextFix(label.smartPointer(), " ".repeat(label.textLength), "Delete label declaration"))
                    }
                }
            }
        }
    }
}