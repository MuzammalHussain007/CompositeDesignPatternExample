public class Cashier implements Employee {
    private int id;
    private  String name;
    private double salary;


    public Cashier(int id, String name, double salary) {
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

    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void remove(Employee employee) {

    }

    @Override
    public Employee getChild(int i)
    {
        return null;
    }

    }



