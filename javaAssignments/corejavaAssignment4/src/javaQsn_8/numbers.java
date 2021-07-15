package javaQsn_8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class numbers {

    public static void main(String[] args) {
	    List<Integer> num = new ArrayList<>();
       num.add(50);
       num.add(30);
       num.add(100);
       num.add(25);
       num.add(31);
       num.add(28);
       num.add(56);
    
     Consumer<List<Integer>> iterate = a-> {a.forEach(System.out::println);};
        Thread t = new Thread(()-> iterate.accept(num));
        t.start();
    }
}