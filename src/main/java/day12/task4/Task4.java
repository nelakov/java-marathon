package day12.task4;

import java.util.ArrayList;
import java.util.List;

import static day12.task4.MusicBand.transferMembers;

public class Task4 {
    public static void main(String[] args) {
        List<String> membersLinkinParkList = new ArrayList<>();
        List<String> membersLimpBizkitList = new ArrayList<>();
        membersLinkinParkList.add("Mike Shinoda");
        membersLinkinParkList.add("Chester Bennington");
        membersLimpBizkitList.add("Fred Durst");
        membersLimpBizkitList.add("Wes Borland");

        MusicBand linkinPark = new MusicBand("Linkin Park", 1996, membersLinkinParkList);
        MusicBand limpBizkit = new MusicBand("Limp Bizkit", 1994, membersLimpBizkitList);

        transferMembers(membersLinkinParkList, membersLimpBizkitList);
        System.out.println("List Linkin Park after transfer: " + "\n" + "---------------------------");
        linkinPark.printMembers(linkinPark.getMembers());
        System.out.println("----------------------------------------------------------------------");
        System.out.println("List Limp Bizkit after transfer" + "\n" + "---------------------------");
        limpBizkit.printMembers(limpBizkit.getMembers());
    }
}
