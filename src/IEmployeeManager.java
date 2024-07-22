public interface IEmployeeManager {

     void addEmployee(Employee employee);

    void removeEmployee(Employee employee);

    double calculateSalary(String name);

    void saveToFile(String name);

}