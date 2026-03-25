package Day70;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		List<Product> list = new ArrayList<>();
		
		for(int i = 0;i<n;i++) {
			list.add(new Product(reader.nextInt(), reader.nextInt()));
		}
		
		list.sort((p1,p2)->{
			if(p1.price!=p2.price) {
				return Integer.compare(p2.price, p1.price);
			}else {
				return Integer.compare(p2.quality, p1.quality);
			}
		});
		
		for(int i = 0;i<n-1;i++) {
			if(list.get(i).quality<list.get(i+1).quality) {
				System.out.println("Happy Alex");
				return;
			}
		}
		System.out.println("Poor Alex");
		reader.close();
	}

	private static class Product {
		int price;
		int quality;

		private Product(int price, int quality) {
			this.price = price;
			this.quality = quality;
		}
	}

}
