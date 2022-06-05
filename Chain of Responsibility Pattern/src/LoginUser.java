/**
 * @author Yu
 * @title: LoginUser
 * @projectName CRP
 * @date 2022/5/26 17:46
 */
public class LoginUser {
    private String loginName;//登录名
    private String password;//密码
    private String roleName;//角色
    private String permission;//权限

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
