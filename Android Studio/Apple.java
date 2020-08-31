package gmit.com.caloriecam;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Apple extends AppCompatActivity {

    ListView listView;
    ImageView apple;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);


        apple = (ImageView)findViewById(R.id.apple1);
        listView =(ListView)findViewById(R.id.listview6);
        final ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Per medium apple(150g)");
        arrayList.add("Calories: 90kcal");
        arrayList.add("Fats: 0.8g");
        arrayList.add("Carbohydrates: 17.4g");
        arrayList.add("Protein: 0.9g");


        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);


    }
}