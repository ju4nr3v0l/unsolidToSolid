public interface IEmployeeManager {

     void addEmployee(Employee employee);

    void removeEmployee(Employee employee);

    double calculateSalary(Employee employee);

    void saveToFile(String name);

}