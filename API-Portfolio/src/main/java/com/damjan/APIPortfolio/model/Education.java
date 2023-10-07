package com.damjan.APIPortfolio.model;

public class Education {
    private String faculty;
    private String facultyShortName;
    private String facultyPeriod;
    private String academy;
    private String whereAcademy;
    private String academyPeriod;

    public Education() {
    }

    public Education(String faculty, String facultyShortName, String facultyPeriod, String academy, String whereAcademy, String academyPeriod) {
        this.faculty = faculty;
        this.facultyShortName = facultyShortName;
        this.facultyPeriod = facultyPeriod;
        this.academy = academy;
        this.whereAcademy = whereAcademy;
        this.academyPeriod = academyPeriod;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFacultyShortName() {
        return facultyShortName;
    }

    public void setFacultyShortName(String facultyShortName) {
        this.facultyShortName = facultyShortName;
    }

    public String getFacultyPeriod() {
        return facultyPeriod;
    }

    public void setFacultyPeriod(String facultyPeriod) {
        this.facultyPeriod = facultyPeriod;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getWhereAcademy() {
        return whereAcademy;
    }

    public void setWhereAcademy(String whereAcademy) {
        this.whereAcademy = whereAcademy;
    }

    public String getAcademyPeriod() {
        return academyPeriod;
    }

    public void setAcademyPeriod(String academyPeriod) {
        this.academyPeriod = academyPeriod;
    }

    @Override
    public String toString() {
        return "Education{" +
                "faculty='" + faculty + '\'' +
                ", facultyShortName='" + facultyShortName + '\'' +
                ", facultyPeriod='" + facultyPeriod + '\'' +
                ", academy='" + academy + '\'' +
                ", whereAcademy='" + whereAcademy + '\'' +
                ", academyPeriod='" + academyPeriod + '\'' +
                '}';
    }
}
