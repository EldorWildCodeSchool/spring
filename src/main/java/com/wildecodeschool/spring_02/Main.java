package com.wildecodeschool.spring_02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;
import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
public class Main {

    private static List<Doctor> myDoctors = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        Doctor doctor9 = new Doctor(9, "Christopher Eccleston");
        Doctor doctor10 = new Doctor(10, "David Tennant");
        Doctor doctor11 = new Doctor(11, "Matt Smith");
        Doctor doctor12 = new Doctor(12, "Peter Capaldi");
        Doctor doctor13 = new Doctor(13,"Jodie Whittaker");

        myDoctors.add(doctor9);
        myDoctors.add(doctor10);
        myDoctors.add(doctor11);
        myDoctors.add(doctor12);
        myDoctors.add(doctor13);

    }

    @RequestMapping("/doctor/{id}")
    @ResponseBody
    public String doctor(@PathVariable int id) {

        if (id < 9) {
            throw new ResponseStatusException(HttpStatus.SEE_OTHER, "This doctor has retired! Please choose another one (maybe 9 - 13?)");
        }
        if (id > 13) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible to retrieve the incarnation " + id);
        }
        for (Doctor doctor : myDoctors) {
            if (doctor.getActorID() == id) {
                return doctor.toString();
            }
        }
        return "foo!";

    }

}
