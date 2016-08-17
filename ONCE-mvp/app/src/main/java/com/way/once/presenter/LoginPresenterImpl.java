package com.way.once.presenter;

import android.text.TextUtils;

import com.way.once.util.LoginHttp;
import com.way.once.view.LoginView;

/**
 * Created by pc on 2016/8/18.
 */

public class LoginPresenterImpl implements LoginPresenter {
    private final LoginView mView;

    public LoginPresenterImpl(LoginView view) {
        this.mView = view;

        //我这里直接把activity作为view，所以不需要
        //mView.setPresenter(this);
    }

    @Override
    public void login() {
        if (!validator()) {
            return;
        }

        boolean result = LoginHttp.getInstance().httpLogin(mView.getAccount(), mView.getPassword());

        if (result) {
            mView.loginSuccess();
        } else {
            mView.loginError("account or password is error");
        }
    }

    @Override
    public void start() {
        //TODO
    }

    /**
     * 登录参数校验
     *
     * @return
     */
    private boolean validator() {
        if (TextUtils.isEmpty(mView.getAccount())) {
            mView.loginError("account is empty");
            return false;
        }

        if (TextUtils.isEmpty(mView.getPassword())) {
            mView.loginError("account is empty");
            return false;
        }
        return true;
    }
}
