import java.util.Scanner;

public class ASDemo{
    private int priVar;
    protected int proVar;
    public int pubVar;

    public void setVar(int priValue, int proValue, int pubValue) {
        priVar = priValue;
        proVar = proValue;
        pubVar = pubValue;
    }
    public void getVar() {
        System.out.println("Private Variable: " + priVar);
        System.out.println("Protected Variable: " + proVar);
        System.out.println("Public Variable: " + pubVar);
    }
}
class test{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter value of Private Variable : ");
    int priValue = scanner.nextInt();
    System.out.print("Enter value of Protected Variable : ");
    int proValue = scanner.nextInt();
    System.out.print("Enter value of Public Variable  : ");
    int pubValue = scanner.nextInt();
    ASDemo obj = new ASDemo();
    obj.setVar(priValue, proValue, pubValue);
    obj.getVar();
    scanner.close();
    }
}
