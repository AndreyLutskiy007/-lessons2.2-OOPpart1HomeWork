public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wit;
    private int creativity;
    private String fullName;
    private int powerOfMagic;
    private int transgressionDistance;

    public Ravenclaw(String fullName, int mind, int wit, int creativity, int powerOfMagic, int transgressionDistance) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wit = wit;
        this.creativity = creativity;
        this.fullName = fullName;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private int summPowerRavenclaw() {
        return this.mind + this.wit + this.creativity + super.getTransgressionDistance() + super.getPowerOfMagic();

    }


    public void compare(Ravenclaw ravenclaw) {
        if (this.summPowerRavenclaw() > ravenclaw.summPowerRavenclaw()) {
            System.out.println(this.getFullName() + " лучше чем " + ravenclaw.getFullName());

        } else {
            System.out.println(ravenclaw.getFullName() + " лучше чем " + this.getFullName());
        }

    }

    public int sumPowerTransgressionRaven() {
        return super.getPowerOfMagic() + super.getTransgressionDistance();
    }

    public void compare1(Ravenclaw ravenclaw) {
        if (this.sumPowerTransgressionRaven() > ravenclaw.sumPowerTransgressionRaven()) {
            System.out.println(this.getFullName() + " лучше чем " + ravenclaw.getFullName() + " по силе магии и трансгрессии ");

        } else {
            System.out.println(ravenclaw.getFullName() + " лучше чем  " + this.getFullName() + " по силе магии и трансгрессии ");
        }

    }

    @Override
    public String toString() {
        return " Студент Когтевран: " + super.toString()
                + ", смекалка - " + wit + " баллов, "
                + ", мудрость - " + mind + " баллов,  "
                + ", инициативность - " + creativity + " баллов." + " Скилл равен - " + summPowerRavenclaw();
    }
}
