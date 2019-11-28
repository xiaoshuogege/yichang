package cn.shuo.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        MyColloction<String> m=new MyColloction<String>();
        MyColloction<Integer> m1=new MyColloction<>();
        m.set("王朔",0);
        m1.set(12345,1);
        String a=m.get(0);
        Integer b=m1.get(1);
        System.out.println(a+b);
        List list=new ArrayList();
        Map map = new HashMap();
    }
}
class MyColloction<E>{
    Object[] ob = new Object[5];
    public void set(E e,int index){
        ob[index]=e;
    }
    public E get(int index){
        return (E) ob[index];
    }
}
