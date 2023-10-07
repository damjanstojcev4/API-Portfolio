package com.damjan.APIPortfolio.model;

public class Certificates {
    private String certificate;
    private String issued;

    public Certificates() {
    }

    public Certificates(String certificate, String issued) {
        this.certificate = certificate;
        this.issued = issued;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getIssued() {
        return issued;
    }

    public void setIssued(String issued) {
        this.issued = issued;
    }

    @Override
    public String toString() {
        return "Certificates{" +
                "certificate='" + certificate + '\'' +
                ", issued='" + issued + '\'' +
                '}';
    }
}
