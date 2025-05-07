package videogameexercise;

import videogame.logic.VideoGame;
import java.util.ArrayList;
import java.util.List;

public class VideoGameExercise {

    public static void main(String[] args) {
        
        List<VideoGame> videoGameList = new ArrayList<>();
        
        VideoGame game1 = new VideoGame(1, "Banjo Kazooie", "Nintendo 64", 4, "Platform");
        VideoGame game2 = new VideoGame(2, "Kirby 64: The Crystal Shards", "Nintendo 64", 4, "Platform");
        VideoGame game3 = new VideoGame(3, "Hollow Knight", "PC", 1, "Platform");
        VideoGame game4 = new VideoGame(4, "Counter Strike", "PC", 1, "Shooter");
        VideoGame game5 = new VideoGame(5, "Mario Party 3", "Nintendo 64", 4, "Platform");
        
        videoGameList.add(game1);
        videoGameList.add(game2);
        videoGameList.add(game3);
        videoGameList.add(game4);
        videoGameList.add(game5);
        
        for (VideoGame game: videoGameList) {
            System.out.println("----------------------------");
            
            System.out.println("Game title: " + game.getTitle());
            System.out.println("Game console: " + game.getConsole());
            System.out.println("Game amount of players: " + game.getAmountOfPlayers());
        }
        
        
        game3.setTitle("Hollow Knight: Silksong");
        game3.setAmountOfPlayers(1);
        
        game4.setTitle("CS2");
        game4.setAmountOfPlayers(5);
        
        System.out.println("################################");
        
        for (VideoGame game: videoGameList) {
            if (game.getConsole().equals("Nintendo 64")) {
                System.out.println(game.toString());
            }
        }
        
    }
    
}
