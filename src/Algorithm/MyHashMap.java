package Algorithm;

public class MyHashMap {
    private Object[] map=null;
    private int capacity=10;
    private float loadFactor=0.75f;
    private int size  =0;
    public MyHashMap(){
        map=new Object[10];
    }
    public MyHashMap(int capacity){
        if(capacity<=0){

        }else {
            this.capacity=capacity;
        }
    }

    public MyHashMap(int capacity, float loadFactor) {
        if(capacity<=0||loadFactor<=0){

        }else {
            this.capacity = capacity;
            this.loadFactor = loadFactor;
        }
    }

    public void put(Object key, Object value){
        Node node= new Node(key,value);
    }
    public Object get(Object key){
        int index =key.hashCode();
        return map[index];
    }

    private void ifAddSize(){
        if(1==1){

        }else {

        }
    }
     class Node{
        private Object key;
        private Object value;
        private Node   next;
        public Node(){

        }
        public Node(Object key,Object value){
            this.key=key;
            this.value=value;
        }
        public int changeKey(){
            return key.hashCode()%map.length;
        }
        public Object getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }
}
