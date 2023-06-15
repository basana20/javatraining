package Bank;

import bank.Customer;
public class Test {
    public static void main(String[] args){
        Customer a = new Customer();
        System.out.println(a.id);
        System.out.println(a.name);
        System.out.println(a.balance);
        System.out.println(a.isLocked);

    }
}
