public class Instructor extends Person {
    public Instructor(int id, String name, int videoSayisi,int instructorNumber, int odevSayisi) {
        super(id, name);
        this.instructorNumber=instructorNumber;
        this.videoSayisi=videoSayisi;
        this.odevsayisi=odevSayisi;
    }
    private int instructorNumber;

    public int getInstructorNumber() {
        return getId()*2;
    }

    public void setInstructorNumber(int instructorNumber) {
        this.instructorNumber = instructorNumber;
    }

    private int videoSayisi;

    public int getVideoSayisi() {
        return videoSayisi;
    }

    public void setVideoSayisi(int videoSayisi) {
        this.videoSayisi = videoSayisi;
    }
    private int odevsayisi;

    public int getOdevsayisi() {
        return odevsayisi;
    }

    public void setOdevsayisi(int odevsayisi) {
        this.odevsayisi = odevsayisi;
    }



}
