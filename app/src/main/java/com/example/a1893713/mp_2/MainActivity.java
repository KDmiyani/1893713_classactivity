package com.example.a1893713.mp_2;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

Button sub,clos;
EditText firstname,lastname,txtemail,txtpass;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstname = findViewById(R.id.fname);
        lastname = findViewById(R.id.lname);
        txtemail = findViewById(R.id.email);
        txtpass = findViewById(R.id.pass);
        sub = findViewById(R.id.submit);
        clos = findViewById(R.id.close);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   Toast.makeText(getApplicationContext(), firstname.getText(),Toast.LENGTH_SHORT).show();
                Snackbar snack = Snackbar.make(findViewById(R.id.vvww), "Registration Done", Snackbar.LENGTH_LONG).setAction("undo", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "Toast", Toast.LENGTH_LONG).show();
                    }
                });
                snack.show();
            }

             });

clos.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        firstname.setText("");
        lastname.setText("");
        txtemail.setText("");
        txtpass.setText("");




    }
});
}}