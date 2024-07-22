public class EmployeeManager implements IEmployeeManager {
    private ISalaryCalculator salaryCalculator;

    // Constructor que inyecta la dependencia
    public EmployeeManager(ISalaryCalculator salaryCalculator) {
        this.salaryCalculator = salaryCalculator;
    }
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
        System.out.println(salaryCalculator.calculateSalary(employee));
    }

    @Override
    public void saveToFile(String name) {

    }
}