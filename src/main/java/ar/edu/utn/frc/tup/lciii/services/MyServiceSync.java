package ar.edu.utn.frc.tup.lciii.services;

import org.springframework.stereotype.Service;

@Service
public class MyServiceSync {

    public String syncA() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "A";
    }
    public String syncB() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "B";
    }
}
