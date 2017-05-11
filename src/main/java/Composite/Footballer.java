package Composite;

/**
 * Created by paulreynolds on 11/05/2017.
 */
public class Footballer implements Athlete{

    int height;
    int weight;
    int age;
    String gender;
    String position;
    String club;

    public int calculateBMI(int height, int weight, int age, String gender) {
        int BMI = 0;

        //TODO calculate BMI

        return BMI;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

}
