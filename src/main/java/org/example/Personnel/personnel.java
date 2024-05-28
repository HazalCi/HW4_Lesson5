package org.example.Personnel;
import java.util.ArrayList;


class personnel {

    static ArrayList<personnel> personnelList = new ArrayList<>();
    String name;
    String title;
    int registryno;

    static void addPerson(personnel person) {
        personnelList.add(person);
    }

    static void printPersonnelList() {
        for (personnel person : personnelList) {
            System.out.println("Name: " + person.name  + "\nTitle: " + person.title + "\nRegistry No: " + person.registryno  + " \n-----\n");
        }
    }
}
