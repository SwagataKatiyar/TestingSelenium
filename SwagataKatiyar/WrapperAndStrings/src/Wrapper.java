public class Wrapper {
	
	public static void main(String[] args) {
		int a=88;
		
		Integer i=new Integer(34);
		byte b=i.byteValue();
		
		System.out.println(b);
		String s=String.valueOf(a);
		
		
		Double d=Double.valueOf(a);
		System.out.println(d);
		
		Long num=Long.valueOf(a);
		System.out.println(num);
		
		float f=(float)a;
		System.out.println(f);
		
		System.out.println(s);
		char c='S';
		String s1=String.valueOf(c);
		System.out.println("Whats your name?:"+s1);
		String s2="I am Swagata Katiyar";
		System.out.println("First character"+s2.charAt(0));
		String str="29";
		try {
			int number=Integer.parseInt(str);
			System.out.println(number);
		}
		catch(NumberFormatException ex){
			ex.printStackTrace();
			
			
		}
		
		
		String str1[]= {"Swagata","Shreya","Riya"};
		StringBuilder sb=new StringBuilder();
		sb.append(str1[0]);
		sb.append(" "+str1[1]);
		sb.append(" "+str1[2]);
		System.out.println(sb.toString());
		Wrapper obj=new Wrapper();
		obj.Builder(str1);
		
	
	}
	
	public void Builder(String strs[]) {
		
		StringBuilder sb=new StringBuilder();
		sb.append(strs[0]);
		sb.append(" "+strs[1]);
		sb.append(" "+strs[2]);
		String singleString=sb.toString();
		System.out.println(singleString);
	}

}