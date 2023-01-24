package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.members = members;
        this.name = name;
        this.year = year;
    }

    static void transferMembers(List<MusicArtist> a, List<MusicArtist> b) {
        a.addAll(b);
    }

    void printMembers(List<MusicArtist> members) {
        for (MusicArtist member: members) {
            System.out.println(member.toString());
        }
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
