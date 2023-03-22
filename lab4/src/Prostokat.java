public class Prostokat extends Figura{
    double a,b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Prostokat() {
        super();
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    void info() {
        System.out.println("a: "+a+"\nb: "+b);
    }

    @Override
    double pole() {
        return a*b;
    }
}
