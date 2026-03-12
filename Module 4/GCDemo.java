class GarbageCollectionDemo {
    String name;

    GarbageCollectionDemo(String name) {
        this.name = name;
    }

    protected void finalize() {
        System.out.println(name + " object is garbage collected");
    }

    public static void main(String[] args) {
        GarbageCollectionDemo obj1 = new GarbageCollectionDemo("Object1");
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo("Object2");

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}