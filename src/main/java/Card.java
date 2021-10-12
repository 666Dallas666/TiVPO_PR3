public class Card{
    int number;
    String name;
    String date;
    int cvv;

    public Card(int number, String name, String date, int cvv){
        this.number = number;
        this.name = name;
        this.date = date;
        this.cvv = cvv;
    };

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", cvv=" + cvv +
                '}';
    }
}
