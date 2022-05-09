package linkedLists;

public class DoublyEndedListDemo {
    public static void main(String args[]){
        System.out.println("inserting at tail doubly ended list ");
        DoublyEndedList doublyEndedList = new DoublyEndedList();
        doublyEndedList.insertAtTail(2);
        doublyEndedList.insertAtTail(12);
        doublyEndedList.insertAtTail(22);
        doublyEndedList.insertAtTail(24);
        System.out.println(doublyEndedList);
    }
}
