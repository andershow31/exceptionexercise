package model.exception;

public class ExerciseException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ExerciseException(String msg) {
		super(msg); //assim criamos a exceção personalizada, a msg vai para a classe Exception
	}
	
}
