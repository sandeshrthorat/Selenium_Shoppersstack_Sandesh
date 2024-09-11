package com.ShoppersStack_GenericUtility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Java_Utility {
   
	public void generateRandomNumber() 
	{
		Random random = new Random();
		random.nextInt(1000);
	}
	
	public String localDtae()
	{
		String date = LocalDate.now().toString().replace("-","");
		return date;
	}
	
	public String localDateTime()
	{
		String localTime = LocalDateTime.now().toString().replace("-","").replace(":","").replace(".","");
		return localTime;
	}
	
	
}
