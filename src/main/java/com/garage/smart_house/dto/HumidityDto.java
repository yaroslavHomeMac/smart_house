package com.garage.smart_house.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Vladyka Stanislau
 * @since 20.08.2021
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HumidityDto {
    private double temperature;
    @JsonProperty(value = "relative_humidity")
    private double relativeHumidity;
    @JsonProperty(value = "controller_id")
    private long controllerId;
}
