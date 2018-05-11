package io.springfox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Import({ springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration.class })
@ComponentScan({ "io.springfox.custom" })
public class SpringfoxTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringfoxTestApplication.class, args);
    }
}
