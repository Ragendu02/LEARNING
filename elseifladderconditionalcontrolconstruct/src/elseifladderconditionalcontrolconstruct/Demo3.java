package elseifladderconditionalcontrolconstruct;
import java.util.Scanner;
public class Demo3 {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
         System.out.println("Enter the mark");
         int mark=scan.nextInt();
         System.out.println("Enter your family income");
         int income=scan.nextInt();
         if(mark>=1080){
              if(income<=200000){
System.out.println("You are eligible for Scholarship");
              }else {
            	  System.out.println("You are not eligible for Scholarship");
}
}
         else
        	 {
        	 System.out.println("Your  family income must be less than 2 lakhs");
        	 }}
        	 }


