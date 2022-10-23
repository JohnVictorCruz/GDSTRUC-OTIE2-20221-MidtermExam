package MidtermExam;

public class Card {

    private String cardType;

    private int number;


    public Card(String cardType, int number) {
        this.cardType = cardType;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    @Override
    public String toString() {
        String specialCard = "";

        switch (number) {
            case 1:
                specialCard = "Ace";
                break;
            case 11:
                specialCard = "Jack";
                break;
            case 12:
                specialCard = "Queen";
                break;
            case 13:
                specialCard = "King";
                break;
            case 14:
                return "Joker";
        }

        if (number == 1 || number > 10)
            return cardType + " " + specialCard;

        return cardType + " " + number;
    }
}