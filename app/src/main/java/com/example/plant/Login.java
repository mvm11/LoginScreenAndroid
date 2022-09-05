package com.example.plant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button singUpButton;

    // Validaciones

    EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        singUpButton=(Button)findViewById(R.id.sing_up_login);

        singUpButton.setOnClickListener(this::onClick);

        //Validaciones
        editText1=(EditText)findViewById(R.id.textView3);

    }

    public void singIn(View view){
        if(validate()){
            Toast.makeText(this, "ingreso datos", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean validate(){
        boolean retorno = true;

        String emailField = editText1.getText().toString();
        if(emailField.isEmpty()){
            editText1.setError("El campo del email no puede estar vacío");
            retorno=false;
        }


        return retorno;
    }

    private void onClick(View view) {

        Intent intent = new Intent(Login.this, Registro.class);
        startActivity(intent);
    }
}