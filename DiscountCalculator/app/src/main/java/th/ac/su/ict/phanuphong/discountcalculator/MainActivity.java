package th.ac.su.ict.phanuphong.discountcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtPriceOriginal,edtPercentOff;
    Button btnCalculate;
    TextView tvPrice;
    CheckBox cbTax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtPriceOriginal = findViewById(R.id.edtPriceOriginal);
        edtPercentOff = findViewById(R.id.edtPercentOff);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvPrice = findViewById(R.id.tvPrice);
        cbTax = findViewById(R.id.cbTax);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float PriceOriginal = 0;
                PriceOriginal = Float.parseFloat(edtPriceOriginal.getText().toString());
                float PercentOff = 0;
                PercentOff = Float.parseFloat(edtPercentOff.getText().toString());
                float result1 = PriceOriginal*(PercentOff/100);

                float resultPice = 0;
                float Tax = 0;


                if (cbTax.isChecked()){
                    resultPice = PriceOriginal-result1;
                    Tax = (float) 0.07*resultPice;
                    resultPice +=Tax;
                }
                else {
                    resultPice = PriceOriginal-result1;
                }
                tvPrice.setText(Float.toString(resultPice));
            }
        });

    }
}
