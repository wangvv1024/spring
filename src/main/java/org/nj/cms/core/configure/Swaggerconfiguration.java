package org.nj.cms.core.configure;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * swagger ui 的配置类
 * @author vvwang
 *
 */
@EnableWebMvc
@Configuration
@EnableSwagger2 
@ComponentScan(basePackages={"org.nj.cms.web.controller.front"})
public class Swaggerconfiguration extends WebMvcConfigurationSupport {
	 @Bean  
	    public Docket createRestApi() {  
	        return new Docket(DocumentationType.SWAGGER_2)  
	                .apiInfo(apiInfo()) 
	                .forCodeGeneration(true)
	                .select()  
	                .apis(RequestHandlerSelectors.basePackage("org.nj.cms.web.controller.front"))  
	                .paths(PathSelectors.any())  
	                .build();  

	    }  
	  
	    private ApiInfo apiInfo() {  
	        return new ApiInfoBuilder()  
	                .title("SpringMVC 中使用Swagger2构建RESTful APIs")  
	                .termsOfServiceUrl("http://localhost:8080/spring")   
	                .version("1.0")  
	                .build(); 
	    }  

}
