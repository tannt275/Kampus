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

        ArrayList<Earthquake> list = new ArrayList<>();

        list.add(new Earthquake("7.2","Ha Dong", "2017-11-06"));
        list.add(new Earthquake("5.2","Hoa Binh", "2017-10-26"));
        list.add(new Earthquake("3.1","Da Nang", "2017-11-12"));
        list.add(new Earthquake("1.9","Ha Noi", "2017-12-02"));
        list.add(new Earthquake("2.5","Hai Phong", "2017-11-16"));
        list.add(new Earthquake("4.5","Nghe An", "2017-11-15"));
        list.add(new Earthquake("1.4","Quang Tri", "2017-12-01"));

        //Find ListView from layout
        ListView listView = findViewById(R.id.listView);
        //Create a Adapter
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, list);
        //Set adapter for List
        listView.setAdapter(adapter);

        //Now and see result
    }
}
