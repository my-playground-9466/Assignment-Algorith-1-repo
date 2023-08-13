import java.util.Arrays;
import java.util.Scanner;

public class Algo_7 {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
       do{
            
            System.out.println("Enter the sentence :");
            String input = scanner.nextLine();

            String[] sentence = input.split(" ");
            int[] temp=new int[sentence.length];

           
           

            for(int i=0;i<sentence.length;i++){
                temp[i]=sentence[i].length();

            }

            

            
            int max=temp[0];
            int min=temp[0];

            String largest=sentence[0];
            String shortest=sentence[0];

            for(int i=0;i<temp.length;i++){

                
                for(int j=1;j<=i;j++){
                 

                    if(min>temp[j]){
                        min=temp[j];
                    
                        shortest=sentence[i];
                    

                    }else if(max<temp[j]){
                        max=temp[j];
                        largest=sentence[i];
                    }
                    

                }

                 

            }
             
            System.out.println(shortest);
            System.out.println(largest);


        }while(true);
    }
}
