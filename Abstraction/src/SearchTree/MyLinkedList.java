package SearchTree;

import java.sql.SQLOutput;
import java.util.List;

public class MyLinkedList implements NodeList{
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }


    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
       if(this.root == null) {
           //The list was empty, so this item becomes the head
           this.root = newItem;
           return true;
       }

           ListItem currentItem = this.root;
           while(currentItem != null){
               int comparison = currentItem.compareTo(newItem);
               if(comparison < 0){
                   //new item is greater, move right if possible
                   if(currentItem.next() != null){
                       currentItem = currentItem.next();
                   }else{
                       //there is no next, so insert at end of list
                       currentItem.setNext(newItem).setPrevious(currentItem); //rövidítve lett a kód. Először a current item next-je lesz beállítva newItem-re, aztán a newItem előzője meg a currentItemre
                       return true;
                   }

               }else if(comparison > 0){
                   //newItem is less, insert before
                   if(currentItem.previous() != null){
                       currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                       newItem.setNext(currentItem).setPrevious(newItem);

                   }else{
                       //the node with previous is the root
                       newItem.setNext(this.root).setPrevious(newItem);
                       this.root = newItem;
                   }
                   return true;
               }else{
                   //equal
                   System.out.println(newItem.getValue() + " is already present, not added.");
                   return false;
               }
           }
           return false;
       }


    @Override
    public boolean removeItem(ListItem removableItem) {
        if (removableItem != null) {
            System.out.println("Deleting item: " + removableItem.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(removableItem);
            if (comparison == 0) {
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {
                //we are at an item greater than the one to be deleted
                //so the item is not in the list
                return false;
            }
        }
        return false;
    }




    @Override
    public void traverse(ListItem root) {  //végig iterálunk a listán
        if(this.root == null) {
            System.out.println("A lista üres.");
        }else{
            ListItem currentItem = this.root;
            while(currentItem != null){
                System.out.println(currentItem.getValue());
                currentItem = currentItem.next();
            }
        }
    }
}
