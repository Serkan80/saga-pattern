package net.stedin.werkorderservice.domain;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Data
@ToString
public class Werkorder {
    private Long id;
    private Long klantId;
    private Long monteurId;
    private WerkorderStatus status;
    private String aangemaaktDoor;

    @JsonFormat(shape = Shape.STRING)
    private LocalDateTime aanmaakDatum;
    private String omschrijving;
    private String commentaar;
    private Adres adres;
}
