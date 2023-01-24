package day12.task5;

import java.util.ArrayList;
import java.util.List;

import static day12.task5.MusicBand.transferMembers;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> membersLinkinParkList = new ArrayList<>();
        List<MusicArtist> membersLimpBizkitList = new ArrayList<>();
        membersLinkinParkList.add(new MusicArtist("Mike", "Shinoda", 1988));
        membersLinkinParkList.add(new MusicArtist("Chester", "Bennington", 1987));
        membersLimpBizkitList.add(new MusicArtist("Fred", "Durst", 1976));
        membersLimpBizkitList.add(new MusicArtist("Wes", "Borland", 1978));

        MusicBand linkinPark = new MusicBand("Linkin Park", 1996, membersLinkinParkList);
        MusicBand limpBizkit = new MusicBand("Limp Bizkit", 1994, membersLimpBizkitList);

        transferMembers(membersLinkinParkList, membersLimpBizkitList);
        System.out.println("List after transfer: " + "\n" + "---------------------------");
        linkinPark.printMembers(linkinPark.getMembers());
        System.out.println("List" + "\n" + "---------------------------");
        limpBizkit.printMembers(limpBizkit.getMembers());
    }
}
