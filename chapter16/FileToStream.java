package chapter16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToStream {

	public static void main(String[] args) {
		
		try {
			// Paths.get() 메서드 사용
//			Path path = Paths.get("src/chapter19/StrToStream.java");
			// 현재경로에서 test.txt를 찾는다. 만약에 상대경로가 적용되지 않는다면
			// 아래와 같이 절대경로를 적용한다.
			Path path = Paths.get("D:\\HKLEE\\Instructor_Project\\WebProject\\2_BackEnd\\1_Java\\chapter16\\test.txt");
			Stream<String> stream = Files.lines(path, Charset.defaultCharset());
			stream.forEach( s -> System.out.println(s));
			stream.close();
			System.out.println();
			
			//BufferedReader의 lines() 메소드 사용
			File file = path.toFile();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			br.lines().forEach( s -> System.out.println(s));
			stream.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
