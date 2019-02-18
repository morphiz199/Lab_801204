package th.ac.su.ict.fancycalculater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.shashank.sony.fancytoastlib.FancyToast;

public class MainActivity extends AppCompatActivity {

    life.sabujak.roundedbutton.RoundedButton roundedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roundedButton = findViewById(R.id.roundedButton);
        roundedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FancyToast.makeText(MainActivity.this,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.ERROR,true).show();
            }
        });



    }
}
