public class Wolf {
    private String sexAnimal;
    private String name;
    private int weight;
    private int age;
    private String color;

    public String getSexAnimal() {
        return sexAnimal;
    }

    void setSexAnimal(String sexAnimal) {
        if (sexAnimal == "") {
            System.out.println("Empty line");
        } else {
            this.sexAnimal = sexAnimal;
        }
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        if (name == "") {
            System.out.println("Empty line");
        } else {
            this.name = name;
        }
    }

    public int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        if (weight == 0) {
            System.out.println("The entered number is less than 0");
        } else {
            this.weight = weight;
        }
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        if (color == "") {
            System.out.println("Empty line");
        } else {
            this.color = color;
        }
    }

    public boolean walk() {
        System.out.println("He walks very fast");
        return true;
    }

    public void sit() {
        System.out.println("He sits with a flat back");
    }

    public void run() {
        System.out.println("He runs very fast");
    }

    public void howl() {
        System.out.println("He howls very loudly");
    }

    public void hunt() {
        System.out.println("He is good at hunting");
    }

    public String toString() {
        return "Wolf{" +
                "sexAnimal='" + sexAnimal + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}