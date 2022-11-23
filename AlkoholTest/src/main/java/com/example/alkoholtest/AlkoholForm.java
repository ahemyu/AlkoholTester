package com.example.alkoholtest;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AlkoholForm{



        @NotBlank String geschlecht="";
        @NotNull double gewicht=0.0;
        @NotNull Double bierMenge=0.0;
        @NotNull Double weinMenge=0.0;
        @NotNull Double kornMenge=0.0;
        @NotNull Double vodkaMenge=0.0;
        @NotNull Double whiskeyMenge=0.0;


        public void setGeschlecht(String geschlecht) {
                this.geschlecht = geschlecht;
        }

        public String getGeschlecht() {
                return geschlecht;
        }

        public Double getGewicht() {
                return gewicht;
        }
        public void setGewicht(Double gewicht) {
                this.gewicht = gewicht;
        }
        public void setBierMenge(double bierMenge) {
                this.bierMenge = bierMenge;
        }
        public double getBierMenge() {
                return bierMenge;
        }
        public double getWeinMenge() {
                return weinMenge;
        }

        public void setWeinMenge(double weinMenge) {
                this.weinMenge = weinMenge;
        }
        public double getKornMenge() {
                return kornMenge;
        }

        public void setKornMenge(double kornMenge) {
                this.kornMenge = kornMenge;
        }

        public double getVodkaMenge() {
                return vodkaMenge;
        }

        public void setVodkaMenge(double vodkaMenge) {
                this.vodkaMenge = vodkaMenge;
        }
        public double getWhiskeyMenge() {
                return whiskeyMenge;
        }

        public void setWhiskeyMenge(double whiskeyMenge) {
                this.whiskeyMenge = whiskeyMenge;
        }




}
