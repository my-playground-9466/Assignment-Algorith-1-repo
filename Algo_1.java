import java.util.Scanner;

public class Algo_1{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        loop:
        do{
            System.out.print("Input a number :");
            int input = scanner.nextInt();

           if(!(input>0))continue loop;

            int n1=0;int n2=1; int n3=0;

            for(int i=2;i<input;i++){
                n3=n2+n1;
                if(n3<input){
              
                System.out.print(n3 + " ");
                n1=n2;
                n2=n3;
                
                }

            }

            System.out.println();

            


        }while(true);
    }
    
}