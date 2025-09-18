import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    private final TemperatureConverter tempConv = new TemperatureConverter();

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(-2.77, tempConv.fahrenheitToCelsius(27));
    }

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(212, tempConv.celsiusToFahrenheit(100));
        assertEquals(179.59, tempConv.celsiusToFahrenheit(82));
    }

    @Test
    void testKelvintoCelsius() {
        assertEquals(26.85, tempConv.kelvinToCelsius(300));
    }

    @Test
    void testIsExtremeTemperature() {
        assertTrue(tempConv.isExtremeTemperature(-50));
        assertTrue(tempConv.isExtremeTemperature(90));
        assertFalse(tempConv.isExtremeTemperature(27));
    }
}