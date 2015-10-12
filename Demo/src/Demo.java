import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



class Parent{
	public  void m(){
		System.out.println("hai");
	}
}
class Child extends Parent{
	public  void m(){
		System.out.println("childhai");
	}
	
}

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ArrayList al =new ArrayList();
		al.add("java");
		al.add("oracle");
		al.add("c");
		al.add("c++");
		al.add("a");
		al.add("z");
		//Collections.sort(al);
		System.out.println("sorted list in Ascending :  " + al);
		Collections.sort(al,Collections.reverseOrder());
		//Collections.reverse(al);
		System.out.println(al);*/
		HashMap<String,String> hm= new HashMap<String,String>();
		hm.put("pune","maharastra");
		hm.put("bza","Andhra");
		hm.put("hyd","telengana");
		System.out.println("before deleting....."+hm);
		Iterator itr=hm.keySet().iterator();
		
		while(itr.hasNext()){
			String key = (String)itr.next(); 
			if(key.equals("hyd"))
				itr.remove();
		}
		
		for(Map.Entry entry : hm.entrySet())
			if(entry.getKey().equals("pune"))
				hm.remove(entry.getKey());
		
		System.out.println("after deleting....."+hm);
		
		swap();
		
	}

	
	public static boolean istPalindrom(char[] word){
	    int i1 = 0;
	    int i2 = word.length - 1;
	    while (i2 > i1) {
	        if (word[i1] != word[i2]) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    return true;
	}
	

	public  static void swap(){
		 int a=3,b=4;
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("a=  "+a+"  b=   "+b);
		 
	}
}
