package cn.shuo.myco;

public class Test5<E> {
    private Object[] elementData;
    private int size;

    private static final int DEFALT_CAPACITY = 10;

    public Test5() {
        elementData = new Object[DEFALT_CAPACITY];
    }

    public Test5(int capacity) {

        if (capacity < 0) {
            throw new RuntimeException("不能为负数");
        } else if (capacity == 0) {
            elementData = new Object[DEFALT_CAPACITY];
        } else {
            elementData = new Object[capacity];
        }


    }

    public void add(E element) {

        if (size == elementData.length) {
            Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];

            System.arraycopy(elementData, 0, newArray, 0, elementData.length);
            elementData = newArray;
        }

        elementData[size++] = element;
    }

    public E get(int index) {

        cheak(index);
        return (E) elementData[index];
    }

    public void set(E element, int index) {

        cheak(index);

        elementData[index] = element;

    }

    public void cheak(int index) {
        if (index < 0 || index > size - 1) {
            throw new RuntimeException("索引不合法：" + index);
        }
    }

    public void remove(E element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(get(i))) {
                remove(i);
            }
        }
    }

    public void remove(int index) {
        int numMoved = elementData.length - 1 - index;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null;


    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elementData[i] + ",");
        }
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static void main(String[] args) {
        Test5 t = new Test5(20);
        for (int i = 0; i < 40; i++) {
            t.add("wang" + i);
        }
        System.out.println(t);
        t.set("wangshuo", 10);
        System.out.println(t.get(10));


    }

}