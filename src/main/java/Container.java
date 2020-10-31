import java.util.ArrayList;

public class Container<T extends Number> {
    T value;

    public Container(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show() {
        System.out.println(value.getClass().getName());
    }

    public void demo(ArrayList<? extends T> argument) {
        System.out.println(argument);
    }

    //Here, ? means an arraylist of type, which is a super class of T( which extends Number)
//    public void demo(ArrayList<? super T> argument) {
//        System.out.println(argument);
//    }
}
