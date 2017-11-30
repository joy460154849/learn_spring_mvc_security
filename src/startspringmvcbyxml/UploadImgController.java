package startspringmvcbyxml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;

@Controller
@RequestMapping("/uploads")
public class UploadImgController {

	
	@RequestMapping(value="/img",method=RequestMethod.GET)
	public String getimg(){
		return "uploadimg";
	}
	
	@RequestMapping(value="/registerImg",method=RequestMethod.POST)
	public String processRegisteration(@RequestPart("profilePicture") byte[] profilePicture){
		System.out.println("jin lai le");
		return "uploading";
	}
}
