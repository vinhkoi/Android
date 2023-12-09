package com.example.streamingapp_nhom12.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.streamingapp_nhom12.R;

public class MainActivity extends AppCompatActivity {

    Button btnLogin, btnForgotpass;
    EditText txtUsername, txtPassword;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
        initControll();

    }


    protected void initControll(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = String.valueOf(txtUsername.getText());
                String password = String.valueOf(txtPassword.getText());

                if(TextUtils.isEmpty(username)||TextUtils.isEmpty(password)){
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Vui lòng nhập đầy đủ tài khoản và mật khẩu để đăng nhập!")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    // do something
                                }
                            });
                    AlertDialog alert = builder.create();
                    alert.show();
                } else {
                    if(username.equals("nhom12")&&password.equals("nhom12")){
                        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                        startActivity(intent);
                        finish();
                    }else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setMessage("Tài khoản hoặc mật khẩu không chính xác. Vui lòng kiểm tra lại!")
                                .setCancelable(false)
                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        // do something
                                    }
                                });
                        AlertDialog alert = builder.create();
                        alert.show();
                    }

                }
            }
        });

        btnForgotpass = findViewById(R.id.btnForgotpass);

        btnForgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Tạo Intent để chuyển tới ForgotpassActivity
                    Intent intent = new Intent(MainActivity.this, ForgotPasswordActivity.class);
                    startActivity(intent);
            }
        });


    }

    protected void initView(){
        btnForgotpass = findViewById(R.id.btnForgotpass);
        btnLogin = findViewById(R.id.btnLogin);
        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);


    }
}