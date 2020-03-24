public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;

    public Jaeger() {
        
    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
    }

    // public String getModelName() {
    //     return modelName;
    // }

    // void setModelName(String modelName) {
    //     this.modelName = modelName;
    // }

    // public String getMark() {
    //     return mark;
    // }

    // void setMark(String mark) {
    //     this.mark = mark;
    // }

    // public String getOrigin() {
    //     return origin;
    // }

    // void setOrigin(String origin) {
    //     this.origin = origin;
    // }


    // public float getHeight() {
    //     return height;
    // }

    // void setHeight(float height) {
    //     this.height = height;
    // }

    // public float getWeight() {
    //     return weight;
    // }

    // void setWeight(float weight) {
    //     this.weight = weight;
    // }

    public boolean drift() {
        System.out.println("You entered the drift");
        return true;
    }

    public void move() {
        System.out.println("You walked 5 steps");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useWeapon() {
        System.out.println("Fire!!!");
    }


    public String toString() {
        return "Jaeger{" +
                "modelName='" + modelName + '\'' +
                ", mark='" + mark + '\'' +
                ", origin='" + origin + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

