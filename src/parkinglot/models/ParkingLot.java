package parkinglot.models;

import java.util.List;

public class ParkingLot extends BaseModel{
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private int cappacity;

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public int getCappacity() {
        return cappacity;
    }

    public void setCappacity(int cappacity) {
        this.cappacity = cappacity;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "parkingFloors=" + parkingFloors +
                ", gates=" + gates +
                ", cappacity=" + cappacity +
                '}';
    }
}
