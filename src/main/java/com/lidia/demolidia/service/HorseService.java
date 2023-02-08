package com.lidia.demolidia.service;

import com.lidia.demolidia.entity.Horse;
import com.lidia.demolidia.repository.HorseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HorseService {

    private final HorseRepository horseRepository;

    public Horse saveHorse(Horse horse) {
        return horseRepository.save(horse);
    }
}
