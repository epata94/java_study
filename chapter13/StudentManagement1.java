package chapter13;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentManagement1 {
    // 학생 추가 기능이 있기때문에 배열의 최대사이즈를 고려해야 ㅎ
    private static final int MAX_STUDENTS = 100;
    private static Student[] students = new Student[MAX_STUDENTS];
    private static int numStudents = 0;

    public static void main(String[] args) {
        initializeStudents();
        showMenu();
    }

    // 5명의 임의의 학생 데이터 생성
    private static void initializeStudents() {
        String[] names = {"홍길동", "김철수", "이영희", "박종수", "최지수"};
        int[] koreanScores = {80, 90, 70, 85, 95};
        int[] englishScores = {85, 85, 75, 95, 90};
        int[] mathScores = {90, 70, 80, 95, 85};

        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], koreanScores[i], englishScores[i], mathScores[i]);
            numStudents++;
        }
    }

    // 메뉴 출력 및 기능 실행
    private static void showMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n==============================");
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
                    // exit() 프로그램 종료. 인자가 0은 정상 종료를 의미
                    System.exit(0);
                default:
                    System.out.println("잘못된 메뉴를 선택하였습니다. 다시 선택해주세요.");
            }
        }
    }

    // 1. 전체 학생 정보 출력
    private static void printAllStudents() {
        if (numStudents == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

        System.out.println("\n=======================================");
        System.out.println("이름\tID\t국어\t영어\t수학\t평균");
        System.out.println("=======================================");

        for (int i = 0; i < numStudents; i++) {
            System.out.println(students[i]);
        }

        System.out.println("=======================================");
    }

    // 2. 최고 평균점수 학생 검색
    private static void searchHighestAverageStudent() {
        if (numStudents == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        double maxAvg = students[0].getAverage();
        int maxIndex = 0;

        for (int i = 1; i < numStudents; i++) {
            if (students[i].getAverage() > maxAvg) {
                maxAvg = students[i].getAverage();
                maxIndex = i;
            }
        }

        System.out.println("최고 평균점수 학생: " + students[maxIndex].getName());
    }
    private static void searchLowestAverageStudent() {
        if (numStudents == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        double minAvg = students[0].getAverage();
        int minIndex = 0;

        for (int i = 1; i < numStudents; i++) {
            if (students[i].getAverage() < minAvg) {
                minAvg = students[i].getAverage();
                minIndex = i;
            }
        }

        System.out.println("최저 평균점수 학생: " + students[minIndex].getName());
    }

    // 4. 학생 검색
    private static void searchStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("검색할 학생 이름을 입력하세요: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < numStudents; i++) {
            if (students[i].getName().equals(name)) {
                System.out.println(students[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("해당 학생을 찾을 수 없습니다.");
        }
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

        Student newStudent = new Student(name, koreanScore, englishScore, mathScore);
        students[numStudents] = newStudent;
        numStudents++;

        System.out.println("학생이 추가되었습니다.");
    }
}