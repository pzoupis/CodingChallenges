package hackerrank.algorithms.implementation;

/**
 * Problem link: https://www.hackerrank.com/challenges/grading
 */
public class GradingStudents {
    public static int[] gradingStudents(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 38) {
                continue;
            }

            int difference = 5 - (grades[i] % 5);
            if (difference < 3) {
                grades[i] += difference;
            }
        }
        return grades;
    }
}
