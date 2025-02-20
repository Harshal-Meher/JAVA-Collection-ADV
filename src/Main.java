import java.util.*;

public class Main {
    public static void main(String[] args) {

       List<String> fruits = Arrays.asList("apple","Banana","Orange","Grapes","Chiku","Cherry","Kivi","Mango");
       //sort all element in assending order base on there length

        // fruits.sort(Comparator.comparingInt(String::length)); //:: refearnces type
        //System.out.println("Sorted by length : "+fruits);
        //Sorted by length : [Kivi, Apple, Mango, Chiku, Banana, Orange, Grapes, Cherry]

        //Collections.sort(fruits,Comparator.comparingInt(String::length));
        //System.out.println("Sorted by length : "+fruits);
        //Sorted by length : [Kivi, Apple, Mango, Chiku, Banana, Orange, Grapes, Cherry]

        //Sort all element in desending order and list out result

//        List<Integer> numbers =Arrays.asList(1,6,3,4,2,5);
//        numbers.sort(Comparator.reverseOrder());
//        System.out.println("Reverces Order : " + numbers);


        //sort the list of employe base on there age in asending order

        List<Employee> employee = new ArrayList<>();
//        List<Employee> employee = Arrays.asList(new Employee(1,"Harshal",23,"50000","JD"),
//                new Employee(2,"Abhishek",24,"60000","JD")
//                );
        employee.add(new Employee(1,"Harshal",23,"50000","JD"));
        employee.add(new Employee(2,"Abhishek",24,"60000","JD"));
        employee.add(new Employee(3,"Roshan",25,"40000","SD"));
        employee.add(new Employee(4,"Ketan",23,"80000","JD"));
        employee.add(new Employee(5,"Jay",21,"20000","SD"));

//        employee.sort(Comparator.comparing(Employee::getEmpSalary));
        //sort by base on age and salary
        employee.sort(Comparator.comparingInt(Employee::getEmpAge ).thenComparing(Employee::getEmpSalary));
        //if emp are sorted base on their same age then sorted by their comparators Salary

        //sortout the all emp base on index of first occurance of "a" in each string
        fruits.sort(Comparator.comparingInt((e)->e.indexOf("a")));
        fruits.forEach(System.out::println);

    }
}