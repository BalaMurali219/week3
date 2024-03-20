import java.util.Scanner;

class AddTwoNumbers{
    int a,b,c;
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    
};
class AddThreeNumbers extends AddTwoNumbers{
    void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }

};

public class Overinher {
    public static void main(String[] args) {
        AddThreeNumbers obj = new AddThreeNumbers();
        Scanner input = new Scanner(System.in);
        obj.a= input.nextInt();
        obj.b= input.nextInt();
        obj.c= input.nextInt();
        obj.sum(obj.a,obj.b,obj.c);
        obj.sum(obj.a,obj.b);
        input.close();


    }
}    

