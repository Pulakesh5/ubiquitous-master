package ticket.booking.entities;

import java.util.Date;

public class Ticket {
    private String ticketID;
    private String userID;
    private String source;
    private String destination;
    private Date dateOfTravel;
    private Train train;

    // Constructor
    public Ticket(String ticketID, String userID, String source, String destination, Date dateOfTravel, Train train) {
        this.ticketID = ticketID;
        this.userID = userID;
        this.source = source;
        this.destination = destination;
        this.dateOfTravel = dateOfTravel;
        this.train = train;
    }

    // Getters and Setters
    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDateOfTravel() {
        return dateOfTravel;
    }

    public void setDateOfTravel(Date dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    // Method to get ticket information
    public String getTicketInfo() {
        return String.format("Ticket ID: %s\nUser ID: %s\nSource: %s\nDestination: %s\nDate of Travel: %s\nTrain No: %s",
                ticketID, userID, source, destination, dateOfTravel, (train != null ? train.getTrainNo() : "N/A"));
    }
}
