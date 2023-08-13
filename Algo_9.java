import java.util.Arrays;
import java.util.Scanner;

public class Algo_9 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String input;
        do{
            do{
            
            System.out.println("Enter the word :");
            input = scanner.nextLine();

            }while(!(input.length()>1));

            char[] chars=input.toCharArray();
            char[] temp=new char[chars.length];

        
            for(int i=0;i<chars.length;i++){
                char letter=chars[i];
            
                temp[chars.length-1-i]=chars[i];
            }

            if(Arrays.equals(temp,chars)){
                System.out.println("Word is palindrome");
            }else{
                 System.out.println("Word is not palindrome");
            }
            

        }while(true);
    
        
    }
    
}
