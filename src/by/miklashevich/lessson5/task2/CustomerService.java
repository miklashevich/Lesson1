package by.miklashevich.lessson5.task2;


public class CustomerService {


    public static Customer print(Customer[] people, int chislo1, int chislo2) {
        for (int i = 0; i < people.length; i++) {
            if (chislo1 <= people[i].numberCrediCart && chislo2 <= people[i].numberCrediCart) {
                System.out.println(people[i].surname);
            }
        }
        return null;
    }
}



