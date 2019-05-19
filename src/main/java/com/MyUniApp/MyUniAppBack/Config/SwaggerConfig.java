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
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
     private static final String TITLE = "Myuniapp API";

    /**
     * The API Description
     */
    private static final String DESCRIPTION = "Myuniapp API";

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
        /**
     * The API information to be presented on the Swagger
     * @return the api info
     * @param version the application version
     */
    private ApiInfo apiInfo(final String version) {

        return new ApiInfoBuilder()
                .title(TITLE)
                .description(DESCRIPTION)
                .version(version)
                .build();
    }
}
