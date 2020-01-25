package com.nan;

import com.nan.Model.Employee;

import java.util.Arrays;
import java.util.Comparator;

public class Assignment2 {

    public static void main(String[] args) {

        //1)
        problemOne("north", 'r');

        //2)
        problemTwo(new int[] {3, 5, 7, 1, 4, 32, 15});

        //3)
        int problemThree = addDigits(37);
        System.out.println(problemThree);

        //4)
        Employee john = new Employee("John", 18, "MALE", 3000);
        Employee nick = new Employee("Nick", 40, "MALE", 8000);
        Employee jenny = new Employee("Jenny", 65, "FEMALE", 10000);

        double socialSecurityTax = socialSecurityTax(john);
        System.out.println(socialSecurityTax);
        double insuranceCoverage = insuranceCoverage(nick);
        System.out.println(insuranceCoverage);
        sortSalary(jenny, john, nick);

        // extra credit

    }

    // 1) Write a method to take a String and character as input and find how many characters are in the String
    public static void problemOne(String strInput, char charInput) {

        int i = 0;

        for (int ii = 0; ii < strInput.length(); ii ++){

            if (strInput.charAt(ii) == charInput){
                i ++;
            }
        }

        System.out.println("\"" + strInput + "\"" + " has " + i  + " \'" +charInput + "\'");
    }

    // 2) Write a method to find the maximum and minimum number in an array of numbers
    public static void problemTwo(int[] arrInput) {

        int maxNumber = arrInput[0];
        int minNumber = arrInput[0];

        for (int ii = 0; ii < arrInput.length; ii++){

            if (arrInput[ii] > maxNumber){
                maxNumber = arrInput[ii];
            }

            if (arrInput[ii] < minNumber){
                minNumber = arrInput[ii];
            }

        }

        System.out.println("Max is " + maxNumber + " and Min is "  + minNumber);

    }

    // 3) adds all digits function
    public static int addDigits (int input){

        int length = Integer.toString(input).length();

        int result = input;

        while(length > 1) {
            result = 0;

            while(input > 0)
            {
                int remainder = input % 10;
                result = result + remainder ;
                input = input / 10;
            }

            input = result;
            length = Integer.toString(input).length();

        }

        return result;
    }

    // 4) Employee Analysis
    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */

    public static double socialSecurityTax(Employee employee) {

        double salary  = employee.getSalary();
        double ssTaxRate = 0.062;
        double socialSecurityTax;

        if ( salary <= 8900){
            socialSecurityTax = salary * ssTaxRate;
        }else{
            socialSecurityTax = 106800 * ssTaxRate;
        }

        return socialSecurityTax;

    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public static double insuranceCoverage(Employee employee) {

        double age  = employee.getAge();
        double salary = employee.getSalary();
        double insuranceCoverage;

        if ( age <35){
            insuranceCoverage = salary * 0.03;
        }else if(35 <= age & age <= 50){
            insuranceCoverage = salary * 0.04;
        }else if(50 < age & age < 60){
            insuranceCoverage = salary * 0.05;
        }else{
            insuranceCoverage = salary * 0.06;
        }

        return insuranceCoverage;

    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public static void sortSalary(Employee e1, Employee e2, Employee e3) {
        Employee[] employees = new Employee[3];
        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;

        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getSalary() - e2.getSalary();
            }
        });

        System.out.println(employees[0].getName() + ", " + employees[1].getName() + ", " + employees[2].getName());
    }

    // Extra Credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
	    /*
	     write your understanding here.
	     Your Answer:

	     Java passes by value not reference. In this example, what got passed into the swap() method are copies of a and b.
	     So no matter how we change the values of x and y, it won't affect the value of a and b, which still point to the
	     original objects.

	    */



}
