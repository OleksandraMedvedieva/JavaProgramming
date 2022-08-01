package day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {
        String[] names = {"Leon Kunaev", "Sibel Arslan", "Bogdan Turchyk","Efe Aydin", "Umit Akdag",
                "Tabita Pohus", "Yaroslav Marshtupa", "Maya Guraspashvily", "Eldar Osmanov", "Stanislav Kovalov"};

        for(String each:names){
            String reversed = "";
            for (int i = each.length()-1; i >=0 ; i--) {
                reversed += each.charAt(i);
            }
            System.out.println(reversed);
        }


    }
}
