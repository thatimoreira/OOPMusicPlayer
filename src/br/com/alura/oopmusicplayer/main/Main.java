package br.com.alura.oopmusicplayer.main;

import br.com.alura.oopmusicplayer.models.Music;
import br.com.alura.oopmusicplayer.models.MyFavorites;
import br.com.alura.oopmusicplayer.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music   myMusic = new Music();
        myMusic.setTitle("Video");
        myMusic.setArtist("India.Arie");
        myMusic.setAlbum("Acoustic Soul");
        myMusic.setGenre("Soul");

        // simulating the plays
        for (int i = 0; i < 7191; i ++){
            myMusic.play();
        }

        // simulating the likes
        for (int i = 0; i < 6972; i++){
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Hipsters Ponto Tech");
        myPodcast.setHost("Paulo Silveira");
        myPodcast.setDescription("Discussion about technology, programming, design, startups, and the latest trends.");

        // simulating the plays
        for (int i = 0; i < 2001; i ++){
            myPodcast.play();
        }

        // simulating the likes
        for (int i = 0; i < 1961; i++){
            myPodcast.like();
        }

        MyFavorites favorites = new MyFavorites();
        favorites.addToFavorites(myMusic);
        favorites.addToFavorites(myPodcast);
    }
}
