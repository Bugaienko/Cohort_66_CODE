package lesson_47.groupingBy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Sergey Bugaenko
 * {@code @date} 24.06.2025
 */

public class GroupingByExample {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(
                List.of(
                        new Employee("Petr", 2500, 25, "developer", "IT"),
                        new Employee("Silvia", 1500, 22, "trainee", "IT"),
                        new Employee("Stefan", 2500, 30, "PM", "IT"),
                        new Employee("Olivia", 2700, 24, "manager", "Management"),
                        new Employee("Sebastian", 3500, 28, "chef", "Management"),
                        new Employee("Hanna", 2000, 25, "chef", "Cleaning"),
                        new Employee("Max", 1300, 45, "cleaner", "Cleaning"),
                        new Employee("John", 3200, 19, "chef", "IT")
                )
        );

        /*
        Collectors.groupingBy(Function classifier) - простейшая форма группировки
        Группирует элементы по ключу, полученному с помощью функции-классификатора
        Результат будет Map<K, List<T>> - ключ : значение, список элементов, соответствующих этому ключу.
         */

        // Сгруппировать сотрудников по отделам
        Map<String, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));


        map.forEach((department, employeeList) -> System.out.println(department + " -> " + employeeList));

        System.out.println("==============\n");

        Map<String, Set<Employee>> linkedMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, LinkedHashMap::new, Collectors.toSet()));

        linkedMap.forEach((department, employeeList) -> System.out.println(department + " -> " + employeeList));

        System.out.println("===============\n");
        // Количество сотрудников в каждом отделам
        Map<String, Long> map1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("Employee::getDepartment, Collectors.counting(): " + map1);

        System.out.println("===============\n");

        // Расчет средней заработной платы по отделу
        Map<String, Double> map2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("average: " + map2);

        // Группировка сотрудников по отделам, при этом получить список зарплат в отделе
        Map<String, List<Integer>> map3 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getSalary, Collectors.toList())));

        System.out.println("Список зарплат по отделам: " + map3);

        System.out.println("===============\n");
        // Суммарная статистика

        DoubleSummaryStatistics statistics = employees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("max: " + statistics.getMax());
        System.out.println("min: " + statistics.getMin());
        System.out.println("avg: " + statistics.getAverage());
        System.out.println("count: " + statistics.getCount());
        System.out.println("sum: " + statistics.getSum());
        System.out.println("statistics: " + statistics);

        IntSummaryStatistics intStatistics = employees.stream()
                .collect(Collectors.summarizingInt(Employee::getAge));

        System.out.println("intStatistics: " + intStatistics);




    }
}
