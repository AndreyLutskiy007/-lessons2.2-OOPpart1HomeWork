public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;
    private String fullName;
    private int powerOfMagic;
    private int transgressionDistance;


    public Hufflepuff(String fullName, int industriousness, int loyalty, int honesty, int powerOfMagic, int transgressionDistance) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
        this.fullName = fullName;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private int summPowerHufflepuff() {
        return this.industriousness + this.honesty + this.loyalty + super.getTransgressionDistance() + super.getPowerOfMagic();

    }


    public void compare(Hufflepuff hufflepuff) {
        if (this.summPowerHufflepuff() > hufflepuff.summPowerHufflepuff()) {
            System.out.println(this.getFullName() + " лучше чем " + hufflepuff.getFullName());

        } else {
            System.out.println(hufflepuff.getFullName() + " лучше чем " + this.getFullName());
        }

    }

    public int sumPowerTransgressionHuff() {
        return super.getPowerOfMagic() + super.getTransgressionDistance();
    }

    public void compare1(Hufflepuff hufflepuff) {
        if (this.sumPowerTransgressionHuff() > hufflepuff.sumPowerTransgressionHuff()) {
            System.out.println(this.getFullName() + " лучше чем " + hufflepuff.getFullName() + " по силе магии и трансгрессии ");

        } else {
            System.out.println(hufflepuff.getFullName() + " лучше чем  " + this.getFullName() + " по силе магии и трансгрессии ");
        }
    }


    @Override
    public String toString() {
        return " Студент Пуффендуй: " + super.toString()
                + ", трудолюбие - " + industriousness + " баллов, "
                + ", честность - " + honesty + " баллов,  "
                + ", преданность - " + loyalty + " баллов." + " Скилл равен - " + summPowerHufflepuff();
    }
}
