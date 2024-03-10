package Sem_7_OOPprinciples;

import java.util.List;

public class VendingMachineBottleWater implements VendingMachine {
    private List<Product> productList;  // список с продуктами
    @Override
    public void initProducts(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList)
            if(product.getName().equals(name))
                return product;
        return null;
    }
    public Product getProduct(String name, double volume) {
        for (Product product : productList)
            if(product.getName().equals(name) && ((BottleWater) product).getVolume() == volume)
                return product;
        return null;
    }
}
