import java.util.*;
import java.util.Scanner;
public class fibonnaciSeries {

    public static void main(String[] args){
        int n=5;
        System.out.println(fibbo(5));
    }
    private static int fibbo(int n){
        if(n==0||n==1){
            return n;
        }
        int f1=fibbo(n-1);
        int f2=fibbo(n-2);
        return f1+f2;
    }
    
}

    

