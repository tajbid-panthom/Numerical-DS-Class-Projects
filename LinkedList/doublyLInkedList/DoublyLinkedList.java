package doublyLInkedList;

public class DoublyLinkedList {

  private Node header;
  private Node trailer;
  private int size;

  public DoublyLinkedList() {
    header = new Node(-1, null, null);
    trailer = new Node(-1, null, null);
    header.setNext(trailer);
    trailer.setPrevious(header);
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
      return -1;
    }
    return header.getNext().getData();
  }

  public int last() {
    if (isEmpty()) {
      return -1;
    }
    return trailer.getPrevious().getData();
  }

  public void addFirst(int element) {
    addbetween(element, header, header.getNext());
  }

  public void addLast(int element) {
    addbetween(element, trailer.getPrevious(), trailer);
  }

  public int removeFirst() {
    if (isEmpty()) {
      return -1;
    }
    return remove(header.getNext());
  }

  public int removeLast() {
    if (isEmpty()) {
      return -1;
    }
    return remove(trailer.getPrevious());
  }

  public void addbetween(int element, Node predecessor, Node successor) {
    Node newest = new Node(element, predecessor, successor);
    predecessor.setNext(newest);
    successor.setPrevious(newest);
    size++;
  }

  public int remove(Node node) {
    Node predecessor = node.getPrevious();
    Node successor = node.getNext();
    predecessor.setNext(successor);
    successor.setPrevious(predecessor);
    size--;
    return node.getData();
  }

  public void showList() {
    Node temp = header.getNext();
    while (temp != null) {
      System.out.println(temp.getData());
      temp = temp.getNext();
    }
    System.out.println();
  }
}
