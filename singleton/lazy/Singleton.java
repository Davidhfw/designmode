    /**
     * 2 懒汉式
     */
    private static Singleton instance;
    private Singleton() {}
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
     //支持延迟加载，加锁严重影响并发操作
