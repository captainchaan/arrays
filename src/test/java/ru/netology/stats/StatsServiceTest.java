package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void Summa() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.summa(sale);
        long expected = 180;

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void Medium(){
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = service.medium(sale);
        double expected = 15;

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void maxDay(){
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.getMaxMonth(sale);

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void minDay(){
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.getMinMonth(sale);

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void highMedium(){
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.highMedium(sale);

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void lowMedium(){
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.lowMedium(sale);

        Assertions.assertEquals(expected, actual);
    }


}
