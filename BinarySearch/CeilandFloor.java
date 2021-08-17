public class CeilandFloor{

    static int ceil(int arr[],int tar){
        int st=0,end=arr.length-1,mid;

        while(st<=end){
            mid=st+(end-st)/2;

            if(tar<arr[mid] ) end=mid-1;
            else if(tar>arr[mid]) st=mid+1;
            else return arr[mid];
        }
        return arr[st];
    }

    static int floor(int arr[],int tar){
        int st=0,end=arr.length-1,mid;

        while(st<=end){
            mid=st+(end-st)/2;

            if(tar<arr[mid] ) end=mid-1;
            else if(tar>arr[mid]) st=mid+1;
            else return arr[mid];
        }
        return arr[end];
    }

    public static void main(String[] args) {

        int arr[]={2,4,6,7,9,10,23,34,56,67,88,90,};
        Scanner sc=new Scanner(System.in);

        int tar=sc.nextInt();
        System.out.println("ceil value of "+tar+" is "+ceil(arr,tar));
        System.out.println("floor value of "+tar+" is "+floor(arr,tar));


    }
}