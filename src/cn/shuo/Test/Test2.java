package cn.shuo.Test;

import java.util.ArrayList;
import java.util.Collection;

public class Test2 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.size();
        System.out.println(c);
        System.out.println(c.isEmpty());
        c.add("王朔");
        c.add("王小朔");
        System.out.println(c);
        System.out.println(c.size());

        System.out.println(c.contains("王朔"));
        System.out.println(c.contains("王大朔"));

        Object[] objs=c.toArray();
        System.out.println(objs);
        c.remove("王小朔");
        System.out.println(c);
        c.clear();
        System.out.println(c.size());
    }
}
