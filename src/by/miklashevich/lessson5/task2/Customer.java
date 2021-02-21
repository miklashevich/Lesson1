package by.miklashevich.lessson5.task2;

public class Customer {
    public int id;
    public String surname;
    public String firstName;
    public String middleName;
    public String adress;
    public int numberCrediCart;
    public int numberBancAccount;

    public Customer(int id, String surname, String firstName, String middleName, String adress, int numberCrediCart, int numberBancAccount) {
        this.id = id;
        this.surname = surname;
        this.firstName = firstName;
        this.middleName = middleName;
        this.adress = adress;
        this.numberCrediCart = numberCrediCart;
        this.numberBancAccount = numberBancAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", adress='" + adress + '\'' +
                ", numberCrediCart=" + numberCrediCart +
                ", numberBancAccount=" + numberBancAccount +
                '}';
    }
}


