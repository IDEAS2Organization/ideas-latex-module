package es.us.isa.ideas.controller.latex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Latex4IdeasModuleApplication extends SpringBootServletInitializer  {
    
    public static void main(String[] args){
        SpringApplication.run(Latex4IdeasModuleApplication.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(
        SpringApplicationBuilder builder
    ) {
        return builder.sources(Latex4IdeasModuleApplication.class);
    }
}
