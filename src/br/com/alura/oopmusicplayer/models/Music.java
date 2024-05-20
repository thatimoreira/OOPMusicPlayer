package br.com.alura.oopmusicplayer.models;

public class Music extends Audio {
    private String  album;
    private String  artist;
    private String  genre;

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int getRating() {
        if (this.getTotalPlays() > 1000000) {
            return 5;
        }
        if (this.getTotalPlays() > 500000) {
            return 4;
        }
        if (this.getTotalPlays() > 200000) {
            return 3;
        }
        if (this.getTotalPlays() > 50000) {
            return 2;
        }
        if (this.getTotalPlays() > 10000) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
