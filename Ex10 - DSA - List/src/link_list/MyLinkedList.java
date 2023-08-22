package link_list;

public class MyLinkedList<T> {
    private Node<T> head;
    private int numNodes;

    public MyLinkedList(T data) {
        head = new  Node(data);
        numNodes++;
    }
    private class Node<T> {
        private Node<T> next;
        private T data;
        private Node(T data) {
            this.data = data;
        }
        public T getData() {
            return this.data;
        }
        public void setData(T data) {
            this.data = data;
        }
    }
    public void add(int index, T data) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        temp.next.next = temp.next;
        numNodes++;
    }
    public void addFirst(T data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}