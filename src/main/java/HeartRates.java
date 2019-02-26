import java.util.Calendar;

public class HeartRates {

    private String firstName;
    private String lastName;
    private int bMonth;
    private int bDay;
    private int bYear;

    HeartRates(String name, String lastName, int month, int day, int year){
        this.firstName = name;
        this.lastName = lastName;
        this.bMonth = month;
        this.bDay = day;
        this.bYear = year;


    }

    public int getAge(){
        int currentBirthday = 0;
        if(Calendar.getInstance().get(Calendar.MONTH) < this.bMonth
            || Calendar.getInstance().get(Calendar.MONTH) == this.bMonth
            && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == this.bDay)
            {
            currentBirthday = 1;
        }

        return Calendar.getInstance().get(Calendar.YEAR) - this.bYear - currentBirthday;
    }

    public int getMaxHR(){
        return 220 - this.getAge();
    }

    public double[] getIdealRange(){
        double[] hrRange= {this.getMaxHR() * .5, this.getMaxHR() * .85};
        return hrRange;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMonth() {
        return bMonth;
    }

    public void setMonth(int month) {
        this.bMonth = month;
    }

    public int getDay() {
        return bDay;
    }

    public void setDay(int day) {
        this.bDay = day;
    }

    public int getYear() {
        return bYear;
    }

    public void setYear(int year) {
        this.bYear = year;
    }


}
