package DesktopConsole;

public class WeatherData {

    private double currentTemp;
    private double minTemp;
    private double maxTemp;
    private String currentCondition;

    public WeatherData(double currentTemp, double minTemp, double maxTemp, String currentCondition) {
        this.currentTemp = currentTemp;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
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

}
