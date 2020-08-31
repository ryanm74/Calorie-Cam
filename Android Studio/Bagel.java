package gmit.com.caloriecam;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Bagel extends AppCompatActivity {

    ListView listView;
    ImageView bagel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagel);

        bagel = (ImageView)findViewById(R.id.bagel1);
        listView =(ListView)findViewById(R.id.listview1);
        final ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Bagel");
        arrayList.add("Per 100g");
        arrayList.add("Calories: 225kcal");
        arrayList.add("Fats: 2.5g");
        arrayList.add("Carbohydrates: 40.3g");
        arrayList.add("Protein: 8.7g");


        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);


    }
}