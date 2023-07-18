public class Dog extends Animal{
    public Dog(String nameAnimal, String ownerName, String diagnosis, Boolean isVaccinated) {
        super(nameAnimal, ownerName, diagnosis, isVaccinated);
    }
    @Override
    protected void toFly() {
        System.out.println("Не летает");
    }
}
