package com.subrat.Project5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.subrat.Project5.model.Ticket;
import com.subrat.Project5.model.Train;
import com.subrat.Project5.service.TicketService;
import com.subrat.Project5.service.TrainService;

@Controller
public class PageControlller {

    @Autowired
    private TicketService ticketService;
    
   @Autowired
   private TrainService trainService;
    
    @GetMapping("/")
    public String home() {
        return "home"; 
    }

    /* Book Ticket Logics  */
    //------------------------//
    
    @GetMapping("/bookTicketForm")
    public String showBookTicketForm() {
        return "bookTicketForm"; 
    }

    @PostMapping("/bookTicketForm")
    public String bookTicket(@RequestParam String fromStation,
                             @RequestParam String toStation,
                             @RequestParam String passengerName,
                             @RequestParam int noOfTickets,
                             @RequestParam String travelDate,
                             Model model) {
    	 try {
    	        Ticket ticket = ticketService.bookTicket(fromStation, toStation, passengerName, noOfTickets, travelDate);
    	        //Storing all data in Model,shares visibility of data to jsp pages
    	        model.addAttribute("ticket", ticket);
    	        return "ticketConfirmation"; 
    	        
    	    } catch (IllegalStateException e) {
    	        model.addAttribute("errorMessage", e.getMessage()); 
    	        return "bookTicketForm"; 
    	    }
    }
    
    
    /* Ticket Confirmation Logics  */
    //------------------------//
    
    @GetMapping("/ticketConfirmation")
    public String showTicketConfirmation() {
        return "ticketConfirmation";  
    }
    
    
    /* Check Train availability Logics  */
    //------------------------//
    
    @GetMapping("/checkAvailability")
    public String showCheckAvailabilityForm() {
        return "checkAvailability"; 
    }

    
    @PostMapping("/checkAvailability")
    public String checkTrainAvailabilityy(@RequestParam String sourceStation,
                                         @RequestParam String destinationStation,
                                         @RequestParam String travelDate,
                                         Model model) {
    	
       
        List<Train> availableTrains = trainService.checkTrainAvailability(sourceStation, destinationStation, travelDate);
     
        
        model.addAttribute("availableTrains", availableTrains);
        return "availabilityResult"; 
    }
    
    
    /* View Ticket  Logics  */
    //------------------------//
    
    @PostMapping("/checkTicket")
    public String viewTicket(@RequestParam String bookingReferenceNumber, Model model) {
        
        Ticket ticket = ticketService.getTicketByReferenceNumber(bookingReferenceNumber);

        if (ticket != null) {
            
            model.addAttribute("ticket", ticket);
        } else {
           
            model.addAttribute("message", "Ticket not found.");
        }

        return "viewTicket";  
    }
    
    @GetMapping("/viewTicket")
    public String checkTick() {
    	return "viewTicket";
    }
    
    //Cancel Ticket
    
    @GetMapping("/cancelTickets")
    public String cancelUserTicket() {
    	return "cancelTicket";
    }
    
    @PostMapping("/cancelTickets")
    public String cancelUserTicketForm(@RequestParam String bookingReferenceNumber, Model model) {
    	
    	String msg=ticketService.removeTicketByBookingReferenceNumber(bookingReferenceNumber);
    	
      model.addAttribute("cancelMsg", msg);
    	
    	
    	return "cancelTicket";
    }


}
