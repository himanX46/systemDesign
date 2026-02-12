import parkinglot.controllers.TicketController;
import parkinglot.repositories.GateRepository;
import parkinglot.repositories.TicketRepository;
import parkinglot.repositories.VehicleRepository;
import parkinglot.strategies.spotassignment.SpotAssignmentStrategy;
import parkinglot.strategies.spotassignment.SpotAssignmentStrategyImpl;
import parkinglot.ticketService.TicketService;

public class Main {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        SpotAssignmentStrategy spotAssignmentStrategy = new SpotAssignmentStrategyImpl();
        TicketRepository ticketRepository = new TicketRepository();
        TicketService ticketService = new TicketService(gateRepository,vehicleRepository,spotAssignmentStrategy,ticketRepository);
        TicketController ticketController = new TicketController(ticketService);
    }
}