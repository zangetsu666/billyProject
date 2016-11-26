package ad.billy;

import javax.faces.webapp.FacesServlet;
import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@SpringBootApplication
public class BillyprojectApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(BillyprojectApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder 
        configure(SpringApplicationBuilder application) {
            return application.sources(BillyprojectApplication.class);
    }
     
    @Bean
    public FacesServlet facesServlet() {
        return new FacesServlet();
    }
     
 
    @Bean
    public ServletRegistrationBean facesServletRegistration() {
      ServletRegistrationBean registration = 
          new ServletRegistrationBean(facesServlet(), "*.xhtml");
      registration.setName("FacesServlet");
      return registration;
    }
	
}
