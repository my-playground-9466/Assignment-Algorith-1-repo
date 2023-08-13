import java.util.Arrays;
import java.util.Scanner;

public class Algo_5 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String text;
        do{
            do{
                System.out.print("Enter the text :");
                text=scanner.nextLine();

            }while(text.isBlank());

            char[] chars=text.toCharArray();
            char[] temp=new char[chars.length];

           
            for(int i=0;i<chars.length;i++){
                char letter=chars[i];

                if(letter==' ') continue;
            
                temp[chars.length-1-i]=chars[i];

            }

            chars=temp;
            System.out.println(Arrays.toString(chars));
            
        }while(true);
        

    }
    
}
