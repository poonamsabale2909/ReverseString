package jdc04;

public class Concatination {

	public static void main(String[] args) {
	
		String str="POONAM";
		String rev="";
		
		int length = str.length();
		
		for(int i=length-1;i>=0;i--) {
		
			rev=rev+str.charAt(i);
			
		}
				
		System.out.println("Reverse String is:"+rev);
		
	}

}
