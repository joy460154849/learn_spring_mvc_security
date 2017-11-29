package startspringmvcbyxml;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;

@Controller
@RequestMapping("/upload")
public class UploadImg {

	@RequestMapping(value="registerImg",method=RequestMethod.POST)
	public String processRegisteration(@RequestPart("profilePicture") byte[] profilePicture, @Valid Spittle spittle,Errors errors){
		if (errors.hasErrors()) {
			return "registerForm";
		}
		return null;
	}
}
