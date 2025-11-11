import java.util.LinkedList;

public class HashMapImple {
    static class MyHashMap<k, v> {
        public static final int DEFAULT_CAPAXITY = 4;
        public static final float DEFAULT_LOAD_FACTER = 0.75f;
        private LinkedList<Node>[] buckets;

        private int n = 0;

        private class Node {
            k key;
            v value;

            Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }
        private void initBuckets(int N){
            buckets = new LinkedList[N];
            for(int i=0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
        }

        public MyHashMap(){
            initBuckets(DEFAULT_CAPAXITY);
        }
        public int size() {
            n = 0;

            return n;
        }

        private int HashFun(k key){
            int hc = key.hashCode();
            return Math.abs(hc)%buckets.length;
        }
        public void put(k key, v value) {
            // int bi = HashFun() ;
        }

        public v get(k key) {
            return null;

        }

        public v remove(k key) {

            return null;
        }

    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        MyHashMap<Integer, Integer> mp1 = new MyHashMap<>();
        MyHashMap<Character, Integer> mp2 = new MyHashMap<>();

    }
}
