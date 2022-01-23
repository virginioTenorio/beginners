package application;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InvestmentEarmings {
           public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Insira seu pre�o de compra por a��o");
			double buyingPrice = sc.nextDouble();
			int day =1;
			double closingPrice = 0.1;
			DecimalFormat df = new DecimalFormat("0.00");
			while (true) {
				System.out.println("Insira o pre�o de fechamento do dia " 
			          + day + " qualquer valor negativo para deixar");
				 closingPrice = sc.nextDouble();
				if (closingPrice <0.0) break;
				double earnings = closingPrice - buyingPrice;
				if (earnings > 0.0) {
					System.out.println("O dia seguinte " + day +
							", voc� ganhou R$ " +df.format(earnings)+ " de valor."  );
				}
				else if (earnings <0.0) {
					System.out.println("O dia seguinte " + day +
							", voc� perdeu R$ " +df.format(-earnings) + " de valor."  );
				}
				else {
					System.out.println("O dia seguinte  " + day +
							", voc� n�o tem lucro por a��o. "  );
				}
				day += 1;
			}
			sc.close();
		}
      }

