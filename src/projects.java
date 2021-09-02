package src;

public class projects {
    public static void main(String[] args) {

        float grade1 = 78;
        float grade2 = 84;
        float grade3 = 89;
        float grade4 = 97;
        float grade5 = 70;
        float avg12 = (grade1 + grade2) / 2, avg34 = (grade3 + grade4) / 2;
        float finalAvg = ((avg12 * 2) + (avg34 * 2) + grade5) / 5;

        System.out.println(finalAvg);
    }
}