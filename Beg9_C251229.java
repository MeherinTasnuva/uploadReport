
package beg9_.c251229;
 import java.util.Scanner;
public class Beg9_C251229 {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
       System.out.println("Enter N:");
       int N=sc.nextInt(); 
       int sum=0;
       for(int i=1;i<=N;i++)
       {sum=sum+i;}
       System.out.println("Sum of 1 to "+N+" = "+sum);      
                   
    }
    
}
