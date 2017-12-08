package practice;

public class SortingWithoutAPI {
	public static void main(String[] args){
	/*	List<String> name=new ArrayList<>();
		name.add("pooja");
		name.add("ddaf");*/
		String[] name={"pooja","deepi","soun","gk"};
		int i=0;
		if(name[i].length()==name[i+1].length()){
			
			System.out.println("dzfsdfname"+name[i]);
			i++;
			if(name[i].charAt(i)<name[i+1].charAt(i+1)){
				System.out.println("rrrrname"+name[i]);
			
		}
			System.out.println("ssssname     "+name[i].toString());
		}else if(name[i].length()<name[i+1].length()){
			i++;
			if(name[i].charAt(i)>name[i+1].charAt(i+1)){
				System.out.println("rrrrname"+name[i]);
			
		}
		}
		

	}
}