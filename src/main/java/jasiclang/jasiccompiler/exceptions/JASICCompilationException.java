package jasiccompiler.exceptions;

/**
 * Used when something goes bad while compiling.
 * 
 * @author xbony2
 *
 */
public class JASICCompilationException extends Exception{
	public JASICCompilationException(){
		super();
	}
	
	public JASICCompilationException(String message){
		super(message);
	}
	
	public JASICCompilationException(Throwable clause){
		super(clause);
	}
	
	public JASICCompilationException(String message, Throwable clause){
		super(message, clause);
	}
}
