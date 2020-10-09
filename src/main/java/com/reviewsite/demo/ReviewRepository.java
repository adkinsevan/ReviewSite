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
                "1993", "Hardcore Hip-hop", "/Images/36 chambers.jpeg",
                "The most iconic hip-hop album of all time, period. Every song is a memorable hit that not only reshaped the genre itself, but, the entirety of the future of music.  It is the music that begun a new era, everything from the skits, to the production, to the individual personalities of every member of the Wu-Tang. Truly the pinnacle of hip-hop. ");

        Review summerTime = new Review(2L,"Summertime '06",
                "Summertime '06 is the debut studio double album by American rapper Vince Staples.",
                "2015","Hip-hop", "/Images/summertime.jpg",
                "A biological wonder of the world is the warning that mice give each other when they smell the pheromones of predator. It is said that a mouse can scream for hours to let others know about the fear of approaching danger. Summertime 06’ is this same cry from Vince Staples. A young mind letting people know the brutal conditions of just surviving in the hardest parts of Long Beach. Every party song is followed by a track to remind you how different life can be for people like him.");

        Review strays = new Review(3L,"Strays With Rabies",
                "Strays With Rabies is the second studio album by EarthGang",
                "2015","Rap", "/Images/Strays.jpg",
                "It’s hard to describe this one, but every song is an ear-worm. You’ll want to listen to every track on this album over and over again. Not only are the songs fun to listen too but thought provoking as well. Each track is accompanied by an equally great music video as well.  ");

        Review iDontLike = new Review(4L,"I Don't Like Shit, I Don't Go Outside",
                "I Don't Like Shit, I Don't Go Outside is the second studio album by American rapper Earl Sweatshirt",
                "2015", "Hip-hop", "/images/earl_sweatshirt.jpg",
                "Proven perfection. Earl Sweatshirt is establishing his lyrical skill in all aspects from creativity to delivery. This is him telling the world that he has been very meticulous on what he has to say, he’s cementing his thoughts not only about his own life, but the decisions and actions of those around him. Listening through I Don’t Like Shit I don’t Go outside is akin to reading an isolated monk’s writings.");

        Review takeMeTo = new Review(5L, "Take Me To Your Leader",
                "Take Me to Your Leader is the second studio album by British-American MC/producer MF Doom, released under the alias King Geedorah",
                "2003", "Underground Hip-hop", "/Images/take me.jpg",
                "A true mastery of lyrics, production, and continuity. From start to finish this is a story you can follow and learn from. “I Wonder” featuring Hassan Chop is three minutes and thirty eight seconds of strife told in beautiful imagery that no movie could covey.");

        Review liquidSwords = new Review(6L, "Liquid Swords",
                "Liquid Swords is the second solo studio album by American rapper and Wu-Tang Clan member GZA",
                "1995", "East Coast Hip-hop", "/Images/liquid.jpeg",
                "Is there anything I can say about this album that hasn’t been said already? Some regard this as, not only the greatest hip-hop album of all time, but as the greatest album of all time. Do I agree? I cannot say, but it is absolutely phenomenal.");

        Review betterOffDead = new Review(7L, "BetterOffDEAD",
                "BetterOffDEAD is the second mixtape by American hip hop trio Flatbush Zombies.",
                "2013", "Hip-hop", "/Images/betterOff.jpg",
                "The catchiness of BetterOffDEAD is unmatched. From front to back I, personally, have this album memorized. Flatbush Zombies are establishing themselves as ahead of all others.");

        Review atrocityExhibition = new Review(8L, "Atrocity Exhibition",
                "Atrocity Exhibition is the fourth studio album by American rapper Danny Brown",
                "2016", "Experimental Hip-hop", "/Images/Danny.jpg",
                "The title fits perfectly for this album. It starts with Downward Spiral, the confusion you feel abut this song: should you be ready to listen to another Danny Brown club record, or should you be as tormented as he is? Every feature is a superstar that perfectly demonstrates the energy one can reflect when Danny Brown is preforming with them. ");

        Review pinata = new Review(9L, "Piñata",
                "Piñata is the first collaborative studio album by American rapper Freddie Gibbs and record producer Madlib",
                "2014", "Hip-hop", "/Images/pinata.jpg",
                "Have you been to Gary Indiana? Have you lived in the absolute poorest parts of the Midwest? This album is the closest you can come to experiencing this without actually living through it. The final track, the namesake of the album, is the greatest collaboration project of talent that this genre has ever seen.");


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
