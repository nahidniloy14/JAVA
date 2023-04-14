package Array;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// ArrayList<dataType>=new ArrayList<dataType>();
		ArrayList<String> name =new ArrayList<String>();
		name.add("Arif");
		name.add("Sakib");
		name.add("Raju");
		name.add("Parvez");
		System.out.println(name);//[Arif, Sakib, Raju, Parvez]
		System.out.println(name.get(0));//Arif
		System.out.println(name.size());//4
		
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i));
//			Arif
//			Sakib
//			Raju
//			Parvez

		}
		
		
		
		

	}

}
