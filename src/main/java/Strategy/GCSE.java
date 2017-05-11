package Strategy;

/**
 * Created by paulreynolds on 11/05/2017.
 */
public class GCSE implements Grade{

    String grade;
    public String calculateGrade(int[] grades) {
        for (int grade1 : grades) {
            switch (grade1) {
                case 10:
                    grade += "A*";
                    break;
                case 9:
                    grade += "A";
                    break;
                case 8:
                    grade += "B+";
                    break;
                case 7:
                    grade += "B";
                    break;
                case 6:
                    grade += "B-";
                    break;
                case 5:
                    grade += "C";
                    break;
                case 4:
                    grade += "D";
                    break;
                default:
                    grade += "F";
            }
        }

        return grade;
    }
}
