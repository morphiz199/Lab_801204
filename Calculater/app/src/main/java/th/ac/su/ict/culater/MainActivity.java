package th.ac.su.ict.culater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Edittext1,Edittext2;
    TextView text1;
    Button btn1,btn2;
    RadioButton rbPlus;
    RadioGroup rgOperator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Edittext1 = findViewById(R.id.Edittext1);
        Edittext2 = findViewById(R.id.Edittext2);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        text1 = findViewById(R.id.text1);
        rbPlus = findViewById(R.id.rbPlus);
        rgOperator = findViewById(R.id.rgOperator);

        btn2.setOnClickListener(listener);
        btn1.setOnClickListener(listener);
/*
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double e1 = Double.parseDouble(Edittext1.getText().toString());
                Double e2 = Double.parseDouble(Edittext2.getText().toString());
                Double result = e1+e2;

//                Log.d("calculation", "result ="+result);
//                Toast.makeText(MainActivity.this,result+result,Toast.LENGTH_LONG).show();

                text1.setText(result.toString());
            }
        });
        */


    }
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (v == btn2){
                Toast.makeText(MainActivity.this,"click",Toast.LENGTH_LONG).show();
                text1.setText("0");
                Edittext1.setText("");
                Edittext2.setText("");

            }
            if (v == btn1){
                Toast.makeText(MainActivity.this,"click",Toast.LENGTH_LONG).show();
                int e1 = Integer.parseInt(Edittext1.getText().toString());
                int e2 = Integer.parseInt(Edittext2.getText().toString());
                int result = 0;

//                if (rbPlus.isChecked()){
//                    result = e1+e2;
//                }
                switch (rgOperator.getCheckedRadioButtonId()){
                    case R.id.rbPlus:
                        result = e1+e2;
                        break;
                    case R.id.rbMinus:
                        result = e1-e2;
                        break;
                    case R.id.rbMultiply:
                        result = e1*e2;
                        break;
                    case R.id.rbDivide:
                        result = e1/e2;
                        break;
                }
                text1.setText("="+result);
            }

        }
    };
}
