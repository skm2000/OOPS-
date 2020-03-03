class Function{
    public static void main(String []args){
        short a=1;
        int b=2;
        double c=3.2;
        show(a);
        show(b);
        show(c);
    }
    public static void show(int x){
        System.out.println("Integer");
    }
    /*public static void show(short x){
        System.out.println("Short");
    }*/
    public static void show(double x){
        System.out.println("Double");
    }
}