package parkinglot.dtos;

public class GenerateTicketResponseDTO {
    private Long ticketId;
    private String operatorName;
    private String spotNumber;

    private ResponseStatus responseStatus;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(String spotNumber) {
        this.spotNumber = spotNumber;
    }

    @Override
    public String toString() {
        return "GenerateTicketResponseDTO{" +
                "ticketId=" + ticketId +
                ", operatorName='" + operatorName + '\'' +
                ", spotNumber='" + spotNumber + '\'' +
                ", responseStatus=" + responseStatus +
                '}';
    }
}
