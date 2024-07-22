public class EmployeeManager implements IEmployeeManager {
    @Override
    public String addEmployee(String name) {
        System.out.println("Employee added");
        return name;
    }

    @Override
    public String removeEmployee(String name) {
        System.out.println("Employee removed");
        return name;
    }
}