import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Prostokat p=new Prostokat(3,1);
        Kolo k=new Kolo(3);
        p.info();
        k.info();
        System.out.println(p.pole());
        System.out.println(k.pole());
        Figura[] f=new Figura[5];
        f[0]=p;
        f[1]=k;
        for (int i=0;i<2;i++){
            if(f[i].pole()<4) f[i].info();
        }
    }
}