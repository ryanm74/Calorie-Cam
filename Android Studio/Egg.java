package gmit.com.caloriecam;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Egg extends AppCompatActivity {

    ListView listView;
    ImageView egg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egg);

        egg = (ImageView)findViewById(R.id.egg1);
        listView =(ListView)findViewById(R.id.listview4);
        final ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Egg");
        arrayList.add("Per Egg");
        arrayList.add("Calories: 70kcal");
        arrayList.add("Fats: 5g");
        arrayList.add("Carbohydrates: trace");
        arrayList.add("Protein: 7g");


        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);


    }
}