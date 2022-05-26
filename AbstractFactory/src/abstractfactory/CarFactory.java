package abstractfactory;

public class CarFactory extends AbstractVehicleFactory{
    @Override
    Vehicle getVehicle(VehicleType vehicleType) {
        switch(vehicleType){
            case BMW :  return new BMW("Karl Rapp","Munich, German");
            case Lamborghini:  return new Lamborghini("Ferruccio Lamborghini"," Italy");

        }
        //Founder:
        //Headquarters: Sant'Agata Bolognese,
        return null;
    }
}
