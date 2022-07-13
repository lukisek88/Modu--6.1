package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    @Mock
    private Temperatures temperaturesMock;
    private WeatherForecast weatherForecast;
   private Map<String,Double> temperaturesMap;

    @BeforeEach
    public  void  beforeEveryTest(){

        this.temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);

        this.weatherForecast = new WeatherForecast(temperaturesMock);
    }


    @Test
    void testCalculateForecastWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
@DisplayName("Test Median")
    @Test
        public void testMedian() {

//Given

        Double expected = 25.5;
        //When
        Double median = weatherForecast.getMediana(temperaturesMap);
        System.out.println(median);
        //Then
        Assertions.assertEquals(expected,median);

        }
        @DisplayName("Test Average")
@Test
    public void testAverage(){
        //Given

            Double expected = 25.56;
    //When
    Double average = weatherForecast.getAverage(temperaturesMap);
    System.out.println(average);
    //Then
    Assertions.assertEquals(expected,average);
}

    }

