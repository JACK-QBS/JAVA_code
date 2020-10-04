package test24;

/**
 * 单链表
 */
class Node {
    public int data;
    public Node next; // 表示下个节点的引用
    public Node(int data) {
        this.data = data;
    }
}
public class SingleLinkedList {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addFirst(6);
        singleLinkedList.addLast(1);
        singleLinkedList.addFirst(4);
        singleLinkedList.addLast(8);
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(6);
        singleLinkedList.display();
        //singleLinkedList.remove(1);
        //singleLinkedList.display();
        System.out.println(singleLinkedList.contains(6));
        singleLinkedList.removeAllKey(6);
        singleLinkedList.display();
    }

    public Node head;// 标识头节点
    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = this.head;
        this.head = node;
    }

    // 打印
    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    // 尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
        } else {
            Node cur = this.head;
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    // 检查下标是否合法
    public boolean checkIndex(int index) {
        if(index == 0 || index > this.getLength()) {
            System.out.println("下标不合法！");
            return false;
        }
        return true;
    }

    // 任意位置插入，第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        if(!checkIndex(index)) {
            return;
        }
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == this.getLength()) {
            addLast(data);
            return;
        }
        Node cur = searchPrev(index);//cur 此时保存的就是 index-1 位置节点的引用
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;


    }
    public int getLength() {
        int count = 0;
        Node cur = this.head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    //查找index的位置，找到并返回引用
    public Node searchPrev(int index) {
        Node cur = this.head;
        int count = 0;
        while(count < index-1) {
            cur = cur.next;
            count++;
        }
        return cur;

    }

    // 找前驱
    public Node searchPrevNode(int key) {
        Node cul = this.head;
        while (cul.next != null) {
            if(cul.next.data == key) {
                return cul;
            }
            cul = cul.next;
        }
        return null;
    }
    //删除第一次出现关键字 key 的节点
    public void remove(int key) {
        // 头节点是要删除的节点
        if(this.head == null) return;
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node cul = searchPrevNode(key);
        if(cul == null) {
            System.out.println("没有你要删除的数字！");
            return;
        }
        Node del = cul.next; // 所要删除的节点
        cul.next = del.next;
    }


    // 判断是否包含某个元素
    public boolean contains(int toFind) {
        Node cul = this.head;
        while (cul != null) {
            if(cul.data == toFind) {
                return true;
            }
            cul = cul.next;
        }
        return false;
    }

    // 删除所有值为 key 的节点
    public void removeAllKey(int key) {
        Node cul = this.head;
        while (cul.next != null) {
        remove(key);
        cul = cul.next;
        }
    }

}
