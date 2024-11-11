package singlyLinkedList;

public class Node {

  private int element;
  private Node next;

  public Node(int element, Node next) {
    this.element = element;
    this.next = next;
  }

  public int getElement() {
    return element;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node node) {
    this.next = node;
  }
}
