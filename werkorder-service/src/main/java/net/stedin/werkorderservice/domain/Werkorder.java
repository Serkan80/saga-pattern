package net.stedin.werkorderservice.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Werkorder {
    private Long id;
    private Long klantId;
    private Long monteurId;
    private WerkorderStatus status;
    private String aangemaaktDoor;

    @JsonFormat(shape = Shape.STRING)
    private Date aanmaakDatum;
    private String omschrijving;
    private String commentaar;
    private Adres adres;
}
