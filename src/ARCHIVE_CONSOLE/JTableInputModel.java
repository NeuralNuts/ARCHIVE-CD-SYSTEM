package ARCHIVE_CONSOLE;

public class JTableInputModel {
    public String ID;
    public String Title;
    public String Author;
    public String Section;
    public String X;
    public String Y;
    public String BarCode;
    public String Description;
    public String OnLoan;

    public JTableInputModel(){}

    public JTableInputModel(String id, String title, String author, String section, String x, String y, String bar_code, String description, String on_loan){

        ID = id;
        Title = title;
        Author = author;
        Section = section;
        X = x;
        Y = y;
        BarCode = bar_code;
        Description = description;
        OnLoan = on_loan;
    }

    @Override
    public String toString()
    {
        return ID + ";" + Title + ";" + Author + ";" + Section + ";" + X + ";" + Y + ";" + BarCode + ";" + Description + ";" + OnLoan;
    }
}
