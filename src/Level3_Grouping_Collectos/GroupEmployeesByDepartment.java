package Level3_Grouping_Collectos;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByDepartment {


    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(
                new Employee(1, "Sneha", "IT"),
                new Employee(2, "Nilesh", "HR"),
                new Employee(3, "Sangita", "IT"),
                new Employee(4, "Sekhar", "Finance"),
                new Employee(5, "Prity", "HR")
        );
        Map<String,List<Employee>> listMap=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(listMap);
    }
}
class Employee{
  int id;
  String name;
  String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
