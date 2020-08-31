package gmit.com.caloriecam;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Banana extends AppCompatActivity {

    ListView listView;
    ImageView banana;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banana);

        banana = (ImageView)findViewById(R.id.banana1);
        listView =(ListView)findViewById(R.id.listview3);
        final ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Banana");
        arrayList.add("Per 100g");
        arrayList.add("Calories: 90kcal");
        arrayList.add("Fats: 0.3g");
        arrayList.add("Carbohydrates: 22.8g");
        arrayList.add("Protein: 1.1g");


        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);


    }
}