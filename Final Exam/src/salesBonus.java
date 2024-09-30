//Judy Marie Delos Reyes
//11-29-2023
//Displays bonus amounts, total bonus paid to all salespeople, and how many salespeople.
import java.text.DecimalFormat;
public class salesBonus {
    public static void main(String[] args) {
        double[][] salesAmount_DR = {
                {2400, 3500, 2000},
                {1500, 7000, 1000},
                {600, 450, 2100},
                {790, 240, 500},
                {1000, 1000, 1000}
        };
        final double BONUS_RATE_DR = 0.035;
        double[] totalSales_DR = new double[5];
        double[] totalBonus_DR = new double[5];
        // calculate total sales and bonus amounts per person
        for (int i = 0; i < salesAmount_DR.length; i++) {
            for (int j = 0; j < salesAmount_DR[i].length; j++) {
                totalSales_DR[i] += salesAmount_DR[i][j];
                totalBonus_DR[i] += salesAmount_DR[i][j] * BONUS_RATE_DR;
            }
        }
        // display results
        System.out.println("Salesperson\tJanuary\t\tFebruary\tMarch");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d\t \t$%.2f \t$%.2f \t$%.2f\n", (i + 1), salesAmount_DR[i][0], salesAmount_DR[i][1], salesAmount_DR[i][2]);
        }

        // calculate and display total bonus paid to all salespeople
        double bonusPaid_DR = 0.0;
        for (double bonus : totalBonus_DR) {
            bonusPaid_DR += bonus;
        }
        System.out.printf("\nTotal bounus paid to all Salespeople: $%.2f\n", bonusPaid_DR);
    }
}
