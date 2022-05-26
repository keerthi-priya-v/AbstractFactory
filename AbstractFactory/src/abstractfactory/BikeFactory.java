package abstractfactory;

public class BikeFactory extends AbstractVehicleFactory{
    @Override
    Vehicle getVehicle(VehicleType vehicleType) {
        switch(vehicleType){
            case Honda :  return new Honda("Soichiro Honda","Gurgaon",1955);
            case KTM :  return new KTM("Hans Trunkenpolz"," Mattighofen",1959);

        }
        return null;
    }
}
