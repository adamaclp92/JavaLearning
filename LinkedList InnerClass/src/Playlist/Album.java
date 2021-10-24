package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artist;
    private SongList songs;


    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration){
        return this.songs.add(new Song(title, duration));
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song checkedSong = this.songs.findSong(title);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have this song: " + title);
        return false;
    }


    private class SongList{
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song){
           if(songs.contains(song))
               return false;
           else{
               this.songs.add(song);
               return true;
           }
        }

        private Song findSong(String title){
            for (Song checkedSong: this.songs) {
                if(checkedSong.getTitle().equals(title))
                    return checkedSong;
            }
            return null;
        }

        public Song findSong(int trackNumber){
            int index = trackNumber - 1;
            if((index >0) && (index < songs.size()))
                return songs.get(index);
            return null;
        }

    }

}
