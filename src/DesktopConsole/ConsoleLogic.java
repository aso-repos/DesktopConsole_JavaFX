package DesktopConsole;
import java.time.LocalDateTime;

public class ConsoleLogic {

    public String getCurrentDay () {
        String day = LocalDateTime.now().getDayOfWeek().toString();
        return day.substring(0,1).toUpperCase() + day.substring(1).toLowerCase();
    }

    public String getCurrentDate () {

        LocalDateTime getDate = LocalDateTime.now();

        Integer currentDay = getDate.getDayOfMonth();
        String month = getDate.getMonth().toString();
        Integer currentYear = getDate.getYear();

        return currentDay + " " + month.substring(0,1).toUpperCase() + month.substring(1,3).toLowerCase() + " " + currentYear;
    }

    public String getCurrentTime () {

        LocalDateTime getTime = LocalDateTime.now();

        Integer currentHour = getTime.getHour();
        String hour = currentHour.toString();
        if (currentHour < 10) {
            hour = "0" + hour;
        }
        Integer currentMinute = getTime.getMinute();
        String minute = currentMinute.toString();
        if (currentMinute < 10) {
            minute = "0" + minute;
        }

        return hour + ":" + minute;
    }

    public String getWeatherIconName (String condition) {

        condition = condition.toLowerCase();
        if (condition.equals("clear")) {
            return "Clear-Day";
        } else if (condition.equals("mist")) {
            return "Mist-Fog";
        } else if (condition.equals("snow")) {
            return "Snow";
        } else if (condition.equals("light rain")) {
            return "Light-Rain";}

        return "No-Weather";
    }
}
