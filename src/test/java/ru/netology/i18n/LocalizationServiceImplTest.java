package ru.netology.i18n;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {



    @Test
    void locale() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        localizationService.locale(Country.RUSSIA);
        String expected = "Добро пожаловать";
        assertEquals(expected,localizationService);
    }
}