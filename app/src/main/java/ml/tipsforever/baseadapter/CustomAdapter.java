package ml.tipsforever.baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kawsar on 3/1/2018.
 */

class CustomAdapter extends BaseAdapter{
    Context context;
    String[] countryName;
    int[] flags;
    private LayoutInflater inflater;

    public CustomAdapter(Context context, String[] countryName, int[] flags) {
        this.context = context;
        this.countryName = countryName;
        this.flags = flags;
    }

    @Override
    public int getCount() {
        return countryName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null){
            inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample_view,parent,false);

        }
        ImageView imageView = convertView.findViewById(R.id.imageId);
        TextView textView = convertView.findViewById(R.id.textCountryNameId);
        TextView textView1 = convertView.findViewById(R.id.textDescripId);

        imageView.setImageResource(flags[position]);
        textView.setText(countryName[position]);
        return convertView;
    }
}
