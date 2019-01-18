package org.csystem.movierestapp;

import org.csystem.movierestapp.entity.MovieInfo;
import org.csystem.movierestapp.service.IMovieService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class App {
    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }

    //İNİT DATA BURADA DEPENDECY INJECTİON İLE bu metot çağrılacak.
    //Hatta movieService nesnesine service anatasyonutla işaretlenmiş sınıf atanacak.

    /*
    @Bean
    public ApplicationRunner initData(IMovieService movieService)
    {
        return args -> {
            movieService.save(new MovieInfo("Geleceğe dönüş", "anonim", LocalDate.of(1982, 4, 2)));
            movieService.save(new MovieInfo("Geleceğe dönüş 2", "anonim", LocalDate.of(1985, 4, 2)));
            movieService.save(new MovieInfo("Geleceğe dönüş 3", "anonim", LocalDate.of(1990, 4, 2)));
            movieService.save(new MovieInfo("Karate Kid2", "anonim", LocalDate.of(1990, 4, 2)));
            movieService.save(new MovieInfo("Hayalet Avcıları", "anonim", LocalDate.of(1990, 4, 2)));
        };
    }*/
}
