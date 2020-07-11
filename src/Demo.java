public class Demo {
    public static void main(String[] args) {
        Employee employee = new Accountant(1,"Muzammal",25);
        Employee employee1 = new Cashier(3,"ABC",25403);
        Employee manager= new BankManager(2,"Ali",254);
        manager.add(employee);
        manager.add(employee1);
        manager.print();



    }
}
