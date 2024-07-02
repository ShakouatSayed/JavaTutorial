package encapsulation_example.encapsulation_abstraction_java;

abstract class CustomerExample {
    String pro_name;

    abstract void ProductManage();

    public abstract int ProIncrementList();

    public abstract String toString();

    public CustomerExample(String pro_name) {
        this.pro_name = pro_name;
    }

    // public String getProductName() {
    // return pro_name;
    // }
}

class ProductManagement extends CustomerExample {
    String store_name, location;
    int import_product;

    public ProductManagement(String pro_name, String store_name, String location, int import_product) {
        super(pro_name);
        this.pro_name = pro_name;
        this.location = location;
        this.import_product = import_product;
    }

    @Override
    void ProductManage() {
        if (pro_name == "Cocacola" || pro_name == "Pepsi") {
            System.out.println(location);
        } else {
            System.out.println("This product Store in out of chittagong.");
        }
    }

    @Override
    public int ProIncrementList() {
        import_product += 1;
        while (import_product == 1) {
            if (import_product > 1 && import_product == 5) {
                import_product = 1;
            }
            import_product++;
        }
        System.out.println(import_product);
        return import_product;
    }

    @Override
    public String toString() {
        return "The Cocacola company service the country is Bangladesh.";
    }
}

public class Example02 {
    public static void main(String args[]) {
        ProductManagement OB1 = new ProductManagement("Cocacola", "Bangladesh Store", "Chittagong", 10);
        System.out.println("This product manage to bangladesh: ");

        String s = OB1.toString();
        System.out.println(s);

    }
}
