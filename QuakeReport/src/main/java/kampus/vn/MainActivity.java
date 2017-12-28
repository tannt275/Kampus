package kampus.vn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        //TODO add earthquake data for compatible with video


        ListView listView = findViewById(R.id.listView);
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);
        listView.setAdapter(adapter);
    }
}
