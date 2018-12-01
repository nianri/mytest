package test01;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("小王", 12, "男");
        Student student2 = new Student("小张", 14, "男");
        Student student3 = new Student("小马", 16, "男");
        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        int max = list.get(0).getAge();
        Student next;
        Student maxStudent = new Student();
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            next = (Student) it.next();
            System.out.println(next);
            if (max < next.getAge()) {
                max = next.getAge();
                maxStudent = next;
            }
        }
        maxStudent.setName("小猪佩奇");
        System.out.println("年龄最大的学生姓名已更改为小猪佩奇:" + maxStudent);
    }
}
