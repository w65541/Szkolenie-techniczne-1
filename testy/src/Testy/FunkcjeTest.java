package Testy;

import org.junit.Assert;

import org.junit.jupiter.api.BeforeAll;
import Klasy.Funkcje;

class FunkcjeTest {
    public Funkcje fun = new Funkcje();

    @org.junit.jupiter.api.Test
    void relu() {

        Assert.assertEquals(fun.relu(1),1);
        Assert.assertEquals(fun.relu(-1),0);
    }

    @org.junit.jupiter.api.Test
    void sigmund() {
    }
}