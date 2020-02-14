public class ConditionalStatement {
		public static void main(String[] args){
			int age = 50;
				if(age < 20){
					System.out.println("Your age is: " + age + ";");
					}
				else if(age > 20){
					System.out.println("Your age is: " + age + ";");
					}
			String human_gender = "woman";
				if(human_gender != human_gender){
					System.out.println("Your human gender");
					}
				else if(human_gender == human_gender){
					System.out.println("Your human gender :" + human_gender + ";");
					}
			double height = 1.67;
				if(height < 1.8){
					System.out.println("Your height is:" + height + ";");
					}
				else if(height > 1.8){
					System.out.println("Your height is:");
					}
				char [] name = new char[] {'I', 'r', 'i', 'n', 'a'};
					if(name[0] == 'M'){
					System.out.println("No");
					}
					else if(name[0] == 'I'){
						System.out.println("Your name begins with a letter: " + name [0] + ".");
					}
					else{
						System.out.println("Your full name:");
					}
		}
}
