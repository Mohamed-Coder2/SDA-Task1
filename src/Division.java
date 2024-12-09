public class Division extends Thread{

    private double n1, n2;
    private double result;

    public Division(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double Divide(double n1, double n2) {
        if(n2 == 0) {
            return -1;
        }
        return n1 / n2;
    }

    public double getResult(){
        return result;
    }

    @Override
    public void run() {
        if(n2 == 0) {
            System.out.println("Error: Division by 0");
        } else {
            result = Divide(n1,n2);
            System.out.println("Divide output is " + result);
        }
    }
}
