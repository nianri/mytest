package test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Test04 {
    public static void main(String[] args) {
        Collection<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        Object[] objects = integers.toArray();
        System.out.println(Arrays.toString(objects));
    }
}
