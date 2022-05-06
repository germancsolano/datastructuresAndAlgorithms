package linkedLists;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class LinkedListDemo {

    public static void main(String args[]){

        LinkedList list = new LinkedList();
//        list.insertAtHead(5);
//        list.insertAtHead(10);
//        list.insertAtHead(2);
//        list.insertAtHead(12);
//        list.insertAtHead(19);
//        list.insertAtHead(20);


        Employee employee = new Employee("German", "Carranza");
        Employee employee1 = new Employee("Perla", "Carranza");
        Employee employee2 = new Employee("Poncho", "Carranza");
        list.insertAtHead(employee);
        list.insertAtHead(employee1);
        list.insertAtHead(employee2);
        System.out.println(list);
        System.out.println(list.getLenght());
        list.deleteAtHead();
        System.out.println(list);
        System.out.println(list.getLenght());
        System.out.println(list.findElement(employee1));
    }
    static class Employee {
        private String Name;
        private String lastName;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public Employee(String name, String lName){
            this.Name=name;
            this.lastName=lName;
        }
    }

}
