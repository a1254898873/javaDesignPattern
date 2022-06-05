/**
 * @author Yu
 * @title: Main
 * @projectName AP
 * @date 2022/5/26 17:20
 */
public class Main {
    public static void main(String[] args) {
        LoginByTelephone loginByTelephone = new LoginByTelephone();//手机登录适配器
        loginByTelephone.loginByTelephone("131xxxxxxxx");

        LoginByWechat loginByWechat = new LoginByWechat();
        loginByWechat.loginByWechat("微信openid");//微信登录适配器

        LoginByQQ loginByQQ = new LoginByQQ();
        loginByQQ.loginByQQ("QQ号");//QQ登录适配器
    }
}
