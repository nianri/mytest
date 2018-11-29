package test01;

import java.util.ArrayList;
import java.util.Collection;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("c");
        collection.add("e");
        collection.add("s");
        String str = "s";
        boolean boo = listTest(collection, str);
        System.out.println(collection + "中是否存在" + str + "; " + boo);
    }

    public static boolean listTest(ArrayList<String> al, String s) {
        return al.contains(s);
    }
}
