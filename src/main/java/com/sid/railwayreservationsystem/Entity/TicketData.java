package com.sid.railwayreservationsystem.Entity;


import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Document(collection = "Ticket")
@Component
public class TicketData {

    @Id
    ObjectId _id;
    String pnr;
    String departingStationName;
    String destinationStationName;
    String distanceBetweenStation;
    String price;
    String dateOfTravel;
    String departureTime;;
    String arrivalTime;




}
