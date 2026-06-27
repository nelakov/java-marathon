package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members = new ArrayList<>();

    public MusicBand(String name, int year, List<String> members) {
        this.members = members;
        this.name = name;
        this.year = year;
    }

    static void transferMembers(List<String> target, List<String> source) {
        target.addAll(source);
        source.clear();
    }

    void printMembers(List<String> members) {
        for (String member : members) {
            System.out.println(member);
        }
    }

    public List<String> getMembers() {
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
