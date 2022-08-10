package week14;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList;

    public GroceryList() {
        groceryList = new ArrayList<>();
    }

    public void addItemToList(String item){
        groceryList.add(item);
    }
    public void modifyList(int position, String newItem){
        groceryList.set(position-1, newItem);
        System.out.println("Grocery Item " + (position) + " has been modified");
    }
    public void removeItem(int position){
        groceryList.remove(position-1);
    }

    public String search(String item){
        String searchResult;
        if(groceryList.size() == 0){
            return null;
        }
       searchResult = "not found";
        int indexOfItem = groceryList.lastIndexOf(item);
        if (indexOfItem>=0){
            searchResult = item + " item is found at line " + (indexOfItem +1);
        }
        return searchResult;
    }

    public String toString() {
        String list ="You have " + groceryList.size() + " items in your shopping list";
        for (int i = 0 ; i < groceryList.size(); i++){
            list+="\n" + (i+1) + ". " + groceryList.get(i);
        }

        return list;
    }
}
