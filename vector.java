import java.util.*;
import java.io.*;

class vectorJava{
    public static void main(String args[]) throws IOException{
        Vector v1=new Vector();  //creating a default vector
        v1.add(1);
        v1.add(2);
        v1.add("Rishabh");
        v1.add("Khandagre");
        v1.add("hello");

        System.out.println("Vector v1="+v1);

        Vector<Integer>v2=new Vector<Integer>();  //creating generic vector
        v2.add(1);
        v2.add(2);
        v2.add(67);
        
        v2.add(Integer.parseInt("1234"));
        System.out.println("Vector v2="+v2);
    }
}