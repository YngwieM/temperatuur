package be.vdab.temperatuur.restclients;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import java.math.BigDecimal;

@SpringBootTest
class OpenWeatherMapClientTest {
    private final OpenWeatherMapClient client;

    public OpenWeatherMapClientTest(OpenWeatherMapClient client) {
        this.client = client;
    }

    @Test
    void temperatuurInBrussel() {
        assertThat(client.getTemperatuur("Brussel").get())
                .isBetween(BigDecimal.valueOf(-60), BigDecimal.valueOf(60));
    }
    @Test
    void onbestaandeGemeente() {
        assertThat(client.getTemperatuur("xxx")).isEmpty();
    }
}