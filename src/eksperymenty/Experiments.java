package eksperymenty;

import java.util.ArrayList;

public class Experiments {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.set(4, numbers.get(0));
        System.out.println(numbers);
    }
}