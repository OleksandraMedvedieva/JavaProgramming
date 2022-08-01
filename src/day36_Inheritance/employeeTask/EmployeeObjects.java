package day36_Inheritance.employeeTask;

public class EmployeeObjects {
    public static void main(String[] args) {

        Developer d1 = new Developer();
        Tester t1 = new Tester();
        Driver driver = new Driver();
        Teacher teacher = new Teacher();

        d1.setInfo("Luck", "Junior Developer", "Amazon", 'M',43,123,150000);
        t1.setInfo("Sasha", "SDET","Amadeus",'F',29,234,120000);
        driver.setInfo("Oleh", "Driver kategory A", "Lukoil", 'M',32,456,100000);
        teacher.setInfo("Elina", "Teacher", "High School 34",'F', 25,789,80000 );

        d1.haveBreak();
        t1.fixingBugs();
        teacher.work();
        driver.lunch();


    }
}
