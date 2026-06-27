class Outer {
    public void display() {
        System.out.println("This is Outer class display method.");
    }
    class Inner {
        public void display() {
            System.out.println("This is Inner class display method.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.display();
        Outer.Inner in = obj.new Inner();
        in.display();
    }
}