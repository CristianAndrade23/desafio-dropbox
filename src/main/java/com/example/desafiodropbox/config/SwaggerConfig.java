package com.example.desafiodropbox.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket productApi() {
    return new Docket(DocumentationType.SWAGGER_2)
      .select()
      .apis(RequestHandlerSelectors.basePackage("com.example.desafiodropbox.events"))
      .paths(regex("/v1.*"))
      .build()
      .apiInfo(metaInfo());
  }

  private ApiInfo metaInfo() {

    ApiInfo apiInfo = new ApiInfo(
      "User Control API",
      "Spring Boot Swagger User Control API",
      "1.0",
      "Terms of Service",
      new Contact("Cristian Andrade", null,
        "cristian.a.s.andrade@hotmail.com"),
      "Apache License Version 2.0",
      "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
    );

    return apiInfo;
  }

}
