package application;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InvestmentEarmings {
           public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Insira seu preço de compra por ação");
			double buyingPrice = sc.nextDouble();
			int day =1;
			double closingPrice = 0.1;
			DecimalFormat df = new DecimalFormat("0.00");
			while (true) {
				System.out.println("Insira o preço de fechamento do dia " 
			          + day + " qualquer valor negativo para deixar");
				 closingPrice = sc.nextDouble();
				if (closingPrice <0.0) break;
				double earnings = closingPrice - buyingPrice;
				if (earnings > 0.0) {
					System.out.println("O dia seguinte " + day +
							", você ganhou R$ " +df.format(earnings)+ " de valor."  );
				}
				else if (earnings <0.0) {
					System.out.println("O dia seguinte " + day +
							", você perdeu R$ " +df.format(-earnings) + " de valor."  );
				}
				else {
					System.out.println("O dia seguinte  " + day +
							", você não tem lucro por ação. "  );
				}
				day += 1;
			}
			sc.close();
		}
      }

