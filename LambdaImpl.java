import java.sql.SQLOutput;

interface Iwritecontent{
    void content();

    void show();
}
class ShowData implements Iwritecontent{

    @Override
    public void content() {
        System.out.println("Hello Here is some content");
    }

    @Override
    public void show() {
        System.out.println("Hello Everyone");
    }
}
public class LambdaImpl {
    public static void main(String[] args){
        //without lambda expression
        ShowData showData = new ShowData();
        showData.content();
        showData.show();

        Iwritecontent c2 = new Iwritecontent() {
            @Override
            public void content() {
                System.out.println("Anvesh Mangalam");
            }

            @Override
            public void show() {
                System.out.println("Vidhi Goyal");
            }
        };
        c2.content();
        c2.show();
        
        
        

    }
}
