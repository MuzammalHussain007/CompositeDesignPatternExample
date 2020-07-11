import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankManager implements Employee {
    private int id;
    private  String name;
    private double salary;
    private List<Employee> bankmanager = new ArrayList<>();

    public BankManager(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalery() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("==================================");
            System.out.println("ID:"+getId());
        System.out.println("==================================");
            System.out.println("Name:"+getName());
        System.out.println("==================================");
            System.out.println("Salary:"+getSalary());
        System.out.println("==================================");
        Iterator<Employee> it = bankmanager.iterator();

        while (it.hasNext())
        {
            Employee employee = it.next() ;
            employee.print();
        }

    }

    @Override
    public void add(Employee employee) {
      bankmanager.add(employee);
    }

    @Override
    public void remove(Employee employee) {
      bankmanager.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
        return bankmanager.get(i);
    }
}
