package ru.netology.test.sender;

import ru.netology.entity.Location;
import ru.netology.geo.GeoService;

public class GeoServiceImplMock implements GeoService {

    public static final String LOCALHOST = "127.0.0.1";
    public static final String MOSCOW_IP = "172.0.32.11";
    public static final String NEW_YORK_IP = "96.44.183.149";

    @Override
    public Location byIp(String ip) {
        return null;
    }

    @Override
    public Location byCoordinates(double latitude, double longitude) {
        return null;
    }
}
