package gmit.com.caloriecam;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Avocado extends AppCompatActivity {

    ListView listView;
    ImageView avocado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avocado);

        avocado = (ImageView)findViewById(R.id.avocado1);
        listView =(ListView)findViewById(R.id.listview5);
        final ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Avocado");
        arrayList.add("Per 100g");
        arrayList.add("Calories: 240kcal");
        arrayList.add("Fats: 22g");
        arrayList.add("Carbohydrates: 2.6");
        arrayList.add("Protein: 2.4g");


        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);


    }
}