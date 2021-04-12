package tn.esprit.spring.security;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;

public class CustomizationPortAndPath implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>{

	 @Override
	    public void customize(ConfigurableServletWebServerFactory server) {
	        server.setPort(9090);
	        server.setContextPath("/SpringMVC");
	    }
}
