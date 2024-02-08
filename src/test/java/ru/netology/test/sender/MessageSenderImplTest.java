package ru.netology.test.sender;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.i18n.LocalizationService;
import ru.netology.sender.MessageSenderImpl;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;
import static ru.netology.test.sender.GeoServiceImplMock.MOSCOW_IP;
import static ru.netology.test.sender.GeoServiceImplMock.NEW_YORK_IP;

@ExtendWith(MockitoExtension.class)
class MessageSenderImplTest {
    String expected,text;

    @Mock
    GeoService geoService;

    @Mock
    LocalizationService localizationService;

    @InjectMocks
    MessageSenderImpl messageSenderImpl;

    @Test
    void MessageSenderImplTestRussia() {
        when(geoService.byIp(MOSCOW_IP)).thenReturn(new Location("Moscow", Country.RUSSIA, null, 0));
        when(localizationService.locale(Country.RUSSIA)).thenReturn("Добро пожаловать");
        Map<String, String> headers = new HashMap<>();
        headers.put(MessageSenderImpl.IP_ADDRESS_HEADER, MOSCOW_IP);
        expected = "Добро пожаловать";
        text = messageSenderImpl.send(headers);
        Assertions.assertEquals(expected, text);
    }
@Test
    void MessageSenderImplTestUSA() {
        when(geoService.byIp(NEW_YORK_IP)).thenReturn(new Location("New York", Country.USA, null, 0));
        when(localizationService.locale(Country.USA)).thenReturn("Welcome");
        Map<String, String> headers = new HashMap<>();
        headers.put(MessageSenderImpl.IP_ADDRESS_HEADER, NEW_YORK_IP);
        expected = "Welcome";
        text = messageSenderImpl.send(headers);
        Assertions.assertEquals(expected, text);
    }
}