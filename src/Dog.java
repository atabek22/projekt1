public class Dog {
    double age;
    String color;
    int paws;
    String name;

    public Dog(double age, String color, int paws, String name) {
        this.age = age;
        this.color = color;
        this.paws = paws;
        this.name = name;
    }

    public Dog() {

    }

    public Dog(double age) {
        this.age = age;
    }

    public Dog(String color) {
        this.color = color;
    }

    public Dog(int paws) {
        this.paws = paws;
    }

    public double getAge() {
        return this.age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPaws() {
        return this.paws;
    }

    public void setPaws() {
        this.paws = paws;
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }

}
