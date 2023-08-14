public class Algo_8_2 {
    public static void main(String[] args) {

        int[] numA={5,7,-2,3,4,6,7};
        int[] numB={7,8,-8,2,1,-9,6};

        for(int i=0;i<numA.length;i++){

            for(int j=0;j<numB.length;j++){

                if(numA[i]==numB[j]){
                    System.out.print(numB[j]+",");

                }
            }
        }
        System.out.print("\b\b\n");
    }
    
}
