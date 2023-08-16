package calculator_next_day;

public class NextDayCalculator {
    private int day;
    private int month;
    private int year;

    public NextDayCalculator(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public NextDayCalculator() {
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String nextDay() {
        if (getMonth() == 2) {
            if (isLeapYear()) {
                if (getDay() < 29) {
                    this.day += 1;
                } else {
                    this.month += 1;
                    setDay(1);
                }
            } else {
                if (getDay() < 28) {
                    setDay(1);
                } else {
                    this.month += 1;
                    setDay(1);
                }
            }
        } else if (getMonth() == 1 || getMonth() == 3 || getMonth() == 5 || getMonth() == 7 || getMonth() == 8 || getMonth() == 10 || getMonth() == 12) {
            if (getDay() < 31) {
                this.day += 1;
            } else {
                if (getMonth() == 12) {
                    setMonth(1);
                    this.year += 1;
                } else {
                    this.month += 1;
                }
                setDay(1);
            }
        } else {
            if (getDay() < 30) {
                this.day += 1;
            } else {
                this.month += 1;
                setDay(1);
            }
        }
        return getDay() + " " + getMonth() + " " + getYear();
    }


    public boolean isLeapYear(){
        boolean isDivisibleBy4 = getYear() % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = getYear() % 100 == 0;
            if (isDivisibleBy100){
                boolean isDivisibleBy400 = getYear() % 400 == 0;
                if(isDivisibleBy400) return
                        true;
            } else {
                return true;
            }
        }
        return false;
    }
}
