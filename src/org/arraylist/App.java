package org.arraylist;
import java.util.*;
public class App {
	
		static ArrayList<String>listNames=new ArrayList<>();
		public static void main(String args[])
		{
			listNames.add("Chaand");
			listNames.add("John");
			listNames.add("Steve");
			listNames.add("Pooja");
			listNames.add("Salim");
			listNames.add("Rahul");
			listNames.add("Mia");
			listNames.add("Angel");
			System.out.println(listNames);
			App app = new App();
			app.displayList(listNames);
		   /*	app.removeNameByPosition(0);
			System.out.println("************");
			app.displayList(listNames);
			System.out.println("************");
			System.out.println(listNames.get(0));
			System.out.println(listNames.get(1)); 
			
			System.out.println("************");
			app.removeNameByString("Pooja");
			app.displayList(listNames);
			System.out.println("************");
			System.out.println(listNames.get(3));
			//app.update("shweta", 2);
			app.displayList(listNames);*/
			int pos=app.search("Chaand");

			app.update( "shweta sanjay sanap",pos);
			app.displayList(listNames);

		}
		
		
		void displayList(ArrayList<String> names){
			for(String name: names){
				System.out.println(name);
			}
			
		}
		void removeNameByPosition(int position){
		   listNames.remove(position);
		}
		void removeNameByString(String name){
			listNames.remove(name);
		}
		void update(String name,int pos){
			//int pos=search(name);
			listNames.set(pos, name);
		}
		int search(String s)
		{
			return listNames.indexOf(s);
		}
}
