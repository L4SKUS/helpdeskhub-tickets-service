package com.helpdeskhub.tickets.dto;

import com.helpdeskhub.tickets.enums.TicketPriority;
import com.helpdeskhub.tickets.enums.TicketStatus;
import lombok.Data;

@Data
public class TicketCreateDTO {
    private String title;
    private String description;
    private TicketStatus status;
    private TicketPriority priority;
    private Integer clientId;
}
