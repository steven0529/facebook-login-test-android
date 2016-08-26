package com.chuck.facebooklogintest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.login.LoginManager;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by chuck on 23/08/2016.
 */
public class InfoActivity extends Activity {

    @BindView(R.id.name_tv) TextView nameTv;
    @BindView(R.id.email_tv) TextView emailTv;
    @BindView(R.id.bday_tv) TextView bdayTv;
    @BindView(R.id.status_tv) TextView statusTv;
    @BindView(R.id.logoutBtn) Button logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        ButterKnife.bind(this);

        User user = (User) getIntent().getExtras().get("user");
        nameTv.setText(user.getName());
        emailTv.setText(user.getEmail());
        bdayTv.setText(user.getBirthday());


        statusTv.setText(LoginManager.getInstance().getLoginBehavior().toString());

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginManager.getInstance().logOut();
                finish();
            }
        });
    }
}
