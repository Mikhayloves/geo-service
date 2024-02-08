package ru.netology.geo;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;
import static ru.netology.geo.GeoServiceImpl.MOSCOW_IP;

class GeoServiceImplTest {

    @Test
    void byIp() {
        Location location = new Location("Moscow", Country.RUSSIA, null, 0);
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location result = geoService.byIp("172.");
        assertEquals(location,result);
    }
}