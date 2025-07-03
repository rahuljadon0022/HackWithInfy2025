import java.util.*;
public class BuyTwoChoclates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("enter array value:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter money:");
        int money=sc.nextInt();
        int ans=function(arr, money);
        System.out.println("ans:"+ans);

    }
    static int function(int[] prices,int money){
        int min=Integer.MAX_VALUE;
        int second_min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                second_min=min;
                min=prices[i];
            }
            else if(prices[i]<second_min){
                second_min=prices[i];
            }
        }
        int sum=min+second_min;
        if(sum<=money){
            return sum-money;
        }
        else{
            return money;
        }
    }
    
}
