package com.example.parth.basicdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    private DatabseHelper mydb;
   /* EditText Name, Add;
    Button save;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mydb = new DatabseHelper(this);
    }
}

       /* Name = (EditText) findViewById(R.id.edtname);
        Add = (EditText) findViewById(R.id.edtadd);

        save = (Button) findViewById(R.id.btnsave);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SaveData();
            }
        });
    }

    public void SaveData() {
        String edt1 = Name.getText().toString();
        String edt2 = Add.getText().toString();

        Boolean result = mydb.InsertData(edt1, edt2);

        if (result == true) {

            Toast.makeText(MainActivity.this, "data inserted.....", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "data not inserted.....", Toast.LENGTH_SHORT).show();

        }
    }
}*/
