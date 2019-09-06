package net.stedin.werkorderservice.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum WerkorderStatus {
    INACTIEF, ACTIEF, GEANNULEERD, AFGEROND;

    @JsonCreator
    public static WerkorderStatus fromString(String value) {
        if (value == null || "".equals(value.trim())) {
            throw new IllegalArgumentException("WerkorderStatus moet een waarde bevatten");
        }

        return WerkorderStatus.fromString(value.toUpperCase());
    }
}
