import java.util.ArrayList;
import java.util.Iterator;

class Student{
   public int id;
   public String name;
   public String email;

   public Student(int id, String name, String email) {
       this.id = id;
       this.name = name;
       this.email = email;

   }

    public String toString() {
       return "Student{" +
               "id=" + id +
               ", name-'" + name + '\'' +
               ", email-'" + email + '\'' +
               '}';

    }
}

public class Demo3 {
    public static void main(String[] args) {

        Student obj1 = new Student(1, "Anvesh", "anvesh30@gmail.com");
        Student obj2 = new Student(2, "Vidhi", "vidhi18@gmail.com");


        ArrayList<Student> student = new ArrayList<>();
        student.add(obj1);
        student.add(obj2);
        //System.out.println(student);

        for(Student s: student){
            System.out.println(s);
        }


    }
}
