package mpu.exam.thecoffeeshop.service;

import mpu.exam.thecoffeeshop.model.Category;
import mpu.exam.thecoffeeshop.model.Product;
import mpu.exam.thecoffeeshop.repository.ProductRepo;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    public List<Product> getAllProduct(){
        return productRepo.findAll();
    }
    public void addProduct(Product product){
        productRepo.save(product);
    }
    public void removeProductById(long id){
        productRepo.deleteById(id);
    }
    public Optional<Product>getProductById(long id){
        return  productRepo.findById(id);
    }
    public  List<Product> getAllProductByCategory(int id){
        return  productRepo.findAllByCategory_id(id);
    }

}
