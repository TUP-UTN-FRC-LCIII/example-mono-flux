package ar.edu.utn.frc.tup.lciii.controllers;

import ar.edu.utn.frc.tup.lciii.services.MyServiceSync;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sync")
public class MyControllerSync {

    @Autowired
    MyServiceSync serviceSync;

    @RequestMapping("/a")
    public String aSync() {
        long t1= System.currentTimeMillis();System.currentTimeMillis();
        String result = serviceSync.syncA();
        long t2= System.currentTimeMillis();
        System.out.println(t2-t1);
        return result;
    }

    @RequestMapping("/b")
    public String bSync() {
        long t1= System.currentTimeMillis();System.currentTimeMillis();
        String result = serviceSync.syncB();
        long t2= System.currentTimeMillis();
        System.out.println(t2-t1);
        return result;
    }

    @RequestMapping("/ab")
    public String abSync() {

        long t1= System.currentTimeMillis();
        String ab = serviceSync.syncA() + serviceSync.syncB();
        long t2= System.currentTimeMillis();
        System.out.println(t2-t1);
        return ab;
    }
}
