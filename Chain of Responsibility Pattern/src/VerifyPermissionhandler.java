/**
 * @author Yu
 * @title: VerifyPermissionhandler
 * @projectName CRP
 * @date 2022/5/26 18:02
 */
public class VerifyPermissionhandler extends MyHandler{
    @Override
    public void doHandler(LoginUser loginUser) {//校验权限
        if (!"admin".equals(loginUser.getPermission())){
            System.out.println("暂无权限");
            return;
        }
        System.out.println("权限校验通过，登录成功");
    }
}
