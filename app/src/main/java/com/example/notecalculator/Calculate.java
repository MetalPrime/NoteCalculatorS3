package com.example.notecalculator;

import java.text.DecimalFormat;

public class Calculate {

    private double pParcia1;
    private double pParcia2;
    private double quices;
    private double ejSemanales;
    private double parcial1;
    private double parcial2;
    private double result;
    private DecimalFormat numberFormat = new DecimalFormat("#.00");

    public Calculate(double parcial1,double parcial2,double pParcia1,double pParcia2,double quices,double ejSemanales){
        this.pParcia1 = pParcia1;
        this.pParcia2 = pParcia2;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.ejSemanales = ejSemanales;
        this.quices = quices;

        this.parcial1 = (this.parcial1*0.15);
        this.parcial2 = (this.parcial2*0.15);
        this.pParcia1 = (this.pParcia1*0.25);
        this.pParcia2 = (this.pParcia2*0.25);
        this.quices = (this.quices*0.15);
        this.ejSemanales = (this.ejSemanales*0.05);

        result = (this.ejSemanales+this.quices+this.pParcia2+this.pParcia1+this.parcial2+this.parcial1);
        result = Double.parseDouble(numberFormat.format(result));
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

}
