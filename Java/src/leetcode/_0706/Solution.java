package leetcode._0706;

class MyHashMap {
    public class ListNode {
        public int key;
        public int value;
        public ListNode next;

        public ListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int key, int value, ListNode next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    public int getHash(int key) {
        return key % length;
    }
    private int length = 16;
    private ListNode[] mapList;
    /** Initialize your data structure here. */
    public MyHashMap() {
        mapList = new ListNode[length];

    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        //System.out.println(key + "put");
        ListNode node = new ListNode(key, value);
        if (mapList[getHash(key)] == null) {
            mapList[getHash(key)] = node;
            return;
        }

        ListNode temp = mapList[getHash(key)];
        while (temp != null) {
            if (temp.key == key) {
                temp.value = value;
                break;
            }
            if (temp.next == null) {
                temp.next = node;
            }
            temp = temp.next;
        }

    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        //System.out.println(key + "get");
        ListNode head = mapList[getHash(key)];
        if (head == null) {
            return -1;
        }

        ListNode temp = head;
        while (temp != null) {
            if (temp.key == key) {
                return temp.value;
            }
            temp = temp.next;
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        //System.out.println(key + "remove");
        if (mapList[getHash(key)] == null) {
            return;
        }
        if (mapList[getHash(key)].key == key) {
            mapList[getHash(key)] = mapList[getHash(key)].next;
            return;
        }

        ListNode temp = new ListNode(-1, -1, mapList[getHash(key)]);
        while (temp.next != null ) {
            if (temp.next.key == key) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }
}
