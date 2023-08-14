package entities;
public class Student {
    public String name;
    public double grade1, grade2, grade3;

    public String missingGrade() {
        double finalMedia = grade1 + grade2+ grade3;
        if (finalMedia > 60) {
            return "FINAL GRADE = " + finalMedia + "\nPASS";
        } else {
            return "FINAL GRADE = " + finalMedia + "\nFAILED" + "\nMISSING " + Math.abs(finalMedia - 60) + " points";
        }

    }
}
