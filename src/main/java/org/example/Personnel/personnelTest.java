package org.example.Personnel;

public class personnelTest {
    public static void main(String[] args) {
        personnelListAdding("Hazal", "Software Test Engineer", 12345);
        personnelListAdding("Mehmet", "System Design Engineer", 23456);
        personnelListAdding("Betül", "Software Engineer", 34567);

        personnel.printPersonnelList();
    }

    //personnel class'ından person objesi oluşturma ve personnel objesi olan listeye ekleme
    public static void personnelListAdding(String name, String title, int regno) {

        personnel person = new personnel();
        person.name = name;
        person.title = title;
        person.registryno = regno;

        personnel.addPerson(person);
    }
}
