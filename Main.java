public class Main {
    public static void main(String[] args) {

       Person kaan=new Person(1,"kaan");
        MainManager mainManager= new MainManager();
        mainManager.add(kaan);
        mainManager.videoIzleme(kaan);
        System.out.println(kaan.getUserNumber());

       Student cihan=new Student(8,"cihan",2);
       StudentManager studentManager=new StudentManager();
       studentManager.add(cihan);
       studentManager.videoIzleme(cihan);
       studentManager.yorumYazma(cihan);
        System.out.println(cihan.getUserNumber());

       Instructor furkan=new Instructor(3,"furkan",2,3,5);
       InstructorManager instructorManager= new InstructorManager();
       instructorManager.add(furkan);
       instructorManager.Odev(furkan);
       instructorManager.videoIzleme(furkan);
       instructorManager.video(furkan);
        System.out.println(furkan.getInstructorNumber());
        System.out.println(furkan.getUserNumber());
        System.out.println(furkan.getOdevsayisi());
    }
}
