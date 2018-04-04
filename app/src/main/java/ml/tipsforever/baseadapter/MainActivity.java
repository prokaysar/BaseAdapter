package ml.tipsforever.baseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    String[] cname;
    int[] flags = {
            R.drawable.bangladesh,
            R.drawable.india,
            R.drawable.pakistan
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);
        cname = getResources().getStringArray(R.array.contryName);

        CustomAdapter adapter = new CustomAdapter(this,cname,flags);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = cname[position];
                Toast.makeText(MainActivity.this,"Hello "+name,Toast.LENGTH_LONG).show();
            }
        });

    }
}
