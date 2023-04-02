import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MyTest1 {
    public static void main(String[] args) {
      /*  Map map = new HashMap();
        Date date = new Date();
        map.put(1,date);
        Object o = map.get(1);
        Object o1 = map.get(1);
        System.out.println(o==o1);*/

        System.out.println("即CPU核数 ="+ Runtime.getRuntime().availableProcessors());
    }

}
