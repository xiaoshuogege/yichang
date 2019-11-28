package cn.shuo.myco;

public class Test4<E> {
    private Object[] elementData;
    private int size;

    private static final int DEFALT_CAPACITY=10;

    public Test4(){
        elementData=new Object[DEFALT_CAPACITY];
    }
    public Test4(int capacity){

        if (capacity<0){
            throw new RuntimeException("不能为负数");
        }else if(capacity==0){
            elementData = new Object[DEFALT_CAPACITY];
        }else {
            elementData = new Object[capacity];
        }


    }
    public void add(E element){

        if (size==elementData.length){
            Object[] newArray = new Object[elementData.length+(elementData.length>>1)];

            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData=newArray;
        }

        elementData[size++]=element;
    }

    public E get(int index){

        cheak(index);
        return (E) elementData[index];
    }
    public void set(E element,int index){

        cheak(index);

        elementData[index]=element;

    }
    public void cheak(int index){
        if (index<0||index>size-1){
            throw new RuntimeException("索引不合法："+index);
        }
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
        Test4 t=new Test4(20);
        for (int i=0;i<40;i++){
            t.add("wang"+i);
        }
        System.out.println(t);
        t.set("wangshuo",10);
        System.out.println(t.get(10));
    }
}