package linkedLists;

public class InsertAtSortedDemo {

    public static void main(String args[]){
        InsertAtSortedList insertAtSortedList= new InsertAtSortedList();
        insertAtSortedList.insertElement(22);
        insertAtSortedList.insertElement(2);
        insertAtSortedList.insertElement(40);
        insertAtSortedList.insertElement(28);
        insertAtSortedList.insertElement(1);
        insertAtSortedList.insertElement(50);
        insertAtSortedList.insertElement(32);
        System.out.println(insertAtSortedList.toString());
    }
}
