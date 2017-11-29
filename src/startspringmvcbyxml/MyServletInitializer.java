package startspringmvcbyxml;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;

public class MyServletInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext arg0) throws ServletException {
		Dynamic myServlet = arg0.addServlet("myServlet", MyServlet.class);//注册servlet
		myServlet.addMapping("/custom/**");//映射到Servlet
	}
	
	

}
