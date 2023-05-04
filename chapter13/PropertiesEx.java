package chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;



public class PropertiesEx {

	public static void main(String[] args) {
		
		try {
			Properties pr = new Properties();
// Step1] config.properties 파일을 chapter13 패키지가 있는 폴더로 카피한다.
// Step2] 탐색기에서 해당 파일이 있는 폴더로 이동하여 폴더 전체 주소를 복사하여 아래와 같이 붙여넣는다.
//			D:\HKLEE\Instructor_Project\WebProject\2_BackEnd\1_Java\chapter13
// Step3] 폴더 구분자를 '\' 에서 '/'로 변경한다.
//			D:/HKLEE/Instructor_Project/WebProject/2_BackEnd/1_Java/chapter13
			// properties 파일 읽어오기
			FileInputStream reader = new FileInputStream(
					"D:/HKLEE/Instructor_Project/WebProject/2_BackEnd/1_Java/chapter13"
					+ "/config.properties");
			// Properties 객체에 로드
			pr.load(reader);
			System.out.println(pr);
			System.out.println(" 이름 :" + pr.get("name"));
			
			// property에 키,값으로 추가
			pr.put("subject", " 자바");
			System.out.println(pr);
			
			// properties 파일로 출력
			pr.store(new FileOutputStream(
					"C:/java/workspace/test/src/chapter13/"
					+ "test.properties"), "#save");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
