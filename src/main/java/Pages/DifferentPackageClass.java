package Pages;

import practice.BaseClass;

public class DifferentPackageClass extends BaseClass {
    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        DifferentPackageClass dif = new DifferentPackageClass();
        // Accessing the protected method directly through an instance of BaseClass
       // base.protectedMethod();
        dif.protectedMethod();
    }
}