public interface Employee {
    int getID();
    String getName();
    double getSalery();
    void print();
    void  add(Employee employee);
    void  remove(Employee employee);
    Employee getChild(int i);

}
