
package abstractfactory;

public abstract class AbstractVehicleFactory {
    //return vehicle object
    abstract Vehicle getVehicle(VehicleType vehicleType);
}

