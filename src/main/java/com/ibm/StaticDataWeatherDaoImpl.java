package com.ibm;

import java.util.Date;

/**
 * Implementation of WeatherDao
 */
public class StaticDataWeatherDaoImpl implements WeatherDao {

  public WeatherData find(Date date) {

    WeatherData wd = new WeatherData();
    wd.setDate((Date) date.clone());
    // some bogus values
    wd.setLow(date.getMonth() + 5);
    wd.setHigh(date.getMonth() + 20);
    return wd;
  }

  public WeatherData save(Date date) {
    throw new UnsupportedOperationException("This class uses static data only");
  }

  
  public WeatherData update(Date date) {
    throw new UnsupportedOperationException("This class uses static data only");
  }
}
