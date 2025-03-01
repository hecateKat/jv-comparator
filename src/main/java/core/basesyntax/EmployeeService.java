package core.basesyntax;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {

    private final Comparator<Employee> employeeComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            int ageCompared = Integer.compare(o1.getAge(), o2.getAge());
            if (ageCompared != 0) {
                return ageCompared;
            }
            return (o1.getName().compareTo(o2.getName()));
        }
    };

    public Set<Employee> getEmployByOrder(List<Employee> employees) {
        Set<Employee> employeesSet = new TreeSet<>(employeeComparator);
        employeesSet.addAll(employees);
        return employeesSet;
    }
}