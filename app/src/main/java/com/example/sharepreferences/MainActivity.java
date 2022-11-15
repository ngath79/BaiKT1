package com.example.sharepreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.nio.charset.CharsetEncoder;

public class MainActivity extends AppCompatActivity {

    Button btnXacNhan;
    EditText edtUseName, edtPassword;
    CheckBox cbRemember;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();

        sharedPreferences = getSharedPreferences("dataLogin", MODE_PRIVATE);
        //lấy giá trị SharePreferences
        edtUseName.setText(sharedPreferences.getString("taikhoan", ""));
        edtPassword.setText(sharedPreferences.getString("matkhau", ""));
        cbRemember.setChecked(sharedPreferences.getBoolean("checked", false));

        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usename = edtUseName.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();

                if(usename.equals("Nga") && password.equals("nga123")) {
                    Toast.makeText(MainActivity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    // NẾU CÓ CHECKBOX
                    if(cbRemember.isChecked()) {
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("taikhoan", usename);
                        editor.putString("matkhau", password);
                        editor.putBoolean("checked", true);
                        editor.commit();
                    } else {
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.remove("taikhoan");
                        editor.remove("matkhau");
                        editor.remove("checked");
                        editor.commit();
                    }

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            startActivity(new Intent(MainActivity.this,ListItem.class));
                        }
                    },10);
                }
                else {
                    Toast.makeText(MainActivity.this, "Đăng nhập lỗi", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void Anhxa() {
        btnXacNhan =(Button) findViewById(R.id.buttonXacNhan);
        edtUseName = (EditText) findViewById(R.id.edittextUseName);
        edtPassword = (EditText) findViewById(R.id.editTextPassword);
        cbRemember = (CheckBox) findViewById(R.id.checkBoxRemember);
    }

}