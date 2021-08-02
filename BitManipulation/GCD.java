package BitManipulation;

import java.util.Scanner;

public class GCD {

    public static int GCDFactor(int n1,int n2){

      
        int rem;
       // System.out.println("GCD of "+n1+" and "+sub);
        while(n2!=0){
            
            rem=n1%n2;
            n1=n2;
            n2=rem;

        }
        return n1;

    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n1=sc.nextInt();
        int n2=sc.nextInt();

        

        System.out.println("GCD of "+n1+" and "+n2+" is "+GCDFactor(n1,n2));

        sc.close();
    }
    
}
