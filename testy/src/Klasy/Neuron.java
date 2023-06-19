package Klasy;

import java.util.ArrayList;
import java.util.function.Function;

public class Neuron {
    //Poniższa klasa reprezentuje sztuczny neuron
    //Obiekt tej klasy posiada:
// - tablice 1-wymiarowe: weights (wagi)
// - liczbę : bias (przesunięcie), s -pośredni wynik obliczeń (suma ważona)
// - obiekt delegata do funkcji nieliniowej f
//powyższe zmienne możesz wprowadzić w dowolny sposób (np. właściwości)
// s=input*weights+bias
// y=f(s)
    ArrayList<Integer> wagi=new ArrayList<>();
    double b,s,y;

    public Neuron(ArrayList<Integer> wagi,double B,double i) {
        b=B;
        this.wagi = wagi;
        int w=1;
        for (int x:wagi
             ) {
            w*=x;
        }
        w/=wagi.size();
        s=w*i+b;
        y=calc(s);
       // y=f(s);
    }

    //do wyrażenia lambda;

        //funkcja zwracająca wyjście y
        double calc(double  input)
        { return 0; }

}
