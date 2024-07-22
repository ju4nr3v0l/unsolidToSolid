public class EmployeeManager implements IEmployeeManager {
    @Override
    public void addEmployee(Employee employee) {
        System.out.println("Empleado agregado");
    }

    @Override
    public void removeEmployee(Employee employee) {
        System.out.println("Empleado eliminado");
    }

    @Override
    public void calculateSalary(Employee employee) {

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        System.out.println(salaryCalculator.calculateSalary(employee));
    }

    @Override
    public void saveToFile(String name) {

    }
}