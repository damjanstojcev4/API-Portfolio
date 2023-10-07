package com.damjan.APIPortfolio.model;

public class Skills {
    private String skill;

    public Skills() {
    }

    public Skills(String skill) {
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "skill='" + skill + '\'' +
                '}';
    }
}
