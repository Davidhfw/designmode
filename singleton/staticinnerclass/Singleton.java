    /**
     * 4 静态内部类
      */
    private Singleton() {}
    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }
    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
   // 既保证了线程安全，又能做到延迟加载
    
