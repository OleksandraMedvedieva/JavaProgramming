package day35_Encapsulation.scrumTeam2;


public class MyScrumTeam {
   public static void main(String[] args) {


      Tester tester1 = new Tester("Lyan", 'M',"Sdet",123,123456);
      Tester tester2 = new Tester("Ali",'M',"SDET",142,120000);
      Tester tester3 = new Tester("Alex",'F',"SE",127,140000);
      Tester tester4 = new Tester("Lala", 'M',"SDET",115,800000);

      Tester[] testers = {tester2,tester3,tester4};

      Developer developer1 = new Developer("Olga", 'F', "Java Developer", 167,120000);
      Developer developer2= new Developer("Aygun", 'F', "Java Master", 189,185000);
      Developer developer3 = new Developer("Tunc", 'M', "Software Developer", 198,135000);
      Developer developer4= new Developer("Sinem", 'M', "Senior Developer",234,200000);
      Developer[] developers = {developer2,developer3,developer4};

      ScrumTeam scrum = new ScrumTeam("Mike Poty", "Lili Truck", "Ivan Medvediev");
      System.out.println(scrum);
      scrum.hireTester(tester1);
      scrum.hireDeveloper(developer1);

      //scrum.hireTesters(testers);
      //scrum.hireDevelopers(developers);


      System.out.println(scrum);












   }


}
