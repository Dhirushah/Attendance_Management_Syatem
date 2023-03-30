package Model.modelclass;

public class Attendance_table {
    int id;
    int Class_id;
    int User_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClass_id() {
        return Class_id;
    }

    public void setClass_id(int class_id) {
        Class_id = class_id;
    }

    public int getUser_id() {
        return User_id;
    }

    public void setUser_id(int user_id) {
        User_id = user_id;
    }

    public Attendance_table(int id, int class_id, int user_id) {
        this.id = id;
        Class_id = class_id;
        User_id = user_id;
    }
}
