package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    static LinkedList<Song> playList = new LinkedList<Song>();
    public static void main(String[] args) {


        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);


        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24

        System.out.println("====================================");

        System.out.println(playList.get(0).getTitle());
        System.out.println(playList.get(1).getTitle());
        System.out.println(playList.get(2).getTitle());
        System.out.println(playList.get(3).getTitle());

        System.out.println("====================================");
        playApplication();
        System.out.println("====================================");
    }

    public static void playApplication(){
        ListIterator<Song> iterator = playList.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = false;
        showInstructions();

        if(playList.isEmpty()){
            System.out.println("A zenelejátszó üres.");
        }else{
            System.out.println("Aktuális zene: ");
            System.out.println(iterator.next().toString());
            iterator.previous();
        }

        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;

                case 1:
                    listPlayList(playList);
                    break;

                case 2:
                    if(!goingForward){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        goingForward = true;
                    }

                    if(iterator.hasNext()){
                        System.out.println(iterator.next().toString());

                    }else{
                        System.out.println("End of the playlist.");
                    }
                    break;

                case 3:
                    if(goingForward){
                        if(iterator.hasPrevious())
                            iterator.previous();
                        goingForward = false;
                    }

                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous().toString());

                    }else{
                        System.out.println("Start of the playlist.");
                    }
                    break;

                case 4:
                    if(goingForward && iterator.hasPrevious()){
                        iterator.previous();
                        System.out.println(iterator.next().toString());
                    }else{
                        System.out.println(iterator.next().toString());
                        iterator.previous();
                    }
                    break;

                case 5:
                    if(iterator.hasPrevious()){
                        iterator.previous();
                        System.out.println(" - " + iterator.next().toString() + " törölve a listából.");
                        iterator.remove();
                    }else if(iterator.hasNext()){
                        iterator.next();
                        System.out.println(" - " + iterator.previous().toString() + " törölve a listából.");
                        iterator.remove();
                    }
                    break;
            }
        }
    }

    public static void showInstructions(){
        System.out.println("Válassz az alábbiak közül");
        System.out.println("0 - Exit\n" +
                            "1 - Show playlist\n" +
                            "2 - Skip forward\n" +
                            "3 - Skip backward\n" +
                            "4 - Replay the current song\n" +
                            "5 - Remove current song from the list");
    }

    public static void listPlayList(LinkedList<Song> playlist){
        System.out.println("Teljes lejátszási lista:");
        ListIterator<Song> iterator = playlist.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());

        }
    }

}
