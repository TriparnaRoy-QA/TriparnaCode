package oct.ex_11102024;

public class APIAutomation {
    public static void main(String[] args){
        BaseTestApi baseTestAPI= new TestCaseApi();
        //performing HTTP operation using TestCaseApi
        baseTestAPI.performGET();
        baseTestAPI.performPOST();
        baseTestAPI.performGET();
        baseTestAPI.performPATCH();
        baseTestAPI.performDELETE();
        //using setter method
        baseTestAPI.setId(20);
        baseTestAPI.setName("Triparna");
        System.out.println("ID set" + baseTestAPI.getId());
        System.out.println("name set" + baseTestAPI.getName());
    }
}
