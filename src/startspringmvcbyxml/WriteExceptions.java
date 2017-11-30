package startspringmvcbyxml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import exceptions.Exceptions;
import exceptions.Exceptions2;

@Controller
@RequestMapping("/writeexception")
public class WriteExceptions {
	
	@RequestMapping("/getexception")
	public String getException(){
		String id = null;
		if(id==null){
			throw new Exceptions();
		}
		return "home";
	}
	
	@RequestMapping("/getexception2")
	public String getException2(){
		String id = null;
		if(id==null){
			throw new Exceptions2();
		}
		return "home";
	}
	
	@RequestMapping("/getexception1")
	public String getException11(){
		String id = null;
		id.getBytes();
		return "home";
	}

	
	@RequestMapping("/test")
	public String test(){
		return "home";
	}
	
//	@ExceptionHandler(Exceptions.class)
//	public String handleDuplicateSpittle(){
//		return "error/admin-404";
//	}
}
