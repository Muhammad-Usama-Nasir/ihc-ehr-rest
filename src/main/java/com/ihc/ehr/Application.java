package com.ihc.ehr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author Ihsan Ullah
 *
 */
@SpringBootApplication
public class Application  extends SpringBootServletInitializer {

	 /**
     * Used when run as JAR
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Gas Station Project is running");
    }

    /**
     * Used when run as WAR
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        System.out.println("Gas Station Project is running");

        return builder.sources(Application.class);
    }

}
