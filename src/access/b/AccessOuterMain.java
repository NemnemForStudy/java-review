package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();
        // public 호출 가능
        accessData.publicField = 1;
        accessData.publicMethod();

        // default
        // accessData.defaultField = 2;
        // accessData.defaultMethod();

        // private은 불가함.

        // innerAccess
        accessData.innerAccess();
    }
}
