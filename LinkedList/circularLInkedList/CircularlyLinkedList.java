package circularLInkedList;

public class CircularlyLinkedList {

  private Node tail;
  private int size;

  public CircularlyLinkedList() {
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
    if (isEmpty()) return -1; // garbage value instead of null, since return type can't take on null value.
    return tail.getNext().getElement();
  }

  public int last() {
    if (isEmpty()) return -1; // A garbage value instead of null, since return type int can't take on null value.
    return tail.getElement();
  }

  public void rotate() {
    if (tail != null) {
      tail = tail.getNext();
    }
  }

  public void addFirst(int element) {
    if (size == 0) {
      tail = new Node(element, null);
      tail.setNext(tail);
    } else {
      Node newest = new Node(element, tail.getNext());
      tail.setNext(newest);
    }
    size++;
  }

  public void addLast(int element) {
    addFirst(element);
    tail = tail.getNext();
  }

  public int removeFirst() {
    if (isEmpty()) {
      return -1; // a garbage value instead of null, since return type int can't take on null value.
    }
    Node head = tail.getNext();
    if (head == tail) {
      tail = null;
    } else {
      tail.setNext(head.getNext());
    }
    size--;
    return head.getElement();
  }

  public void showList() {
    Node temp = tail.getNext();
    for (int i = 0; i < size; i++) {
      System.out.print(temp.getElement() + " ");
      temp = temp.getNext();
    }
    System.out.println();
  }
}
