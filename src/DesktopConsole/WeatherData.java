package DesktopConsole;

public class WeatherData {

    private double currentTemp;
    private double minTemp;
    private double maxTemp;
    private String currentCondition;
    private int currentConditionCode;

    public WeatherData(double currentTemp, double minTemp, double maxTemp, String currentCondition, int currentConditionCode) {
        this.currentTemp = currentTemp;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.currentCondition = currentCondition;
        this.currentCondition = currentCondition;
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

}
