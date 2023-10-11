package com.damjan.APIPortfolio.Controller;

import com.damjan.APIPortfolio.model.Certificates;
import com.damjan.APIPortfolio.model.Skills;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5500", allowCredentials = "true")
@RestController
@RequestMapping("/skills")
public class SkillsController {

    @GetMapping()
    public List<Skills> getSkills() {
        List<Skills> skillsList = new ArrayList<>();

        Skills skills1 = new Skills();
        skills1.setSkill("Java");
        skillsList.add(skills1);

        Skills skills2 = new Skills();
        skills2.setSkill("Spring Boot");
        skillsList.add(skills2);

        Skills skills3 = new Skills();
        skills3.setSkill("RDBMS");
        skillsList.add(skills3);

        Skills skills4 = new Skills();
        skills4.setSkill("Git");
        skillsList.add(skills4);

        Skills skills5 = new Skills();
        skills5.setSkill("Leadership and Teamwork");
        skillsList.add(skills5);

        Skills skills6 = new Skills();
        skills6.setSkill("JPA and Hibernate");
        skillsList.add(skills6);

        return skillsList;
    }
}
