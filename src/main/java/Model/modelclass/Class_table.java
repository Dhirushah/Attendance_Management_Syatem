package Model.modelclass;

public class Class_table {
int id;
String Classname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassname() {
        return Classname;
    }

    public void setClassname(String classname) {
        Classname = classname;
    }

    public Class_table(int id, String classname) {
        this.id = id;
        Classname = classname;
    }
}
