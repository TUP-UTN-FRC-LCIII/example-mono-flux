package ar.edu.utn.frc.tup.lciii.services;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class MyServiceFlux {

    public Mono<String> a() {
        return Mono.just("A").delayElement(Duration.ofSeconds(3));
    }
    public Mono<String> b() {

        return Mono.just("B").delayElement(Duration.ofSeconds(3));
    }
}
