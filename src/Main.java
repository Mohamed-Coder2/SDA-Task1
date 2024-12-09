import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers for Division");

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println("Enter two numbers for Multiplication");

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();

        Division d = new Division(n1,n2);
        Multiplication m = new Multiplication(x1,x2);

        d.start();
        m.start();

        d.join();
        m.join();

        System.out.println(d.getResult()+m.getResult());
    }
}