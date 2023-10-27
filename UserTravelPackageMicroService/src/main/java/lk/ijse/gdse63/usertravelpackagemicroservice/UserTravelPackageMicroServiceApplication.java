package lk.ijse.gdse63.usertravelpackagemicroservice;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class UserTravelPackageMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserTravelPackageMicroServiceApplication.class, args);
    }

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

}