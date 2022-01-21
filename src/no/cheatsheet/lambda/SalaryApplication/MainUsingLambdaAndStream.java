package no.cheatsheet.lambda.SalaryApplication;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static no.cheatsheet.lambda.SalaryApplication.GenderEnum.FEMALE;


public class MainUsingLambdaAndStream {

    private static final int RECURRING_ADDITION = 10000;
    private static final int PERCENT = 7;
    private static final int INCREASE_LOW_SALARY = 25000;
    private static final int LOW_SALARY = 400000;
    private static final int IS_MALE = 30;

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Charles", "Dickens", GenderEnum.MALE, "CEO", 900000),
                new Employee("Lewis", "Carroll", GenderEnum.MALE, "Chef", 400000),
                new Employee("Thomas", "Carlyle", GenderEnum.MALE, "Waiter", 350000),
                new Employee("Charlotte", "Bronte", FEMALE, "Chef", 420000),
                new Employee("Matthew", "Arnold", GenderEnum.MALE, "Waiter", 370000));

        // Lambda
        //1) Recurring addition
        Function<Employee, Integer> recurring_addition
                = employee -> employee.getSalary()+ RECURRING_ADDITION;

        //2) Adding a percent adition for all
        Function<Employee , Integer> percent
                = employee -> (int) employee.getSalary() + ((employee.getSalary()/100) * PERCENT);

        //3) compensation for low salaried workers
        Function<Employee , Integer> low_salary_compensation
                = employee -> employee.getSalary() <= LOW_SALARY ? employee.getSalary()+ INCREASE_LOW_SALARY : employee.getSalary();

        //4) Percent addition for males
        Function<Employee, Integer> maleSalaryIncrease
                = employee -> employee.isMale() ? (int) (employee.getSalary()+ (employee.getSalary()/100) * IS_MALE) : employee.getSalary();

        // ------------------------------------------------------------------------------------------------------------------

        // Streams
        //1) Prints a list of last names from the list
        List <String> listOfLastNames = employees.stream()
                .map(p -> p.getLastName())
                .collect(Collectors.toList());
        System.out.println("\nLast names of the workers are:\n" + listOfLastNames + "\n");

        //2) Count how many females are in the list <employees>
        long count = employees.stream()
                .filter(p -> p.getGenderEnum().equals(FEMALE))
                .count();
        System.out.println("\nThere are [" + count + "] female(s) working at the resturant.\n");

        //3) Find salary for FEMALE workers and calculate the average
        employees.stream()
                .filter(p -> p.getGenderEnum().equals(FEMALE))
                .mapToInt(i -> i.getSalary())
                .average()
                .ifPresent(avg -> System.out.println("\nAverage salary for FEMALE is: \n" + avg + "\n"));

        //4) Find the employee with the role "ceo" and increase salary by 7%
        System.out.println("\nBefore: \n" + employees);
        employees.stream()
                .filter(a -> a.getEmployeeRole().toLowerCase().contains("ceo"))
                .forEach(a -> a.setSalary((int)(a.getSalary() * (1.07))));
        System.out.println("\nAfter a 7% raise, new CEO salary is: \n" + employees + "\n");

        //5) Find out if it's true if anyone has a salary of 800.000 or more
        boolean salaryAbove = employees.stream()
                .mapToInt(i -> i.getSalary())
                .anyMatch(i -> i > 800000);
        System.out.println("\nIt is [" + salaryAbove + "] that someone has a salary of 800.000,- or more.\n");

        //6) Print employees without using a for loop
        System.out.println("\nPrinting without a loop:\n");
        employees.stream()
                .forEach(System.out::println);
        System.out.println("\n");

        //7) Use the collector and comparator to find the lowest salary of the workers.
        Employee employeeWithLowestSalary = employees.stream()
                .collect(Collectors.minBy(
                        Comparator.comparingInt(Employee::getSalary)))
                .get();
        System.out.println("\nThe employee with the lowest salary is:\n" + employeeWithLowestSalary +"\n");

        //8) Find numbers which is divisible by both 3 and 5. Find the sum of numbers which are divisible by both
        int[] intStream = IntStream.range(1, 1001).toArray();

        //Find sum of divisible by both
        int divisibleByThreeAndFive = Arrays.stream(intStream)
                .filter(i -> i % 3 == 0)
                .filter(i -> i % 5 == 0)
                .sum();

        //Find sum divisible by three only
        int divisibleByThree = Arrays.stream(intStream)
                .filter(i -> i % 3 == 0)
                .sum();
        //Find sum divisible by five only
        int divisibleByFive = Arrays.stream(intStream)
                .filter(i -> i % 5 == 0)
                .sum();
        System.out.println("(Divisible by 3 = [" + divisibleByThree + "]) + (" + "Divisible by 5 = [" + divisibleByFive + "]) - (" + "Divisible by both = [" + divisibleByThreeAndFive+ "])\n");
        System.out.println(divisibleByThree + divisibleByFive - divisibleByThreeAndFive);


        // ------------------------------------------------------------------------------


        // Text Formatting for print
        System.out.println("Before changes: " + "\n" + employees + "\n");
        salaryAdjustments(employees, recurring_addition);
        System.out.println("After recurring benefits: " + "\n" + employees + "\n");
        salaryAdjustments(employees, percent);
        System.out.println("After percentage increase: " + "\n" + employees + "\n");
        salaryAdjustments(employees, low_salary_compensation);
        System.out.println("Increasing salary for lowest salary: " + "\n" + employees + "\n");
        salaryAdjustments(employees, maleSalaryIncrease);
        System.out.println("Increasing salary for males: " + "\n" + employees + "\n");
    }

    // Do the salary adjustments
    private static void salaryAdjustments(List<Employee> employees, Function<Employee, Integer> salary) {

        employees.forEach(employee -> employee.setSalary(salary.apply(employee)));
    }








}




