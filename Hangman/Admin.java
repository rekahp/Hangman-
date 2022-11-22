import java.util.Scanner;

public class Admin {
    
    private String realChoice;
    public Admin() {
    }
        
        public static void clearScreen() {  

            System.out.print("\033[H\033[2J");  
         
            System.out.flush();  
         
         }
    
         public int setChoice() {
            Scanner in = new Scanner(System.in);
            realChoice = (in.nextLine());
            try{
               return Integer.valueOf(realChoice);

            }
            catch (Exception e){}
   
            System.out.println("Please try again.");
            return 0;
         }
         public int getChoice() {
            return Integer.valueOf(realChoice);
         }



}
