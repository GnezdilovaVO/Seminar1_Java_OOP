public class Animal {
    protected String nameAnimal;
    protected String ownerName;
    protected String diagnosis;
    protected Boolean isVaccinated;
    protected final String TYPE = getClass().getSimpleName();

    public Animal(String nameAnimal, String ownerName, String diagnosis, Boolean isVaccinated) {
        this.nameAnimal = nameAnimal;
        this.ownerName = ownerName;
        this.diagnosis = diagnosis;
        this.isVaccinated = isVaccinated;
    }

    public boolean isVaccinated() {
        return this.isVaccinated;
    }

    public void setVaccinate(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public String getType() {
        return TYPE;
    }

    @Override
    public String toString() {
        return String.format("%s{name = %s, owner = %s}", TYPE, nameAnimal, ownerName);
    }

    public String getType(String arg) {
        return arg + TYPE;
    }

    protected void toGo() {
        System.out.println("ходить");
    }

    protected void toFly() {
        System.out.println("летать");
    }

    protected void toSwim() {
        System.out.println("плавать");
    }
}