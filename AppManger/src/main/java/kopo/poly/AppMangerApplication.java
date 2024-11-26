package kopo.poly;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AppMangerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppMangerApplication.class, args);
    }

}
