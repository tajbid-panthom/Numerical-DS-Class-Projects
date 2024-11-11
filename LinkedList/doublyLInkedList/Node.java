package doublyLInkedList;

public class Node {

  private int data;
  private Node prev;
  private Node next;

  public Node(int data, Node prev, Node next) {
    this.data = data;
    this.prev = prev;
    this.next = next;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Node getPrevious() {
    return prev;
  }

  public void setPrevious(Node prev) {
    this.prev = prev;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}
