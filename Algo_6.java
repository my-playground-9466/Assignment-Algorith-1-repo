
import java.util.Scanner;

public class Algo_6 {

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
                if(!(letter==' ')){

                    temp[i]=chars[i];

                }else{

                    

                     temp[i]=chars[i+1];
                     letter=chars[i+2];
                     
                    }
                
                }
                System.out.println(Arrays.toString(temp));

           
            
            

           // System.out.println(Arrays.toString(chars));
        }while(true);
        

    }
    
}
