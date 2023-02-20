public class Gryffindors extends Hogwarts {

    private int nobility;
    private int honor;
    private String fullName;
    private int bravery;
    private int powerOfMagic;
    private int transgressionDistance;

    public Gryffindors(String fullName, int nobility, int honor, int bravery, int powerOfMagic, int transgressionDistance) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.fullName = fullName;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    private int summPowerGryffidors() {
        return this.bravery + this.honor + this.nobility + super.getTransgressionDistance() + super.getPowerOfMagic();

    }


    public void compare(Gryffindors gryffindors) {
        if (this.summPowerGryffidors() > gryffindors.summPowerGryffidors()) {
            System.out.println(this.getFullName() + " лучше чем по всем показателям" + gryffindors.getFullName());

        } else {
            System.out.println(gryffindors.getFullName() + " лучше чем по всем показателям " + this.getFullName());
        }

    }

    public int sumPowerTransgression() {
        return super.getPowerOfMagic() + super.getTransgressionDistance();
    }

    public void compare1(Gryffindors gryffindors) {
        if (this.sumPowerTransgression() > gryffindors.sumPowerTransgression()) {
            System.out.println(this.getFullName() + " лучше чем " + gryffindors.getFullName() + " по силе магии и трансгресcии ");

        } else {
            System.out.println(gryffindors.getFullName() + " лучше чем  " + this.getFullName() + " по силе магии и трансгресcии ");
        }

    }



    @Override
    public String toString() {
        return " Студент Гриффендор: " + super.toString()
                + ", храбрость - " + bravery + " баллов, "
                + ", верность - " + honor + " баллов,  "
                + ", благородство - " + nobility + " баллов. " + " Скилл равен - " + summPowerGryffidors();


    }
}
