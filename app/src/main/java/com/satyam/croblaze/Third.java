package com.satyam.croblaze;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Third extends AppCompatActivity {


    Button register,login;
    EditText phone,password2,name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        register=findViewById(R.id.registerbutton);
        login = findViewById(R.id.login);
        phone=findViewById(R.id.phone);
        password2=findViewById(R.id.password2);
        name=findViewById(R.id.name);

        //to hide the login

        login.setVisibility(View.GONE);
        register.setText("REGISTER");


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (name.getText().toString().isEmpty()||phone.getText().toString().isEmpty()||password2.getText().toString().isEmpty())
                {

                    Toast.makeText(Third.this, "Please fill all the details", Toast.LENGTH_SHORT).show();
                }

                else {

                    register();
                }
            }
        });
    }

    private void register() {

        String url="https://searchkero.com/A_croblaze/register.php";


    }
}
