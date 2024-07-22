public class EmployeeManager implements IEmployeeManager {
    @Override
    public void addEmployee(Employee employee) {
        System.out.println("Employee added");
    }

    @Override
    public void removeEmployee(Employee employee) {
        System.out.println("Employee removed");
    }

    @Override
    public double calculateSalary(Employee employee) {
        return 0;
    }

    @Override
    public void saveToFile(String name) {

    }
}