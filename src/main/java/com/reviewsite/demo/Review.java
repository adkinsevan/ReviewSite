package com.reviewsite.demo;

public class Review {
    private Long id;
    private String albumName;
    private String albumDescription;
    private String albumReleaseDate;
    private String genre;
    private String imgUrl;
    private String albumReview;

    public Long getId() {
        return id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getAlbumDescription() {
        return albumDescription;
    }

    public String getAlbumReleaseDate() {
        return albumReleaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getAlbumReview() {
        return albumReview;
    }

    public Review(long id, String albumName, String albumDescription, String albumReleaseDate, String genre,
                  String imgUrl, String albumReview) {
        this.id = id;
        this.albumName = albumName;
        this.albumDescription = albumDescription;
        this.albumReleaseDate = albumReleaseDate;
        this.genre = genre;
        this.imgUrl = imgUrl;
        this.albumReview = albumReview;
    }
}
