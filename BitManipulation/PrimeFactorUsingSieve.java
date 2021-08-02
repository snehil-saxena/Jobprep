package BitManipulation;

import java.util.Scanner;

public class PrimeFactorUsingSieve {

    public static void PrimeFactor(int n){

        int pf[]=new int [n+1];

        for(int i=2;i<=n;i++)
            pf[i]=i;

        for(int i=2;i<=n;i++){

            if(pf[i]==i){
                
                for(int j=i*i;j<=n;j+=i)
                    if(pf[j]==j)
                        pf[j]=i;
            }
        }

        while(n!=1){

            System.out.println (n+" = "+pf[n]+" ");
            n=n/pf[n];

        }

    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        PrimeFactor(n);

        sc.close();
    }
    
}
