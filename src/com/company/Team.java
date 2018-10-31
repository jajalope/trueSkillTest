package com.company;

public class Team {
    public double mu;
    public double sigma;
    public double trueMu = mu-(sigma*3);
    public String name;

    Team (String teamName){
        name = teamName;
        mu = 50;
        sigma = 50/3;
    }

    public void setMu(double muVal) {
        this.mu = muVal;
        this.trueMu = mu-(sigma*3);
    }

    public double getMu() {
        return mu;
    }

    public void setSigma(double sigma) {
        this.sigma = sigma;
        this.trueMu = mu-(sigma*3);
    }

    public double getSigma() {
        return sigma;
    }
}
