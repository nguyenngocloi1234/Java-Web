package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
   private static Map<Integer, Customer> customers;
   static {
       customers = new HashMap<>();
       customers.put(1,new Customer(1,"Loi","nguyenngocloi.bkdn@gmail.com","QuangNam"));
       customers.put(2, new Customer(2,"Trang","trangnguyen.dn@gmail.com","DaNang"));
       customers.put(3, new Customer(3, "Men","menle.dn@gmail.com","HoaTien"));
       customers.put(4, new Customer(4,"Oanh","oanhle.dn@gmail.com","LeSon"));
       customers.put(5, new Customer(5, "Nguyet","nguyenho.qn@gmail.com","DienHoa"));
       customers.put(6, new Customer(6,"Tai","Tainguyen.qn@gmail.com","DienHoa"));
   }
    @Override
    public List<Customer> read() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void create(Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);
    }

    @Override
    public void delete(int id) {
        customers.remove(id);
    }

    @Override
    public List<Customer> findByName(String name) {
       List<Customer> cuss = new ArrayList<>();
       List<Customer> customeers = this.read();
        for (Customer cus:customeers) {
           if (name.contains(cus.getName())){
               cuss.add(cus);
           }
        }
        return cuss;
    }
}
