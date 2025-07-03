import java.util.*;
public class ArrayPartition {
    public static void main(String[] args){
        int[] nums={1,4,3,2};
        Arrays.sort(nums);
        int i=0;
        int max_sum=0;
        while(i<nums.length){
            max_sum+=nums[i];
            i+=2;
        }
        System.out.println(max_sum);



    }
    
}
