import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("Nập vào giá trị a: ");
        a =sc.nextDouble();
        System.out.println("Nập vào giá trị b: ");
        b =sc.nextDouble();
        System.out.println("Nập vào giá trị c: ");
        c =sc.nextDouble();

        QuadraticEquation pt = new QuadraticEquation();
        pt.setA(a);
        pt.setB(b);
        pt.setC(c);

        pt.getRoot();
    }
}
