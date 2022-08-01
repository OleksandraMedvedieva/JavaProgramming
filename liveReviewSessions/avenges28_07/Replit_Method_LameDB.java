package avenges28_07;

public class Replit_Method_LameDB {

    public static String lameDb(String db, String op, String id, String data){
        String resultDb="";
        String[] arr = db.split("#");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].substring(1);
        }

        String[] newArr = null; // empty arr
        int index = Integer.parseInt(id)-1;
        switch(op){
            case "add":
                newArr = new String[arr.length+1];

                for( int i = 0, j = 0; i< arr.length+1; ){
                    if (index == i){
                        newArr[i] = data;
                        i++;
                        continue;
                    }
                    newArr[i] = arr[j];
                    i++;
                    j++;
                }
                break;
            case"edit":
                newArr = new String[arr.length];
                for (int i = 0;i<arr.length; ){
                    if (index == i){
                        newArr[i] = data;
                        i++;
                        continue;
                    }
                    newArr[i] = arr[i];
                    i++;
                }
                break;
            case "delete":
                newArr = new String[arr.length];

                for (int i = 0;i<arr.length; ){
                    if (index == i){
                        newArr[i] = data;
                        i++;
                        continue;
                    }
                    newArr[i] = arr[i];
                    i++;
                }


                break;
        }
        int z =1;
        for(String each: newArr){
            if(!each.isEmpty()){
                resultDb+=z+each+ "#";
                z++;
            }
            else{
                z++;
                continue;
            }

        }



        return resultDb.substring(0,resultDb.length()-1);
    }

    public String lameDb(String db, String op, int id, String data){  // this is an instance method even though it is in the same class, it needs an object created to be called
        String resultDb="oscar";
        // some solution
        return resultDb;
    }

    public static void main(String[] args) {
        System.out.println(lameDb("1tst#2bla#3foo","delete","1",""));
        //   System.out.println(Replit_Method_LameDB.lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa")); Since this a static method we can call with class name as well

        Replit_Method_LameDB obj = new Replit_Method_LameDB();
        obj.lameDb("1etsy#2wooden#3spoon", "add", 4, "aaa");

    }


}
