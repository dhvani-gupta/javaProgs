import java.lang.*;
import java.util.*;
class Clock
{
    public static void main(String[] args)
   {
       int hr,min,sec;
       Scanner ob = new Scanner(System.in);
       System.out.println("Choose format: ");
       System.out.println("1. AM ");
       System.out.println("2. PM ");
       format = ob.nextInt();
       switch (format)
       {
           case 1:
       System.out.println("Enter Hour(1-12): \t");
       hr = ob.nextInt();
       if(hr>12)
       {
         System.out.println("Invalid. Exited");  
       }
       else
       {
            System.out.println("Enter Minutes: \t");
        min = ob.nextInt();
       System.out.println("Enter Seconds: \t");
       sec = ob.nextInt();
       System.out.println("Entered Time: \t"+ hr + ":" + min + ":" + sec);}
       case 2 :
       System.out.println("Enter Hour(1-12/12-24): \t");
       hr = ob.nextInt();
       if(hr>24)
       {
         System.out.println("Invalid. Exited");  
       }
       else
       {
           System.out.println("Enter Minutes: \t");
       min = ob.nextInt();
       System.out.println("Enter Seconds: \t");
       sec = ob.nextInt();
       System.out.println("Entered Time: \t"+ hr + ":" + min + ":" + sec);
       }
    }
    }
}

