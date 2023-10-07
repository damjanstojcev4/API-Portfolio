package com.damjan.APIPortfolio.Controller;

import com.damjan.APIPortfolio.model.Certificates;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/certificates")
public class CertificatesController {

    @GetMapping()
    public List<Certificates> getCertificates() {
        List<Certificates> certificateList = new ArrayList<>();

        Certificates certificate1 = new Certificates();
        certificate1.setCertificate("Java Programming Masterclass - Udemy");
        certificate1.setIssued("June 2023");
        certificateList.add(certificate1);

        Certificates certificate2 = new Certificates();
        certificate2.setCertificate("HTTP Essential Training - LinkedIn Learning");
        certificate2.setIssued("March 2023");
        certificateList.add(certificate2);

        Certificates certificate3 = new Certificates();
        certificate3.setCertificate("Git and Github Essentials - Amigoscode");
        certificate3.setIssued("December 2022");
        certificateList.add(certificate3);

        Certificates certificate4 = new Certificates();
        certificate4.setCertificate("Relational Database and SQL Essentials - Amigoscode");
        certificate4.setIssued("December 2022");
        certificateList.add(certificate4);

        Certificates certificate5 = new Certificates();
        certificate5.setCertificate("Java Functional Programming - Amigoscode");
        certificate5.setIssued("October 2022");
        certificateList.add(certificate5);

        return certificateList;
    }

}
