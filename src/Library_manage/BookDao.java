package Library_manage;

import java.sql.*;

public class BookDao {
    public static boolean insertBook(Book b) throws RuntimeException {
        boolean f;
        try {
            Connection con = Cp.CreateC();
            String query = "INSERT INTO Books(Bname,BAuthor)values(?,?)";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, b.getBname());
            preparedStatement.setString(2, b.getBauthor());
            preparedStatement.executeUpdate();
            f = true;
        }
        catch (SQLException |ClassNotFoundException ex){
            ex.printStackTrace();
            throw new RuntimeException();
        }

        return f;

    }

    public static void showBooks() {
        try {
            Connection con = Cp.CreateC();
            String query = "SELECT * FROM Books";
            Statement sts = con.prepareStatement(query);
            ResultSet set = sts.executeQuery(query);

            if (set.next()) {
                System.out.println("ID \t\t Name \t\t Author");
                System.out.println("==================================");

                do {
                    int Id = set.getInt(1);
                    String Name = set.getString(2);
                    String Author = set.getString(3);

                    System.out.println(Id + "\t\t" + Name + "\t\t" + Author);
                } while (set.next());

                System.out.println("==================================");
            } else {
                System.out.println("No books are available");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static boolean issueBook(int id) {
        boolean b;
        try {
            Connection con = Cp.CreateC();
            String query = "DELETE FROM Books WHERE Bid=?";

           PreparedStatement preparedStatement= con.prepareStatement(query);
           preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
            b = true;
        }
        catch (SQLException |ClassNotFoundException ex){
            ex.printStackTrace();
            throw new RuntimeException();
        }
        return b;
    }
}
