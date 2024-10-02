package ru.netology.stats;

public class StatsService {
    public long summa(long[] sale) { //сумма всех продаж
        long allSales = 0;
        for (int i = 0; i < sale.length; i++) {
            allSales = allSales + sale[i];
        }
        return allSales;
    }

    public double medium(long[] sale){ //средняя сумма продаж в месяц
        long sum = summa(sale);
        return(double) sum / sale.length;
    }
    public int getMaxMonth(long[]sale){ //номер месяца, в котором пик продаж
        int maxMonth = 0;
        for (int i = 0; i < sale.length; i++){
            if (sale[i]  >= sale[maxMonth] ){
                maxMonth = i;
            }
        }
        return maxMonth+ 1;
    }

    public int getMinMonth(long[]sale){
        int minMonth = 0;
        for (int i = 0; i < sale.length; i++){
            if (sale[i]  < sale[minMonth] ){
                minMonth = i;
            }
        }
        return minMonth+ 1;
    }
    public long highMedium(long[] sale) { //количество месяцев выше среднего

        int high = 0;
        double average = medium(sale);
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > average) {
                high++;
            }
        }

        return high;

    }
    public long lowMedium(long[] sale) { //количество месяцев ниже среднего

        int low = 0;
        double average = medium(sale);

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < average) {
                low++;
            }
        }

        return low;

    }



}