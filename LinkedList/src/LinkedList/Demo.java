package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

       /* placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brosbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);*/

        addInOrder(placesToVisit, "Sidney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brosbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);
        addInOrder(placesToVisit, "Darwin");

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("=============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity); //pozitív, ha a paraméterben levő String ABC sorrendben hamarabb van, mint a this object(stringListIterator.next())
            if(comparison == 0){
                //equal, do not add
                System.out.println(newCity + " is already included as a destination.");
                return true;
            }else if(comparison > 0){
                //new city should appear before this one
                //Brisbane -> Adelaide
                stringListIterator.previous(); //mivel fent a next() itemre hivatkozunk, vissza kell egyet lépni
                stringListIterator.add(newCity);
                return true;
            }else if(comparison < 0){
                //move on next city,

            }
        }
        stringListIterator.add(newCity); //0 elemnél, valamint ha az a paraméter eleme abc sorrendben az utolsó a lista elemeihez képest, nincs hasnext(), szóval adja is hozzá automat
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itenerary");
            return;
        }else{
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }

                    if(listIterator.hasNext())
                        System.out.println("Now visiting " + listIterator.next());
                    else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }

                    if(listIterator.hasPrevious())
                        System.out.println("Now visiting " + listIterator.previous());
                    else {
                        System.out.println("We are at the start of the list.");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }

    }

    private static void printMenu(){
        System.out.println("0 - quit \n" +
                "1 - go to next city \n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}
