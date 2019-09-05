package net.stedin.werkorderservice.domain;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class Address {

    @NotEmpty
    @Pattern(regexp = "[0-9]{4}\\s?[aA-zZ]{2}")
    private String zipcode;

    @NotEmpty
    private String houseNr;

    @NotEmpty
    private String street;

    @NotEmpty
    private String city;
}
