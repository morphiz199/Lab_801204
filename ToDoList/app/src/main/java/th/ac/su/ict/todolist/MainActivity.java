package th.ac.su.ict.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText  edtInput;
    Button btnAdd;
    ListView listview;

    ArrayList<String> toDoItems;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Inflate

        listview = findViewById(R.id.listview);
        edtInput = findViewById(R.id.edtInput);
        btnAdd = findViewById(R.id.btnAdd);

        toDoItems = new ArrayList<>(); //Instantiate
        arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,toDoItems);

        listview.setAdapter(arrayAdapter);

//        for (int i =0;i<30;i++){
//            toDoItems.add("hello"+i);
//        }
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = edtInput.getText().toString();
                TextUtils.isEmpty(item);
                if (!TextUtils.isEmpty(item)) {
                    toDoItems.add(0, item);
                    arrayAdapter.notifyDataSetChanged();
                    edtInput.setText("");
               }

            }
        });


    }
}
