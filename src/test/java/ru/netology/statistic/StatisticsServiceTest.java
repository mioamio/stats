package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxTwo() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        long expected = 11;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxThree() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {24, 20, 18, 16, 14, 12, 10, 8, 6, 4, 2};
        long expected = 24;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}