public class Main
{
    public static void main(String[] args) {
        // declare variables
        double summerCost = 183.66;
        double autumnCost = 166.50;
        double winterCost = 170.32;
        double springCost = 161.12;
        double yearlyCost = 0;

        // calculate total yearly maintenance cost
        yearlyCost = summerCost + autumnCost + winterCost + springCost;

        // output
        System.out.println("The maintenance cost for the summer is " + summerCost);
        System.out.println("The maintenance cost for the autumn is " + autumnCost);
        System.out.println("The maintenance cost for the winter is " + winterCost);
        System.out.println("The maintenance cost for the spring is " + springCost);

        System.out.println("The total yearly maintenance cost is " + yearlyCost);
    }
}