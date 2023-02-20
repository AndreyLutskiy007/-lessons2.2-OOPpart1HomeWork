public class Slytherin extends Hogwarts {
    private int theTrick;
    private int ambition;
    private int determination;
    private String fullName;
    private int powerOfMagic;
    private int transgressionDistance;

    public Slytherin(String fullName, int theTrick, int ambition, int determination, int powerOfMagic, int transgressionDistance) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.theTrick = theTrick;
        this.ambition = ambition;
        this.determination = determination;
        this.fullName = fullName;
    }

    public int getTheTrick() {
        return theTrick;
    }

    public void setTheTrick(int theTrick) {
        this.theTrick = theTrick;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    private int summPowerSlytherin () {
        return this.theTrick + this.ambition + this.determination + super.getTransgressionDistance() + super.getPowerOfMagic();

    }


    public void compare (Slytherin slytherin) {
        if (this.summPowerSlytherin() > slytherin.summPowerSlytherin()) {
            System.out.println(this.getFullName() + " лучше чем " + slytherin.getFullName());

        } else {
            System.out.println(slytherin.getFullName() + " лучше чем " + this.getFullName());
        }

    }

    public int sumPowerTransgressionSlyth() {
        return super.getPowerOfMagic() + super.getTransgressionDistance();
    }

    public void compare1(Slytherin slytherin) {
        if (this.sumPowerTransgressionSlyth() > slytherin.sumPowerTransgressionSlyth()) {
            System.out.println(this.getFullName() + " лучше чем " + slytherin.getFullName() + " по силе магии и трансгрессии ");

        } else {
            System.out.println(slytherin.getFullName() + " лучше чем  " + this.getFullName() + " по силе магии и трансгрессии ");
        }


        }


    @Override
    public String toString() {
        return  " Студент Слизерин: " + super.toString()
                + ", хитрость - " +  theTrick + " баллов, "
                + ", амбиции - " + ambition + " баллов,  "
                + ", решительность - " + determination + " баллов." + " Скилл равен - " + summPowerSlytherin();
    }
}
