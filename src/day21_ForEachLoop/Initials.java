package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String[] names = {"Leon Kunaev", "Sibel Arslan", "Bogdan Turchyk","Efe Aydin", "Umit Akdag",
                "Tabita Pohus", "Yaroslav Marshtupa", "Maya Guraspashvily", "Eldar Osmanov", "Stanislav Kovalov"};

        for(String each:names){
            String initial = each.charAt(0)+ "." + each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }

    }
}
