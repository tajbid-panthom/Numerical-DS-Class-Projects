package singlyLinkedList;

public class SinglyLinkedList {

  private Node head;
  private Node tail;
  private int size;

  public SinglyLinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int first() {
    if (isEmpty()) {
      return -1; // a garbage value instead of null, since return type int can't take on null value.
    }
    return head.getElement();
  }

  public int last() {
    if (isEmpty()) {
      return -1; // a garbage value instead of null, since return type int can't take on null value.
    }
    return tail.getElement();
  }

  public void addFirst(int element) {
    head = new Node(element, head);
    if (size == 0) {
      tail = head;
    }
    size++;
  }

  public void addLast(int element) {
    Node newest = new Node(element, null);
    if (isEmpty()) {
      head = newest;
    } else {
      tail.setNext(newest);
    }
    tail = newest;
    size++;
  }

  public int removeFirst() {
    if (isEmpty()) {
      return -1; // a garbage value instead of null, since return type int can't take on null value.
    }
    int answer = head.getElement();
    head = head.getNext();
    size--;
    if (size == 0) {
      tail = null;
    }
    return answer;
  }

  private Node reverse(Node head) {
    Node prev = null;
    Node current = head;
    while (current != null) {
      Node next = current.getNext();
      current.setNext(prev);
      prev = current;
      current = next;
    }
    return prev;
  }

  // Function to remove nodes with greater value on the right
  public Node removeNodes(Node head) {
    if (head == null) return null;

    // Step 1: Reverse the list
    head = reverse(head);

    // Step 2: Remove nodes that are smaller than the max value seen so far
    Node current = head;
    Node maxNode = head;
    while (current != null && current.getNext() != null) {
      if (current.getNext().getElement() < maxNode.getElement()) {
        current.setNext(current.getNext().getNext());
      } else {
        current = current.getNext();
        maxNode = current;
      }
    }

    // Step 3: Reverse the list back to its original order
    head = reverse(head);

    return head;
  }

  public void showList() {
    Node temp = head;
    for (int i = 0; i < size; i++) {
      System.out.print(temp.getElement() + " ");
      temp = temp.getNext();
    }
    System.out.println();
  }
}
