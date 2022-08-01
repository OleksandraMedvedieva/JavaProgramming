package day17_While_DoWHile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String str = "Java Java Python Python";
        str = str.toLowerCase();
        int frequency = 0;

        while ( str.contains("java") ){
            str=str.replaceFirst("java", "");
            frequency++;
        }

        System.out.println("frequency = " + frequency);

        System.out.println("====================================================");
        String str2 = "cat c dogbagcat dgbko";
        int countCat = 0;
        while (str2.contains("cat")){
            str2 = str2.replaceFirst("cat", "");
            countCat++;
        }
        System.out.println("countCat = " + countCat);
        //System.out.println("str2 = " + str2);


        System.out.println("====================================================");
        String sentence = "Java Java Java Python Python Python Python";
        int countJava = 0;
        int countPython = 0;
        while (sentence.contains("Java") || sentence.contains("Python") ){
            if (sentence.contains("Java")) {
                sentence = sentence.replaceFirst("Java", "");
                countJava++;
            }

            if (sentence.contains("Python")) {
                sentence = sentence.replaceFirst("Python", "");
                countPython++;
            }

        }
        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);



    }
}

/*
Str = "Java Java Java Python"

        		Delete 1st Java:
        				" Java Java Python"

				Delete 2d Java:
						" Java Python"

				Delete 3rd Java:
						"  Python"


 */
