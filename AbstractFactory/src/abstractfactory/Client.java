package abstractfactory;

public class Client {
    public static void main(String[] args){
        Vehicle ktm = Factory.getFactory(FactoryType.BIKEFACTORY).getVehicle(VehicleType.KTM);
        System.out.println(ktm.getDetails());
        AbstractVehicleFactory abstractVehicleFactory= Factory.getFactory(FactoryType.CARFACTORY);
        Vehicle bmw = abstractVehicleFactory.getVehicle(VehicleType.BMW);
        System.out.println(bmw.getDetails());
    }
}
