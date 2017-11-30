package startspringmvcbyxml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *@Controller注解：构造器注解，基于@Component注解。作用：辅助实现组件扫描，。所以组件扫描会自动找到HomeController,声明spring上下文中的一个bean
 */
@Controller
@RequestMapping({"/","/homepage"})
public class HomeController {

	@RequestMapping(value="home",method=RequestMethod.GET)
	public String home(){
		return "home";
	}
	
	@RequestMapping(value="/img",method=RequestMethod.GET)
	public String getimg(){
		return "uploadimg";
	}
//	
//	@RequestMapping(method=RequestMethod.GET)
//	public String home2(){
//		return "home2";
//	}
}
