package lk.ijse.gdse63.finalproject.util;

import com.google.gson.Gson;
import lk.ijse.gdse63.finalproject.HotelMicroServiceApplication;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class StringToPricesListConverter {

    public static void main(String[] args) {
        SpringApplication.run(HotelMicroServiceApplication.class, args);
    }

    @Bean
    public Gson getGson(){
        return new Gson();
    }
    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}

