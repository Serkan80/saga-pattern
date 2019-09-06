
package net.stedin.werkorderservice.domain;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
public class Adres {

    @NotEmpty
    @Pattern(regexp = "[0-9]{4}\\s?[aA-zZ]{2}")
    private String postcode;

    @NotEmpty
    private String huisNr;

    @NotEmpty
    private String straat;

    @NotEmpty
    private String woonplaats;
}
