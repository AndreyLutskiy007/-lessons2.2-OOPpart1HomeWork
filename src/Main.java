import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Gryffindors hermioneGrangers =
                new Gryffindors("Hermione granger", 89, 90, 91, 97, 98);


        Gryffindors harryPotter =
                new Gryffindors("Harry Potter", 91, 92, 95, 98, 99);


        Gryffindors ronWeasley =
                new Gryffindors("Ron Weasley", 78, 90, 80, 38, 78);

        Hufflepuff zachariahSmith =
                new Hufflepuff("Zachariah Smith", 65, 89, 87, 34, 76);

        Hufflepuff cedricDiggory =
                new Hufflepuff("Cedric Diggory", 55, 87, 30, 58, 87);
        Hufflepuff finchFletchleyiggory =
                new Hufflepuff("Finch-Fletchleyiggory", 76, 55, 67, 76, 60);

        Slytherin dracoMalfoy =
                new Slytherin("Draco Malfoy", 98, 89, 88, 56, 56);
        Slytherin grahamMontague =
                new Slytherin("Graham Montague", 78, 58, 78, 6, 20);
        Slytherin gregoryGoyle
                = new Slytherin("Gregory Goyle", 65, 67, 80, 56, 90);

        Ravenclaw zhouChang =
                new Ravenclaw("Zhou Chang", 95, 87, 87, 67, 76);
        Ravenclaw padmaPatil =
                new Ravenclaw("Padma Patil", 80, 85, 85, 76, 78);
        Ravenclaw marcusBelby=
                new Ravenclaw("Marcus Belby", 98, 84, 83, 66, 74);
        harryPotter.compare(ronWeasley);
        harryPotter.compare1(hermioneGrangers);
        padmaPatil.compare(marcusBelby);
        zhouChang.compare(marcusBelby);
        finchFletchleyiggory.compare1(zachariahSmith);
        dracoMalfoy.compare(grahamMontague);
        dracoMalfoy.compare1(gregoryGoyle);
        zachariahSmith.compare(cedricDiggory);
        System.out.println(hermioneGrangers);
        System.out.println(zachariahSmith);
        System.out.println(marcusBelby);
        System.out.println(dracoMalfoy);


    }
}


// PrintService printServices = new PrintService();
// printServices.print (hermioneGrangers);


//   gryffindor[0] = new Gryffindors("Hermione granger", 89, 90, 91, 97, 98);
//   gryffindor[1] = new Gryffindors("Harry Potter", 91, 92, 95, 98, 99);
//   gryffindor[2] = new Gryffindors("Ron Weasley", 78, 90, 80, 38, 78);

//   hufflepuff[0] = new Hufflepuff("Zachariah Smith", 65, 89, 87, 34, 76);
//   hufflepuff[1] = new Hufflepuff("Cedric Diggory", 55, 87, 30, 58, 87);
//   hufflepuff[2] = new Hufflepuff("Finch-Fletchleyiggory", 76, 55, 67, 76, 60);

//   slytherin [0] = new Slytherin("Draco Malfoy", 98, 89, 88, 56, 56);
//   slytherin [1] = new Slytherin("Graham Montague", 78, 58, 78, 6, 20);
//   slytherin [2] = new Slytherin("Gregory Goyle", 65, 67, 80, 56, 90);

//   ravenclaw[0] = new Ravenclaw("Zhou Chang", 95, 87, 87, 67, 76);
//   ravenclaw[1] = new Ravenclaw("Padma Patil", 80, 85, 85, 76, 78);
//   ravenclaw[2] = new Ravenclaw("Marcus Belby", 98, 84, 83, 66, 74);



