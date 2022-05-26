package abstractfactory;

public class Factory {
    public static AbstractVehicleFactory getFactory(FactoryType factoryType){
        switch(factoryType){
            case BIKEFACTORY:
                return new BikeFactory();
            case CARFACTORY:
                return new CarFactory();
        }
        return null;
    }
}
