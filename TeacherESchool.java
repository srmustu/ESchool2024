public class TeacherESchool {
    String name;
    String branch;
    String phoneNum;
    TeacherESchool(String name, String branch, String phoneNum){
        this.name = name;
        this.branch = branch;
        this.phoneNum = phoneNum;
    }

    void printTeacherInformation(){
        String m1 = "Teacher's personal information; ";
        System.out.print(m1 + "\n" + "Name : " + this.name + "\n" + "Branch : " + this.branch + "\n" + "Phone number : " + this.phoneNum + "\n");
    }


}
