public class Cycle {	
    public static void main(String[] args) {
    	   	for (int i = 1; i <= 20; i++){
    				System.out.println("Number of 1 from 20: " + i);
    				}

    			System.out.println(" ");

    				int k = -6;
    	    	while(k <= 6){
						System.out.println("k= " + k );
						k = k+2;
    	 			}
        		
        	System.out.println(" ");

       			int j = 1;
    				int result = 9;
    				do {
						result = result + j;
    	 			if(result % 2 != 0){
    	 					System.out.println("Number " + result + " no event");
    	 					} else if(result % 2 == 0){
    	 				System.out.println("Nubber " + result + " event");
    	 				}
        			j++;		
    	 				} while(j <= 11);

    	 			System.out.println("11 + 13 + 15 + 17 + 19 = " + result);	
    	
    		}
}