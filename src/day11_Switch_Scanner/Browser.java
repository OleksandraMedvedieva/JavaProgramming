package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        String browserName = "chrom";
        String result = "";
        if (browserName == "chrome" || browserName == "firefox" || browserName == "opera" || browserName == "safari" || browserName == "edge"){
            if(browserName == "chrome"){
                result = "Chrome Browser is selected";
            }else if(browserName == "firefox"){
                result = "Firefox Browser is selected";
            }else if(browserName == "opera"){
                result = "Opera Browser is selected";
            }else if(browserName == "safari"){
                result = "Safari Browser is selected";
            }else{
                result = "Edge Browser is selected";
            }
        }else{
            result = "Invalid Browser Name";
        }
        System.out.println(result);




    }
}
/*
Warmup Tasks:
	1. Create a class called Browser. Write a program that can display the name of selected browser
	        1. declear a String variable named browserName
	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
	        3. if the browser name does not match with the valid browsers' names,
	        out put should be: Invalid Browser Name

	        Ex:
	        	String browser = "chrome";

	    	Output:
	    		Chrome Browser is selected

			Note: MUST use nested if
 */
