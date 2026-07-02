package DesktopConsole;
import java.time.LocalDateTime;

public class ConsoleLogic {

    WeatherService weatherService = new WeatherService();
    WeatherData weatherData = weatherService.getWeatherData();

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

    // Get the weather right icon from WeatherAPI

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

    public String getCurrentWeatherIcon (int conditionCode) {

        return getWeatherIconName(conditionCode);
    }

    public String getWeatherIconName (int conditionCode) {

        if (conditionCode == 1000) {
            return "Clear-Day";
        } else if (conditionCode == 1030 || conditionCode == 1135 || conditionCode == 1147) {
            return "Mist-Fog";
        } else if (conditionCode == 1210 || conditionCode == 1213 || conditionCode == 1216
                || conditionCode == 1219 || conditionCode == 1222 || conditionCode == 1225
                || conditionCode == 1255 || conditionCode == 1258
                || conditionCode == 1279 || conditionCode == 1282
                || conditionCode == 1114 || conditionCode == 1117) {
            return "Snow";
        } else if (conditionCode == 1063 || conditionCode == 1150 || conditionCode == 1153
                || conditionCode == 1180 || conditionCode == 1183 || conditionCode == 1186
                || conditionCode == 1189 || conditionCode == 1192 || conditionCode == 1195
                || conditionCode == 1240 || conditionCode == 1243 || conditionCode == 1246
                || conditionCode == 1273 || conditionCode == 1276) {
            return "Light-Rain";
        }

        return "No-Weather";
    }

}
