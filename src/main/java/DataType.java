public class DataType {

    public static void main(String[] args) {

        byte a = 4;
        byte b = 6;
//        byte c = a + b;  // X
        byte d = 3 + 4;  // O

        long l = 123;
//		Long ll = 123; // Error
        Long lll = 123L;
        long ll = 123L;

        double dd = 12.3566;

        // 整数默认int 浮点数默认double
// byte short 在定义时 接受的是int 值 如果超出范围 则报错。

//		float f = 12.3566; Error
        float ff = 12.3566f;
        float fff = (float) 12.3566;
    }
}
