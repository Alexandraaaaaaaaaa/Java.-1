package com.geekbrains.lesson4;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.geekbrains.lesson4.Triangle.triangleGeron;

public class TriangleTest {
    private static Logger logger = LoggerFactory.getLogger("TriangleTest");

    @BeforeAll
    static void beforeAll(){
        logger.debug("info log");
    }

    @Test
    @DisplayName("Позитивная проверка расчёта площади треугольника")
    void calculationAreatriangle() {
        double result = triangleGeron(15, 13, 17);
        Assertions.assertEquals(93.89988019161686, result);
    }

    @Test
    void negativСalculationAreaTriangleMinusNumber(){
        double result = triangleGeron(15, 13, 17);
        Assertions.assertEquals(93.8998801916168, result);
    }
}
