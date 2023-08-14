import java.util.Arrays;

public class Algo_8_1{
    public static void main(String[] args) {

        int[] numA={5,7,-2,3,4,6,7};
        int[] numB={7,8,-8,2,1,-9,6};

        int[] temp = new int[numA.length+numB.length];

        //temp=numA;

        for(int i=0;i<numA.length;i++){

            for(int j=0;j<numA.length;j++){

                if( i==j ){
                    temp[i]=numA[j];

                }
            
            }
        }

        for(int i=0;i<numB.length;i++){
            for(int j=0;j<numB.length;j++){

                if(i==j){
                temp[numA.length+i]=numB[j];
                }
            }
        }



            


        
        System.out.println(Arrays.toString(temp));

        
    }
}