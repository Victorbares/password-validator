package bares.vi.csci3130_a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mButton1;
    private EditText mText1;
    private TextView mTextU;
    private Validator Valid = new Validator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1= findViewById(R.id.button1);
        mText1 =  findViewById(R.id.editText1);
        mTextU = findViewById(R.id.textView1);

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Valid.validate(mText1.getText().toString()) == 0)) {
                    mTextU.setText("Your password is saved");
                }
                else{
                    mTextU.setText("You can't submit your password, becausse he is not strong enough.");
                }
            }
        });

        mText1.addTextChangedListener(new TextWatcher()  {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(Valid.validate(mText1.getText().toString()) == 0) {
                    mTextU.setText("Your password is good, you can submit it");
                }
                else {
                    mTextU.setText("Your password is not strong enough");
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}
