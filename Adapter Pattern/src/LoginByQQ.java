/**
 * @author Yu
 * @title: LoginByQQ
 * @projectName AP
 * @date 2022/5/26 17:20
 */
public class LoginByQQ extends LoginService{

    @Override
    public void login(String userName, String password) {
        super.login(userName, password);
    }

    public void loginByQQ(String qqNum){
        //处理业务逻辑，如注册，存储qq账号信息等
        //为了兼容之前的账号密码登录，可以初始化与一个固定一个账号，并设置密码
        System.out.println("--------QQ登录--------");
        this.login(qqNum,"设置好的密码");
    }

}
