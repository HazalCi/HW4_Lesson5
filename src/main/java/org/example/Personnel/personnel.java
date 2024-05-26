package org.example.Personnel;
import java.util.ArrayList;
import java.util.List;

class personnel {
    String name;
    static List<String> personnelList = new ArrayList<>();

    static void addPerson(String name) {
        personnelList.add(name);
    }

    static void printPersonnelList() {
        for (String person : personnelList) {
            System.out.println(person);
        }
    }
}
