package kopo.poly.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    private Info apiInfo() {
        return new Info()
                .title("UserService") // 문서 제목
                .description("User Service Description") // 문서 설명
                .contact(new Contact().name("Prof. SeaByeol Kim") // 명세서 작성자 정보
                        .email("toquf345@gmail.com")
                        .url("https://www.kopo.ac.kr/kangseo/content.do?menu=1547"))
                .license(new License()
                        .name("한국폴리텍대학 서울강서캠퍼스 빅데이터과 김새별"))
                .version("1.0.0");
    }

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI().components(new Components()).info(apiInfo());
    }

}

