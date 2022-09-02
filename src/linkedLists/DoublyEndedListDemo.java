package linkedLists;

public class DoublyEndedListDemo {
    public static void main(String args[]){
        System.out.println("inserting at tail doubly ended list ");
        DoublyEndedList doublyEndedList = new DoublyEndedList();
        doublyEndedList.insertAtBegin(7);
        doublyEndedList.insertAtBegin(1);
        doublyEndedList.insertAtTail(10);
        doublyEndedList.insertAtTail(12);
        doublyEndedList.insertAtTail(22);
        doublyEndedList.insertAtTail(24);
        doublyEndedList.delete(12);
        doublyEndedList.delete(1);
        doublyEndedList.delete(24);
        System.out.println(doublyEndedList);
    }
}
