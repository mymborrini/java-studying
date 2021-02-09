package com.skynet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // The finite and exhaustive hierarchy is one of the great benefits of using sealed classes.
        // Let's see an example of this in action:

        Person person_1 = new Manager("1234567");
        Person person_2 = new Employee("8901234");

        checkPersonRole(person_1);
        checkPersonRole(person_2);
    }


    private static void checkPersonRole(Person person){

        if (person instanceof Manager manager){
            System.out.println(manager.getEmployeeId());
        } else if (person instanceof Employee employee){
            System.out.println(employee.getSupervisorId());
        }

        /*
        * Without a sealed class, the compiler can't reasonably determine that all possible sub-classes
        * are covered with our if-else statements. Without an else clause at the end, the compiler
        * would likely issue a warning indicating our logic doesn't cover every case.
        * */

    }
}
