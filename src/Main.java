public class Main {
    public static void main(String[] args) {

        CreditService service = new CreditService();
        double result = service.calculate(12);
        System.out.println("Ваш месячный платеж " + result);



       /* int sumCredit = 1_000_000;
        double percent = 9.99;
        int creditTerm = 24;
//расчет месячного процента
        double monthlyRate = percent/100/creditTerm;
// расчет участка формулы с возведением в степень
        double b = 1 + monthlyRate;
        double x = Math.pow(b,creditTerm);
        //делим формулу на верхнуюю и нижнюю часть
        double down = x -1;
        double top = monthlyRate/down;
        double middle = monthlyRate + top;


        double payment = sumCredit*middle;

        System.out.println(payment);*/
    }
}
