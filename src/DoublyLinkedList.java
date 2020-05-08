public class DoublyLinkedList {


    // class of ListNode separate.
    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;
        //constructor
        public ListNode(int data) {
            this.data = data;
        }
    }


    //constructor
    private ListNode head;
    private ListNode tail;
    private int length;
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    // function of empty or not
    public boolean isEmpty() {
        return length == 0; // head == null;  boolean operator
    }

    // function of length
    public int length() {
        return length;
    }

    // function of insertLast
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    // function to display Doubly LinkedList in forward direction
    public void displayForward() {
        if (head == null) {
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // function to display Doubly LinkedList in backward direction
    public void displayBackward() {
        if (tail == null) {
            return;
        }
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertLast(1);
        dll.insertLast(10);
        dll.insertLast(15);
        dll.insertLast(25);

        System.out.println("Forward display as below:");
        dll.displayForward();

        System.out.println("Backward display as below:");
        dll.displayBackward();
    }

}


