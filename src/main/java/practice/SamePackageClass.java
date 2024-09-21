package practice;
public class SamePackageClass {
    public static void main(String[] args) {
        BaseClass base = new BaseClass();

        // Accessing the protected method directly within the same package
        base.protectedMethod();
    }
}