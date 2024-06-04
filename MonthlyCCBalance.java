public class MonthlyCCBalance
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        double firstMonth = 5000;
        double secondMonth = 95.99;
        double thirdMonth = 0;
        double secondMonthTotal = 95.99;
        System.out.println("Enter the initial credit card balance");
        System.out.println("5000");
        firstMonth = 5000;
        secondMonth = firstMonth * 0.17;
        secondMonthTotal = firstMonth + secondMonth;
        System.out.println("the interest due for the end second month " + secondMonth + "USD");
        thirdMonth = secondMonthTotal * 0.17;
        System.out.println("the ineterest due for the end of third month " + thirdMonth + "USD");
    }

}