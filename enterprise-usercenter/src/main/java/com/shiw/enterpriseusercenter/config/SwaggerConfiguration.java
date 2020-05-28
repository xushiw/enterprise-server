package com.shiw.enterpriseusercenter.config;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Component
public class SwaggerConfiguration {

    @Bean
    public Docket createRestApi(){

        return new Docket(DocumentationType.SPRING_WEB).apiInfo(apiInfo()).select().
                apis(RequestHandlerSelectors.basePackage("com.shiw.enterpriseusercenter.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Swagger api interface doc")
                .description("about interface aip runTest..")
                .termsOfServiceUrl("https://swagger.io/tools/swagger-ui/")
                .version("1.0")
                .build();
    }


}
