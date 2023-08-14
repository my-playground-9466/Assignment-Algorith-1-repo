import java.util.Scanner;

public class Algo_10 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        
        String text;
        do{
            
            System.out.print("Enter the phone number:");
            text=scanner.nextLine();

            
            if(!text.isEmpty()){

            
            char[] numbers;
            if(text.startsWith("+94 ") && text.length()==15){

                numbers=text.toCharArray();

                if(numbers[3]== ' ' && numbers[6]==' ' && numbers[10]==' '){

                    boolean valid = true;
                    for(int i=4;i<numbers.length;i++){

                        if(i==6 || i==10){
                            if(numbers[i]!=' '){
                                valid=false;
                                break;

                            }
                        }else if(!Character.isDigit(numbers[i])){
                            valid =false;
                        }


                    }
                    if(valid) System.out.println("Number is valid");
                    else System.out.println("Number is not valid");


                }else if(text.startsWith("0")&& text.length()==11){

                    numbers=text.toCharArray();
                    boolean valid = true;
                    for(int i=1;i<numbers.length;i++){

                        if(i==3){
                            if(numbers[i]!='-'){
                                valid=false;
                                break;

                            }
                        }else if(!Character.isDigit(numbers[i])){
                            valid =false;
                        }


                    }
                    if(valid) System.out.println("Number is valid");
                    else System.out.println("Number is not valid");


                }

            }
            
        }else{
            System.out.println("Number can't be empty");
        }

    }while(true);

            
            


        

    }
    
}
