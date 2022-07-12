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
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given

        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);


        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
@DisplayName("Test Median")
    @Test
        public void testMedian() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

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
    Map<String, Double> temperaturesMap = new HashMap<>();
    temperaturesMap.put("Rzeszow", 25.5);
    temperaturesMap.put("Krakow", 26.2);
    temperaturesMap.put("Wroclaw", 24.8);
    temperaturesMap.put("Warszawa", 25.2);
    temperaturesMap.put("Gdansk", 26.1);

    WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

    Double expected = 25.56;
    //When
    Double average = weatherForecast.getAverage(temperaturesMap);
    System.out.println(average);
    //Then
    Assertions.assertEquals(expected,average);
}

    }

