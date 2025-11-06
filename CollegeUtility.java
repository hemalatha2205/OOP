package co4_scenario;

class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class CollegeUtility {
    public static <T> boolean compareBoxes(Box<T> b1, Box<T> b2) {
        return b1.get().equals(b2.get());
    }

    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        Box<Integer> b2 = new Box<>();
        b1.set(100);
        b2.set(100);

        System.out.println("Boxes equal? " + compareBoxes(b1, b2));

        Box<String> s1 = new Box<>();
        Box<String> s2 = new Box<>();
        s1.set("Hello");
        s2.set("World");
        System.out.println("Boxes equal? " + compareBoxes(s1, s2));
    }
}
