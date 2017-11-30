package startspringmvcbyxml;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan
public class WebConfig extends WebMvcConfigurerAdapter{
	
	/**
	 *配置视图解析器 
	 */
	@Bean
	public ViewResolver viewResovler(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setExposeContextBeansAsAttributes(true);
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);//InternalResourceViewResolver将视图解析为JstlView
		return resolver;
	}

	/**
	 *配置静态资源处理 
	 */
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
		configurer.enable();
		
	}
	
	/**
	 *为文件上传配置的 
	 */
	@Bean
	public MultipartResolver mulitipartResovler() throws IOException{
		return new StandardServletMultipartResolver();
	}
}
