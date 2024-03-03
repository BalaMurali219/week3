class PublicClass {
    private int priv = 5;
    protected int pro = 6;
    public int pub = 7;

    public int getPrivate() {
        return priv;
    }
}

class PubSubClass extends PublicClass {
    public int varPro = pro;
    public int varPrivate = getPrivate();
}

class PrivateClass {
    private int priv2 = 8;
    protected int pro2 = 9;
    public int pub2 = 10;

    public int getPrivate2() {
        return priv2;
    }
}

class PrivSubClass extends PrivateClass {
    public int varPro2 = pro2;
    public int varPrivate2 = getPrivate2();
    public int varPub2 = pub2;
}

class ProtectedClass {
    private int priv3 = 11;
    protected int pro3 = 12;
    public int pub3 = 13;

    public int getPrivate3() {
        return priv3;
    }
}

class ProSubClass extends ProtectedClass {
    public int varPro3 = pro3;
    public int varPrivate3 = getPrivate3();
    public int varPub3 = pub3;
}

public class PubPriPro {
    public static void main(String[] args) {
        PubSubClass obj1 = new PubSubClass();
        System.out.println("public variable : " + obj1.pub);
        System.out.println("private variable : " + obj1.varPrivate);
        System.out.println("protected variable : " + obj1.pro);
        System.out.println();

        PrivSubClass obj2 = new PrivSubClass();
        System.out.println("public variable : " + obj2.pub2);
        System.out.println("private variable : " + obj2.varPrivate2);
        System.out.println("protected variable : " + obj2.pro2); 
        System.out.println();

        ProSubClass obj3 = new ProSubClass();
        System.out.println("public variable : " + obj3.pub3);
        System.out.println("protected variable : " + obj3.pro3);
        System.out.println("private variable : " + obj3.varPrivate3);
        System.out.println();
    }
}
