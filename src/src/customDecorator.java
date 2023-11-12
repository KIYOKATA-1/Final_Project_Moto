public class customDecorator implements  MotorcycleDecorator{
    private Motorcycle motorcycle;

    public customDecorator(Motorcycle motorcycle){
        this.motorcycle = motorcycle;
    }


    @Override
    public String getDescription() {
        return motorcycle.getDescription() + ", with Custom";
    }

    @Override
    public double getPrice() {
        return motorcycle.getPrice() + 10000;
    }
}
