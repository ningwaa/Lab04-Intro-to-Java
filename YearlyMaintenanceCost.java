public class YearlyMaintenanceCost {
    /**
     * @param args the command line arguements
     */
    public static void main(String[] args)
    {

        double springCost=100.25;
        double summerCost=150.50;
        double fallCost=200.25;
        double winterCost=250.45;
        double totalCost=0;
        System.out.println("Enter the Maintenance cost of spring");
        System.out.println("100.25");
        System.out.println("Enter the Maintenance cost of summer");
        System.out.println("150.50");
        System.out.println("Enter the Maintenance cost of fall");
        System.out.println("200.25");
        System.out.println("Enter the Maintenance cost of winter");
        System.out.println("250.45");
        totalCost = springCost+summerCost+fallCost+winterCost;
        System.out.println("The total Yearly Maintenance cost is" + totalCost + "USD with the Seasonal Cost" + springCost + "USD for spring," + summerCost + "USD for summer," + "fallCost " + "USD for fall" + winterCost+ "USD for winter");

    }


}