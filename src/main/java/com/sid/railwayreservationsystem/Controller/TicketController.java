package com.sid.railwayreservationsystem.Controller;


import com.sid.railwayreservationsystem.Entity.TicketData;
import com.sid.railwayreservationsystem.Response.TicketResponse;
import com.sid.railwayreservationsystem.Services.TicketingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/ticket")
public class TicketController {

    @Autowired
    TicketingServices ticketingServices;

    @GetMapping("/getAvailableTickets/")
    public List<TicketData> getAvailableTicket(){


        return ticketingServices.getAvailableTicket();
    }
}
