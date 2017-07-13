import java.util.ArrayList;
import java.util.List;

public class CollectionTest1{

     public static void main(String []args){
        System.out.println("Hello World");
        Employee emp1 = new Employee(1, "Deepak", "Nerul");
        System.out.println(emp1.getId());
        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        emp1.setAddress("Vashi");
        System.out.println(list.get(0).getAddress());
     }
    
     
}

class Employee {
    int id;
    String name, address;
    
    Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }    
}
