package test01;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Test06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("s");
        list.add("a");
        list.add("s");
        String a1 = "a";
     boolean boo = listTest(list);
        System.out.println(list+"是否为空: "+boo);
    }
    public static boolean listTest(ArrayList<String> al) {
        return al.isEmpty();
    }
}
