package com.khair.textreappter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextText,editTextText2, textView;
    Button button;


    String string="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextText=findViewById(R.id.editTextText);
        editTextText2=findViewById(R.id.editTextText2);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 String inpurt=editTextText.getText().toString();
                 String stringe=editTextText2.getText().toString();
                textView.setText("");
                 if (editTextText.length()>0&&editTextText2.length()>0){

                     int tst=Integer.parseInt(stringe);
                     for (int x=1;x<=tst;x++){
                      string=string+inpurt+"\n";
                     }

                     textView.setText(string);




                 }else {
                     editTextText.setError("Please enter a number");
                     editTextText2.setError("Please enter a number");
                 }



            }
        });








    }
}