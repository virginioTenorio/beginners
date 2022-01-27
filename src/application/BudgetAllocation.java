package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.ValueExp;

public class BudgetAllocation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanto você pode gastar? ");
		
		double total = sc.nextDouble();
		double sum =0;
		int i = 0;
		List<Double>proportion =new ArrayList<Double>();
		System.out.println("Digite sua proporção de várias despesas. ");
		System.out.println("O sistema para se a proporção acumulada exceder 100%");
		do {
			System.out.println("Sua proporção de despesas " + (i + 1)+ ":");
			double value = sc.nextDouble();
			proportion.add(value);
			sum += proportion.get(i);
			i++;
		} while (sum <= 100);
		
		if (sum > 100) {
			double cumulationSum =0.0;
			for (int j =0;j < proportion.size() - 1; j++) {
				cumulationSum += proportion.get(j);
			}
			proportion.set(proportion.size() - 1, 100.0 - cumulationSum);
		}
		for (double value : proportion) {
			double expense = value * total / 100;
			System.out.println("Você "+ value + "% é igual a $ "+ expense);
		}
				
		
		
		
	}

}
