package Klasy;

import static java.lang.Math.exp;

public class Funkcje {
    public int relu(int x){
        if(x<0)return 0;
        return x;
    }
    public double sigmund(double x){return 1/(1+exp(-x));}
}
