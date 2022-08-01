package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int year = 2001;
        int num = 2;
        String result;
        if (num >=1 && num <=12){
            switch(num) {
                case 2:
                    if(year%4 == 0){
                        result ="28 days";
                    }else{
                        result ="29 days";
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    result = "30 days";
                    break;
                default:
                    result ="31 days";
            }
        }else{
            result ="invalid number";
        }
        System.out.println("result = " + result);


        }



    }

/*
4. NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12

			If(1~12){


			}else{
				Invalid
			}
 */
