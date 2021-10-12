public class Card {
    String number;
    String name;
    String date;
    String cvv;

    public Card(String number, String name, String date, String cvv) {
        this.number = number;
        this.name = name;
        this.date = date;
        this.cvv = cvv;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
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

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", cvv='" + cvv + '\'' +
                '}';
    }
}
