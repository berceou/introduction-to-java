import java.util.Scanner;

public class GradeAverageExp {
    public static void main(String[] args) {
        int quiz, midterm, makeupExam;
        double averageNormal;
        double averageGrade;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter quiz number: ");
        quiz = input.nextInt();
        System.out.print("Enter midterm number: ");
        midterm = input.nextInt();
        System.out.print("Enter makeup exam number: ");
        makeupExam = input.nextInt();
        averageNormal = (double) (quiz + midterm + makeupExam) / 3;
        System.out.printf("The average of %d grades is %.2f", quiz, averageNormal);
        averageGrade = (quiz * 0.2) + (midterm * 0.3) + (makeupExam * 0.4);
        System.out.println("\n The average of grade is " + averageGrade);

    }
}
