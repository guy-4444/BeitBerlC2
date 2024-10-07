import java.util.Scanner;

public class SalaryCalculator {

    public static final double AVERAGE_SALARY_FOR_SOCIAL_SECURITY = 12_536;

    public static void start() {
        System.out.println("◍ ◍ ◍ ◍ ◍ Salary Calculator App ◍ ◍ ◍ ◍ ◍");
        Scanner scanner = new Scanner(System.in);


        System.out.println("Hi, Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your gross salary:");
        double input = scanner.nextDouble();
        System.out.println("Hi, Enter 1 if you under 18, 0 else:");

        int bool = scanner.nextInt();
        boolean under18 = bool == 1 ? true : false;


        double incomeTax = calculateIncomeTax(input);
        double socialSecurity = calculateSocialSecurity(input, under18);
        double healthTax = calculateHealthTax(input, under18);

        System.out.println("Name: " + name);
        System.out.println("bool: " + bool);
        System.out.println("Gross: " + input);
        System.out.println("Income Tax: " + incomeTax);
        System.out.println("Social Security: " + socialSecurity);
        System.out.println("Health Tax: " + healthTax);

        double net = 0;
        System.out.println("Net Salary: " + net);

    }

    public static double calculateSocialSecurity(double gross, boolean under18) {
        // https://www.kolzchut.org.il/he/%D7%93%D7%9E%D7%99_%D7%91%D7%99%D7%98%D7%95%D7%97_%D7%9C%D7%90%D7%95%D7%9E%D7%99_%D7%9C%D7%A2%D7%95%D7%91%D7%93_%D7%A9%D7%9B%D7%99%D7%A8
        final double MAX_FOR_SOCIAL_SECURITY = 49_030;
        final double AVG_60 = AVERAGE_SALARY_FOR_SOCIAL_SECURITY * 0.60;


        if (gross <= 0) {
            return 0;
        }

        if (under18) {
            return 0;
        }

        double tax = 0;

        // הכנסה המירבית לחודש החייבת בדמי ביטוח
        gross = Math.min(gross, MAX_FOR_SOCIAL_SECURITY);

        // under 60% from the average salary
        double sml = Math.min(gross, AVG_60);
        tax += sml * (0.4 / 100.0);

        // above 60% from the average salary and below max
        double big = gross - AVG_60;
        big = Math.max(0, big);
        tax += big * (7.0 / 100.0);

        return tax;
    }

    public static double calculateHealthTax(double gross, boolean under18) {
        // https://www.kolzchut.org.il/he/%D7%93%D7%9E%D7%99_%D7%91%D7%99%D7%98%D7%95%D7%97_%D7%9C%D7%90%D7%95%D7%9E%D7%99_%D7%9C%D7%A2%D7%95%D7%91%D7%93_%D7%A9%D7%9B%D7%99%D7%A8
        final double MAX_FOR_SOCIAL_SECURITY = 49_030;
        final double AVG_60 = AVERAGE_SALARY_FOR_SOCIAL_SECURITY * 0.60;


        if (gross <= 0) {
            return 0;
        }

        if (under18) {
            return 0;
        }

        double tax = 0;

        // הכנסה המירבית לחודש החייבת בדמי ביטוח
        gross = Math.min(gross, MAX_FOR_SOCIAL_SECURITY);

        // under 60% from the average salary
        double sml = Math.min(gross, AVG_60);
        tax += sml * (3.1 / 100.0);

        // above 60% from the average salary and below max
        double big = gross - AVG_60;
        big = Math.max(0, big);
        tax += big * (5.0 / 100.0);

        return tax;
    }

    public static double calculateIncomeTax(double gross) {
        double[] steps = new double[]{0, 7_010, 10_060, 16_150, 22_440, 46_690};
        double[] prcnt = new double[]{10, 14, 20, 31, 35, 47};
        double tax = 0.0;

        for (int i = steps.length - 1; i >= 0; i--) {
            if (gross > steps[i]) {
                double part = gross - steps[i];
                double newTax = part * prcnt[i] / 100.0;
                tax += newTax;
                gross -= part;
            }
        }

        return tax;
    }

    public static double calculateFund(double gross) {

        return 0;
    }

    public static double calculatePension(double gross) {

        return 0;
    }



}
