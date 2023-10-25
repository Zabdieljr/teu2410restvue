package com.bezahive.teu2410quickrestandvue;

import com.bezahive.teu2410quickrestandvue.repository.PatientRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.TimeZone;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(basePackageClasses = PatientRepository.class)
public class Teu2410quickrestandvueApplication {

    public static void main(String[] args) {
        SpringApplication.run(Teu2410quickrestandvueApplication.class, args);
    }
    @PostConstruct
    void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Bogota"));
    }
}
