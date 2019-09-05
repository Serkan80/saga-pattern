package net.stedin.werkorderservice.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Werkorder {
    private Long id;
    private Long customerId;
    private Long monteurId;
    private WerkorderStatus status;
    private String createdBy;
    private LocalDateTime createdOn;
    private String description;
    private String comments;
    private Address address;

}
