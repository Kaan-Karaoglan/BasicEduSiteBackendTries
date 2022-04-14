public class Student extends Person {
    private int ogrenciNo;
    public Student(int id, String name, int ogrenciNo) {
        super(id, name);
    }
    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }


}
