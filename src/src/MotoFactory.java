public class MotoFactory implements MotorcycleFactory{

    @Override
    public Motorcycle createMotorcycle(String brand, String model, String color, int maxSpeed) {
        return new Motorcycle(brand,model,color,1000);
    }
}
