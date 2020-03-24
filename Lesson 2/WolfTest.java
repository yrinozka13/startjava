public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
      	wolfOne.setSexAnimal("Man");
        wolfOne.setName("Rekx");
        wolfOne.setColor("dark grey");
        wolfOne.setWeight(57);
       	wolfOne.setAge(5);
       	System.out.println(wolfOne);
        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
   }
}