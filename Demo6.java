import java.util.LinkedList;

public class Demo6 {

    public static void main(String args[]) {


        LinkedList<String> list = new LinkedList<String>();
        list.add("Honesty");
        list.add("is");
        list.add("the");
        list.add("Best");
        list.add("Policy");
        System.out.println("First LinkedList:" + list);


        LinkedList sec_list = new LinkedList();
        sec_list = (LinkedList) list.clone();

        System.out.println("Second LinkedList is:" + sec_list);
    }
}
