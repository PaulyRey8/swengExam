package Strategy;

/**
 * Created by paulreynolds on 11/05/2017.
 */
public class University {

    public String calculateGrade(int[] grades) {
        int total = 0;

        int avg = 0;

        for (int grade : grades) {
            total += grade;
        }

        avg = total / grades.length;

        if(avg >= 70) return "First";
        if(avg >= 60) return "2:1";
        if(avg >= 70) return "2:2";
        if(avg >= 70) return "Third";
        return "Fail";
    }
}
