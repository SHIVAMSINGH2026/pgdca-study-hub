// Practical-43: Write a Java Program to demonstrate Wrapper Class (Boxing, Unboxing, Auto-boxing & Auto-unboxing) in Java.
public class WrapperExample {
    int num;
    double price;
    char grade;

    WrapperExample(int n, double p, char g) {
        num = n;
        price = p;
        grade = g;
    }

    void showWrapper() {
        // Wrapping (Boxing) - primitive to object
        Integer objNum = Integer.valueOf(num);
        Double objPrice = Double.valueOf(price);
        Character objGrade = Character.valueOf(grade);

        System.out.println("Integer Object: " + objNum);
        System.out.println("Double Object: " + objPrice);
        System.out.println("Character Object: " + objGrade);

        // Unboxing - object to primitive
        int primitiveNum = objNum.intValue();
        double primitivePrice = objPrice.doubleValue();
        char primitiveGrade = objGrade.charValue();

        System.out.println("Primitive int: " + primitiveNum);
        System.out.println("Primitive double: " + primitivePrice);
        System.out.println("Primitive char: " + primitiveGrade);

        // Auto-boxing
        Integer autoBox = num;
        Double autoBoxDouble = price;
        System.out.println("Auto-boxed Integer: " + autoBox);
        System.out.println("Auto-boxed Double: " + autoBoxDouble);

        // Auto-unboxing
        int autoUnBox = objNum;
        double autoUnBoxDouble = objPrice;
        System.out.println("Auto-unboxed int: " + autoUnBox);
        System.out.println("Auto-unboxed double: " + autoUnBoxDouble);

        // Parsing String to primitive
        String strNum = "123";
        int parsedNum = Integer.parseInt(strNum);
        System.out.println("Parsed int from String: " + parsedNum);
    }

    public static void main(String[] args) {
        WrapperExample obj = new WrapperExample(50, 99.99, 'A');
        obj.showWrapper();
    }
}

/* Output:
Integer Object: 50
Double Object: 99.99
Character Object: A
Primitive int: 50
Primitive double: 99.99
Primitive char: A
Auto-boxed Integer: 50
Auto-boxed Double: 99.99
Auto-unboxed int: 50
Auto-unboxed double: 99.99
Parsed int from String: 123
*/
