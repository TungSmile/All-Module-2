package dayMonthYear;

public class calcul {
    int day;
    int month;
    int year;


    calcul(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
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

    public void checkDayInMonth() {
        while(this.day>checkMonthInYear()){
            this.day-=checkMonthInYear();
            this.month++;
        }
    }

    public int checkMonthInYear() {
        while (true) {
            switch (this.month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                     return  31;
                case 4:
                case 6:
                case 9:
                case 11:
                    return  30;

                case 2:
                    if (checkLeapYear(this.year)) {
                         return  29;
                    } else {return  28;}
                default:
                    this.year += this.month / 12;
                    this.month = this.month / 12;
            }
        }
    }

    public boolean checkLeapYear(int year) {
        if (year % 4 == 0) {
            return true;
        } else return year % 100 == 0 && year % 400 == 0;
    }

}
