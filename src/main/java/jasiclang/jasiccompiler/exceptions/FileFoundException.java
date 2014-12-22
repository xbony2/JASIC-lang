package jasiccompiler.exceptions;

/**
 * Used when a file is found, when it shouldn't be.
 * 
 * @author xbony2
 *
 */
public class FileFoundException extends Exception{
	public FileFoundException(){
		super();
	}
	
	public FileFoundException(String message){
		super(message);
	}
	
	public FileFoundException(Throwable clause){
		super(clause);
	}
	
	public FileFoundException(String message, Throwable clause){
		super(message, clause);
	}
}
