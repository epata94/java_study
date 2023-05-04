package chapter14;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class StudentManagement3 {
    // ArrayList이기 때문에 MAX SIZE를 지정할 필요가 없다.
    private static HashMap<String, Student> studentMap = new HashMap<>();

    public static void main(String[] args) {
        initializeStudents();
        showMenu();
    }

    // 5명의 임의의 학생 데이터 생성
    private static void initializeStudents() {
        int idNum = 1;
        String[] names = {"홍길동", "김철수", "이영희", "박종수", "최지수"};
        int[] koreanScores = {80, 90, 70, 85, 95};
        int[] englishScores = {85, 85, 75, 95, 90};
        int[] mathScores = {90, 70, 80, 95, 85};
        DecimalFormat df = new DecimalFormat("ID000");
        for (int i = 0; i < names.length; i++) {
            String id = df.format(idNum++);
// 값을 입력할 때 인덱스(위치정보)가 필요없다.
            studentMap.put(id,new Student(id, names[i],koreanScores[i],englishScores[i],mathScores[i]));
        }
    }

    // 메뉴 출력 및 기능 실행
    private static void showMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n============ 메뉴 =============");
            System.out.println("1. 전체 학생 정보");
            System.out.println("2. 최고 평균점수 학생 검색");
            System.out.println("3. 최저 평균점수 학생 검색");
            System.out.println("4. 학생 검색");
            System.out.println("5. 학생 추가");
            System.out.println("6. 종료");
            System.out.println("==============================");
            System.out.print("원하는 메뉴를 선택하세요: ");

            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    printAllStudents();
                    break;
                case 2:
                    searchHighestAverageStudent();
                    break;
                case 3:
                    searchLowestAverageStudent();
                    break;
                case 4:
                    searchStudent();
                    break;
                case 5:
                    addStudent();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("잘못된 메뉴를 선택하였습니다. 다시 선택해주세요.");
            }
        }
    }

    // 1. 전체 학생 정보 출력
    private static void printAllStudents() {
//        ArrayList의 요소가 없는 조건을 아래 메소드로 알수 있다.
        if (studentMap.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

        System.out.println("\n=======================================");
        System.out.println("이름\t\tID\t\t국어\t영어\t수학\t평균");
        System.out.println("=======================================");

        // ArrayList에 값을 등록시 Object로 등록되기 때문에
        // 다시 값을 가져올 때는 Object로 받아서 형변환을 해줘야 한다.
        // 추후 제네릭으로 이 문제가 해결된다.
        for (Student student : studentMap.values()) {
            System.out.println(student);
        }

        System.out.println("=======================================");
    }

    // 2. 최고 평균점수 학생 검색
    private static void searchHighestAverageStudent() {
        double maxAvg = (studentMap.get(0)).getAverage();
        int maxIndex = 0;

        for (int i = 1; i < studentMap.size(); i++) {
            if ( studentMap.get(i).getAverage() > maxAvg ) {
                maxAvg = studentMap.get(i).getAverage();
                maxIndex = i;
            }
        }
        System.out.println("최고 평균점수 학생: " + studentMap.get(maxIndex).getName());
    }
    private static void searchLowestAverageStudent() {
        double minAvg = studentMap.get(0).getAverage();
        int minIndex = 0;

        for (int i = 1; i < studentMap.size(); i++) {
            if ( studentMap.get(i).getAverage() < minAvg ) {
                minAvg = studentMap.get(i).getAverage();
                minIndex = i;
            }
        }
        System.out.println("최저 평균점수 학생: " + studentMap.get(minIndex).getName());
    }

    // 4. 학생 검색
    private static void searchStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("검색할 학생 ID를 입력하세요: ");
        String name = scanner.nextLine();
        boolean found = false;

        if (!studentMap.containsKey(name)) {
            System.out.println("해당 학생이 존재하지 않습니다.");
            return;
        }

        System.out.println(studentMap.get(name));
    }

    // 5. 학생 추가
    private static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("추가할 학생 이름을 입력하세요: ");
        String name = scanner.nextLine();
        System.out.print("국어 점수를 입력하세요: ");
        int koreanScore = scanner.nextInt();
        System.out.print("영어 점수를 입력하세요: ");
        int englishScore = scanner.nextInt();
        System.out.print("수학 점수를 입력하세요: ");
        int mathScore = scanner.nextInt();
        scanner.nextLine();

//        Student newStudent = new Student(name, koreanScore, englishScore, mathScore);
//        studentMap.put(newStudent);
        System.out.println("학생이 추가되었습니다.");
    }
}