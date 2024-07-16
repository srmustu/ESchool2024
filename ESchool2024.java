public class ESchool2024 {
    /*
    Course Sınıfı Özellikleri :
    Nitelikler : name,code,prefix,note,Teacher
    Metotlar : Course() , addTeacher() , printTeacher()

    Teacher Sınıfı Özellikleri :
    Nitelikler : name,mpno,branch
    Metotlar : Teacher()

    Student Sınıfı Özellikleri :
    Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
    Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
     */

    public static void main(String[] args) {
        TeacherESchool teacher = new TeacherESchool("Julia", "Math", "05693214579");
        teacher.printTeacherInformation();

        System.out.println(" ---- ");

        StudentESchool student1 = new StudentESchool("George","963","12-E",99, 99,
                63, 99,36,99);
        student1.printStudent();

    }
}
