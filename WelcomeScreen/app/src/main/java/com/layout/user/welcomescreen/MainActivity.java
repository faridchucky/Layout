package com.layout.user.welcomescreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout introMessage;
    LinearLayout appContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        introMessage = (RelativeLayout) findViewById(R.id.welcome_pesan);
        appContent = (LinearLayout) findViewById(R.id.content_layout);
    }

    public void dismisWelcomeMessageBox(View view) {
        introMessage.setVisibility(View.INVISIBLE);
        appContent.setVisibility(View.VISIBLE);

    }
}
