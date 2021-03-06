package org.csystem.movierestapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies") //bu url altından başlasın mapping işlemler, /movies controller
public class MovieRestController {

    @GetMapping("/welcome") //@GetMapping("/welcome/") //http://localhost:8080/movies/welcome
    public String welcome()
    {
        return "WELCOME"; //Peki nasıl mı? SpringBootApp.run, main sınıf, init data
    }
}
