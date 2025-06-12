package Praktikum14;

import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList14 {  
    public static void main(String[] args) { 

       ArrayList<Customer14> customers = new ArrayList<>();

       Customer14 customer1 = new Customer14(1, "Zakia");
       Customer14 customer2 = new Customer14(5, "Budi");

       customers.add(customer1);
       customers.add(customer2);
       
       customers.add(new Customer14(4, "Cica"));

       customers.add(2, new Customer14(100, "Rosa"));

       System.out.println(customers.indexOf(customer2));

       Customer14 customer = customers.get(1);
       System.out.println(customer.name);
       customer.name = "Budi Utomo";

       ArrayList<Customer14> newCustomers = new ArrayList<>();
       newCustomers.add(new Customer14(201, "Della"));
       newCustomers.add(new Customer14(202, "Victor"));
       newCustomers.add(new Customer14(203, "Sarah"));

       customers.addAll(newCustomers);

       System.out.println(newCustomers);

       ArrayList<String> daftarSiswa = new ArrayList<>();
       daftarSiswa.add("Zainab");
       daftarSiswa.add("Andi");
       daftarSiswa.add("Rara");
       Collections.sort(daftarSiswa);

       System.out.println(daftarSiswa);

       customers.sort((c1,c2)->c1.name.compareTo(c2.name));
       
       System.out.println(customers);
    }
}
