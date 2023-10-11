package com.damjan.APIPortfolio.Controller;

import com.damjan.APIPortfolio.model.Education;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://127.0.0.1:5500", allowCredentials = "true")
@RestController
@RequestMapping("/education")
public class EducationController {
    @GetMapping
    public Education education() {
        Education education = new Education();
        education.setFaculty("Faculty of Information and Communication Technologies");
        education.setFacultyShortName("FICT");
        education.setFacultyPeriod("October 2021 - Present");
        education.setAcademy("Computer Science and Software Development");
        education.setWhereAcademy("IW Connect Education Center");
        education.setAcademyPeriod("November 2021 - April 2023");

        return education;
    }
}
