package Library_manage;

public class Book {
    private int BId;
    private String  Bname;
    private String  Bauthor;

    public Book(int id, String bname, String  bauthor) {
        BId = id;
        Bname = bname;
        Bauthor = bauthor;
    }

    public Book(String bname, String bauthor) {
        Bname = bname;
        Bauthor = bauthor;
    }

    public int getBId() {
        return BId;
    }

    public void setBId(int BId) {
        this.BId = BId;
    }

    public String getBname() {
        return Bname;
    }

    public void setBname(String bname) {
        Bname = bname;
    }

    public String getBauthor() {
        return Bauthor;
    }

    public void setBauthor(String bauthor) {
        Bauthor = bauthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BId=" + BId +
                ", Bname='" + Bname + '\'' +
                ", Bauthor='" + Bauthor + '\'' +
                '}';
    }
}
