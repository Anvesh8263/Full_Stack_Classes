import java.util.ArrayList;
import java.util.Iterator;
public class Demo1 {
    public static void main(String[] args){
    ArrayList<String> list = new ArrayList<>();
    list.add("Anvesh");
    list.add("Vidhi");
    System.out.println(list);
    System.out.println("-----------------------------------------");

    // using Iterator
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
        System.out.println(iterator.next());
     }

      System.out.println("******************************");
    //for each
    for(String s: list){
        System.out.println(s);
    }
    System.out.println("***************************");
      list.set(1,"Anvesh");
      System.out.println(list.get(1));

        }
}
