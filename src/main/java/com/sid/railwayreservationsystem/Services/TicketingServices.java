package com.sid.railwayreservationsystem.Services;


import com.sid.railwayreservationsystem.Entity.TicketData;
import com.sid.railwayreservationsystem.Repository.TicketRepository;
import com.sid.railwayreservationsystem.Response.TicketResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketingServices {

    @Autowired
    private TicketRepository ticketRepository;





    public List<TicketData> getAvailableTicket() {


        return ticketRepository.findAll();



    }
}
