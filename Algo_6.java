
import java.util.Arrays;
import java.util.Scanner;

public class Algo_6 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String text;
        do{
            do{
                System.out.print("Enter the text :");
                text=scanner.nextLine().strip();

            }while(text.isBlank());

            String[] sentence=text.split(" ");
            String[] temp=new String[sentence.length];

        
            for(int i=0;i<sentence.length;i++){
                temp[sentence.length-1-i]=sentence[i];
            }

            sentence=temp;
            System.out.println(Arrays.toString(sentence));

        }while(true);
        

    }
    
}
