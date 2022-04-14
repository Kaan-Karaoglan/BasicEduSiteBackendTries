import java.sql.Date;
import java.sql.Time;
import java.time.DayOfWeek;

public class Person {
    private int id;
    private String name;
    private int userCode;


    public int getUserNumber() {
        return this.id+this.userCode;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    private int userNumber;

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }


    public Person(int id, String name) {
        super();
        this.id = id;
        this.name = name;
        this.userNumber =id+userCode;
        this.userCode=id*8;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
