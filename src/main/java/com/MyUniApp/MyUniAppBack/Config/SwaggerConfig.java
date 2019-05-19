package com.MyUniApp.MyUniAppBack.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import com.google.common.base.Predicates;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
                .apis(Predicates.and(
                    RequestHandlerSelectors.withClassAnnotation(RestController.class),
                    RequestHandlerSelectors.basePackage("com.MyUniApp")))
            .paths(PathSelectors.any())
            .build()
        .pathMapping("/");
    }
}
