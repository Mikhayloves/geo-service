package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;
import static ru.netology.entity.Country.RUSSIA;

class LocalizationServiceImplTest {



    @Test
    void localeTest() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        localizationService.locale(RUSSIA);
        assertEquals(RUSSIA,localizationService);
    }
}