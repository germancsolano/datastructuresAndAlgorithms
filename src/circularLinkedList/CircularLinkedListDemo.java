package circularLinkedList;

public class CircularLinkedListDemo {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        System.out.println("Adding element at head");
        list.addFirst(12);
        list.addFirst(10);
        list.print();
        list.InsertAtEnd(22);
        list.print();
        //System.out.println(list.findElement(14));
        list.delete(2);
        System.out.println("-----after deletion ");
        list.print();
    }

}
