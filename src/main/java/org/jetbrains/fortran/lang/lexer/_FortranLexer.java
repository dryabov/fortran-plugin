/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package org.jetbrains.fortran.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import java.util.Stack;

import static org.jetbrains.fortran.lang.FortranTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>C:/development/fortran-plugin/src/main/java/org/jetbrains/fortran/lang/lexer/FortranLexer.flex</tt>
 */
class _FortranLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 13792 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\11\1\12\1\13\6\14\1\15\23\14\1\16"+
    "\1\14\1\17\1\20\12\14\1\21\10\11\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
    "\32\1\11\1\33\1\34\2\11\1\14\1\35\3\11\1\36\10\11\1\37\1\40\20\11\1\41\2\11"+
    "\1\42\5\11\1\43\4\11\1\44\1\45\4\11\51\14\1\46\3\14\1\47\1\50\4\14\1\51\12"+
    "\11\1\52\u0381\11");

  /* The ZZ_CMAP_Y table has 2752 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\1\1\10\1\11\1\12\1\13\1\12\1\13\3\12\1"+
    "\14\3\12\1\15\24\12\1\16\1\17\1\20\10\1\1\21\1\22\1\12\1\23\4\12\1\24\10\12"+
    "\1\25\12\12\1\26\1\12\1\27\1\26\1\12\1\30\4\1\1\12\1\31\1\32\2\1\2\12\1\31"+
    "\1\1\1\33\1\26\5\12\1\34\1\35\1\36\1\1\1\37\1\12\1\1\1\40\5\12\1\41\1\42\1"+
    "\43\1\12\1\31\1\44\1\12\1\45\1\46\1\1\1\12\1\47\4\1\1\12\1\50\4\1\1\51\2\12"+
    "\1\52\1\1\1\53\1\54\1\26\1\55\1\56\1\57\1\60\1\61\1\62\1\54\1\17\1\63\1\56"+
    "\1\57\1\64\1\1\1\65\1\66\1\67\1\70\1\23\1\57\1\71\1\1\1\72\1\54\1\73\1\74"+
    "\1\56\1\57\1\71\1\1\1\62\1\54\1\42\1\75\1\76\1\77\1\100\1\1\1\72\1\66\1\1"+
    "\1\101\1\37\1\57\1\52\1\1\1\102\1\54\1\1\1\101\1\37\1\57\1\103\1\1\1\61\1"+
    "\54\1\104\1\101\1\37\1\12\1\105\1\61\1\106\1\54\1\107\1\110\1\111\1\12\1\112"+
    "\1\113\1\1\1\66\1\1\1\26\2\12\1\114\1\113\1\115\2\1\1\116\1\117\1\120\1\121"+
    "\1\122\1\123\2\1\1\72\1\1\1\115\1\1\1\124\1\12\1\125\1\1\1\126\7\1\2\12\1"+
    "\31\1\106\1\115\1\127\1\130\1\131\1\132\1\115\2\12\1\133\2\12\1\134\24\12"+
    "\1\135\1\136\2\12\1\135\2\12\1\137\1\140\1\13\3\12\1\140\3\12\1\31\2\1\1\12"+
    "\1\1\5\12\1\141\1\26\45\12\1\142\1\12\1\26\1\31\4\12\1\31\1\143\1\144\1\17"+
    "\1\12\1\17\1\12\1\17\1\144\1\72\3\12\1\145\1\1\1\146\1\115\2\1\1\115\5\12"+
    "\1\30\2\12\1\147\4\12\1\41\1\12\1\150\2\1\1\66\1\12\1\151\1\50\2\12\1\152"+
    "\1\12\1\100\1\115\2\1\1\12\1\113\3\12\1\50\2\1\2\115\1\153\5\1\1\110\2\12"+
    "\1\145\1\154\1\115\2\1\1\155\1\12\1\156\1\43\2\12\1\41\1\1\2\12\1\145\1\1"+
    "\1\157\1\43\1\12\1\151\6\1\1\160\1\161\14\12\4\1\21\12\1\141\2\12\1\141\1"+
    "\162\1\12\1\151\3\12\1\163\1\164\1\165\1\125\1\164\7\1\1\166\1\1\1\125\6\1"+
    "\1\167\1\170\1\171\1\172\1\173\3\1\1\174\147\1\2\12\1\150\2\12\1\150\10\12"+
    "\1\175\1\176\2\12\1\133\3\12\1\177\1\1\1\12\1\113\4\200\4\1\1\106\35\1\1\201"+
    "\2\1\1\202\1\26\4\12\1\203\1\26\4\12\1\134\1\110\1\12\1\151\1\26\4\12\1\150"+
    "\1\1\1\12\1\31\3\1\1\12\40\1\133\12\1\41\4\1\135\12\1\41\2\1\10\12\1\125\4"+
    "\1\2\12\1\151\20\12\1\125\1\12\1\204\1\1\2\12\1\150\1\106\1\12\1\151\4\12"+
    "\1\41\2\1\1\205\1\206\5\12\1\207\1\12\1\151\1\30\3\1\1\205\1\210\1\12\1\32"+
    "\1\1\3\12\1\145\1\206\2\12\1\145\1\1\1\115\1\1\1\211\1\43\1\12\1\41\1\12\1"+
    "\113\1\1\1\12\1\125\1\51\2\12\1\32\1\106\1\115\1\212\1\213\2\12\1\47\1\1\1"+
    "\214\1\115\1\12\1\215\3\12\1\216\1\217\1\220\1\31\1\67\1\221\1\222\1\200\2"+
    "\12\1\134\1\41\7\12\1\32\1\115\72\12\1\145\1\12\1\223\2\12\1\152\20\1\26\12"+
    "\1\151\6\12\1\100\2\1\1\113\1\224\1\57\1\225\1\226\6\12\1\17\1\1\1\155\25"+
    "\12\1\151\1\1\4\12\1\206\2\12\1\30\2\1\1\152\7\1\1\212\7\12\1\125\1\1\1\115"+
    "\1\26\1\31\1\26\1\31\1\227\4\12\1\150\1\230\1\231\2\1\1\232\1\12\1\13\1\233"+
    "\2\151\2\1\7\12\1\31\30\1\1\12\1\125\3\12\1\72\2\1\2\12\1\1\1\12\1\234\2\12"+
    "\1\41\1\12\1\151\2\12\1\235\3\1\11\12\1\151\1\115\5\1\2\12\1\30\3\12\1\145"+
    "\11\1\23\12\1\113\1\12\1\41\1\30\11\1\1\236\2\12\1\237\1\12\1\41\1\12\1\113"+
    "\1\12\1\150\4\1\1\12\1\240\1\12\1\41\1\12\1\100\4\1\3\12\1\241\4\1\1\72\1"+
    "\242\1\12\1\145\2\1\1\12\1\125\1\12\1\125\2\1\1\124\1\12\1\50\1\1\3\12\1\41"+
    "\1\12\1\41\1\12\1\32\1\12\1\17\6\1\4\12\1\47\3\1\3\12\1\32\3\12\1\32\60\1"+
    "\1\155\2\12\1\30\2\1\1\66\1\1\1\155\2\12\2\1\1\12\1\47\1\115\1\155\1\12\1"+
    "\113\1\66\1\1\2\12\1\243\1\155\2\12\1\32\1\244\1\245\2\1\1\12\1\23\1\152\5"+
    "\1\1\246\1\247\1\47\2\12\1\150\1\1\1\115\1\74\1\56\1\57\1\71\1\1\1\250\1\17"+
    "\21\1\3\12\1\1\1\251\1\115\12\1\2\12\1\150\2\1\1\252\2\1\3\12\1\1\1\253\1"+
    "\115\2\1\2\12\1\31\1\1\1\115\3\1\1\12\1\100\1\1\1\115\26\1\4\12\1\115\1\106"+
    "\34\1\3\12\1\47\20\1\71\12\1\100\16\1\14\12\1\145\53\1\2\12\1\150\75\1\44"+
    "\12\1\113\33\1\43\12\1\47\1\12\1\150\1\115\6\1\1\12\1\151\1\1\3\12\1\1\1\145"+
    "\1\115\1\155\1\254\1\12\67\1\4\12\1\50\1\72\3\1\1\155\6\1\1\17\77\1\6\12\1"+
    "\31\1\125\1\47\1\100\66\1\5\12\1\212\3\12\1\144\1\255\1\256\1\257\3\12\1\260"+
    "\1\261\1\12\1\262\1\263\1\37\24\12\1\264\1\12\1\37\1\134\1\12\1\134\1\12\1"+
    "\212\1\12\1\212\1\150\1\12\1\150\1\12\1\57\1\12\1\57\1\12\1\265\3\266\14\12"+
    "\1\50\123\1\1\257\1\12\1\267\1\270\1\271\1\272\1\273\1\274\1\275\1\152\1\276"+
    "\1\152\24\1\55\12\1\113\2\1\103\12\1\50\15\12\1\151\150\12\1\17\25\1\41\12"+
    "\1\151\36\1");

  /* The ZZ_CMAP_A table has 3056 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\17\1\6\1\0\1\5\1\4\22\0\1\10\1\3\1\20\1\0\1\35\1\36\1\22\1\21\1\30"+
    "\1\31\1\27\1\13\1\34\1\14\1\11\1\25\12\7\1\26\1\23\1\37\1\24\1\40\1\41\1\0"+
    "\1\46\1\66\1\60\1\47\1\42\1\56\1\54\1\61\1\65\1\2\1\67\1\53\1\62\1\45\1\50"+
    "\1\63\1\43\1\51\1\57\1\52\1\55\1\44\1\70\1\64\2\2\1\32\1\16\1\33\1\0\1\1\1"+
    "\0\1\46\1\66\1\60\1\15\1\12\1\56\1\54\1\61\1\65\1\2\1\67\1\53\1\62\1\45\1"+
    "\50\1\63\1\43\1\51\1\57\1\52\1\55\1\44\1\70\1\64\2\2\17\0\1\2\12\0\1\2\4\0"+
    "\1\2\5\0\27\2\1\0\10\2\2\65\35\2\1\57\2\2\4\0\14\2\16\0\5\2\7\0\1\2\1\0\1"+
    "\2\1\0\5\2\1\0\2\2\2\0\4\2\1\0\1\2\6\0\1\2\1\0\3\2\1\0\1\2\1\0\4\2\1\0\23"+
    "\2\1\0\13\2\10\0\6\2\1\0\26\2\2\0\1\2\6\0\10\2\10\0\13\2\5\0\3\2\15\0\12\1"+
    "\4\0\6\2\1\0\1\2\17\0\2\2\7\0\2\2\12\1\3\2\2\0\2\2\1\0\16\2\15\0\11\2\13\0"+
    "\1\2\16\0\12\1\6\2\4\0\2\2\4\0\1\2\5\0\6\2\4\0\1\2\11\0\1\2\3\0\1\2\7\0\11"+
    "\2\7\0\5\2\17\0\26\2\3\0\1\2\2\0\1\2\7\0\12\2\4\0\12\1\1\2\4\0\10\2\2\0\2"+
    "\2\2\0\26\2\1\0\7\2\1\0\1\2\3\0\4\2\3\0\1\2\20\0\1\2\15\0\2\2\1\0\1\2\5\0"+
    "\6\2\4\0\2\2\1\0\2\2\1\0\2\2\1\0\2\2\17\0\4\2\1\0\1\2\7\0\12\1\2\0\3\2\20"+
    "\0\11\2\1\0\2\2\1\0\2\2\1\0\5\2\3\0\1\2\2\0\1\2\30\0\1\2\13\0\10\2\2\0\1\2"+
    "\3\0\1\2\1\0\6\2\3\0\3\2\1\0\4\2\3\0\2\2\1\0\1\2\1\0\2\2\3\0\2\2\3\0\3\2\3"+
    "\0\14\2\13\0\10\2\1\0\2\2\10\0\3\2\5\0\4\2\1\0\5\2\3\0\1\2\3\0\2\2\15\0\13"+
    "\2\2\0\1\2\21\0\1\2\12\0\6\2\5\0\22\2\3\0\10\2\1\0\11\2\1\0\1\2\2\0\7\2\11"+
    "\0\1\2\1\0\2\2\14\0\12\1\7\0\2\2\1\0\1\2\2\0\2\2\1\0\1\2\2\0\1\2\6\0\4\2\1"+
    "\0\7\2\1\0\3\2\1\0\1\2\1\0\1\2\2\0\2\2\1\0\4\2\1\0\2\2\11\0\1\2\2\0\5\2\1"+
    "\0\1\2\11\0\12\1\2\0\14\2\1\0\24\2\13\0\5\2\3\0\6\2\4\0\4\2\3\0\1\2\3\0\2"+
    "\2\7\0\3\2\4\0\15\2\14\0\1\2\1\0\6\2\1\0\1\2\5\0\1\2\2\0\13\2\1\0\15\2\1\0"+
    "\4\2\2\0\7\2\1\0\1\2\1\0\4\2\2\0\1\2\1\0\4\2\2\0\7\2\1\0\1\2\1\0\4\2\2\0\16"+
    "\2\2\0\6\2\2\0\15\2\2\0\1\2\1\0\10\2\7\0\15\2\1\0\6\2\23\0\1\2\4\0\1\2\3\0"+
    "\11\2\1\0\1\2\5\0\17\2\1\0\16\2\2\0\14\2\13\0\1\2\15\0\7\2\7\0\16\2\15\0\2"+
    "\2\12\1\3\0\3\2\11\0\4\2\1\0\4\2\3\0\2\2\11\0\10\2\1\0\1\2\1\0\1\2\1\0\1\2"+
    "\1\0\6\2\1\0\7\2\1\0\1\2\3\0\3\2\1\0\7\2\3\0\4\2\2\0\6\2\5\0\1\2\15\0\1\2"+
    "\2\0\1\2\4\0\1\2\2\0\12\2\1\0\1\2\3\0\5\2\6\0\1\2\1\0\1\2\1\0\1\2\1\0\1\67"+
    "\3\2\1\0\13\2\2\0\4\2\5\0\5\2\4\0\1\2\4\0\2\2\13\0\5\2\6\0\4\2\3\0\2\2\14"+
    "\0\10\2\7\0\10\2\1\0\7\2\6\0\2\2\12\0\5\2\5\0\2\2\3\0\7\2\6\0\3\2\12\1\2\2"+
    "\13\0\11\2\2\0\27\2\2\0\7\2\1\0\3\2\1\0\4\2\1\0\4\2\2\0\6\2\3\0\1\2\1\0\1"+
    "\2\2\0\5\2\1\0\12\2\12\1\5\2\1\0\3\2\1\0\10\2\4\0\7\2\3\0\1\2\3\0\2\2\1\0"+
    "\1\2\3\0\2\2\2\0\5\2\2\0\1\2\1\0\1\2\30\0\3\2\3\0\6\2\2\0\6\2\2\0\6\2\11\0"+
    "\7\2\4\0\5\2\3\0\5\2\5\0\1\2\1\0\10\2\1\0\5\2\1\0\1\2\1\0\2\2\1\0\2\2\1\0"+
    "\12\2\6\0\12\2\2\0\6\2\2\0\6\2\2\0\6\2\2\0\3\2\3\0\14\2\1\0\16\2\1\0\2\2\1"+
    "\0\2\2\1\0\10\2\6\0\4\2\4\0\16\2\2\0\1\2\1\0\14\2\1\0\2\2\3\0\1\2\2\0\4\2"+
    "\1\0\2\2\12\0\10\2\6\0\6\2\1\0\3\2\1\0\12\2\3\0\1\2\12\0\4\2\13\0\12\1\1\2"+
    "\1\0\1\2\3\0\7\2\1\0\1\2\1\0\4\2\1\0\17\2\1\0\2\2\14\0\3\2\4\0\2\2\1\0\1\2"+
    "\20\0\4\2\10\0\1\2\13\0\10\2\5\0\3\2\2\0\1\2\2\0\2\2\2\0\4\2\1\0\14\2\1\0"+
    "\1\2\1\0\7\2\1\0\21\2\1\0\4\2\2\0\10\2\1\0\7\2\1\0\14\2\1\0\4\2\1\0\5\2\1"+
    "\0\1\2\3\0\14\2\2\0\13\2\1\0\10\2\2\0\22\1\1\0\2\2\1\0\1\2\2\0\1\2\1\0\12"+
    "\2\1\0\4\2\1\0\1\2\1\0\1\2\6\0\1\2\4\0\1\2\1\0\1\2\1\0\1\2\1\0\3\2\1\0\2\2"+
    "\1\0\1\2\2\0\1\2\1\0\1\2\1\0\1\2\1\0\1\2\1\0\1\2\1\0\2\2\1\0\1\2\2\0\4\2\1"+
    "\0\7\2\1\0\4\2\1\0\4\2\1\0\1\2\1\0\12\2\1\0\5\2\1\0\3\2\1\0\5\2\1\0\5\2");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\1"+
    "\1\7\1\10\1\1\2\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\10\1\2\0\1\31\13\0\2\1"+
    "\1\32\3\11\1\4\1\0\1\4\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\7\1\1\42\2\1\1\31"+
    "\1\0\1\43\14\0\1\44\2\1\2\11\13\1\4\0"+
    "\1\45\1\0\1\26\1\27\1\0\3\1\1\46\1\1"+
    "\1\47\1\50\10\1\1\51\1\1\1\52\1\0\1\53"+
    "\1\54\2\0\1\55\1\1\1\56\12\1\1\57\1\60"+
    "\1\61\1\0\1\1\1\62\1\63\10\1\1\64\1\1"+
    "\1\65\2\1\1\66\2\1\1\67\1\70\1\1\1\71"+
    "\5\1\1\72\1\73\1\74\1\75";

  private static int [] zzUnpackAction() {
    int [] result = new int[188];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\71\0\162\0\253\0\344\0\u011d\0\u0156\0\u018f"+
    "\0\u01c8\0\u01c8\0\u0201\0\u023a\0\u0273\0\u02ac\0\u02e5\0\u031e"+
    "\0\u0357\0\u0390\0\u01c8\0\u01c8\0\u01c8\0\u01c8\0\u01c8\0\u01c8"+
    "\0\u01c8\0\u03c9\0\u0402\0\u01c8\0\u043b\0\u0474\0\u04ad\0\u04e6"+
    "\0\u051f\0\u0558\0\u0591\0\u05ca\0\253\0\u0603\0\u063c\0\u0675"+
    "\0\u06ae\0\u06e7\0\u0720\0\u0759\0\u0792\0\u07cb\0\u0804\0\u083d"+
    "\0\u0876\0\u08af\0\u08e8\0\u0921\0\u095a\0\u0993\0\u01c8\0\u09cc"+
    "\0\u0a05\0\u02ac\0\u01c8\0\u01c8\0\u01c8\0\u01c8\0\u01c8\0\u01c8"+
    "\0\u01c8\0\u01c8\0\u0a3e\0\u0a77\0\u0ab0\0\u0ae9\0\u0b22\0\u0b5b"+
    "\0\u0b94\0\71\0\u0bcd\0\u0c06\0\u0c3f\0\u0c3f\0\u0c78\0\u0c78"+
    "\0\u0cb1\0\u0cea\0\u0d23\0\u0d5c\0\u0d95\0\u0dce\0\u0e07\0\u0e40"+
    "\0\u0e79\0\u0eb2\0\u0eeb\0\u0f24\0\u0f5d\0\u0f96\0\u0fcf\0\u1008"+
    "\0\u1041\0\u107a\0\u10b3\0\u10ec\0\u1125\0\u115e\0\u1197\0\u11d0"+
    "\0\u1209\0\u1242\0\u127b\0\u12b4\0\u12ed\0\u1326\0\u135f\0\u01c8"+
    "\0\u1398\0\u01c8\0\u01c8\0\u13d1\0\u140a\0\u1443\0\u147c\0\u14b5"+
    "\0\u14ee\0\71\0\71\0\u1527\0\u1560\0\u1599\0\u15d2\0\u160b"+
    "\0\u1644\0\u167d\0\u16b6\0\71\0\u16ef\0\u01c8\0\u1728\0\u01c8"+
    "\0\u01c8\0\u1761\0\u179a\0\71\0\u17d3\0\71\0\u180c\0\u1845"+
    "\0\u187e\0\u18b7\0\u18f0\0\u1929\0\u1962\0\u199b\0\u19d4\0\u1a0d"+
    "\0\71\0\u01c8\0\u01c8\0\u1a46\0\u1a7f\0\71\0\71\0\u1ab8"+
    "\0\u1af1\0\u1b2a\0\u1b63\0\u1b9c\0\u1bd5\0\u1c0e\0\u1c47\0\u01c8"+
    "\0\u1c80\0\71\0\u1cb9\0\u1cf2\0\71\0\u1d2b\0\u1d64\0\71"+
    "\0\71\0\u1d9d\0\71\0\u1dd6\0\u1e0f\0\u1e48\0\u1e81\0\u1eba"+
    "\0\71\0\71\0\71\0\71";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[188];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\0\1\2\1\3\1\4\1\5\1\4\1\6\1\5"+
    "\1\7\1\10\1\11\1\12\1\13\1\0\1\5\1\14"+
    "\1\15\1\16\1\4\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\10\4\2\1\13\1\2\1\35\1\36\1\37"+
    "\4\2\1\40\2\2\1\41\1\2\1\42\1\2\1\43"+
    "\1\44\1\0\2\2\4\0\1\2\2\0\1\2\2\0"+
    "\1\2\24\0\27\2\4\3\1\0\1\3\1\0\62\3"+
    "\4\0\1\4\1\45\1\4\1\0\1\45\6\0\1\45"+
    "\3\0\1\4\51\0\1\4\1\5\1\4\1\0\1\5"+
    "\6\0\1\5\3\0\1\4\54\0\1\6\1\46\1\47"+
    "\1\50\2\0\1\51\62\0\1\47\1\52\1\0\1\53"+
    "\27\0\1\53\2\0\1\54\1\55\1\0\1\56\1\0"+
    "\1\57\1\60\1\61\1\0\1\62\13\0\2\2\4\0"+
    "\1\2\2\0\1\2\2\0\1\2\24\0\3\2\1\63"+
    "\5\2\1\64\15\2\72\0\2\2\4\0\1\2\2\0"+
    "\1\2\2\0\1\2\24\0\6\2\1\65\20\2\6\14"+
    "\1\0\7\14\1\66\1\14\1\67\50\14\6\15\1\0"+
    "\7\15\1\70\2\15\1\67\47\15\4\0\1\71\1\72"+
    "\1\73\1\0\1\72\6\0\1\72\75\0\1\74\70\0"+
    "\1\75\1\76\71\0\1\77\71\0\1\100\65\0\1\101"+
    "\70\0\1\102\45\0\2\2\4\0\1\2\2\0\1\103"+
    "\2\0\1\2\24\0\1\103\26\2\1\0\2\2\4\0"+
    "\1\2\2\0\1\2\2\0\1\2\24\0\17\2\1\104"+
    "\7\2\1\0\2\2\4\0\1\2\2\0\1\2\2\0"+
    "\1\2\24\0\6\2\1\105\20\2\1\0\2\2\4\0"+
    "\1\2\2\0\1\2\2\0\1\2\24\0\6\2\1\106"+
    "\10\2\1\107\7\2\1\0\2\2\4\0\1\2\2\0"+
    "\1\2\2\0\1\2\24\0\7\2\1\110\17\2\1\0"+
    "\2\2\4\0\1\2\2\0\1\2\2\0\1\2\24\0"+
    "\3\2\1\111\10\2\1\112\12\2\1\0\2\2\4\0"+
    "\1\2\2\0\1\2\2\0\1\2\24\0\23\2\1\113"+
    "\3\2\1\0\2\2\4\0\1\2\2\0\1\2\2\0"+
    "\1\2\24\0\17\2\1\114\7\2\7\0\1\6\1\46"+
    "\1\47\66\0\1\47\1\52\1\0\1\50\2\0\1\51"+
    "\62\0\1\115\1\50\2\0\2\116\63\0\1\117\1\51"+
    "\2\0\2\120\63\0\1\47\1\52\123\0\1\121\37\0"+
    "\1\122\27\0\1\122\5\0\1\123\65\0\1\124\74\0"+
    "\1\125\70\0\1\126\31\0\1\127\27\0\1\127\7\0"+
    "\1\130\30\0\1\131\27\0\1\131\7\0\1\132\64\0"+
    "\1\133\23\0\2\2\4\0\1\2\2\0\1\2\2\0"+
    "\1\134\24\0\5\2\1\134\21\2\1\0\2\2\4\0"+
    "\1\2\2\0\1\2\2\0\1\2\24\0\15\2\1\135"+
    "\11\2\1\0\2\2\4\0\1\2\2\0\1\2\2\0"+
    "\1\2\24\0\13\2\1\136\13\2\10\14\1\137\6\14"+
    "\1\137\51\14\10\15\1\140\6\15\1\140\51\15\6\0"+
    "\1\73\63\0\2\2\4\0\1\2\2\0\1\2\2\0"+
    "\1\2\24\0\4\2\1\141\22\2\1\0\2\2\4\0"+
    "\1\2\2\0\1\142\2\0\1\2\24\0\1\142\26\2"+
    "\1\0\2\2\4\0\1\2\2\0\1\2\2\0\1\2"+
    "\24\0\12\2\1\143\14\2\1\0\2\2\4\0\1\2"+
    "\2\0\1\2\2\0\1\2\24\0\3\2\1\144\14\2"+
    "\1\145\6\2\1\0\2\2\4\0\1\2\2\0\1\2"+
    "\2\0\1\2\24\0\4\2\1\146\22\2\1\0\2\2"+
    "\4\0\1\2\2\0\1\147\2\0\1\2\24\0\1\147"+
    "\5\2\1\150\20\2\1\0\2\2\4\0\1\2\2\0"+
    "\1\2\2\0\1\2\24\0\10\2\1\151\16\2\1\0"+
    "\2\2\4\0\1\2\2\0\1\2\2\0\1\2\24\0"+
    "\3\2\1\152\23\2\1\0\2\2\4\0\1\2\2\0"+
    "\1\2\2\0\1\2\24\0\23\2\1\153\3\2\7\0"+
    "\1\115\1\116\67\0\1\117\1\120\71\0\1\74\32\0"+
    "\1\154\35\0\1\75\31\0\1\155\77\0\1\156\33\0"+
    "\1\157\31\0\1\157\32\0\1\160\134\0\1\161\24\0"+
    "\1\101\70\0\1\162\70\0\1\102\70\0\1\163\132\0"+
    "\1\164\16\0\2\2\4\0\1\2\2\0\1\2\2\0"+
    "\1\165\24\0\5\2\1\165\13\2\1\166\1\2\1\167"+
    "\3\2\1\0\2\2\4\0\1\2\2\0\1\170\2\0"+
    "\1\2\24\0\1\170\26\2\1\0\2\2\4\0\1\2"+
    "\2\0\1\2\2\0\1\2\24\0\24\2\1\171\2\2"+
    "\10\14\1\137\5\14\1\66\1\137\1\67\50\14\10\15"+
    "\1\140\5\15\1\70\1\140\1\15\1\67\47\15\1\0"+
    "\2\2\4\0\1\2\2\0\1\2\2\0\1\2\24\0"+
    "\11\2\1\172\15\2\1\0\2\2\4\0\1\2\2\0"+
    "\1\2\2\0\1\2\24\0\3\2\1\173\23\2\1\0"+
    "\2\2\4\0\1\2\2\0\1\2\2\0\1\2\24\0"+
    "\23\2\1\174\3\2\1\0\2\2\4\0\1\2\2\0"+
    "\1\2\2\0\1\2\24\0\10\2\1\175\5\2\1\176"+
    "\10\2\1\0\2\2\4\0\1\2\2\0\1\2\2\0"+
    "\1\2\24\0\21\2\1\177\5\2\1\0\2\2\4\0"+
    "\1\2\2\0\1\2\2\0\1\2\24\0\7\2\1\200"+
    "\17\2\1\0\2\2\4\0\1\2\2\0\1\2\2\0"+
    "\1\2\24\0\16\2\1\201\10\2\1\0\2\2\4\0"+
    "\1\2\2\0\1\2\2\0\1\2\24\0\12\2\1\202"+
    "\14\2\1\0\2\2\4\0\1\2\2\0\1\203\2\0"+
    "\1\2\24\0\1\203\26\2\1\0\2\2\4\0\1\2"+
    "\2\0\1\2\2\0\1\204\24\0\5\2\1\204\21\2"+
    "\1\0\2\2\4\0\1\2\2\0\1\2\2\0\1\2"+
    "\24\0\11\2\1\205\15\2\11\0\1\206\123\0\1\207"+
    "\35\0\1\210\70\0\1\211\71\0\1\212\27\0\1\212"+
    "\105\0\1\213\12\0\2\2\4\0\1\2\2\0\1\2"+
    "\2\0\1\2\24\0\6\2\1\214\20\2\1\0\2\2"+
    "\4\0\1\2\2\0\1\2\2\0\1\2\24\0\7\2"+
    "\1\215\17\2\1\0\2\2\4\0\1\2\2\0\1\2"+
    "\2\0\1\2\24\0\14\2\1\216\12\2\1\0\2\2"+
    "\4\0\1\2\2\0\1\2\2\0\1\2\24\0\23\2"+
    "\1\217\3\2\1\0\2\2\4\0\1\2\2\0\1\2"+
    "\2\0\1\2\24\0\11\2\1\220\15\2\1\0\2\2"+
    "\4\0\1\2\2\0\1\2\2\0\1\2\24\0\16\2"+
    "\1\221\10\2\1\0\2\2\4\0\1\2\2\0\1\2"+
    "\2\0\1\2\24\0\23\2\1\222\3\2\1\0\2\2"+
    "\4\0\1\2\2\0\1\2\2\0\1\2\24\0\13\2"+
    "\1\223\13\2\1\0\2\2\4\0\1\2\2\0\1\2"+
    "\2\0\1\2\24\0\11\2\1\224\15\2\1\0\2\2"+
    "\4\0\1\2\2\0\1\2\2\0\1\2\24\0\4\2"+
    "\1\225\22\2\1\0\2\2\4\0\1\2\2\0\1\2"+
    "\2\0\1\2\24\0\23\2\1\226\3\2\1\0\2\2"+
    "\4\0\1\2\2\0\1\2\2\0\1\2\24\0\7\2"+
    "\1\227\17\2\1\0\2\2\4\0\1\2\2\0\1\2"+
    "\2\0\1\2\24\0\12\2\1\230\14\2\1\0\2\2"+
    "\4\0\1\2\2\0\1\231\2\0\1\2\24\0\1\231"+
    "\26\2\11\0\1\232\70\0\1\233\71\0\1\234\27\0"+
    "\1\234\27\0\2\2\4\0\1\2\2\0\1\2\2\0"+
    "\1\2\24\0\6\2\1\235\20\2\1\0\2\2\4\0"+
    "\1\2\2\0\1\2\2\0\1\2\24\0\14\2\1\236"+
    "\12\2\1\0\2\2\4\0\1\2\2\0\1\237\2\0"+
    "\1\2\24\0\1\237\26\2\1\0\2\2\4\0\1\2"+
    "\2\0\1\2\2\0\1\2\24\0\4\2\1\240\22\2"+
    "\1\0\2\2\4\0\1\2\2\0\1\2\2\0\1\2"+
    "\24\0\3\2\1\241\23\2\1\0\2\2\4\0\1\2"+
    "\2\0\1\2\2\0\1\2\24\0\7\2\1\242\17\2"+
    "\1\0\2\2\4\0\1\2\2\0\1\243\2\0\1\2"+
    "\24\0\1\243\26\2\1\0\2\2\4\0\1\2\2\0"+
    "\1\2\2\0\1\2\24\0\16\2\1\244\10\2\1\0"+
    "\2\2\4\0\1\2\2\0\1\2\2\0\1\2\24\0"+
    "\15\2\1\245\11\2\1\0\2\2\4\0\1\2\2\0"+
    "\1\2\2\0\1\2\24\0\4\2\1\246\22\2\1\0"+
    "\2\2\4\0\1\2\2\0\1\247\2\0\1\2\24\0"+
    "\1\247\26\2\11\0\1\250\60\0\2\2\4\0\1\2"+
    "\2\0\1\2\2\0\1\2\24\0\12\2\1\251\14\2"+
    "\1\0\2\2\4\0\1\2\2\0\1\2\2\0\1\2"+
    "\24\0\11\2\1\252\15\2\1\0\2\2\4\0\1\2"+
    "\2\0\1\2\2\0\1\2\24\0\13\2\1\253\13\2"+
    "\1\0\2\2\4\0\1\2\2\0\1\2\2\0\1\2"+
    "\24\0\7\2\1\254\17\2\1\0\2\2\4\0\1\2"+
    "\2\0\1\2\2\0\1\2\24\0\22\2\1\255\4\2"+
    "\1\0\2\2\4\0\1\2\2\0\1\2\2\0\1\2"+
    "\24\0\10\2\1\256\16\2\1\0\2\2\4\0\1\2"+
    "\2\0\1\2\2\0\1\2\24\0\23\2\1\257\3\2"+
    "\1\0\2\2\4\0\1\2\2\0\1\2\2\0\1\2"+
    "\24\0\20\2\1\260\6\2\1\0\2\2\4\0\1\2"+
    "\2\0\1\2\2\0\1\2\24\0\7\2\1\261\17\2"+
    "\1\0\2\2\4\0\1\2\2\0\1\2\2\0\1\2"+
    "\24\0\7\2\1\262\17\2\1\0\2\2\4\0\1\2"+
    "\2\0\1\263\2\0\1\2\24\0\1\263\26\2\1\0"+
    "\2\2\4\0\1\2\2\0\1\264\2\0\1\2\24\0"+
    "\1\264\26\2\1\0\2\2\4\0\1\2\2\0\1\265"+
    "\2\0\1\2\24\0\1\265\26\2\1\0\2\2\4\0"+
    "\1\2\2\0\1\2\2\0\1\2\24\0\6\2\1\266"+
    "\20\2\1\0\2\2\4\0\1\2\2\0\1\2\2\0"+
    "\1\2\24\0\4\2\1\267\22\2\1\0\2\2\4\0"+
    "\1\2\2\0\1\2\2\0\1\2\24\0\3\2\1\270"+
    "\23\2\1\0\2\2\4\0\1\2\2\0\1\2\2\0"+
    "\1\2\24\0\7\2\1\271\17\2\1\0\2\2\4\0"+
    "\1\2\2\0\1\2\2\0\1\2\24\0\3\2\1\272"+
    "\23\2\1\0\2\2\4\0\1\2\2\0\1\2\2\0"+
    "\1\2\24\0\20\2\1\273\6\2\1\0\2\2\4\0"+
    "\1\2\2\0\1\2\2\0\1\2\24\0\10\2\1\274"+
    "\16\2";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7923];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\7\1\2\11\10\1\7\11\2\1\1\11\10\1"+
    "\2\0\1\1\13\0\4\1\1\11\2\1\1\0\10\11"+
    "\13\1\1\0\1\1\14\0\20\1\4\0\1\11\1\0"+
    "\2\11\1\0\21\1\1\11\1\0\2\11\2\0\16\1"+
    "\2\11\1\0\13\1\1\11\24\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[188];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  _FortranLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return IDENTIFIER;
            }
          case 62: break;
          case 2: 
            { return LINE_COMMENT;
            }
          case 63: break;
          case 3: 
            { return EOL;
            }
          case 64: break;
          case 4: 
            { return WHITE_SPACE;
            }
          case 65: break;
          case 5: 
            { return INTEGER_LITERAL;
            }
          case 66: break;
          case 6: 
            { return DOT;
            }
          case 67: break;
          case 7: 
            { return PLUS;
            }
          case 68: break;
          case 8: 
            { return MINUS;
            }
          case 69: break;
          case 9: 
            { return STRING_LITERAL;
            }
          case 70: break;
          case 10: 
            { return AMP;
            }
          case 71: break;
          case 11: 
            { return EQ;
            }
          case 72: break;
          case 12: 
            { return DIV;
            }
          case 73: break;
          case 13: 
            { return COLON;
            }
          case 74: break;
          case 14: 
            { return MUL;
            }
          case 75: break;
          case 15: 
            { return LPAR;
            }
          case 76: break;
          case 16: 
            { return RPAR;
            }
          case 77: break;
          case 17: 
            { return LBRACKET;
            }
          case 78: break;
          case 18: 
            { return RBRACKET;
            }
          case 79: break;
          case 19: 
            { return COMMA;
            }
          case 80: break;
          case 20: 
            { return DOLLAR;
            }
          case 81: break;
          case 21: 
            { return PERC;
            }
          case 82: break;
          case 22: 
            { return LT;
            }
          case 83: break;
          case 23: 
            { return GT;
            }
          case 84: break;
          case 24: 
            { return QUEST;
            }
          case 85: break;
          case 25: 
            { return FLOATING_POINT_LITERAL;
            }
          case 86: break;
          case 26: 
            { return DO;
            }
          case 87: break;
          case 27: 
            { return EQEQ;
            }
          case 88: break;
          case 28: 
            { return NEQ;
            }
          case 89: break;
          case 29: 
            { return DIVDIV;
            }
          case 90: break;
          case 30: 
            { return COLONCOLON;
            }
          case 91: break;
          case 31: 
            { return POWER;
            }
          case 92: break;
          case 32: 
            { return LE;
            }
          case 93: break;
          case 33: 
            { return GE;
            }
          case 94: break;
          case 34: 
            { return IF;
            }
          case 95: break;
          case 35: 
            { return DOUBLE_PRECISION_LITERAL;
            }
          case 96: break;
          case 36: 
            { return END;
            }
          case 97: break;
          case 37: 
            { return OR;
            }
          case 98: break;
          case 38: 
            { return ELSE;
            }
          case 99: break;
          case 39: 
            { return REAL;
            }
          case 100: break;
          case 40: 
            { return THEN;
            }
          case 101: break;
          case 41: 
            { return KIND;
            }
          case 102: break;
          case 42: 
            { return LOGICAL_EQ;
            }
          case 103: break;
          case 43: 
            { return NOT;
            }
          case 104: break;
          case 44: 
            { return AND;
            }
          case 105: break;
          case 45: 
            { return ENDDO;
            }
          case 106: break;
          case 46: 
            { return ENDIF;
            }
          case 107: break;
          case 47: 
            { return WHILE;
            }
          case 108: break;
          case 48: 
            { return LOGICAL_NEQ;
            }
          case 109: break;
          case 49: 
            { return TRUE_KEYWORD;
            }
          case 110: break;
          case 50: 
            { return ELSEIF;
            }
          case 111: break;
          case 51: 
            { return DOUBLE;
            }
          case 112: break;
          case 52: 
            { return FALSE_KEYWORD;
            }
          case 113: break;
          case 53: 
            { return LOGICAL;
            }
          case 114: break;
          case 54: 
            { return COMPLEX;
            }
          case 115: break;
          case 55: 
            { return PROGRAM;
            }
          case 116: break;
          case 56: 
            { return INTEGER;
            }
          case 117: break;
          case 57: 
            { return CONTINUE;
            }
          case 118: break;
          case 58: 
            { return CHARACTER;
            }
          case 119: break;
          case 59: 
            { return PRECISION;
            }
          case 120: break;
          case 60: 
            { return ENDPROGRAM;
            }
          case 121: break;
          case 61: 
            { return CONCURRENT;
            }
          case 122: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
