package Playlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void addSong(String title, double duration){
        if(findSong(title) >= 0)
            System.out.println("This song(" + title + ") already exists in " + this.albumName);
        else{
            this.songs.add(new Song(title, duration));
            System.out.println("Song(" + title + ") successfully added to " + this.albumName);
        }
    }

    public void deleteSong(String title){
        int foundedSongIndex = findSong(title);
        if(foundedSongIndex >= 0){
            this.songs.remove(foundedSongIndex);
            System.out.println("Song(" + title + ") removed from the " + this.albumName);
        }else{
            System.out.println("Song(" + title + ") doesn't exist in " + this.albumName);
        }
    }

    public void listSongs(){
        int songsListSize = this.songs.size();
        if(songsListSize > 0){
            for (int i = 0; i < songsListSize; i++) {
                Song iSong = this.songs.get(i);
                System.out.println(iSong.getTitle() + " - " + iSong.getDuration());
            }
        }else
            System.out.println("The album is empty.");
    }

    private int findSong(String title){
        for (int i = 0; i < this.songs.size(); i++) {
            if(this.songs.get(i).getTitle().equals(title))
                return i;
        }
        return -1;
    }

    private Song findSong(int index){
        if(index < songs.size())
            return songs.get(index);
        else
            return null;
    }

    public void addToPlayList(String title, LinkedList<Song> playlist){
        int foundedSongIndex = findSong(title);
        if(foundedSongIndex >= 0){
            playlist.add(this.songs.get(foundedSongIndex));
            System.out.println("Song(" + title + ") is successfully added to playlist.");
        }else{
            System.out.println("This song(" + title + ") doesn't exist.");
        }
    }

    public void addToPlayList(int index, LinkedList<Song> playlist){
        Song foundedSong = findSong(index);
        if(foundedSong != null){
            playlist.add(foundedSong);
            System.out.println("Song with " + index + " index is successfully added to playlist.");
        }else{
            System.out.println("This song with " + index + " index doesn't exist.");
        }
    }


}
