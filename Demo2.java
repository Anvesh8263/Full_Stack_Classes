import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Anvesh");
        list.add("Shailendra");
        list.add("Ritesh");
        list.add("Sushobhit");
        System.out.println("****************************************");
        System.out.println("Before Sorting : "+ list);
        Collections.sort(list);
        System.out.println("****************************************");
        System.out.println("After Sorting : "+ list);


        System.out.println("task");
        System.out.println(list);
        System.out.println("----------------After----------------------");
        Collections.sort(list);
        System.out.println(list);

        //Array list is non Synchronus
    }
}
