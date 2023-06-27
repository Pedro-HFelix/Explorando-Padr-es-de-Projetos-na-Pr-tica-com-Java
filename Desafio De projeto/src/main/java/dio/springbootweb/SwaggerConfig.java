package dio.springbootweb;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private Contact contato() {
        return new Contact(
                "Pedro",
                "http://www.seusite.com.br",
                "12202240@aluno.cotemig.com.br");
    }
    private ApiInfoBuilder informacoesApi() {

        ApiInfoBuilder apiBuilder = new ApiInfoBuilder();

        apiBuilder.title("Title - Rest API Java");
        apiBuilder.description("Padrões Java");
        apiBuilder.version("1.0");
        apiBuilder.termsOfServiceUrl("Termo de uso: Open Source");
        apiBuilder.license("Licença - Eu mesmo");
        apiBuilder.licenseUrl("http://www.seusite.com.br");
        apiBuilder.contact(this.contato());

        return apiBuilder;

    }
    @Bean
    public Docket detalheApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        docket
                .select()
                .apis(RequestHandlerSelectors.basePackage("dio.springbootweb.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.informacoesApi().build())
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));

        return docket;
    }
}
