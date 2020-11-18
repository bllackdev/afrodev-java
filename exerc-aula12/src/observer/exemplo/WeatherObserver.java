package observer.exemplo;

import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.logging.Logger;

public interface WeatherObserver {
    void update(WeatherType currentWeather);
}

public class Orcs implements WeatherObserver {

    private static final Logger LOGGER = LoggerFactory.getLogger(Orcs.class);

    @Override
    public void update(WeatherType currentWeather) {
        LOGGER.info("The orcs are facing " + currentWeather.getDescription() + " weather now");
    }
}

public class Hobbits implements WeatherObserver {

    private static final Logger LOGGER = LoggerFactory.getLogger(Hobbits.class);

    @Override
    public void update(WeatherType currentWeather) {
        switch (currentWeather) {
            LOGGER.info("The hobbits are facing " + currentWeather.getDescription() + " weather now");
        }
    }
}
