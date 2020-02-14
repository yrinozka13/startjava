public class MyFirstGame {	
    public static void main(String[] args) {
    	int zagad = 48;

        int i = 0;
        
        do {
                
                if(i < zagad){
                        System.out.println("The number you entered is less than what the computer made: " + i);
                } else if(i > zagad){
                        System.out.println("The number you entered is greater than what the computer made: " + i);
                } 
            i++;        
         } while(i <= 100);

         System.out.println("You guessed! " + zagad);
    	
    }
}