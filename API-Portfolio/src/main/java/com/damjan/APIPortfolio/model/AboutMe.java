package com.damjan.APIPortfolio.model;

public class AboutMe {
    private String fullName;
    private String job;
    private String email;
    private String city;
    private String country;
    private String github;
    private String aboutMe;

    public AboutMe() {
    }

    public AboutMe(String fullName, String job, String email, String city, String country, String github, String aboutMe) {
        this.fullName = fullName;
        this.job = job;
        this.email = email;
        this.city = city;
        this.country = country;
        this.github = github;
        this.aboutMe = aboutMe;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    @Override
    public String toString() {
        return "AboutMe{" +
                "fullName='" + fullName + '\'' +
                ", job='" + job + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", aboutMe='" + aboutMe + '\'' +
                ", github='" + github + '\'' +
                '}';
    }
}
