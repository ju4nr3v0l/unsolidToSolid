public interface IEmployeeManager {

    void addEmployee(Employee employee);

    void removeEmployee(Employee employee);

    void calculateSalary(Employee employee);

    void saveToFile(String name);

}