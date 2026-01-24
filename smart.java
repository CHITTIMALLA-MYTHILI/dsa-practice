import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
Scanner sc=new Scanner(System.in);
int T=sc.nextInt();
for(int t=1;t<=T;t++){
    int n=sc.nextInt();
    System.out.println("Case #"+t+":");
    for(int i=1;i<=n;i++){
        for(int s=1;s<=n-i;s++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
   
}
}
}
