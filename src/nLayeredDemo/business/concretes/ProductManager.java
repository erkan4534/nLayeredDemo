package nLayeredDemo.business.concretes;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstacts.ProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private  ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService=loggerService;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId()==1){
            System.out.println("Product is not accepted in this category");
            return;
        }

        this.productDao.add(product);
        this.loggerService.logToSystem("Product is added :"+product.getName());
    }

    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }
}
