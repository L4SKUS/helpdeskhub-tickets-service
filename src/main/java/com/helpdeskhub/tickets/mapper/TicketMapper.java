package com.helpdeskhub.tickets.mapper;

import com.helpdeskhub.tickets.dto.TicketCreateDTO;
import com.helpdeskhub.tickets.dto.TicketResponseDTO;
import com.helpdeskhub.tickets.dto.TicketUpdateDTO;
import com.helpdeskhub.tickets.model.Ticket;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TicketMapper {

    public Ticket toTicket(TicketCreateDTO dto) {
        return Ticket.builder()
                .title(dto.getTitle())
                .description(dto.getDescription())
                .status(dto.getStatus())
                .priority(dto.getPriority())
                .clientId(dto.getClientId())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
    }

    public TicketResponseDTO toTicketResponseDTO(Ticket ticket) {
        return TicketResponseDTO.builder()
                .id(ticket.getId())
                .title(ticket.getTitle())
                .description(ticket.getDescription())
                .status(ticket.getStatus())
                .priority(ticket.getPriority())
                .clientId(ticket.getClientId())
                .employeeId(ticket.getEmployeeId())
                .createdAt(ticket.getCreatedAt())
                .updatedAt(ticket.getUpdatedAt())
                .build();
    }

    public void updateTicketFromDTO(Ticket ticket, TicketUpdateDTO dto) {
        if (dto.getTitle() != null) {
            ticket.setTitle(dto.getTitle());
        }
        if (dto.getDescription() != null) {
            ticket.setDescription(dto.getDescription());
        }
        if (dto.getStatus() != null) {
            ticket.setStatus(dto.getStatus());
        }
        if (dto.getPriority() != null) {
            ticket.setPriority(dto.getPriority());
        }
        ticket.setEmployeeId(dto.getEmployeeId());
        ticket.setUpdatedAt(LocalDateTime.now());
    }
}
