public class Multiplication extends Thread {
    private double n1, n2;
    private double result;

    public Multiplication(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double Multiply(double n1, double n2) {
        return n1 * n2;
    }

    public double getResult() {
        return result;
    }

    @Override
    public void run() {
        result = Multiply(n1,n2);
        System.out.println("Multiplication output is " + result);
    }
}
