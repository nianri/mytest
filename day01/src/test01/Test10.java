package test01;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Test10 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Collection<Integer> maxto10 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100 - 1 + 1) + 1);
            if (integers.get(i) >= 10) {
                maxto10.add(integers.get(i));
            }
        }
        System.out.println("原集合" + integers);
        System.out.println("元素大于等于10新集合" + maxto10);
    }
}
