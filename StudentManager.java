public class StudentManager extends MainManager {
    public void add(Student student) {
        System.out.println(student.getName() + " öğrenci eklendi");
    }

    public void yorumYazma(Student student) {
        System.out.println(student.getName() + " videoya yorum bırakıldı");
    }


}
