public class Algo_2 {
    
    public static void main(String[] args) {
        
        int[] num = {-5,2,7,10,58,-7,8,23};

        
        int min= num[0];
        int max=num[0];

        for(int i=0;i<num.length-1;i++){

            
            int maxIndex=0;
            int minIndex=0;
            int j;
            for( j=1;j<=i;j++){

                if(num[j]>max){
                    max=num[j];
                    maxIndex=j;

                 }

            }
            num[maxIndex]=num[i];
            max=num[i];
           

            

        }
        System.out.println(max);
        System.out.println(min);
        
        
    
    }
}
