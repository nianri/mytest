package test01;

import java.util.ArrayList;

public class Test07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer integ = 1;
        int firstIndex = listTest(list, integ);
        System.out.println(integ + "在" + list + "中第一次出现的位置是:" + firstIndex);
    }

    public static int listTest(ArrayList<Integer> al, Integer s) {
        return al.indexOf(s);
    }
}
