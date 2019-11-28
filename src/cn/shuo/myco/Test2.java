package cn.shuo.myco;

public class Test2<E> {
    private Object[] elementData;
    private int size;

    private static final int DEFALT_CAPACITY=10;

    public Test2(){
        elementData=new Object[DEFALT_CAPACITY];
    }
    public Test2(int capacity){
        elementData = new Object[capacity];
    }
    public void add(E element){



        elementData[size++]=element;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i=0;i<size;i++){
            sb.append(elementData[i]+",");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }

    public static void main(String[] args) {
        Test2 t=new Test2(20);
        t.add("aaa");
        t.add("bbb");
        System.out.println(t);
    }
}