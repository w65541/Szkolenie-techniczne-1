package com.example.programowanierownolegle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        ArrayList<Osoba> o=new ArrayList<>();
        o.add(new Osoba("a","b",2000));
        o.add(new Osoba("aaz","c",2001));o.add(new Osoba("a","b",2002));o.add(new Osoba("aac","b",1999));o.add(new Osoba("a","b",1998));
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() ->Calc(2,3));
        CompletableFuture<List<Integer>> completableFuture2 = CompletableFuture.supplyAsync(() ->Pierwsz(2,100));
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        for (int i = 1; i < 26; i++) {
            a.add(i);
            b.add(i);
        }
        System.out.println(Dodaj(a,b));
       try {
           System.out.println(completableFuture.get());
       }catch (Exception e){}
        try {
            System.out.println(completableFuture2.get());
        }catch (Exception e){}
                Thread newThread = new Thread(() -> {
            System.out.println(Calc(2,3));
        });
        Thread newThread2 = new Thread(() -> {
            System.out.println(Pierwsz(2,100));
        });
        Thread newThread3 = new Thread(() -> {
            o.stream().filter(x->x.getYear()>2000).forEach(x->System.out.println(x.toString()));
        });
        Thread newThread4 = new Thread(() -> {
            o.stream().filter(x->x.getImie().startsWith("aa")).sorted((o1, o2)->o1.getNazwisko().
                    compareTo(o2.getNazwisko())).forEach(x->System.out.println(x.toString()));//6
        });
newThread2.start();
newThread.start();
        newThread3.start();
        newThread4.start();
        launch();
    }


    public static int Calc(int a, int b){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {

        }
        return a*b;
    }
    public static ArrayList<Integer> Pierwsz(int a, int b){
        ArrayList<Integer> pierwsze=new ArrayList<>();
        boolean p;
        for (int i = a; i <=b ; i++) {
            p=true;
            if(i%2!=0 && i!=2){
            for (int j = 3; j < i/2; j++) {
                if(i%j==0) p=false;
            }
            if(p) pierwsze.add(i);
            }
        }
        return pierwsze;
    }

    public static ArrayList<Integer> Dodaj(ArrayList<Integer> a, ArrayList<Integer> b){
    int part=a.size()/5;

        ArrayList<Integer> wynik=new ArrayList<>();
        CompletableFuture<List<Integer>> part1= CompletableFuture.supplyAsync(() -> {
            ArrayList<Integer> p1=new ArrayList<>();
            for (int i = part*0; i < part*1; i++) {
                p1.add(a.get(i)+b.get(i));
            }
            return p1;
        });
        CompletableFuture<List<Integer>> part2= CompletableFuture.supplyAsync(() -> {
            ArrayList<Integer> p1=new ArrayList<>();
            for (int i = part*1; i < part*2; i++) {
                p1.add(a.get(i)+b.get(i));
            }
            return p1;
        });
        CompletableFuture<List<Integer>> part3= CompletableFuture.supplyAsync(() -> {
            ArrayList<Integer> p1=new ArrayList<>();
            for (int i = part*2; i < part*3; i++) {
                p1.add(a.get(i)+b.get(i));
            }
            return p1;
        });
        CompletableFuture<List<Integer>> part4= CompletableFuture.supplyAsync(() -> {
            ArrayList<Integer> p1=new ArrayList<>();
            for (int i = part*3; i < part*4; i++) {
                p1.add(a.get(i)+b.get(i));
            }
            return p1;
        });
        CompletableFuture<List<Integer>> part5= CompletableFuture.supplyAsync(() -> {
            ArrayList<Integer> p1=new ArrayList<>();
            for (int i = part*4; i < part*5; i++) {
                p1.add(a.get(i)+b.get(i));
            }
            return p1;
        });
        try {
            wynik.addAll(part1.get());
            wynik.addAll(part2.get());
            wynik.addAll(part3.get());
            wynik.addAll(part4.get());
            wynik.addAll(part5.get());
        }catch (Exception e){}

        return wynik;
    }

}