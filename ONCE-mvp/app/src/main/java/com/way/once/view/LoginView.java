package com.way.once.view;

import com.way.once.base.BaseView;
import com.way.once.presenter.LoginPresenter;

/**
 * Created by pc on 2016/8/18.
 */

public interface LoginView extends BaseView<LoginPresenter> {

    void loginError(String msg);

    void loginSuccess();

    String getAccount();

    String getPassword();

}
