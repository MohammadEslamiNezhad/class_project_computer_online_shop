
import java.util.*;

class ComputerShop {
    private static List<Category> categories = new ArrayList<>();;

    static Scanner scanner = new Scanner(System.in);

    static {
        // اضافه کردن دسته بندی ها
        Category laptopCategory = new Category("لپ تاپ");
        Category desktopCategory = new Category("دسکتاپ");
        Category mobileCategory = new Category("موبایل");

        categories.add(laptopCategory);
        categories.add(desktopCategory);
        categories.add(mobileCategory);

        //... rest of the code

        // اضافه کردن ویژگی ها
        laptopCategory.addFeature("پردازنده");
        laptopCategory.addFeature("رم");
        laptopCategory.addFeature("حافظه داخلی");

        desktopCategory.addFeature("پردازنده");
        desktopCategory.addFeature("رم");
        desktopCategory.addFeature("حافظه داخلی");

        mobileCategory.addFeature("پردازنده");
        mobileCategory.addFeature("رم");
        mobileCategory.addFeature("حافظه داخلی");

        // اضافه کردن کالاها
        Map<String, String> laptop1Features = new HashMap<>();
        laptop1Features.put("پردازنده", "Intel Core i5");
        laptop1Features.put("رم", "8GB");
        laptop1Features.put("حافظه داخلی", "512GB");
        Item laptop1 = new Item("لپ تاپ ایسوس", laptop1Features, 15000000, 10);
        laptopCategory.addProduct(laptop1);

        Map<String, String> laptop2Features = new HashMap<>();
        laptop2Features.put("پردازنده", "Apple M1");
        laptop2Features.put("رم", "16GB");
        laptop2Features.put("حافظه داخلی", "1TB");
        Item laptop2 = new Item("لپ تاپ اپل", laptop2Features, 20000000, 10);
        laptopCategory.addProduct(laptop2);

        Map<String, String> desktop1Features = new HashMap<>();
        desktop1Features.put("پردازنده", "Intel Core i7");
        desktop1Features.put("رم", "16GB");
        desktop1Features.put("حافظه داخلی", "1TB");
        Item desktop1 = new Item("دسکتاپ ایسوس", desktop1Features, 10000000, 10);
        desktopCategory.addProduct(desktop1);

        Map<String, String> mobile1Features = new HashMap<>();
        mobile1Features.put("پردازنده", "Qualcomm Snapdragon 888");
        mobile1Features.put("رم", "8GB");
        mobile1Features.put("حافظه داخلی", "128GB");
        Item mobile1 = new Item("موبایل سامسونگ", mobile1Features, 5000000, 10);
        mobileCategory.addProduct(mobile1);

        Map<String, String> mobile2Features = new HashMap<>();
        mobile2Features.put("پردازنده", "Apple A15 Bionic");
        mobile2Features.put("رم", "6GB");
        mobile2Features.put("حافظه داخلی", "64GB");
        Item mobile2 = new Item("موبایل اپل", mobile2Features, 7000000, 10);
        mobileCategory.addProduct(mobile2);

    }
    public static void main(String[] args) {

        while (true) {
            System.out.println("منو:");
            System.out.println("1. اضافه کردن دسته بندی");
            System.out.println("2. اضافه کردن کالا");
            System.out.println("3. نمایش کالاها");
            System.out.println("4. خروج از برنامه");

            System.out.print("لطفا گزینه مورد نظر را انتخاب کنید: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addCategory();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    Category.showProducts();
                    break;
                case 4:
                    System.out.println("خروج از برنامه...");
                    return;
                default:
                    System.out.println("گزینه وارد شده صحیح نیست. لطفا دوباره تلاش کنید.");
            }
        }
    }

    private static void addCategory() {
        System.out.print("لطفا نام دسته بندی را وارد کنید: ");
        String categoryName = scanner.nextLine();
        Category category = new Category(categoryName);
        categories.add(category);
        System.out.println("دسته بندی با موفقیت اضافه شد.");
    }

    private static void addItem() {
        System.out.print("لطفا نام کالا را وارد کنید: ");
        String itemName = scanner.nextLine();
        System.out.print("لطفا دسته بندی کالا را وارد کنید: ");
        String categoryName = scanner.nextLine();
        boolean existCategory = false;
        Category category1 = null;
        for (Category category : categories){
            if (categoryName.equals(category.getName())) {
                existCategory = true;
                category1 = category;
                break;
            }
        }
        if (existCategory) {
            System.out.println("دسته بندی یافت نشد.");
            return;
        }
        Map<String, String> features = new HashMap<>();
        System.out.print("لطفا تعداد ویژگی ها را وارد کنید: ");
        int featureCount = scanner.nextInt();
        for (int i = 0; i < featureCount; i++) {
            System.out.print("لطفا نام ویژگی را وارد کنید: ");
            String featureName = scanner.nextLine();
            System.out.print("لطفا مقدار ویژگی را وارد کنید: ");
            String featureValue = scanner.nextLine();
            features.put(featureName, featureValue);
        }
        System.out.print("لطفا قیمت کالا را وارد کنید: ");
        int price = scanner.nextInt();
        System.out.print("لطفا تعداد کالا را وارد کنید: ");
        int quantity = scanner.nextInt();
        Item item = new Item(itemName, features, price, quantity);
        category1.addProduct(item);
        System.out.println("کالا با موفقیت اضافه شد.");
    }
}