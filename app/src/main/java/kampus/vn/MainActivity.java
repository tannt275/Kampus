package kampus.vn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ArrayList<EarthQuake> list = QueryUtils.extractEarthquakes();
        ArrayList<EarthQuake> list = QueryUtils.extractEarthquakes();

        //Find ListView from layout
        ListView listView = findViewById(R.id.listView);
        //Create a Adapter
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, list);
        //Set adapter for List
        listView.setAdapter(adapter);

        //Now and see result
    }
}
