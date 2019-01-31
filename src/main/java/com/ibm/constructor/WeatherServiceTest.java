package com.ibm.constructor;


import java.util.GregorianCalendar;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 */
public class WeatherServiceTest  {

  public static void main(String[] s)
  {
	  try
	  {
		  
	  
    ApplicationContext ctx = new ClassPathXmlApplicationContext(
        "applicationContext.xml");
    WeatherService ws = (WeatherService) ctx.getBean("weatherService");

    Double high = ws.getHistoricalHigh(new GregorianCalendar(2004, 0, 1).getTime());
    //  ... do more validation of returned value here, this test is not realistic
    System.out.println("High was: " + high);
  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
}
}
