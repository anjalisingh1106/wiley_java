import java.util.*;
class TotalCart{
    public static int calc(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int total = calc(arr);
            if(total>10000){
                double dis=total*0.1;
                System.out.println("total :"+total);
                System.out.println("discount: "+dis);
                System.out.println("discount applied :"+(total-dis));
            }
            else{
                System.out.println("total :"+total);
                
            }
            
    }
}