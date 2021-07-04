package leetcode._0146;


public class LRUCache{
    class Node<T> {
        T data;
        Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    class MyLinkedList<T> {
        Node list;
        int size;

        public MyLinkedList() {
            size = 0;
        }

        //添加到头部
        public void put(T data) {
            Node node = new Node(data, list);
            list = node;
            size++;
        }
        //按下标添加
        public void put(int index, T data) {
            index = index - 1;
            if (list == null) {
                put(data);
                return;
            }
            checkIndex(index);
            Node head = list;
            Node temp = list;
            for (int i = 0; i < index; i++) {
                head = temp;
                temp = temp.next;
            }
            Node node = new Node(data, temp);
            head.next = node;
            size++;
        }
        //删除头结点
        public void remove() {
            if (list != null) {
                Node temp = list;
                list = list.next;
                temp.next = null;
                size--;
            }
        }

        public void remove(int index) {
            index = index - 1;
            checkIndex(index);
            Node temp = list;
            Node head = list;
            for (int i = 0; i < index; i++) {
                head = temp;
                temp = temp.next;
            }
            head.next = temp.next;
            temp.next = null;
            size--;
        }

        public void removeLast() {
            if (list == null) {
                return;
            }
            Node temp = list;
            Node node = list;
            while (temp.next != null) {
                node = temp;
                temp = temp.next;
            }
            node.next = null;
            size--;
        }

        public void set(int index, T data) {
            index = index - 1;
            checkIndex(index);
            Node temp = list;
            Node head = list;
            for (int i = 0; i < index; i++) {
                head = temp;
                temp = temp.next;
            }
            head.data = data;
        }

        //查询第一个节点
        public T get() {
            return (T) list.data;
        }

        //按下标查询节点
        public T get(int index) {
            index = index - 1;
            checkIndex(index);
            Node temp = list;
            Node head = list;
            for (int i = 0; i < index; i++) {
                head = temp;
                temp = temp.next;
            }

            return (T) head.next.data;
        }

        //查询最后一个节点
        public T getLast() {
            if (list == null) {
                return null;
            }

            Node temp = list;
            Node head = list;
            while (temp.next != null) {
                head = temp;
                temp = temp.next;
            }
            return (T) head.next.data;
        }


        public void checkIndex(int index) {
            if (index < 0 && index > size) {
                throw new IndexOutOfBoundsException(String.format("index: %d, size: %d", index, size));
            }
        }

        @Override
        public String toString() {

            Node temp = list;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
            return "";
        }

    }

    int size;
    MyLinkedList myLinkedList;
    public LRUCache(int capacity) {
        size = capacity;
        myLinkedList = new MyLinkedList();
    }

    public int get(int key) {
        myLinkedList.checkIndex(key);
        int res = (int) myLinkedList.get(key);
        myLinkedList.remove(key);
        myLinkedList.put(res);

        return res;
    }

    public void put(int key, int value) {
        myLinkedList.checkIndex(key);
        myLinkedList.put(key, value);
    }
}

