package circus.animal;

public abstract class Bird extends Animal {
    @Override
    public String speak() {
        return null;
    }

    public void fly() {
        System.out.println("Whee ...");
    }

    @Override
    public int getValue() {
        return 0;
    }
}
