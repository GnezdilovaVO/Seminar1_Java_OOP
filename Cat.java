public class Cat extends Animal {
    private int countPaws;

    public Cat() {
        this("Васька", null, null, false, 4);
    }

    public Cat(String nameAnimal, String ownerName, String diagnosis, Boolean isVaccinated, int countPaws) {
        super(nameAnimal, ownerName, diagnosis, isVaccinated);
        this.countPaws = countPaws;
    }

    private void wakeUp() {
        System.out.println("Кот проснулся");
    }

    private void findFood() {
        System.out.println("Кот нашел еду");
    }

    private void eatFood() {
        System.out.println("Кот поел");
    }

    private void sleepCat() {
        System.out.println("Кот уснул");
    }
    public void hunt() {
        wakeUp();
        findFood();
        eatFood();
        sleepCat();
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
