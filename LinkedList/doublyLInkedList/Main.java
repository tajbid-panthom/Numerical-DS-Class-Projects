package doublyLInkedList;

public class Main {

  public static void main(String[] args) {
    DoublyLinkedList list = new DoublyLinkedList();

    list.addFirst(10);
    list.addLast(20);
    list.addFirst(5);
    list.addLast(30);

    System.out.println("List after adding elements:");
    list.showList();

    list.removeFirst();
    list.removeLast();

    System.out.println("List after removing elements:");
    list.showList();

    System.out.println("First element: " + list.first());
    System.out.println("Last element: " + list.last());

    System.out.println("Size of the list: " + list.size());
  }
}
