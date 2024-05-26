package org.example.Personnel;

public class personnelTest {
    public static void main(String[] args) {
        personnel person1 = new personnel();
        personnel person2 = new personnel();
        person1.name ="Hazal";
        person2.name ="Mehmet";
        personnel.addPerson(person1.name);
        personnel.addPerson(person2.name);
        personnel.printPersonnelList();

    }
}
