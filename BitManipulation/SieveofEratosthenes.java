package BitManipulation;

import java.util.Scanner;

public class SieveofEratosthenes {
    public static void main(String[] args) {
        
       // System.out.println("Hello World");

       Scanner sc=new Scanner(System.in);

       int n=sc.nextInt();
       
       int prime[]=new int[n+1];

       for(int i=2;i<=n;i++){

            if(prime[i]==0){
                for(int j=i*i;j<=n;j+=i)
                    prime[j]=1;
            }
       }

       for(int i=2;i<=n;i++){
           if(prime[i]==0)
            System.out.print(i+"  [");
       }

       System.out.println();
       sc.close();

    }

}
