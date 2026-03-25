package Day36;

import java.util.Scanner;

public class Demo18 {

	public static String[] tiangan = { "geng", "xin", "ren", "gui", "jia", 
			"yi", "bing", "ding", "wu", "ji" };
	public static String[] dizhi = {"shen","you","xu","hai","zi","chou","yin","mao","chen","si","wu","wei"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(tiangan.length);
//		System.out.println(dizhi.length);
		Scanner reader = new Scanner(System.in);
		int year = reader.nextInt();
		int x = year%10;
		int y = year%12;
		System.out.println(tiangan[x]+dizhi[y]);
	}

}
