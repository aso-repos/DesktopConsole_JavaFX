package DesktopConsole;

public class WeatherData {

    private double currentTemp;
    private double minTemp;
    private double maxTemp;
    private String currentCondition;
    private int currentConditionCode;
    private int currentIsDay;

    public WeatherData(double currentTemp, double minTemp, double maxTemp, String currentCondition, int currentConditionCode, int currentIsDay) {
        this.currentTemp = currentTemp;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.currentCondition = currentCondition;
        this.currentConditionCode = currentConditionCode;
        this.currentIsDay = currentIsDay;
    }

    public double getCurrentTemp() {
        return currentTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public String getCurrentCondition() {
        return currentCondition;
    }

    public int getCurrentConditionCode() {
        return currentConditionCode;
    }

    public int getCurrentIsDay() {
        return currentIsDay;
    }

}
