public class Bird extends Animal{
    private int lengthWing;
    public Bird (String nameAnimal, String ownerName, String diagnosis, Boolean isVaccinated, int lengthWing) {
        super(nameAnimal, ownerName, diagnosis, isVaccinated);
        this.lengthWing = lengthWing;
    }
    @Override
    protected void toSwim(){
        System.out.println("Не плавает");
    }
}
