public abstract class Hogwarts {


    private String fullName;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String fullName, int powerOfMagic, int transgressionDistance) {
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }




    @Override
    public String toString() {
        return "Имя " + fullName + ", сила магии - " + powerOfMagic + " баллов" +
                ", расстояние трансгрессии - " + transgressionDistance + " баллов";
    }

}
