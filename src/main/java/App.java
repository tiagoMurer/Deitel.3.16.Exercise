        /*3.16 (Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see
    that your heart rate stays within a safe range suggested by your trainers and doctors. According to the
    American Heart Association (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736),
    the formula for calculating your maximum heart rate in beats per minute is 220 minus your age in
    years. Your target heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas
    are estimates provided by the AHA. Maximum and target heart rates may vary based on the
    health, fitness and gender of the individual. Always consult a physician or qualified health care professional
    before beginning or modifying an exercise program.] Create a class called HeartRates. The
    class attributes should include the person’s first name, last name and date of birth (consisting of separate
    attributes for the month, day and year of birth). Your class should have a constructor that receives
    this data as parameters. For each attribute provide set and get methods. The class also should
    include a method that calculates and returns the person’s age (in years), a method that calculates and
    returns the person’s maximum heart rate and a method that calculates and returns the person’s target
    heart rate. Write a Java application that prompts for the person’s information, instantiates an object
    of class HeartRates and prints the information from that object—including the person’s first name,
    last name and date of birth—then calculates and prints the person’s age in (years), maximum heart
    rate and target-heart-rate range.*/

        import java.util.Scanner;
        public class App {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String fName =  scan.nextLine();
        System.out.println("Enter your lastt name:");
        String lName =  scan.nextLine();
        System.out.println("Enter the month of your birth as a valid integer (ex: 9):");
        int bMonth =  scan.nextInt();
        System.out.println("Enter the day of your birth as a valid integer (ex: 28):");
        int bDay =  scan.nextInt();
        System.out.println("Enter the year of your birth as a valid integer (ex: 1997):");
        int bYear =  scan.nextInt();


        HeartRates hr = new HeartRates(fName, lName, bMonth, bDay, bYear);

        String strOutput = "Name: " + fName + " " + lName + "\n" +
                            "Age: " + hr.getAge() + "\n" +
                            "Max heart rate: " + hr.getMaxHR() + "\n" +
                            "Ideal heart rate range: From " + hr.getIdealRange()[0] + " to " +  hr.getIdealRange()[1];

        System.out.println(strOutput);


    }
}
