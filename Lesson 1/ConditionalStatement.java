public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 50;
		if(age < 20) {
			System.out.println("Your age is: " + age + ";");
			}
		else if(age > 20) {
			System.out.println("Your age is: " + age + ";");
			}

		String humanGender = "woman";
		if(humanGender != humanGender) {
			System.out.println("Your human gender");
			}
		else if(humanGender == humanGender) {
			System.out.println("Your human gender :" + humanGender + ";");
			}

		double height = 1.67;
		if(height < 1.8) {
			System.out.println("Your height is:" + height + ";");
			}
		else if(height > 1.8) {
			System.out.println("Your height is:");
			}

		char [] myName = new char[] {'I', 'r', 'i', 'n', 'a'};
		if(myName[0] == 'M') {
			System.out.println("No");
			}
		else if(myName[0] == 'I') {
			System.out.println("Your name begins with a letter: " + myName [0] + ".");
			}
		else{
			System.out.println("Your full name:");
			}
	}
}
