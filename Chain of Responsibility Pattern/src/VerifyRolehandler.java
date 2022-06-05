/**
 * @author Yu
 * @title: VerifyRolehandler
 * @projectName CRP
 * @date 2022/5/26 18:02
 */
public class VerifyRolehandler extends MyHandler{

    @Override
    public void doHandler(LoginUser loginUser) {
        if(!"admin".equals(loginUser.getRoleName())){//校验角色信息
            System.out.println("角色信息有误");
            return;
        }
        System.out.println("角色信息校验通过");
        next.doHandler(loginUser);//传递给下一个节点
    }

}
