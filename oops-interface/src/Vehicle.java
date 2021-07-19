public interface Vehicle {
    void addSpeed(int n);
    void reduceSpeed(int n);
}

class Bike implements Vehicle {

    private int speed;

    public Bike(int speed) {
        this.speed = speed;
    }

    @Override
    public void addSpeed(int n) {
        this.speed+=n;
    }

    @Override
    public void reduceSpeed(int n) {
        this.speed-=n;
    }

    public int getSpeed() {
        return speed;
    }
}

class Car implements Vehicle {

    private int speed;
    int gear=2;

    public Car(int speed) {
        this.speed = speed;
    }

    @Override
    public void addSpeed(int n) {
        this.speed+=gear*n;
    }

    @Override
    public void reduceSpeed(int n) {
        this.speed-=gear*n;
    }

    public int getSpeed() {
        return speed;
    }
}

class Main{
    public static void main(String[] args){
        Car car= new Car(50);
        car.addSpeed(20);
        System.out.println(car.getSpeed());
        car.reduceSpeed(10);
        System.out.println(car.getSpeed());

        Bike bike = new Bike(30);
        bike.addSpeed(10);
        System.out.println(bike.getSpeed());
        bike.reduceSpeed(25);
        System.out.println(bike.getSpeed());

    }

}