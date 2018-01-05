package kampus.vn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView);

        ArrayList<String> objects = new ArrayList<>();
        objects.add("Ha Dong");
        objects.add("Hoa Binh");
        objects.add("Nghe An");
        objects.add("Hai Duong");
        objects.add("Ha Tinh");
        objects.add("Nha Trang");
        objects.add("Bac Giang");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, objects);
        listView.setAdapter(adapter);
    }
}
