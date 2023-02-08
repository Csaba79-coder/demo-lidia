package com.lidia.demolidia;

import com.lidia.demolidia.entity.Horse;
import com.lidia.demolidia.service.HorseService;
import com.lidia.demolidia.value.TypeOfHorse;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoLidiaApplication implements ApplicationRunner {

    private final HorseService horseService;

    public static void main(String[] args) {
        SpringApplication.run(DemoLidiaApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Horse horse = new Horse();
        horse.setType(TypeOfHorse.NONIUS);
        horse.setName("Horse");
        horse.setMale(true);
        horse.setAge(1);
        horseService.saveHorse(horse);
    }
}
