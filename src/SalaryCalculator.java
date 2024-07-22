public class SalaryCalculator implements ISalaryCalculator {
    private IEmployeeManager employeeManager;

    public SalaryCalculator(IEmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @Override
    public double calculateSalary(String employee) {
        // Implementación del cálculo de salario
        return 0.0;
    }
}