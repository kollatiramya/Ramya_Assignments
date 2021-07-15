package javaQsn_7;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class iteration {

    public static void main(String[] args) {
      
     HashMap<Integer, Integer> itr = new HashMap<>();
        itr.put(1, 1500);
        itr.put(4, 23000);
        itr.put(3, 123000);
        itr.put(5, 1300);
        itr.put(2, 320000);
        itr.put(7, 1230000);

        StringBuilder s = new StringBuilder();
        itr.forEach((m, n) -> s.append(m.toString()).append(n.toString()));
        System.out.println(s);
       
    }
}