package Exception.FillInStackTrace;

/**
 * @author William
 * @date 2019-10-31 14:12
 * @description
 */
public class FillInExceptionTest {

    public static void main(String[] args) {
        FillInExceptionTest fit = new FillInExceptionTest();
        try {
            fit.outerMehtod();
        } catch (Exception e) {
            System.out.println("\n==========I am the one evil separation line==============");
            e.printStackTrace();
        }
    }
    public void innerMethod() throws Exception {
        throw new Exception("I got exception in an inner method.");
    }
    public void outerMehtod() throws Exception {
        try {
            innerMethod(); //invoke inner method.
        } catch (Exception e) {
            e.printStackTrace();
            throw (Exception)e.fillInStackTrace();
//            throw e;
        }
    }
}
