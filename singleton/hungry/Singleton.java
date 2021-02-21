   /**
    * 1 饿汉式
    */
    private static final Singleton instance = new Singleton();
    //构造函数永远是私有属性，任何一种实现方式中都是如此, 所有方法都是静态属性，除了构造函数外
    private Singleton() {}
    public static Singleton getInstance() {
        return instance;
    }
    //不支持延迟加载，系统资源不足时，会出现OOM
   
