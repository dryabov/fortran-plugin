package org.jetbrains.fortran.lang.lexer;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class FortranLexer extends FlexAdapter{
    public final static int INITIAL = _FortranLexer.YYINITIAL;

    public FortranLexer() {
        super(new _FortranLexer((Reader) null, false));
    }
}
