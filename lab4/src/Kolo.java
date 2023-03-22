public class Kolo extends Figura{
    double r;

    public Kolo(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    @Override
    void info() {
        System.out.println("r: "+r);
    }

    @Override
    double pole() {
        return r*r*Math.PI;
    }
}
