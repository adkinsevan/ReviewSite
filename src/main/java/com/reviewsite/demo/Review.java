package com.reviewsite.demo;

public class Review {
    private Long id;
    private String albumName;
    private String albumDescription;
    private String albumReleaseDate;
    private String genre;

    public Long getId() {
        return id;
    }
    public String getAlbumName() {
        return albumName;
    }

    public Review(long id, String albumName, String albumDescription, String albumReleaseDate, String genre) {
        this.id = id;
        this.albumName = albumName;
        this.albumDescription = albumDescription;
        this.albumReleaseDate = albumReleaseDate;
        this.genre = genre;
    }
}
