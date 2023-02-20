public class PrintService {
    public void print(Hufflepuff[] hufflepuffs) {

        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Пуффендуй: Имя  " + hufflepuff.getFullName()
                    + " трудолюбие - " + hufflepuff.getIndustriousness() + " баллов, "
                    + " преданность - " + hufflepuff.getLoyalty() + " баллов, "
                    + " честность - " + hufflepuff.getHonesty() + " баллов, "
                    + " магическая сила - " + hufflepuff.getPowerOfMagic() + " баллов, "
                    + " расстояние трансгрессии - " + hufflepuff.getTransgressionDistance() + " баллов; "
            );

        }
        System.out.println();
    }

    public void print(Slytherin[] slytherins) {
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Слизерин: Имя " + slytherin.getFullName()
                    + " хитрость - " + slytherin.getTheTrick() + " баллов, "
                    + " амбиции - " + slytherin.getAmbition() + " баллов, "
                    + " решительность - " + slytherin.getDetermination() + " баллов, "
                    + " магическая сила - " + slytherin.getPowerOfMagic() + " баллов, "
                    + " расстояние трансгрессии - " + slytherin.getTransgressionDistance() + " баллов; "
            );
        }
        System.out.println();
    }

    public void print(Ravenclaw[] ravenclaws) {
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Когтевран: Имя " + ravenclaw.getFullName()
                    + " мудрость - " + ravenclaw.getMind() + " баллов, "
                    + " смекалка - " + ravenclaw.getWit() + " баллов,  "
                    + " инициативность - " + ravenclaw.getCreativity() + " баллов, "
                    + " магическая сила - " + ravenclaw.getPowerOfMagic() + " баллов, "
                    + " расстояние трансгрессии - " + ravenclaw.getTransgressionDistance() + " баллов; "
            );
        }
        System.out.println();
    }

    public void print(Gryffindors[] gryffindors) {
        System.out.println();
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindors hermioneGranger = gryffindors[i];
            System.out.println("Гриффендор: Имя " + hermioneGranger.getFullName()
                    + " храбрость - " + hermioneGranger.getBravery() + " баллов, "
                    + " верность - " + hermioneGranger.getHonor() + " баллов,  "
                    + " благородство - " + hermioneGranger.getNobility() + " баллов, "
                    + " магическая сила - " + hermioneGranger.getPowerOfMagic() + " баллов, "
                    + " расстояние трансгрессии - " + hermioneGranger.getTransgressionDistance() + " баллов; ");
        }
    }
}








  //  public void print(Gryffindors [] harryPotter) {


















