package leetcode._0706;

public class Test {
    public static void main(String[] args) {
        MyHashMap map= new MyHashMap();
        map.remove(27);
        map.put(65, 65);
        map.remove(19);
        map.remove(0);
        map.get(18);
        System.out.println(map.get(2));
    }
}
