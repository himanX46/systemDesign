package parkinglot.ticketService;

import parkinglot.exceptions.InvalidGateException;
import parkinglot.exceptions.InvalidVehicleException;
import parkinglot.models.*;
import parkinglot.repositories.GateRepository;
import parkinglot.repositories.TicketRepository;
import parkinglot.repositories.VehicleRepository;
import parkinglot.strategies.spotassignment.SpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private SpotAssignmentStrategy spotAssignmentStrategy;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, SpotAssignmentStrategy spotAssignmentStrategy, TicketRepository ticketRepository){
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
        this.ticketRepository = ticketRepository;
    }
    public Ticket generateTicket(Long gateId, VehicleType vehicleType, String vehicleNumber) throws InvalidGateException {
        Optional<Gate> optionalGate = gateRepository.findGateById(gateId);
        if(optionalGate.isEmpty()){
            throw new InvalidGateException();
        }
        Gate gate = optionalGate.get();
        Operator operator = gate.getCurrentOperator();
        Optional<Vehicle> optionalVehicle = vehicleRepository.findVehicleByNumber(vehicleNumber);
        Vehicle vehicle;
        if(optionalVehicle.isEmpty()){
            vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
            vehicle = vehicleRepository.save(vehicle);
        }else{
            vehicle = optionalVehicle.get();
        }
        ParkingSpot parkingSpot = spotAssignmentStrategy.findSpot();
        Ticket ticket = new Ticket();
        ticket.setParkingSpot(parkingSpot);
        ticket.setEntryTime(new Date());
        ticket.setVehicle(vehicle);
        ticket.setGate(gate);
        ticket.setOperator(operator);
        return ticketRepository.save(ticket);
    }
}
