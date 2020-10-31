package in28minutes;

import java.util.ArrayList;
import java.util.List;

public class MyCustomList<T> {
    List<T> list = new ArrayList<>();

    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }

    public T get(int i) {
        return list.get(i);
    }

    @Override
    public String toString() {
        return "MyCustomList{" +
                "list=" + list +
                '}';
    }
}
