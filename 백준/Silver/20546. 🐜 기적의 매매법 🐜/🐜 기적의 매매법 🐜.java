import java.io.*;
import java.util.*;

class Bnp {
    
	int cash;
	int stock;
	
	Bnp(int cash) {
		this.cash = cash;
		this.stock = 0;
	}
	
	void buyAll(int todayPrice) {
		stock += cash / todayPrice;
		cash %= todayPrice;
	}
	
	long getTotal(int lastPrice) {
		return (long)cash + (long)stock * lastPrice;
	}
    
}

class Timing {
    
	int cash;
	int stock;
	int prePrice = 0;
	int upCount = 0;
	int downCount = 0;
	
	Timing(int cash) {
		this.cash = cash;
		this.stock = 0;
	}
	
	void trade(int todayPrice) {
		if (prePrice == 0) {
			prePrice = todayPrice;
			return;
		}
		
		if (todayPrice > prePrice) {
			upCount++;
			downCount = 0;
		} else if (todayPrice < prePrice) {
			downCount++;
			upCount = 0;
		} else {
			upCount = 0;
			downCount = 0;
		}
		
		if (upCount == 3) {
			cash += stock * todayPrice;
			stock = 0;
		}
		
		if (downCount == 3) {
			stock += cash / todayPrice;
			cash %= todayPrice;
		}
		
		prePrice = todayPrice;
	}
	
	long getTotal(int lastPrice) {
		return (long)cash + (long)stock * lastPrice; 
	}	
    
}

public class Main {
	
	private static int[] price = new int[14];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cash = Integer.parseInt(br.readLine());

		Bnp jh = new Bnp(cash);
		Timing sm = new Timing(cash);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 14; i++) {
			price[i] = Integer.parseInt(st.nextToken());
			jh.buyAll(price[i]);
			sm.trade(price[i]);
		}
		
		int lastPrice = price[13];
		
		if (jh.getTotal(lastPrice) == sm.getTotal(lastPrice)) {
			System.out.println("SAMESAME");
		} else if (jh.getTotal(lastPrice) > sm.getTotal(lastPrice)) {
			System.out.println("BNP");
		} else {
			System.out.println("TIMING");
		}

		br.close();
	}
	
}