package test01;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Test03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Collection<Integer> collection = toCollection(arr);
        System.out.println(collection);
    }

    private static Collection<Integer> toCollection(int[] arr) {
        Collection<Integer> integers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            integers.add(arr[i]);
        }
        return integers;

    }
}
