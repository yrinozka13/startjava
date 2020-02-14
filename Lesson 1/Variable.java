public class Variable {
	public static void main(String[] args) {

        byte windows = 7;
        short sistem = 32;
        int prozessor_core_TM = 2;
        long prozessor_T = 810;
        float memory = 3.0f;
        double zastota = 2.00;
        char prozessor_ntel = 'R';
        String ntl = Character.toString(prozessor_ntel); 
        boolean pero_sensor = false;

        System.out.println(" Properties of my computer and operating system: ");
        System.out.println(" Windows " + windows + ";" );
        System.out.println(" Operating system " + sistem + " bit; " );
        System.out.println(" CPU Core(TM)" + prozessor_core_TM +  ";");
        System.out.println(" CPU T" + prozessor_T + ";");
        System.out.println(" Installed memory " + memory + " Gb;");
        System.out.println(" Frequency " + zastota + " GHr;" );
        System.out.println(" CPU Intel" + "("+ ntl +  ");");
        System.out.println(" Pen and touch input for this screen " + pero_sensor +  ".");

	}
}
	