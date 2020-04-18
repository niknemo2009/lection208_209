package Lection170420;

import java.util.function.*;

public class Example2 {

    public static void main(String[] args) {
        Consumer<Student> consumer=q->{
            System.out.println(q.toString());
        };
        Predicate<Student> predicate=w->w.age>18;
        Function<Student,String> function=r->r.name;
        UnaryOperator<Student>  unaryOperator= t->{
            t.age++;
          //  public Student apply(Student student) {


           // public String apply(Student student) {
return  t;
        };
        Supplier<Student> supplier=()-> new Student(23,"hgfgfgf");
        Supplier<Student> supplier33=Student::new;
           // public Student get() {

        }
          // public boolean test(Student student) {




    }

