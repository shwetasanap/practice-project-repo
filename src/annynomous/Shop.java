package annynomous;

import java.util.*;

import annunomous.shop.Door;

public class Shop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s);

		Door door = new Door();
		if(door.getLock().isUnlocked("h")){
			System.out.println("Welcome, we are open");
		}else{
			System.out.println("We are closed now, please visit later");
		}

	}

}