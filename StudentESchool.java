public class StudentESchool {
    String name;
    String studentNumber;
    String classes;
    int lecture1Notes;
    int oNote1;
    int lecture2Notes;
    int oNote2;
    int lecture3Notes;
    int oNote3;
    int courseAvarage;
    boolean isPass;

    StudentESchool(String name, String studentNumber, String classes, int lecture1Notes, int oNote1, int lecture2Notes, int oNote2,
                   int lecture3Notes, int oNote3){
        this.name = name;
        this.studentNumber = studentNumber;
        this.classes = classes;
        this.lecture1Notes = lecture1Notes;
        this.oNote1 = oNote1;
        this.lecture2Notes = lecture2Notes;
        this.oNote2 = oNote2;
        this.lecture3Notes = lecture3Notes;
        this.oNote3 = oNote3;
    }

    double averageScoreCalculator(){
        double calculator = 0;
        calculator = (this.lecture1Notes + this.lecture2Notes + this.lecture3Notes);
        calculator /= 3.0;
        calculator *= 0.80;


        return calculator;
    }

    double oNoteCalculator(){
        double oCalculator = 0;
        oCalculator = (this.oNote1 + this.oNote2 + this.oNote3);
        oCalculator /= 3;
        oCalculator *= 0.20;

        return oCalculator;
    }

    double totalCalculator(){
        double total = averageScoreCalculator() + oNoteCalculator();
        return total;
    }


    boolean isPass(){
        if (totalCalculator() > 65){
            return true;
        }else {
            return false;
        }
    }
    void printStudent(){
        String m1 = "Student's 1 personal information";
        System.out.print("Name : " + name + "\n" + "Student number : " + studentNumber + "\n" + "Class : " + classes + "\n" +
                "Math note : " + lecture1Notes + "\n" +"Math oral note : " + oNote1 + "\n" + "Physics note : " + lecture2Notes + "\n" +
                "Physics oral note : " + oNote2 + "\n" + "Chemistry note : " + lecture3Notes + "\n" + "Chemistry oral note : " + oNote3 + "\n" +
                "Average score : " + averageScoreCalculator() + "\n" + "Oral note score : " + oNoteCalculator() + "\n" +
                "Total score : " + totalCalculator() + "\n" + "Passing the class : " + isPass() );
    }


}
