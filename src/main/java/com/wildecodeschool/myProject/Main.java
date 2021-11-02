package com.wildecodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Main {

    private static int docNumber;
    private static String docName;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    public String index() {

        return "<head>" +
                "<title>Who's ya doc?</title>\n" +
                "</head>" +
                "<body>" +
                "<h1>" +
                "<a>List of movie doctors</a>" +
                "</h1>" +
                "<ul>" +
                "<li><a href=\"http://localhost:8080/doctor/1\">Click here to see the name of Doctor 1</a></li>" +
                "<li><a href=\"http://localhost:8080/doctor/2\">Click here to see the name of Doctor 2</a></li>" +
                "<li><a href=\"http://localhost:8080/doctor/3\">Click here to see the name of Doctor 3</a></li>" +
                "<li><a href=\"http://localhost:8080/doctor/4\">Click here to see the name of Doctor 4</a></li>" +
                "</ul>" +
                "</body>";
    }

    @RequestMapping("/doctor/1")
    @ResponseBody
    public static String doctor1() {

        docNumber = 1;
        docName = "William Hartnell";
        return setDocHTMLReponse(docNumber, docName);

    }

    @RequestMapping("/doctor/2")
    @ResponseBody
    public String doctor2() {

        docNumber = 2;
        docName = "Patrick Troughton";
        return setDocHTMLReponse(docNumber, docName);

    }

    @RequestMapping("/doctor/3")
    @ResponseBody
    public String doctor3() {

        docNumber = 3;
        docName = "Jon Pertwee";
        return setDocHTMLReponse(docNumber, docName);

    }

    @RequestMapping("/doctor/4")
    @ResponseBody
    public String doctor4() {

        docNumber = 4;
        docName = "Tom Baker";
        return setDocHTMLReponse(docNumber, docName);

    }

    public static String setDocHTMLReponse(int id, String name){
        return "<head>" +
                "<title>Here's your doc!</title>\n" +
                "</head>" +
                "<body>" +
                "<h2>" +
                "<a>The name of doctor number " + id + " is: </a>" +
                "</h2>" +
                "<ul>" +
                "<li><a>" + name + "</a></li>" +
                "</ul><br>" +
                "<a href=\"http://localhost:8080/\"><small>back to main page</small></a>" +
                "</body>";
    }

}
