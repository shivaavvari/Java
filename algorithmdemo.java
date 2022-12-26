package java_proj;
import java.util.*;

public class algorithmdemo {
public static void main(String[] args) {
	

	LinkedList l = new LinkedList();
    l.add(new String("Java"));
    l.add(new String("is"));
    l.add(new String("platform"));
    l.add(new String("independent"));
    Comparator r=Collections.reverseOrder();
    Collections.sort(l,r);
    Iterator iter = l.iterator();
    while (iter.hasNext())
    {
    	System.out.println(iter.next()+"");
    }
    Collections.shuffle(l);
    iter =l.iterator();
    while (iter.hasNext())
    {
    	System.out.println(iter.next()+"");
    }
    



}
}