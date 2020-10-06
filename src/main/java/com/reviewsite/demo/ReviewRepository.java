package com.reviewsite.demo;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository(){
        Review enterTheWuTang = new Review(1L,"Enter the Wu-Tang (36 Chambers)",
                "Enter the Wu-Tang (36 Chambers) is the debut studio album by American hip hop group Wu-Tang Clan",
                "1993", "Hardcore Hip-hop");

        Review summerTime = new Review(2L,"Summertime '06",
                "Summertime '06 is the debut studio double album by American rapper Vince Staples.",
                "2015","Hip-hop");

        Review strays = new Review(3L,"Strays With Rabies",
                "Strays With Rabies is the second studio album by EarthGang", "2015","Rap");

        Review iDontLike = new Review(4L,"I Don't Like Shit, I Don't Go Outside",
                "I Don't Like Shit, I Don't Go Outside is the second studio album by American rapper Earl Sweatshirt",
                "2015", "Hip-hop");

        Review takeMeTo = new Review(5L, "Take Me To Your Leader",
                "Take Me to Your Leader is the second studio album by British-American MC/producer MF Doom, released under the alias King Geedorah",
                "2003", "Underground Hip-hop");

        Review liquidSwords = new Review(6L, "Liquid Swords",
                "Liquid Swords is the second solo studio album by American rapper and Wu-Tang Clan member GZA",
                "1995", "East Coast Hip-hop");

        Review betterOffDead = new Review(7L, "BetterOffDEAD",
                "BetterOffDEAD is the second mixtape by American hip hop trio Flatbush Zombies.",
                "2013", "Hip-hop");

        Review atrocityExhibition = new Review(8L, "Atrocity Exhibition",
                "Atrocity Exhibition is the fourth studio album by American rapper Danny Brown",
                "2016", "Experimental Hip-hop");

        Review pinata = new Review(9L, "Piñata",
                "Piñata is the first collaborative studio album by American rapper Freddie Gibbs and record producer Madlib",
                "2014", "Hip-hop");



        reviewList.put(enterTheWuTang.getId(),enterTheWuTang);
        reviewList.put(summerTime.getId(),summerTime);
        reviewList.put(strays.getId(), strays);
        reviewList.put(iDontLike.getId(),iDontLike);
        reviewList.put(takeMeTo.getId(),takeMeTo);
        reviewList.put(liquidSwords.getId(),liquidSwords);
        reviewList.put(betterOffDead.getId(),betterOffDead);
        reviewList.put(atrocityExhibition.getId(),atrocityExhibition);
        reviewList.put(pinata.getId(),pinata);
    }

    public ReviewRepository(Review ...reviewToAdd){
        for(Review review: reviewToAdd){
            reviewList.put(review.getId(),review);
        }
    }

    public Review findReview(long id) {
        return reviewList.get(id);
    }
    public Collection<Review> findAll(){
        return reviewList.values();
    }

}
