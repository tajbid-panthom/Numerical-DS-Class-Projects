package singlyLinkedList;

public class Main {

  public static void main(String[] args) {
    SinglyLinkedList list1 = new SinglyLinkedList();
    list1.addLast(9);
    list1.addLast(12);
    list1.addLast(15);
    list1.addLast(2);
    list1.addLast(3);
    list1.addLast(3);
    list1.showList();
    System.out.println("\n");
    SinglyLinkedList list2 = new SinglyLinkedList();
    list2.addLast(10);
    list2.addLast(20);
    list2.addLast(30);
    list2.showList();
  }
}
