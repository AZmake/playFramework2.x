package controllers;

import play.mvc.Result;
import uba.api.service.SysUserSercice;
import uba.utils.Message;
import views.html.help;
import static play.libs.Json.toJson;

/**
 * Created by azmake on 16/5/23.
 */
public class azApi extends BaseController {
    public static SysUserSercice sysUserMessageSercice = new SysUserSercice();

    public Result help() {
        StringBuilder sb = new StringBuilder();
        sb.append("发送验证码：sendVerificationCode (String phone)\n");
        sb.append("客户登录 ：login(String phone,String verficationCode, type)\n");
        sb.append("获取用户信息：getUserInfo(String phone,String usertoken)<br/><br/>");
        return ok(help.render(sb.toString()));
    }

    public Result login(String fMobile, String fPassword){
        Message getLoginMessage = sysUserMessageSercice.login(fMobile,fPassword);
        return ok(toJson(getLoginMessage));
    }

}
