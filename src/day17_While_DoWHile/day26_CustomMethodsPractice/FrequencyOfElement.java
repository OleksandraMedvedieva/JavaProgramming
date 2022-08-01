package day17_While_DoWHile.day26_CustomMethodsPractice;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr1 = {1,1,1,1,2,3,1,4,5,7,7};
        int r1 = frequencyOfElement(arr1,7);
        System.out.println("r1 = " + r1);
        String[] arr2 = {"a", "v","f","a","a","a"};
        int r2 = frequencyOfElement(arr2,"a");
        System.out.println("r2 = " + r2);

    }
    // Returns the frequency of one element from int array
    public static int frequencyOfElement (int[] arr, int element){
        int count = 0 ;
        for (int each : arr) {
            if (each == element){
                count++;
            }
        }
        return count;
    }

    // Returns the frequency of one element from Double array
    public static int frequencyOfElement (double[] arr, double element){
        int count = 0 ;
        for (double each : arr) {
            if (each == element){
                count++;
            }
        }
        return count;
    }

    // Returns the frequency of one element from char array
    public static int frequencyOfElement (char[] arr, char element){
        int count = 0 ;
        for (char each : arr) {
            if (each == element){
                count++;
            }
        }
        return count;
    }

    // Returns the frequency of one element from String array
    public static int frequencyOfElement (String[] arr, String element){
        int count = 0 ;
        for (String each : arr) {
            if (each.equals(element)){
                count++;
            }
        }
        return count;
    }
}


/*

warmup tasks:
	1. Create a class named FrequencyOfElement:
			1.1 Create a method that passes two parameters: an integer array and an Integer element.
			The method returns the frequency of the given integer element from the integer array

			1.2 Create a method that passes two parameters: a double array and a double element. 
			The method returns the frequency of the given integer from the array

			1.3 Create a method that passes two parameters: a char array and a char element. 
			The method returns the frequency of the given char element from the char array

			1.4 Create a method that passes two parameters: a String array and a String element. 
			The method returns the frequency of the given String element from the String array


 */
