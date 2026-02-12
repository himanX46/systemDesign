package parkinglot.controllers;


import parkinglot.dtos.GenerateTicketRequestDTO;
import parkinglot.dtos.GenerateTicketResponseDTO;
import parkinglot.dtos.ResponseStatus;
import parkinglot.exceptions.InvalidGateException;
import parkinglot.models.Ticket;
import parkinglot.models.VehicleType;
import parkinglot.ticketService.TicketService;

public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    public GenerateTicketResponseDTO generateTicket(GenerateTicketRequestDTO request) throws InvalidGateException {
        String vehicleNumber = request.getVehicleNumber();
        VehicleType vehicleType =  request.getVehicleType();
        Long gateId = request.getGateId();
        Ticket ticket = ticketService.generateTicket(gateId,vehicleType,vehicleNumber);
        GenerateTicketResponseDTO response = new GenerateTicketResponseDTO();
        response.setTicketId(ticket.getId());
        response.setOperatorName(ticket.getOperator().getName());
        response.setSpotNumber(String.valueOf(ticket.getParkingSpot().getNumber()));
        response.setResponseStatus(ResponseStatus.SUCCESS);
        return response;
    }
}
