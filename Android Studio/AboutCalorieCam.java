package gmit.com.caloriecam;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutCalorieCam extends AppCompatActivity {

    private TextView Heading;
    private TextView About;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_calorie_cam);

        Heading = (TextView)findViewById(R.id.heading1);
        About = (TextView)findViewById(R.id.about1);
    }
}