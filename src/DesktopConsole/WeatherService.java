package DesktopConsole;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WeatherService {

    private HttpClient client = HttpClient.newHttpClient();

    public WeatherData getWeatherData () {

        String url = "https://api.weatherapi.com/v1/forecast.json?key=ee40faa248524028917203933262804&q=Cape%20Town&days=1&aqi=no&alerts=no";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode root = objectMapper.readTree(response.body());
            JsonNode currentTempNode = root.path("current").path("temp_c");
            double currentTemp = currentTempNode.asDouble();
            JsonNode conditionTextNode = root.path("current").path("condition").path("text");
            String currentCondition = conditionTextNode.asText();
            System.out.println(currentCondition);
            JsonNode conditionCodeNode = root.path("current").path("condition").path("code");
            int currentConditionCode = conditionCodeNode.asInt();
            JsonNode minTempNode = root.path("forecast").path("forecastday").path(0).path("day").path("mintemp_c");
            double minTemp = minTempNode.asDouble();
            JsonNode maxTempNode = root.path("forecast").path("forecastday").path(0).path("day").path("maxtemp_c");
            double maxTemp = maxTempNode.asDouble();
            return new WeatherData(currentTemp, minTemp, maxTemp, currentCondition, currentConditionCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
