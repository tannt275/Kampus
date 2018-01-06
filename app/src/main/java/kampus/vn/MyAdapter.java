package kampus.vn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by TanNT on 1/6/18.
 */

public class MyAdapter extends ArrayAdapter<EarthQuake> {

    public MyAdapter(@NonNull Context context, @NonNull List<EarthQuake> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rootView = convertView;
        Context context = parent.getContext();
        if (rootView == null) {
            rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        }

        EarthQuake currentEarthQuake = getItem(position);
        TextView mag = rootView.findViewById(R.id.magnitude);
        TextView locationTop = rootView.findViewById(R.id.locationTop);
        TextView locationBottom = rootView.findViewById(R.id.locationBottom);
        TextView timeTop = rootView.findViewById(R.id.timeTop);
        TextView timeBottom = rootView.findViewById(R.id.timeBottom);

        locationTop.setText(currentEarthQuake.getLocationTop());
        locationBottom.setText(currentEarthQuake.getLocationBottom());
        timeTop.setText(currentEarthQuake.getTimeTop());
        timeBottom.setText(currentEarthQuake.getTimeBottom());

        double magValue = currentEarthQuake.getMagnatide();
        mag.setText(String.valueOf(magValue));

        if (magValue >= 5) {
            mag.setTextColor(context.getResources().getColor(R.color.colorRed));
            mag.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.mag_red));
        } else if (magValue >= 3) {
            mag.setTextColor(context.getResources().getColor(R.color.colorBlue));
            mag.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.mag_blue));
        } else {
            mag.setTextColor(context.getResources().getColor(R.color.colorGreen));
            mag.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.mag_green));
        }
        return rootView;
    }
}
