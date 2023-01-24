package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        MusicBand linkinPark = new MusicBand("Linkin Park", 1996);
        MusicBand limpBizkit = new MusicBand("Limp Bizkit", 1994);
        MusicBand thirtySecondsToMars = new MusicBand("Thirty Seconds to Mars", 1998);
        MusicBand papaRoach = new MusicBand("Papa Roach", 1993);
        MusicBand imagineDragons = new MusicBand("Imagine Dragons", 2008);
        MusicBand xAmbassadors = new MusicBand("X Ambassadors", 2009);
        MusicBand fallOutBoy = new MusicBand("Fall Out Boy", 2001);
        MusicBand coldPlay = new MusicBand("ColdPlay", 1996);
        MusicBand evanescence = new MusicBand("Evanescence", 1995);
        MusicBand seether = new MusicBand("Seether", 1999);

        List<MusicBand> musicBandList = new ArrayList<>();
        musicBandList.add(linkinPark);
        musicBandList.add(limpBizkit);
        musicBandList.add(thirtySecondsToMars);
        musicBandList.add(papaRoach);
        musicBandList.add(imagineDragons);
        musicBandList.add(xAmbassadors);
        musicBandList.add(fallOutBoy);
        musicBandList.add(coldPlay);
        musicBandList.add(evanescence);
        musicBandList.add(seether);
        Collections.shuffle(musicBandList);

        for (MusicBand band : musicBandList) {
            System.out.println("LIST 1");
            System.out.println(band.toString());
        }

        for (MusicBand band:groupsAfter2000(musicBandList)) {
            System.out.println("LIST 2");
            System.out.println(band.toString());
        }
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> musicBandList = new ArrayList<>();
        for (MusicBand band: bands) {
            if (band.getYear() > 2000) {
                musicBandList.add(band);
            }
        }
        return musicBandList;
    }
}
