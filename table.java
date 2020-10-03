package test24;


import java.util.Arrays;

/**
 *  顺序表
 */
class MyArrayList {
    public int[] elem; // null
    public int usedSize; // 0

    public MyArrayList() {
        this.elem = new int[5];
        this.usedSize = 0;
    }

    // 打印顺序表
    public void display() {
        for(int i = 0;i < usedSize;i++) {
            System.out.print(elem[i]+" ");
        }
        System.out.println();
    }

    //在pos 位置新增元素
    public void add(int pos,int data) {
        if(pos < 0 || pos > this.usedSize) {
            System.out.println("该位置不合法！");
        }
        //扩容
        if(this.usedSize == this.elem.length) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        for(int i = this.usedSize;i >= pos;i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;

    }

    //判定是否含某个元素
    public boolean contains(int toFind) {
        for(int i = 0;i < this.usedSize;i++) {
            if(elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for(int i = 0;i < this.usedSize;i++) {
            if (elem[i] == toFind) {
                return i+1;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos < 0 || pos >= this.usedSize) {
            System.out.println("该位置不合法！");
        }
        return elem[pos-1];
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos,int value) {
        if(pos < 0 || pos > this.usedSize) {
            System.out.println("该位置不合法！");
        }
        this.elem[pos] = value;
    }

    //删除第一次出现的关键字 key
    public void remove(int toRemove) {
        //找到是否有 toRemove
        /*for(int i = 0;i < this.usedSize;i++) {
            if (elem[i] == toRemove) {
                for(int j = i;j < usedSize;j++) {
                    elem[j] = elem[j+1];
                }
            }
        }*/
        int index = search(toRemove);
        if(index == -1) {
            System.out.println("么找到该元素！");
            return;
        }
        for(int i = index;i < this.usedSize-1;i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;


    }

    //获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    //清除顺序表
    /**
     * 如果是引用类型： elem[i] = null;
     */
    public void clear() {
        this.usedSize = 0; // 仅限于简单类型
    }


}
public class table {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.display();
        System.out.println(myArrayList.contains(6));
        System.out.println("所找的数在第"+myArrayList.search(6)+"个位置");
        System.out.println(myArrayList.getPos(2));
        myArrayList.setPos(2,12);
        myArrayList.display();
        myArrayList.remove(6);
        myArrayList.display();

    }

}
