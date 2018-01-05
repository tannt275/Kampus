package kampus.vn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<EarthQuake> {

    public EarthquakeAdapter(@NonNull Context context, @NonNull List<EarthQuake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rootView = convertView;
        if (rootView == null){
            rootView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }

        EarthQuake currentEarthQuake = getItem(position);

        TextView magnitude = rootView.findViewById(R.id.magnitude);
        TextView location = rootView.findViewById(R.id.location);
        TextView date = rootView.findViewById(R.id.date);

        //Bind data from View to each item
        magnitude.setText(currentEarthQuake.getMagnitude());
        location.setText(currentEarthQuake.getLocation());
        date.setText(currentEarthQuake.getDate());
        return rootView;
    }
}
