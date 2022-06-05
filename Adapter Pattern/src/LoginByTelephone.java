/**
 * @author Yu
 * @title: LoginByTelephone
 * @projectName AP
 * @date 2022/5/26 17:16
 */
public class LoginByTelephone extends LoginService{

    @Override
    public void login(String userName, String password) {
        super.login(userName, password);
    }

    public void loginByTelephone(String telephone){
        //处理业务逻辑，如注册，存储手机号校验验证码等
        //为了兼容之前的账号密码登录，可以初始化与一个固定一个账号，并设置密码
        System.out.println("--------手机登录--------");
        this.login(telephone,"设置好的密码");
    }
}
