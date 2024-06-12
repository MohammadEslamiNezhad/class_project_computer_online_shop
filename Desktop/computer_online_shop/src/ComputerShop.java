import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class ComputerShop {
    private Category selectedCategory;
        public static void main(String[] args) {
            ComputerShop shop = new ComputerShop();

            while (true) {
                System.out.println("منو اصلی:");
                System.out.println("1. اضافه کردن دسته جدید");
                System.out.println("2. اضافه کردن کالا جدید");
                System.out.println("3. نمایش کالاها");
                System.out.println("4. ذخیره در فایل");
                System.out.println("5. خروج");

                Scanner scanner = new Scanner(System.in);
                System.out.print("گزینه را انتخاب کنید: ");
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        shop.addCategory();
                        break;
                    case 2:
                        shop.addProduct();
                        break;
                    case 3:
                        shop.showProducts();
                        break;
                    case 4:
                        shop.saveToFile();
                        break;
                    case 5:
                        System.out.println("خروج از برنامه...");
                        return;
                    default:
                        System.out.println("گزینه نامعتبر است. لطفا دوباره انتخاب کنید.");
                }
            }
        }
    private List<Category> categories;

    public ComputerShop() {
        this.categories = new ArrayList<>();

        // Add default categories and products
        Category cpuCategory = new Category("پردازنده");
        cpuCategory.addProduct(new Item("Intel Core i5", Map.of("نسل", "10", "برند", "Intel", "مدل", "i5-10400")));
        cpuCategory.addProduct(new Item("AMD Ryzen 5", Map.of("نسل", "5", "برند", "AMD", "مدل", "Ryzen 5 5600X")));
        categories.add(cpuCategory);

        Category ramCategory = new Category("رم");
        ramCategory.addProduct(new Item("Corsair 16GB DDR4", Map.of("حافظه", "16", "فرکانس", "3200")));
        ramCategory.addProduct(new Item("Kingston 8GB DDR4", Map.of("حافظه", "8", "فرکانس", "2400")));
        categories.add(ramCategory);

        Category hardDriveCategory = new Category("هارد");
        hardDriveCategory.addProduct(new Item("Western Digital 1TB", Map.of("حافظه", "1000", "دور در دقیقه", "7200", "سرعت انتقال داده", "6Gb/s")));
        hardDriveCategory.addProduct(new Item("Seagate 500GB", Map.of("حافظه", "500", "دور در دقیقه", "5400", "سرعت انتقال داده", "3Gb/s")));
        categories.add(hardDriveCategory);
    }

    public void addCategory() {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> featuresValues = new HashMap<>();
        boolean groupAdded = false;
        Category category = null;

        while (!groupAdded) {
            System.out.println("۱. نام گروه");
            System.out.println("۲. مشخصات گروه");
            System.out.println("۳. نهایی کردن ثبت گروه");
            System.out.print("گزینه را انتخاب کنید: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over

            switch (option) {
                case 1:
                    System.out.println("نام گروه را وارد کنید:");
                    String groupName = scanner.nextLine();
                    category = new Category(groupName);
                    break;
                case 2:
                    System.out.println("مقدار ویژگی‌ها را وارد کنید:");
                    for (String feature : selectedCategory.getFeatures()) {
                        System.out.print(feature + ": ");
                        String value = scanner.nextLine();
                        featuresValues.put(feature, value);
                    }
                    break;
                case 3:
                    if (category == null) {
                        System.out.println("لطفا ابتدا نام گروه را وارد کنید.");
                        break;
                    }
                    categories.add(category);
                    groupAdded = true;

                    // Write the new category to the file
                    try (FileWriter writer = new FileWriter("shop.txt", true)) {
                        writer.write("دسته: " + category.getName() + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("گزینه نامعتبر است.");
            }
        }
    }

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        boolean productAdded = false;
        Item product = null;
        Map<String, String> featuresValues = new HashMap<>();

        // Select category or create a new one
        System.out.println("دسته بندی کالا را انتخاب کنید:");
        for (int i = 0; i < categories.size(); i++) {
            System.out.println((i + 1) + ". " + categories.get(i).getName());
        }
        System.out.println((categories.size() + 1) + ". دسته جدید");
        int categoryIndex = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over

        Category selectedCategory;
        if (categoryIndex <= categories.size()) {
            selectedCategory = categories.get(categoryIndex - 1);
        } else {
            System.out.println("نام دسته جدید را وارد کنید:");
            String categoryName = scanner.nextLine();
            selectedCategory = new Category(categoryName);
            categories.add(selectedCategory);

            // Write the new category to the file
            try (FileWriter writer = new FileWriter("shop.txt", true)) {
                writer.write("دسته: " + selectedCategory.getName() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Add features to the selected category
        System.out.println("ویژگی‌های دسته را وارد کنید:");
        while (true) {
            System.out.print("ویژگی (یا 'done' برای پایان): ");
            String feature = scanner.nextLine();
            if (feature.equalsIgnoreCase("done")) {
                break;
            }
            selectedCategory.addFeature(feature);
        }

        while (!productAdded) {
            System.out.println("۱. نام کالا");
            System.out.println("۲. مقدار ویژگی‌ها");
            System.out.println("۳. نهایی کردن ثبت کالا");
            System.out.print("گزینه را انتخاب کنید: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over

            switch (option) {
                case 1:
                    System.out.println("نام کالا را وارد کنید:");
                    String productName = scanner.nextLine();
                    product = new Item(productName, featuresValues);
                    break;
                case 2:
                    System.out.println("مقدار ویژگی‌ها را وارد کنید:");
                    for (String feature : selectedCategory.getFeatures()) {
                        System.out.print(feature + ": ");
                        String value = scanner.nextLine();
                        featuresValues.put(feature, value);
                    }
                    break;
                case 3:
                    if (product != null) {
                        selectedCategory.addProduct(product);
                        productAdded = true;

                        // Write the new product to the file
                        try (FileWriter writer = new FileWriter("shop.txt", true)) {
                            writer.write("  کالا: " + product.getName() + "\n");
                            for (Map.Entry<String, String> entry : product.getFeaturesValues().entrySet()) {
                                writer.write("    " + entry.getKey() + ": " + entry.getValue() + "\n");
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("لطفا ابتدا نام کالا را وارد کنید.");
                    }
                    break;
                default:
                    System.out.println("گزینه نامعتبر است.");
            }
        }
    }
    public void showProducts() {
        for (Category category : categories) {
            System.out.println("دسته: " + category.getName());
            for (Item product : category.getProducts()) {
                System.out.println("  کالا: " + product.getName());
                for (Map.Entry<String, String> entry : product.getFeaturesValues().entrySet()) {
                    System.out.println("    " + entry.getKey() + ": " + entry.getValue());
                }
            }
        }
    }

    public void saveToFile() {
        // Add default categories and products
        Category cpuCategory = new Category("پردازنده");
        cpuCategory.addProduct(new Item("CPU1", Map.of("نسل", "10", "برند", "Intel", "مدل", "Core i7")));
        cpuCategory.addProduct(new Item("CPU2", Map.of("نسل", "11", "برند", "AMD", "مدل", "Ryzen 5")));

        Category ramCategory = new Category("رم");
        ramCategory.addProduct(new Item("RAM1", Map.of("حافظه", "8GB", "فرکانس", "3200MHz")));
        ramCategory.addProduct(new Item("RAM2", Map.of("حافظه", "16GB", "فرکانس", "3600MHz")));

        Category hardCategory = new Category("هارد");
        hardCategory.addProduct(new Item("HDD1", Map.of("حافظه", "500GB", "دور در دقیقه", "7200", "سرعت انتقال داده", "100MB/s")));
        hardCategory.addProduct(new Item("HDD2", Map.of("حافظه", "1TB", "دور در دقیقه", "5400", "سرعت انتقال داده", "50MB/s")));

        categories.add(cpuCategory);
        categories.add(ramCategory);
        categories.add(hardCategory);

        try (FileWriter writer = new FileWriter("shop.txt")) {
            for (Category category : categories) {
                writer.write("دسته: " + category.getName() + "\n");
                for (Item product : category.getProducts()) {
                    writer.write("  کالا: " + product.getName() + "\n");
                    for (String feature : category.getFeatures()) {
                        writer.write("    " + feature + ": " + product.getFeaturesValues().get(feature) + "\n");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
