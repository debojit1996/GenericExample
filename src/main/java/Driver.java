import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        Container<Integer> obj = new Container<>(9);
        obj.show();
        obj.demo(new ArrayList<Integer>());
    }
}
