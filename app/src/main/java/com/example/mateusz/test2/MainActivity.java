package com.example.mateusz.test2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button acceptButton;
     EditText nameTextField;

    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTextField = (EditText) findViewById(R.id.nameTextField);

        acceptButton = (Button) findViewById(R.id.acceptButton);
        acceptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                userName = String.valueOf(nameTextField.getText());
                if(!userName.isEmpty())
                {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("userName",userName);
                    startActivity(intent);
                }
            }
        });
    }
}
