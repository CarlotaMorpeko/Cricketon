/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cricket.entities;

import java.util.Date;
import mx.itson.cricket.enums.WeatherStatus;

/**
 *
 * @author Technologyland
 */
public class Forecast {
    
    private Date day;
    private WeatherStatus status;
    //@SerializedName("max_temperature")
    private int maxTemperature;
    private int minTemperature;
    
}
