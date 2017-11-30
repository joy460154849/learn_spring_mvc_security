package exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppWideExceptionHandler {
	
	@ExceptionHandler(Exceptions.class)
	public String duplicateSpittleHandler(){
		return "error/admin-404";
	}
}
