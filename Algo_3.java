import java.util.Arrays;

public class Algo_3 {
    
    public static void main(String[] args) {
        
        int[] nums = {10,20,30,40,50};

        int[] temp= new int[nums.length];

        for(int i=0;i<nums.length;i++){

            for(int j=0;j<nums.length;j++){
                temp[(nums.length-1)-i]=nums[i];
            }
            
        }
        nums=temp;
        System.out.println(Arrays.toString(nums));
        
    }
}
