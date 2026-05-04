
package ndes10_.c251229;
import java.util.Scanner;
public class Ndes10_C251229 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
 System.out.print("Enter B1:");
 int B1=sc.nextInt();
 System.out.print("Enter B2:");
 int B2=sc.nextInt();
 System.out.print("Enter B3:");
 int B3=sc.nextInt();
 if((B1==0&&B2==0)||(B2==0&&B3==0)||(B3==0&&B1==0)) {
 System.out.println("Water filling time");
 } else {
 System.out.println("Not now");
 }}}
    
    

