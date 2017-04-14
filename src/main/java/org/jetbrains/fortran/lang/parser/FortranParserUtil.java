package org.jetbrains.fortran.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.parser.GeneratedParserUtilBase;

/**
 * Created by Sergei on 13.04.17.
 * The class for manual parsing of the external rules in the bnf grammar
 * This is a copy of generated grammar to test, how it compiles
 */
public class FortranParserUtil extends GeneratedParserUtilBase {

    public static boolean parseLabel(PsiBuilder builder_, int level_) {
        return new LabelParser().parse(builder_, level_);
    }

    public static boolean parseLabeledDoConstruct(PsiBuilder builder_, int level_) {
        return new LabeledDoConstructParser().parse(builder_, level_);
    }

}