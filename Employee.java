package prob1;

public class Employee extends Object
{
    /*
    hours[0] - hours worked on Monday
    hours[1] - hours worked on Tuesday
    hours[2] - hours worked on Wednesday
    hours[3] - hours worked on Thursday
    hours[4] - hours worked on Friday
    hours[5] - hours worked on Saturday
    hours[6] - hours worked on Sunday
    */

    private double[] hours = new double[7];
    private String Name;
    private double payRate;

    Employee(String Name, double payRate) {
        this.Name = Name;
        this.payRate = payRate;
    }

    double getHours(int day) {
        return hours[day];
        
    }

    String getName() {
        return Name;
        
    }

    int getNumDaysWorked() {
        int numDaysWorked = 0;

        for(int i = 0; i < hours.length; i++) {
            if(hours[i] > 0)
                numDaysWorked++;
        }
        return numDaysWorked;
        
    }

    double getPay() {
        boolean workedEveryDay = true;
        double totalWeekHoursWorked = 0.0;
        double totalPay = 0.0;

        //Calculate week pay
        //See how many hours worked during week
        for(int i = 0; i < 5; i++) {
            if(getHours(i) > 0) totalWeekHoursWorked += getHours(i);
            else workedEveryDay = false;
        }

        if(totalWeekHoursWorked <= 40.0) totalPay = totalWeekHoursWorked * payRate;
        else {
            totalPay = 40.0 * payRate;
            double overTimePay = (totalWeekHoursWorked - 40.0) * (payRate + (payRate / 2.0));
            totalPay += overTimePay;
        }

        double totalWeekendHoursWorked = 0.0;

        //Calculate weekend pay
        //See how many hours worked during weekend
        for(int i = 5; i < 7; i++) {
            if(getHours(i) > 0) totalWeekendHoursWorked += getHours(i);
            else workedEveryDay = false;
        }

        totalPay += totalWeekendHoursWorked * (payRate * 2.0);
        if(workedEveryDay) totalPay += 50.0;
        return totalPay;
    }

    double getPayRate() {
        return payRate;
    }

    double getTotalHours() {
        double totalHours = 0.0;
        for(int i = 0; i < hours.length; i++)
        {
            totalHours += getHours(i);
        }
        return totalHours;
    }

    double getWeekdayHours() {
        double totalWeekdayHours = 0.0;
        for(int i = 0; i < 5; i++)
        {
            totalWeekdayHours += getHours(i);
        }
        return totalWeekdayHours;
    }

    double getWeekendHours() {
        double totalWeekendHours = 0.0;
        for(int i = 5; i < 7; i++)
        {
            totalWeekendHours += getHours(i);
        }
        return totalWeekendHours;
    }

    void mergeEmployee(Employee e) {
        for(int i = 0; i < hours.length; i++)
        {
            hours[i] += e.getHours(i);
        }
    }

    void newWeek()
    {
        for(int i = 0; i < hours.length; i++)
        {
            hours[i] = 0;
        }
    }

    void setHours(int day, double hours)
    {
        this.hours[day] = hours;
    }

    public String toString() {
        String stringToReturn;

        stringToReturn = "Pay Stub" + "\n"
        + "--------" + "\n"
        + "Name: " + Name + ", Pay Rate: " + payRate + "\n"
        + "Hours:Mon:" + hours[0] + " Tues:" + hours[1] + "Wed:" + hours[2] + "Thurs:" + hours[3] + "Fri:" + hours[4] + "Sat:" + hours[5] + "SUn:" + hours[6] + "\n"
        + "Days worked:" + getNumDaysWorked() + " Total Hours:" + getTotalHours() + "\n"
        + "Weekday Hours:" + getWeekdayHours() + ", Weekend Hours:" + getWeekendHours() + "\n"
        + "Total Pay:" + getPay();

        return stringToReturn;
    }
}

