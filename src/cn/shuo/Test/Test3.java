package cn.shuo.Test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        //Test02();
        Test03();
    }
    public static void Test01(){

    }
    public static void Test02(){
        List<String> l=new ArrayList<>();
        l.add("aaa");
        l.add("bb");
        l.add("ccc");

        List<String> l1=new ArrayList<>();
        l1.add("aaa");
//        l1.add("dd");
//        l1.add("eee");

        System.out.println("list01:"+l);
//        l.addAll(l1);
//        l.removeAll(l1);
        l.retainAll(l1);
        System.out.println(l.containsAll(l1));


        System.out.println(l);
    }
    public static void Test03(){
        List<String> l=new ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        System.out.println(l);
        l.add(2,"王朔");
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        l.set(2,"王朔");
        System.out.println(l);
        l.set(2,"aa");
        System.out.println(l);
        System.out.println(l.get(2));
        l.add("C");
        l.add("B");
        l.add("A");
        System.out.println(l);
        System.out.println(l.indexOf("B"));
        System.out.println(l.lastIndexOf("B"));
    }
}
