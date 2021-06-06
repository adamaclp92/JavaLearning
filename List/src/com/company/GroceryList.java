package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String oldItem, String newItem){
        int position = findItem2(oldItem);
        if(position >= 0 ){
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }


    public void removeGroceryItem(String item){
        int position = findItem2(item);
        if(position >= 0 ){
          removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
        String item = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(item + " has been moved.");
    }

    /*public String findItem(String searchItem){
      //  boolean exits = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);

        if(position >= 0){ //az index of -1-et ad vissza, ha nem található a listában az elem
            return groceryList.get(position);
        }
      return null;
    }*/

    private int findItem2(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem2(searchItem);
        if(position >= 0)
            return true;
        else
            return false;
    }

}
