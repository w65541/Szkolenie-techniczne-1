import jdk.dynalink.Operation;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Zad1 zad=(a,b)->a-b;
        int v=zad.op(1,2);
        System.out.println(v);
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> b=new ArrayList<Integer>();
        a.add(4);a.add(3);a.add(1);a.add(2);a.add(3);
        b.add(2);b.add(2);b.add(2);
        Zad8 zad2=((x,y)->{
            ArrayList<Integer> w=new ArrayList<>();
            for (int i = 0; i < x.size() && i < y.size(); i++) {
                w.add(x.get(i)*y.get(i));
            }return w;
        });
        ArrayList<Integer> c=zad2.mul(a,b);
        System.out.println(c.toString());
        a.stream().filter(x->x%2==0).forEach(x->System.out.print(x+" "));//2
        System.out.println();
        System.out.println(a.stream().filter(x->x%2==0).sorted().findFirst().get());//3
        a.stream().filter(x->x<3 && x>0).forEach(x->System.out.print(x+" "));//4
        System.out.println();

        ArrayList<Osoba> o=new ArrayList<>();
        o.add(new Osoba("a","b",2000));
        o.add(new Osoba("aaz","c",2001));o.add(new Osoba("a","b",2002));o.add(new Osoba("aac","b",1999));o.add(new Osoba("a","b",1998));
        o.stream().filter(x->x.getYear()>2000).forEach(x->System.out.println(x.toString()));//5
        o.stream().filter(x->x.getImie().startsWith("aa")).sorted((o1, o2)->o1.getNazwisko().
                        compareTo(o2.getNazwisko())).forEach(x->System.out.println(x.toString()));//6
        System.out.println(o.stream().filter(x->x.getImie().startsWith("aa")).sorted((o1, o2)->o1.getNazwisko().
                compareTo(o2.getNazwisko())).count());
    }

}