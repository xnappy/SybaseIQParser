package de.analysis.compiler;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 *
 * @author mincekara
 */
public class MyAntlrErrorListener extends BaseErrorListener{
    public static MyAntlrErrorListener INSTANCE = new MyAntlrErrorListener();
    
    //When the value is false, the syntaxError method returns without displaying errors.
    private static final boolean REPORT_SYNTAX_ERRORS = true;
    
    private String errorMsg;
    
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, 
                            Object offendingSymbol, 
                            int line, 
                            int charPositionInLine, 
                            String msg, 
                            RecognitionException re) {

        if (!REPORT_SYNTAX_ERRORS) {
            return;
        }

        errorMsg = errorMsg + "line " + line + ":" + charPositionInLine + " "+ msg + "\n";
    }

    @Override
    public String toString() {
        return errorMsg;
    }   
    
    public void setErrorMsg(){
        errorMsg = "";
    }
}
