/**
 * @author Yu
 * @title: SimpleFactory
 * @projectName simple
 * @date 2022/5/25 17:29
 */
public class SimpleFactory {
    public IProduct createProduct(String productType){
        if("apple".equals(productType)){
            return new Apple();
        }else if("orange".equals(productType)){
            return new Orange();
        }
        return null;
    }
}
