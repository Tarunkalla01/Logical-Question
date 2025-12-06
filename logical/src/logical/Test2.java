package logical;

class Parent {
    // 1️⃣ Static area (runs once)
    static {
        System.out.println("1. Parent static block");
    }
    static int s1 = print("2. Parent static variable");

    // 2️⃣ Instance area (runs every time new object is created)
    {
        System.out.println("5. Parent instance block");
    }
    int i1 = print("6. Parent instance variable");

    // 3️⃣ Constructor
    Parent() {
        System.out.println("7. Parent constructor");
        instanceMethod();
        staticMethod();
    }

    // 4️⃣ Methods
    static void staticMethod() {
        System.out.println("8. Parent static method");
    }

    void instanceMethod() {
        System.out.println("9. Parent instance method");
    }

    static int print(String msg) {
        System.out.println(msg);
        return 0;
    }
}

class Child extends Parent {
    // 1️⃣ Static area
    static {
        System.out.println("3. Child static block");
    }
    static int s2 = print("4. Child static variable");

    // 2️⃣ Instance area
    {
        System.out.println("10. Child instance block");
    }
    int i2 = print("11. Child instance variable");

    // 3️⃣ Constructor
    Child() {
        System.out.println("12. Child constructor");
        instanceMethod();
        staticMethod();
    }

    // 4️⃣ Methods
    static void staticMethod() {
        System.out.println("13. Child static method");
    }

    void instanceMethod() {
        System.out.println("14. Child instance method");
    }
}

public class Test2{
	public static void main(String[] args) {
		 System.out.println("=== main() start ===");
	        Child.staticMethod();    // triggers class loading if not yet done
	        System.out.println("--- Creating Object ---");
	        Child obj = new Child(); // creates object
	        System.out.println("--- Calling Methods ---");
	        obj.instanceMethod();
	        Child.staticMethod();
	        System.out.println("=== main() end ===");
		
	}
}
