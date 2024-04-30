class TDemo extends Thread
{ 
    String name; 
    TDemo(String name)
    { 
        this.name=name; 
    } 
    public void run()
    { 
        System.out.println("My name is "+name); 
    } 
}
public class ThreadDemo
{ 
    public static void main(String[] args)
    { 
        TDemo obj=new TDemo("B.Balamurali"); 
        obj.start(); 
    } 
} 
