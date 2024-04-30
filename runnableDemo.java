class RDemo implements Runnable
{ 
    int num; 
    RDemo(int num)
    { 
        this.num=num; 
    } 
    public void run()
    { 
        System.out.println("START!!"); 
        for(int i=1;i<=num;i++)
        { 
            if(i==50)
            { 
                System.out.println(i); 
            }
            else
            { 
                System.out.print(i+" "); 
            } 
        } 
        System.out.println("FINISH!!"); 
    } 
} 
public class runnableDemo
{
    public static void main(String[] args)
    { 
        RDemo obj=new RDemo(50); 
        obj.run(); 
    }
}    
