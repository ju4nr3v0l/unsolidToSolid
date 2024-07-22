public class PartTimeEmployee extends Employee {

    private String type = "Part Time";

    public PartTimeEmployee(String name, String department) {
        super(name, department);
    }


    public String getType() {
        return this.type;
    }
}