package Lection170420;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class Example1 {
    public static void main(String[] args) {
        List<Student> list=new Vector();
        Student st1=new Student(19,"Anton");
        Student st2=new Student(20,"Alina");
        Student st3=new Student(21,"Ivan");
        Student st4=new Student(18,"Irina");
        Student st5=new Student(19,"Andriy");
        Collections.addAll(list,st1,st2,st3,st4,st5);
        Comparator<Student>  compAge=(w,r)->{
//            int result=-2;
//            if(w.age==r.age){
//                result=0;
//            }else if(w.age>r.age){
//                result=1;
//            }else{
//                result=-1;
//            }
            return w.age==r.age?0:(w.age>r.age?1:-1);
        };
          //  public int compare(Student o1, Student o2) {


        Collections.sort(list,compAge);
                System.out.println(list+"  11111111111111");

       final int var=34;
       final Example1 ex1=new Example1();
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
               /// var++;
                //ex1.print();
                //ex1=new Example1();
                return var+3;
            }
        });
        Collections.sort(list,(q,z)-> q.name.compareTo(z.name));
        System.out.println(list+"  222222222222222");
        Comparator<Student>  qaz=Example1::print;
        Collections.sort(list,qaz);
        System.out.println(list+"  3333333333");
    }

    static int print(Student q,Student s){
        System.out.println("qqqqqqqq");
    return 0;
    }
    int sum(int ... elements){
        int result=0;
        for(int temp:elements){
            result+=temp;
        }
        return result;
    }
}

