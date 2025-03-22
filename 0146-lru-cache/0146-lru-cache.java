class LRUCache {
    class Node {
        int key, value;
        Node prev, next;
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> map;
    private final Node head, tail;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node=map.get(key);
        moveToHead(node);
        return node.value;
        
    }
       private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(Node node) {
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    private void addToHead(Node node) {
       head.next.prev=node;
       node.next=head.next;
       head.next=node;
       node.prev=head;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.value=value;
            moveToHead(node);
            return;

        }
        if(map.size()>=capacity){
             removeLRU();
        }
        Node node =new Node(key, value);
        map.put(key,node);
        addToHead(node);

    }
    private void removeLRU() {
        Node node=tail.prev;
        removeNode(node);
        map.remove(node.key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */