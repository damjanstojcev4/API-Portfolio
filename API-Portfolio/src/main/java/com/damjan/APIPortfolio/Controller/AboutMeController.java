package com.damjan.APIPortfolio.Controller;

import com.damjan.APIPortfolio.model.AboutMe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about-me")
public class AboutMeController {

    @GetMapping("/")
    public AboutMe getAboutMe() {
        AboutMe aboutMe = new AboutMe();
        aboutMe.setFullName("Damjan Stojchev");
        aboutMe.setJob("Java Developer");
        aboutMe.setEmail("damjan.stojcev4@gmail.com");
        aboutMe.setCity("Bitola");
        aboutMe.setCountry("Macedonia");
        aboutMe.setGithub("https://github.com/damjanstojcev4");
        aboutMe.setAboutMe("I am junior Java developer with a strong passion for creating innovative and efficient software solutions. " +
                "My experience includes working with Java SE and Java EE, as well as popular Java frameworks such as Spring and Hibernate. " +
                "I am highly motivated, detail-oriented and a quick learner, always looking for new challenges and opportunities to expand my skillset. " +
                "I am constantly striving to improve my skills and stay up-to-date with the latest industry trends. " +
                "I have a problem-solving mindset, and I enjoy the process of taking a project from the initial requirements to a polished, working product. " +
                "I am dedicated to my work and I am excited to be a part of a team that shares my passion for technology and making a difference in the world. " +
                "I am always open to learning new things and collaborating with others to achieve our goals.");

        return aboutMe;
    }
}
