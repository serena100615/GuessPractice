package guess.fju.com.guesspractice;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class SecretNumber extends AppCompatActivity {
    Random ran = new Random();
    int n = ran.nextInt(100)+1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret_number);
    }
    public void guess(View view){
        TextView txt_front = (TextView) findViewById(R.id.txt_front);
        TextView txt_back = (TextView) findViewById(R.id.txt_back);
        EditText ed_enter = (EditText) findViewById(R.id.ed_enter);
        int number = Integer.parseInt(ed_enter.getText().toString());

            if (number < n) {
                txt_front.setText(Integer.toString(number));
            } else if (number > n) {
                txt_back.setText(Integer.toString(number));
            } else {
                new AlertDialog.Builder(this)
                        .setMessage(R.string.right)
                        .setPositiveButton(R.string.ok, null)
                        .show();

            }

    }
}
