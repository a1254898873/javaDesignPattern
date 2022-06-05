/**
 * @author Yu
 * @title: Main
 * @projectName CRP
 * @date 2022/5/26 18:03
 */
public class Main {
    public static void main(String[] args) {
        MyHandler accountHandler = new VerifyAccountHandler();
        MyHandler rolehandler = new VerifyRolehandler();
        MyHandler permissionhandler = new VerifyPermissionhandler();

        accountHandler.next(rolehandler);
        rolehandler.next(permissionhandler);

        LoginUser loginUser = new LoginUser();
        loginUser.setLoginName("孤狼1号");
        loginUser.setPassword("123456");
        loginUser.setRoleName("admin");
        loginUser.setPermission("admin");
        accountHandler.doHandler(loginUser);//从起点开始调用
    }
}
