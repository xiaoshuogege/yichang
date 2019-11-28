package cn.shuo.myco;

public class Test3<E> {
    private Object[] elementData;
    private int size;

    private static final int DEFALT_CAPACITY=10;

    public Test3(){
        elementData=new Object[DEFALT_CAPACITY];
    }
    public Test3(int capacity){
        elementData = new Object[capacity];
    }
    public void add(E element){

        if (size==elementData.length){
            Object[] newArray = new Object[elementData.length+(elementData.length>>1)];

            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData=newArray;
        }

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
        Test3 t=new Test3(20);
        for (int i=0;i<40;i++){
            t.add("wang"+i);
        }
        System.out.println(t);
    }
}