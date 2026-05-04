
package ndes14_.c251229;
import java.util.Scanner;
public class Ndes14_C251229 {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
 System.out.print("Profit of company A:");
 int P=sc.nextInt();
 System.out.print("Profit of company B:");
 int Q=sc.nextInt();
 System.out.print("Profit of company C:");
 int R=sc.nextInt();
 System.out.print("Profit of company D:");
 int S=sc.nextInt();
 if((P>(Q+R+S))||(Q>(R+S+P))||(R>(S+P+Q))||(S>(P+Q+R))) 
 {
 System.out.println("There is a monopoly");
 } else {
 System.out.println("There is no monopoly");
 }}}

