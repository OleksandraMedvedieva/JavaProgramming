package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlock {
    public static void main(String[] args) {
        Employee employee = null;
        try{
            System.out.println(employee.getSalary());
        }catch(IndexOutOfBoundsException e){
            System.out.println("First block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Second block");
            e.printStackTrace();
        }catch(NullPointerException e){
            System.out.println("third block");
            e.printStackTrace();
        }

    }

}
