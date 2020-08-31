package gmit.com.caloriecam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Features extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_features);

        listView =(ListView)findViewById(R.id.listview);

        final ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("About");
        arrayList.add("Object Detection");
        arrayList.add("Label Information");
        arrayList.add("Camera");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                {
                    Intent intent = new Intent(Features.this,AboutCalorieCam.class);
                    startActivity(intent);
                }
                if (position==1)
                {
                    Intent intent = new Intent(Features.this,DetectorActivity.class);
                    startActivity(intent);
                }
                if (position==2)
                {
                    Intent intent = new Intent(Features.this,LabelInfo.class);
                    startActivity(intent);
                }

                if (position==3)
                {
                    Intent intent = new Intent(Features.this,Camera.class);
                    startActivity(intent);
                }

            }
        });
        }
}