import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class student implements Comparable<student>{
    public int id;
    public String name;
    public String email;
    public student(int id, String name, String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name-'" + name + '\'' +
                ", email-'" + email + '\'' +
                '}';
    }
    //copareTo{ student = class , student = another object }
    public int compareTo(student student) {
        if(id> student.id){
            return 1;
        } else if (id< student.id) {
            return -1;
        }
        else{
            return 0;
        }
    }
}
//    class infomation{
//    public int id;
//    public int rollno;
//    public int marks;
//
//    public infomation(int id, int rollno, int marks){
//        this.id=id;
//        this.rollno=rollno;
//        this.marks=marks;
//    }
//        public String toString(){
//            return "information{" +
//                    "id-" + id +
//                    ", rollno-'"+ rollno +'\''+
//                    ", email-'" + marks +'\'' +
//                    '}';
//        }
//    }


public class Demo4  {
    public static void main(String[] args) {

        student obj1=new student(2,"Aryan","aryan@gmail.com");
        student obj2=new student(1,"Anvesh","anvesh@gmail.com");
        student obj3=new student(3,"Sumit","sumit@gmail.com");

        ArrayList<student> list=new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        //Comparable is a interface having a function "compareTo().it work in same class."
        Collections.sort(list);
        //Comparator in another class
        for(student s: list){
            System.out.println(s);
        }
//        infomation obj1=new infomation(1,1,91);
//        infomation obj2=new infomation(2,6,89);
//        infomation obj3=new infomation(3,52,92);
//
//        ArrayList<infomation> list=new ArrayList<>();
//        list.add(obj1);
//        list.add(obj2);
//        list.add(obj3);

//        for(infomation s: list){
//            System.out.println(s);
//        }
//        Iterator itrator=list.iterator();
//        while(itrator.hasNext()){
//            System.out.println(itrator.next());
// enumeration cannot work in Arraylist and linkedlist....
//        }
    }
}
