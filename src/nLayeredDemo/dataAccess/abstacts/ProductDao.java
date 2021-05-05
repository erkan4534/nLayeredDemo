package nLayeredDemo.dataAccess.abstacts;

import nLayeredDemo.entities.concretes.Product;

import java.util.List;

//The another name is ProductDal
public interface ProductDao {
    void add(Product product);
    void update(Product product);
    void delete(Product product);
    Product get(int id);
    List<Product> getAll();
}
