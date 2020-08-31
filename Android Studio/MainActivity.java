package gmit.com.caloriecam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private TextView Welcome;
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private ImageView Logo;
    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Welcome = (TextView)findViewById(R.id.welcome);
        Name = (EditText)findViewById(R.id.eName);
        Password = (EditText)findViewById(R.id.ePassword);
        Info = (TextView)findViewById(R.id.info);
        Login = (Button)findViewById(R.id.buttonLogin);
        Logo = (ImageView)findViewById(R.id.cclogo);

        Info.setText("Number of attempts remaining: 3");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

    }

    private void validate(String userName, String userPassword){
        if((userName.equals("Ryan")) && (userPassword.equals("5555"))){
            Intent intent = new Intent(MainActivity.this, Features.class);
            startActivity(intent);
        }else{
            counter--;

            Info.setText("Number of attempts remaining: " + String.valueOf(counter));

            if(counter == 0){
                Login.setEnabled(false);
            }
        }
    }


}
