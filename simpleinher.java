import java.util.Scanner;
class calculator{
    double a,b;
    public void add(){
        System.out.println("a+b : "+(a+b));
    }
    public void sub(){
        System.out.println("a-b : "+(a-b));
    }
}
class Advcalculator extends calculator{
    public void mul(){
        System.out.println("a*b : "+(a*b));
    }
    public void div(){
        if(b!=0)
            System.out.println("a/b : "+(a/b));
        else
            System.out.println("can not divisible by zero");

    }
}
public class Simple{
    public static void main(String[] args) {
        Advcalculator obj = new Advcalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operands : ");
        obj.a = scanner.nextDouble();
        obj.b = scanner.nextDouble();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();

       scanner.close();
    }
}
