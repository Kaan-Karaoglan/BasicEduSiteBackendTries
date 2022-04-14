public class InstructorManager extends MainManager {
    public void add(Instructor instructor) {
        System.out.println(instructor.getName()+" Öğretmen eklendi");
    }
    public void video(Instructor instructor){
        System.out.println(instructor.getVideoSayisi()+" video yüklendi");
    }
    public void Odev(Instructor instructor){
        System.out.println(instructor.getOdevsayisi()+" ödevler verildi");
    }

}
