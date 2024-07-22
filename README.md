# Integrantes del equipo
- Juan David Marulanda
- Jefferson Morales Gonzalez
- Jhan Castro Vargas
- Laura Sofia Guio Camargo
- Natacha Castrillon
- Ruben Dario Suarez Amaya


## Incumplimiento de prinicios SOLID:

- **Principio de Responsabilidad Única (SRP)**: ReportGenerator se encarga de generar reportes en Excel y PDF. Esto significa que tiene más de una razón para cambiar, lo que va en contra del SRP.

- **Principio de Inversión de Dependencias (DIP)**: En el método calculateSalary de SalaryCalculator, se crea una instancia de EmployeeManager directamente. Esto muestra una  dependencia de una implementación específica en lugar de una abstracción, lo que no va  con el DIP, y es mejor depender de abstracciones en vez de concreciones.

- **Principio de Sustitución de Liskov (LSP)**: PartTimeEmployee sobrescribe el método getName() y lanza una excepción, lo que cambia el comportamiento que se espera cuando se trata como su tipo base Employee. Esto viola el LSP, ya que PartTimeEmployee no puede ser  sustituido del todo por Employee.

- **Principio de Segregación de Interfaces (ISP)**: Aunque no se identifica claramente en los fragmentos de código, si EmployeeManager implementa EmployeeOperations y esta interfaz tiene métodos que no son necesarios para todas las clases que la implementan, se estaría violando el ISP.



## Cambios realizados para cumplir con los principios SOLID:

- **Principio de Responsabilidad Única (SRP)**: Se dividió `ReportGenerator` en dos clases separadas, `ExcelReportGenerator` y `PDFReportGenerator`, cada una encargada de generar reportes en su respectivo formato. Esto asegura que cada clase tenga una sola razón para cambiar y se le agrega una interfaz para el principio de segregación de interfaces.

- **Principio de Inversión de Dependencias (DIP)**: Se modificó `SalaryCalculator` para no crear una instancia de EmployeeManager directamente. En su lugar, EmployeeManager se inyecta donde sea necesario, promoviendo la dependencia de abstracciones en lugar de implementaciones concretas. Ademas se crea una interfaz en el caso de que existan cakculos de salario para otros tipos de empleados.

- **Principio de Sustitución de Liskov (LSP)**: Se eliminó la sobreescritura del método getName() en `PartTimeEmployee` que lanzaba una excepción, asegurando que `PartTimeEmployee` pueda ser usado desde Employee sin alterar el comportamiento.

- **Principio de Segregación de Interfaces (ISP)**: Se creó una interfaz `EmployeeOperations` que contiene los métodos necesarios para operar con un empleado, y se aseguró de que `EmployeeManager` implemente esta interfaz. De esta forma, se garantiza que las clases que implementen `EmployeeOperations` no tengan que implementar métodos que no necesitan.