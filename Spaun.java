public class Spaun extends Animal {
    private int countOfPaws;
    public Spaun (String nameAnimal, String ownerName, String diagnosis, Boolean isVaccinated, int countOfPaws) {
        super(nameAnimal, ownerName, diagnosis, isVaccinated);
        this.countOfPaws = countOfPaws;
    }
    @Override
    protected void toSwim(){
        System.out.println("Не плавает");
    }
    @Override
    protected void toFly() {
        System.out.println("Не летает");
    }
}
