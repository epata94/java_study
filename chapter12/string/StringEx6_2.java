package chapter12.string;

public class StringEx6_2 {

	public static void main(String[] args) {
		String[] strArr = {null, "", " "};

		for(String str: strArr){

			if(str == null) System.out.println("null입니다.");
		    
		    else if(str == "" || str.isEmpty()) System.out.println("길이가 "+str.length()+"입니다.");
		    
		    else if(str == " " || str.trim().isEmpty()) System.out.println("공백"+str.length()+"칸입니다.");
		}
	}

}
