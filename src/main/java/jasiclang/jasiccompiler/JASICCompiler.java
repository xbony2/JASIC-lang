package jasiccompiler;

import jasiccompiler.exceptions.FileFoundException;

import java.io.File;
import java.io.FileNotFoundException;

public class JASICCompiler {
public static final String EXTENSION = "jasic";
	
	public static void compile(File jasicSrc, File compiledClass){
		try{
			if(!jasicSrc.exists()){
				throw new FileNotFoundException("File not found: " + jasicSrc.getName());
			}
		}catch (FileNotFoundException e){
			e.printStackTrace();
			return;
		}
		
		try{
			if(compiledClass.exists()){
				throw new FileFoundException("The specified output is already in use");
			}
		}catch(FileFoundException e){
			e.printStackTrace();
			return;
		}
	}
}
