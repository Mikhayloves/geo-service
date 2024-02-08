package ru.netology.test.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
import static ru.netology.entity.Country.RUSSIA;

class LocalizationServiceImplTest {



    @Test
    void localeTest() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        String expected = localizationService.locale(RUSSIA);
        Assertions.assertEquals("Добро пожаловать",expected);
    }
}