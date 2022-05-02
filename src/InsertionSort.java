import java.util.Arrays;

public class InsertionSort {

    static int arr[]={12,3,44,7,1,22,2};
    static Employee[] employees= new Employee[3];

    public static void main(String args[]){
        System.out.println("Insertion sort");
        sort(arr);
        System.out.println("sorted: "+ Arrays.toString(arr));
        Employee employee1 = new Employee();
        employee1.setEmployeeNumber(123456789);
        employee1.setFisrtName("German");
        employee1.setLastName("Carranza");
        employee1.setEmail("g@email.com");
        employees[0]=employee1;
        Employee employee2 = new Employee();
        employee2.setEmployeeNumber(113456789);
        employee2.setFisrtName("Perla");
        employee2.setLastName("Carranza");
        employee2.setEmail("per@email.com");
        employees[1]=employee2;
        Employee employee3 = new Employee();
        employee3.setEmployeeNumber(103456789);
        employee3.setFisrtName("Poncho");
        employee3.setLastName("Carranza");
        employee3.setEmail("pon@email.com");
        employees[2]=employee3;
        sort(employees);
        for(Employee e:employees){
            System.out.println("Employee no: "+e.getEmployeeNumber()+ " employee name "+e.getFisrtName());
        }

    }

    public static void sort(int arr[]){
        // we have to traverse all elements of the array so we use an outer for loop
        for(int i=0;i<arr.length;i++){
            // now we have to assign the element of ar[i] to a current value
            int current=arr[i];
            int j=i-1;
            // Now we have to compare the new element with all elements to the left until we have reached the element 0 or arr[i]>current
            while (j>=0 && arr[j] > current){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=current;
        }
    }

    public static void sort(Employee employees[]){
        int j=0;
        for(int i=0;i<employees.length;i++){
            Employee current = employees[i];
            j=i-1;
            while (j>=0 && employees[j].getEmployeeNumber() > current.getEmployeeNumber()){
                employees[j+1]=employees[j];
                j--;
            }
            employees[j+1]=current;

        }
    }
    static class Employee{
        long employeeNumber;
        String fisrtName;
        String lastName;
        String email;

        public long getEmployeeNumber() {
            return employeeNumber;
        }

        public void setEmployeeNumber(long employeeNumber) {
            this.employeeNumber = employeeNumber;
        }

        public String getFisrtName() {
            return fisrtName;
        }

        public void setFisrtName(String fisrtName) {
            this.fisrtName = fisrtName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

}
