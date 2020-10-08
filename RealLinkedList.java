package test24;

class ListNode {
    public int data;
    public ListNode next;
    public ListNode prev;

    public ListNode(int data) {
        this.data = data;
    }
}
public class RealLinkedList {
    public ListNode head; // 头节点
    public ListNode tail; // 尾节点

    // 头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    // 尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            head = node;
            tail = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
    }

    // 打印
    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    // 任何位置插入，第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        if(index < 0 || index > size()) return;
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == size()) {
            addLast(data);
            return;
        }
        ListNode cur = searchIndex(index);
        ListNode node = new ListNode(data);
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
    }
    public ListNode searchIndex(int index) {
        ListNode cur = this.head;
        while(index > 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }


    // 得到链表的长度
    public int size() {
        ListNode cur = this.head;
        int count = 0;
        while(cur != null) {
            count ++;
            cur = cur.next;
        }
        return count;
    }

    // 删除节点
    public void remove(int key) {
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                //删除的是不是头节点
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        //删除的不是未节点
                        cur.next.prev = cur.prev;
                    } else {
                        this.tail = cur.prev;
                    }
                }
                //删除完成
                return;
            } else {
                cur = cur.next;
            }
        }
    }

    //删除所有等于 key 的节点
    public void allRemove(int key) {
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                //删除的是不是头节点
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        //删除的不是未节点
                        cur.next.prev = cur.prev;
                    } else {
                        this.tail = cur.prev;
                    }
                }
            }
                cur = cur.next;
        }
    }

    // 清空链表
    public void clear() {
        ListNode cur = this.head;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = null;
            cur.prev = null;
            cur = curNext;
        }
        this.head = null;
        this.tail = null;
    }




    public static void main(String[] args) {
        RealLinkedList realLinkedList = new RealLinkedList();
        realLinkedList.addFirst(1);
        realLinkedList.addFirst(2);
        realLinkedList.addFirst(3);
        realLinkedList.addFirst(4);
        realLinkedList.addFirst(5);
        realLinkedList.display();
        realLinkedList.addLast(19);
        realLinkedList.display();

        realLinkedList.addIndex(3,99999);
        realLinkedList.display();

        realLinkedList.remove(5);
        realLinkedList.display();


    }


}
