package com.sid.railwayreservationsystem.Response;


import com.sid.railwayreservationsystem.Entity.TicketData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class TicketResponse {

    String pnr;
    String departingStationName;
    String destinationStationName;
    String distanceBetweenStation;
    String price;
    String dateOfTravel;
    String departureTime;;
    String arrivalTime;

    public TicketResponse(TicketData ticketData)
    {
        this.pnr=ticketData.getPnr();
        this.departingStationName=ticketData.getDepartingStationName();
        this.destinationStationName=ticketData.getDestinationStationName();
        this.price=ticketData.getPrice();
        this.dateOfTravel=ticketData.getDateOfTravel();
        this.departureTime=ticketData.getDepartureTime();
        this.arrivalTime=ticketData.getArrivalTime();

    }


}
