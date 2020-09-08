package Principal;

import java.util.Scanner;

public class Date {
	private int day; // from 1 to 31
	private int month; // from 1 to 12
	private int year; // from 2000 upwards
	public void advance() {
		int diaAvanco;
		System.out.println("Qual o dia de hoje?");
		Scanner entrada = new Scanner(System.in);
		day = entrada.nextInt();
		setDay(day);
		entrada.close();
		
		
		diaAvanco = day+1;
		System.out.println("O dia atual é: "+ day );
		System.out.println("O dia avançado é: "+ diaAvanco);
		
	}
	//Getters and Setters
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public static void main (String []args) {
		Date obj = new Date();
		
		obj.advance();
	}
	


}
