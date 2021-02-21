package by.miklashevich.lessson5.task2;

public class Demo {
    public static void main(String[] args) {
        Customer[] people;
        people = new Customer[3];
        Customer person1 = new Customer(23, "Ivanov", "Ivan", "Ivanovich", "Minsk", 2345678, 12345678);
        Customer person2 = new Customer(23, "Sidorov", "Sergey", "Ivanovich", "Moskow", 4567877, 23456784);
        Customer person3 = new Customer(23, "Petrrov", "Petr", "Petrovvich", "Vorkuta", 5678774, 34567843);
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;


        Chislo interval = new Chislo(1,456);

        System.out.println(CustomerService.print(people,1,5678774));







    }

}
