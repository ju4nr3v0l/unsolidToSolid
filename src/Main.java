import java.util.Scanner;

public class Main {
    public static IEmployeeManager EmployeeManager = new EmployeeManager();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char option = '\0';

        System.out.println("Menu de Operaciones:");
        System.out.println("1. Crear empleado ");
        System.out.println("2. Crear empleado Temporal");
        System.out.println("3. Eliminar empleado");
        System.out.println("4. Calcular salario");
        System.out.println("5. Generar reporte Excel");
        System.out.println("6. Generar reporte PDF");
        System.out.println("Presione 'q' para salir.");

        do {
            System.out.println("\nSeleccione una opción:");
            String input = scanner.next().toLowerCase();
            if (input.length() == 1) {
                option = input.charAt(0);
                switch (option) {
                    case '1':
                        System.out.println("Ingrese el nombre del empleado");
                        String name = scanner.next();
                        System.out.println("Ingrese el departamento");
                        String department = scanner.next();
                        Employee employee = new Employee(name, department);
                        EmployeeManager.addEmployee(employee);
                        break;
                    case '2':
                        System.out.println("Ingrese el nombre del empleado");
                        String namePartial = scanner.next();
                        System.out.println("Ingrese el departamento");
                        String departmentPartial = scanner.next();
                        Employee partTimeEmployee = new PartTimeEmployee(namePartial, departmentPartial);
                        EmployeeManager.addEmployee(partTimeEmployee);
                        break;
                    case '3':
                        System.out.println("Ingrese el nombre del empleado");
                        String nameToRemove = scanner.next();
                        Employee employeeToRemove = new Employee(nameToRemove, "");
                        EmployeeManager.removeEmployee(employeeToRemove);
                        break;
                    case '4':
                        System.out.println("Ingrese el nombre del empleado");
                        String nameToCalculate = scanner.next();
                        Employee employeeToCalculate = new Employee(nameToCalculate, "");
                        EmployeeManager.calculateSalary(employeeToCalculate);
                        break;
                    case '5':
                        System.out.println("Generando Reporte en Excel...");
                        ExcelReportGenerator excelReportGenerator = new ExcelReportGenerator();
                        excelReportGenerator.generateReport();
                        break;
                    case '6':
                        System.out.println("Generando Reporte en PDF...");
                        PDFReportGenerator pdfReportGenerator = new PDFReportGenerator();
                        pdfReportGenerator.generateReport();
                        break;
                    case 'q':
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } else {
                System.out.println("Entrada no válida. Intente de nuevo.");
            }
        } while (option != 'q');

        scanner.close();
    }
}