package in28minutes;

import java.util.ArrayList;
import java.util.List;

public class GenericRunner {

    //method that returns generic type A. A can be anything
    static <A> A returnValue(A value) {
        return value;
    }

    //This method's argument X extends List, so all its argument types should be a subclass of List class
    //It then just duplicates the list using addAll method
    static <X extends List> void duplicateValue(X list) {
        list.addAll(list);
    }

    //? which is wildcard here extends Number, which ? accepts lists which are subclass of Number class
    // only. When we use '? extends', it is called upper bounded wildcard.
    static Number sumOfNumbers(List<? extends Number> numberList) {
        double total = 0.0;
        for(Number number: numberList) {
            total+= number.doubleValue();
        }
        return total;
    }

    //? which is wildcard here is a super class of Number class
    // When we use '? super', it is called lower bounded wildcard, lower-bounded by Number class here.
    static void addNumbers(List<? super Number> numberList) {
        numberList.add(1);
        numberList.add(2L);
        numberList.add(3.0f);
        numberList.add(4.25);
    }


    public static void main(String[] args) {
        MyCustomList<String> list = new MyCustomList<>();
        list.addElement("Element 1");
        list.addElement("Element 2");
        System.out.println(list);
        System.out.println("1st element string: "+list.get(0));

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(10);
        list2.addElement(11);
        System.out.println(list2);
        System.out.println("1st element integer: "+list2.get(0));

        Integer x = returnValue(7);
        String y = returnValue("Hello generic method");
        ArrayList<Integer> z = returnValue(new ArrayList<>());
        System.out.println("return 1: "+x+"\nreturn 2:"+y+"\nreturn 3: "+z);

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
        duplicateValue(numbers);
        System.out.println("Duplicated list: "+numbers);

        System.out.println("Integer list sum: "+sumOfNumbers(List.of(1, 2, 3, 4, 5)));
        System.out.println("Double list sum: "+sumOfNumbers(List.of(1.1, 2.2, 3.3, 4.4, 5.5)));
        System.out.println("Long list sum: "+sumOfNumbers(List.of(1L, 2L, 3L, 4L, 6L)));

        List emptyList = new ArrayList();
        addNumbers(emptyList);
        System.out.println("Lower-Bounded wildcard wala list: "+emptyList);
    }
}
