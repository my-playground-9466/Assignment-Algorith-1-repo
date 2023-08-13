public class Algo_2 {

    public static void main(String[] args) {
        
        int[] num = {-5,2,7,10,58,-7,8,23};

        
        int min= num[0];
        int max=num[0];
      

        for(int i=0;i<num.length;i++){

            int minIndex=0;
        
            for(int j=1;j<=i;j++){

                if(num[j]<min){
                    min=num[j];
                    minIndex=j;

                } else if(num[j]>max) {
                    max=num[j];
                }   
            
            }
            num[i]=num[minIndex];
            min=num[i];

        }

        System.out.println(min);
        System.out.println(max);
        
        
        
    
    }
}
