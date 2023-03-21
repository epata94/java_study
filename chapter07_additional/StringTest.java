package chapter07_additional;

public class StringTest {

	public static boolean myEquals(char[] originText, char[] compareTarget) {
		boolean compareResult = true;


        if (originText.length != compareTarget.length) {
            compareResult = false;
        } else {

            for (int i = 0; i < compareTarget.length; ++i) {
                if( originText[i] != compareTarget[i])
                	compareResult = false;
            }
       }

       return compareResult;
    }
	
	public static void main(String[] args) {
		// Non-Class 타입으로 데이터 처리
		char[] cName = 	{'J','a','m','e','s'};
		char[] cName2 = {'J','a','n','e'};
		//char[] name2 = "James" // 에러 발생

		
		char[][] cNameList = {
				{'J','a','m','e','s'},
				{'J','a','n','e'}
		};
		
		String sName = "James";
		String[] sNameList = {"James","Jane"};

		
//		char[] cName3 = 	{'J','a','m','e','s'};
		// Non-Class 타입으로 데이터 처리
		if( myEquals(cName, cName2) )
			System.out.println("Equal!");
		else
			System.out.println("Not Equal!");
		
		if (sName.equals("James"
				+ ""))
//		if (sName.equals("Jane"))
			System.out.println("Equal!");
		else
			System.out.println("Not Equal!");
	
		

	}

}
