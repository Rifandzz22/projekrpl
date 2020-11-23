package main.jnakshansh.bottomnavigationbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    private Button btn;
    private Button btn1;

    //ini komentar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn =findViewById(R.id.regis);
        btn1 =findViewById(R.id.login);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent il= new Intent(LoginActivity.this, RegistrasiActivity.class);
                startActivity(il);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent il= new Intent(LoginActivity.this, MainActivity.class);
                startActivity(il);
            }
        });

    }
}