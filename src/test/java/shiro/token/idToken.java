package shiro.token;

import org.apache.shiro.authc.HostAuthenticationToken;
import org.apache.shiro.authc.RememberMeAuthenticationToken;

public class idToken implements HostAuthenticationToken, RememberMeAuthenticationToken {

    private String id;
    private String sign;
    private boolean rememberMe;
    private String host;


    public idToken(String sign,String id){
        this.id =id;
        this.sign = sign;
        this.host = null;
        this.rememberMe = false;
    }

    @Override
    public String getHost() {
        return this.getHost();
    }

    @Override
    public boolean isRememberMe() {
        return this.rememberMe;
    }

    @Override
    public Object getPrincipal() {
        return getSign();
    }

    @Override
    public Object getCredentials() {
        return getId();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
