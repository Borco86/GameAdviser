package borco86.com.github.gameadviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Borco on 2017-08-01.
 */

public class GameAdviser {

    List<String> getGames(String genre){
        List<String> gameTitles = new ArrayList<>();
        if(genre.equals("FPS")){
            gameTitles.add("Blood");
            gameTitles.add("Doom");
            gameTitles.add("Wolfenstein");
            gameTitles.add("Call of Juarez");
        }else if(genre.equals("cRPG")){
            gameTitles.add("Planescape Torment");
            gameTitles.add("Baldurs Gate");
            gameTitles.add("Icewind Dale");
            gameTitles.add("Fallout");
        }else if(genre.equals("RTS")){
            gameTitles.add("StarCraft");
            gameTitles.add("Age of Empires");
            gameTitles.add("KKND");
            gameTitles.add("Command&Conquer");
        }else if(genre.equals("Adventure")){
            gameTitles.add("Siberia");
            gameTitles.add("The Longest Journey");
            gameTitles.add("Myst");
            gameTitles.add("broken Sword");
        }
        return gameTitles;

    }

}
