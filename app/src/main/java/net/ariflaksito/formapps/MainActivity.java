package net.ariflaksito.formapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Object View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputName = (EditText) findViewById(R.id_input_name);
        EditText inputEmail = (EditText) findViewById(R.id_input_email);
        EditText inputPhone = (EditText) findViewById(R.id_input_phone);
        EditText inputPassword = (EditText) findViewById(R.id_input_pwd);

        Button btnSave = (Button) findViewById(R.id.in_button_save);
        btnSave.setOnClickListener(new_view.OnClickListener());
            @Override
            public void onClick(View v){
                // kode untuk aksi dari klik button
            
            Log.d("--nama--" , inputName.getText().toString());
            Log.d("--email--" , inputEmail.getText().toString());
            Log.d("--phone--" , inputPhone.getText().toString());
            Log.d("--password--" , inputPassword.getText().toString()) ;       
        }
    });
}
        }