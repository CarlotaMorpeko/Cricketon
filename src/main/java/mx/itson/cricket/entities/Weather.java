/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cricket.entities;

import java.util.List;
import mx.itson.cricket.enums.WeatherStatus;

/**
 *
 * @author Technologyland
 */
public class Weather {
    
    private String city;
    private int temperature;
    private int humidity;
    private WeatherStatus status;
    //@SerializedName("wind_speed")
    private int windSpeed;
    private List<Forecast>forecast;
            
}
