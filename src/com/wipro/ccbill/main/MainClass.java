package com.wipro.ccbill.main;

import java.text.SimpleDateFormat;

import com.wipro.ccbill.entity.CreditCardBill;
import com.wipro.ccbill.entity.Transaction;

public class MainClass {
	public static void main(String a[])
	{
		try {
			Transaction monthTransactions[] = new Transaction[5];
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");
			monthTransactions[0] = new Transaction("1111222233334444",formatter.parse("01/02/2016"),"Household",8000.0,"DB");
			monthTransactions[1] = new Transaction("1111222233334444",formatter.parse("05/02/2016"),"Shopping",12000.0,"DB");
			monthTransactions[2] = new Transaction("1111222233334444",formatter.parse("12/02/2016"),"Stationary",2700.0,"DB");
			monthTransactions[3] = new Transaction("1111222233334444",formatter.parse("16/02/2016"),"groceries",19000.0,"CR");
			monthTransactions[4] = new Transaction("1111222233334444",formatter.parse("19/02/2016"),"Books",4500.0,"DB");
			CreditCardBill cd = new CreditCardBill("1111222233334444","ABC123",formatter.parse("02/03/2016"),monthTransactions);
			System.out.println("Total to Be paid:"+cd.calculateBillAmount());
			
		}
		catch(Exception e)
		{
		}
	}

}
