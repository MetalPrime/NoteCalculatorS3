package com.example.notecalculator;

public class Calculate {

    private double pParcia1;
    private double pParcia2;
    private double quices;
    private double ejSemanales;
    private double parcial1;
    private double parcial2;
    private double result;

    public Calculate(double parcial1,double parcial2,double pParcia1,double pParcia2,double quices,double ejSemanales){
        this.pParcia1 = pParcia1;
        this.pParcia2 = pParcia2;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.ejSemanales = ejSemanales;
        this.quices = quices;

        this.parcial1 = (this.parcial1*15)/100;
        this.parcial2 = (this.parcial2*15)/100;
        this.pParcia1 = (this.pParcia1*25)/100;
        this.pParcia2 = (this.pParcia2*25)/100;
        this.quices = (this.quices*15)/100;
        this.ejSemanales = (this.ejSemanales*5)/100;

        result = Math.round(this.ejSemanales+this.quices+this.pParcia2+this.pParcia1+this.parcial2+this.parcial1 *100)/100d;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

}
