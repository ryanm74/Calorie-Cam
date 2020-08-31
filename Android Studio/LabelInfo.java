package gmit.com.caloriecam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class LabelInfo extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_label_info);

        listView =(ListView)findViewById(R.id.listview2);

        final ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Bagel");
        arrayList.add("Banana");
        arrayList.add("Egg");
        arrayList.add("Avocado");
        arrayList.add("Apple");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                {
                    Intent intent = new Intent(LabelInfo.this,Bagel.class);
                    startActivity(intent);
                }
                if (position==1)
                {
                    Intent intent = new Intent(LabelInfo.this,Banana.class);
                    startActivity(intent);
                }
                if (position==2)
                {
                    Intent intent = new Intent(LabelInfo.this,Egg.class);
                    startActivity(intent);
                }
                if (position==3)
                {
                    Intent intent = new Intent(LabelInfo.this,Avocado.class);
                    startActivity(intent);
                }
                if (position==4)
                {
                    Intent intent = new Intent(LabelInfo.this,Apple.class);
                    startActivity(intent);
                }
            }
        });
    }
}