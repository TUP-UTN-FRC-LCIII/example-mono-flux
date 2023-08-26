package ar.edu.utn.frc.tup.lciii.controllers;

import ar.edu.utn.frc.tup.lciii.services.MyServiceFlux;
import ar.edu.utn.frc.tup.lciii.services.MyServiceSync;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("flux")
public class MyControllerFlux {

    @Autowired
    MyServiceFlux serviceFlux;

    @RequestMapping("/a")
    public Mono<String> aMono() {
        long t1= System.currentTimeMillis();System.currentTimeMillis();
        Mono<String> result = serviceFlux.a();
        long t2= System.currentTimeMillis();
        System.out.println(t2-t1);
        return result;
    }

    @RequestMapping("/b")
    public Mono<String> bMono() {
        long t1= System.currentTimeMillis();System.currentTimeMillis();
        Mono<String> result = serviceFlux.b();
        long t2= System.currentTimeMillis();
        System.out.println(t2-t1);
        return result;
    }

    @RequestMapping("/ab")
    public Flux<String> abFlux() {

        long t1= System.currentTimeMillis();
        Mono<String> a = serviceFlux.a();
        Mono<String> b = serviceFlux.b();
        Flux<String> flux = Flux.merge(a,b);
        long t2= System.currentTimeMillis();
        System.out.println(t2-t1);
        return flux;
    }
}
