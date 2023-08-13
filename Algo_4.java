import java.util.Arrays;

public class Algo_4 {
    public static void main(String[] args) {
        
        int[] nums = {10,20,30,40,50};

        for(int i=0;i<nums.length;i++){

            nums[nums.length+nums.length-1-i]=nums[i];

                
        }
    
        System.out.println(Arrays.toString(nums));
    }
    
}
