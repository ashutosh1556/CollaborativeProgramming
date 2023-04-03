package Rough;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implement below 2 functions.
 * void play(String bandName, String songName); Keeps track of how many times a song of a given band was played
 * String topSong(String bandName);  Returns most played song for the given band
 */
public class MostPlayedSongByBand {
    HashMap<String, HashMap<String, Integer>> bandMap = new HashMap<>();
    Logger logger = Logger.getLogger("MostPlayedSongByBand");

    public static void main(String[] args) {
        MostPlayedSongByBand obj = new MostPlayedSongByBand();
        obj.play("Parikarma", "Mayeri1");
//        obj.play("Parikarma", "Mayeri2");
//        obj.play("Parikarma", "Mayeri2");
//        obj.play("Parikarma", "Mayeri1");
//        obj.play("Band1", "Bekhayali");
//        obj.play("Band1", "Mehram");
//        obj.play("Band1", "Bekhayali");
//        obj.play("Band1", "Mehram");

        System.out.println(obj.topSong("Band1"));
    }

    String topSong(String bandName) {
        String result = "Band name not available";
        if (bandName == null || bandName.isEmpty()) {
            return "String is either Null, Empty or space";
        } else if (bandMap.containsKey(bandName)) {
            HashMap map = bandMap.get(bandName);
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
            result = list.get(0).getKey();
        }
        return result;
    }

    void play(String bandName, String songName) {
        try {
            if (bandName == null || bandName.isEmpty() || songName == null || songName.isEmpty()) {
                logger.log(Level.INFO, "IllegalArgument Exception");
            } else if (!bandMap.containsKey(bandName)) {
                HashMap<String, Integer> map = new HashMap<>();
                map.put(songName, 1);
                bandMap.put(bandName, map);
            } else {
                if (bandMap.get(bandName).containsKey(songName)) {
                    int count = bandMap.get(bandName).get(songName);
                    bandMap.get(bandName).put(songName, ++count);
                } else {
                    bandMap.get(bandName).put(songName, 1);
                }
            }
        } catch (IllegalArgumentException e) {
            logger.log(Level.WARNING, "IllegalArgument Exception");
            e.printStackTrace();
        }
    }
}
