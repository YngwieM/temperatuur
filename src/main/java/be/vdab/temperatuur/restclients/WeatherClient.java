package be.vdab.temperatuur.restclients;

import java.math.BigDecimal;
import java.util.Optional;

public interface WeatherClient {
    Optional<BigDecimal> getTemperatuur(String gemeente);
}
