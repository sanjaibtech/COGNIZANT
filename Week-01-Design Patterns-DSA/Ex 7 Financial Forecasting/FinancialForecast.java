public class FinancialForecast {

    public static double predictIterative(double currentValue, double growthRate, int years) {
        double futureValue = currentValue;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }

    public static double predictUsingFormula(double currentValue, double growthRate, int years) {
        return currentValue * Math.pow(1 + growthRate, years);
    }

    public static void main(String[] args) {
        double currentValue = 1000.0;
        double growthRate = 0.10;
        int years = 5;

        double iterativeResult = predictIterative(currentValue, growthRate, years);
        System.out.println("Predicted Future Value (Iterative): " + iterativeResult);

        double formulaResult = predictUsingFormula(currentValue, growthRate, years);
        System.out.println("Predicted Future Value (Formula-based): " + formulaResult);
    }
}
