package kampus.vn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
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
        TextView time = rootView.findViewById(R.id.time);

        //Bind data from View to each item
        magnitude.setText(currentEarthQuake.getMagnitude());
        location.setText(currentEarthQuake.getLocation());

        Date dateObject = new Date(currentEarthQuake.getTimeInMilliseconds());
        date.setText(formatDate(dateObject));
        time.setText(formatTime(dateObject));
        return rootView;
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}
