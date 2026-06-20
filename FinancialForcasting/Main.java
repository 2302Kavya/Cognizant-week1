public class Main {


    public static void main(String[] args) {

        double result =
                FinancialForecast.futureValue(
                        1000,
                        0.10,
                        3);

        System.out.println(
                "Future Value = " + result);
    }
}

