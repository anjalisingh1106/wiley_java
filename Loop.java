import java.util.*;
class Loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // for(int i=0;i<=10;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.println(i+" "+j);
        //     }
        // }
        // int i=0;
        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // }
        int n;
        do{
            System.out.println("Enter number from 1 to 10 :");
            n = sc.nextInt();
            System.out.println(n);

        }while(n<1 || n>10);
    }
}