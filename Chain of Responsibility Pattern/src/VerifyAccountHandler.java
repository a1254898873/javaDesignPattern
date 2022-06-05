/**
 * @author Yu
 * @title: VerifyAccountHandler
 * @projectName CRP
 * @date 2022/5/26 18:01
 */
public class VerifyAccountHandler extends MyHandler {

    @Override
    public void doHandler(LoginUser loginUser) {//校验账号密码
        if (null == loginUser.getLoginName()){
            System.out.println("用户名不能为空");
            return;
        }
        if (null == loginUser.getPassword()){
            System.out.println("密码不能为空");
            return;
        }
        if (!loginUser.getPassword().equals("123456")){
            System.out.println("密码不正确");
            return;
        }
        System.out.println("账号密码校验通过");
        next.doHandler(loginUser);//传递给下一个节点
    }
}
