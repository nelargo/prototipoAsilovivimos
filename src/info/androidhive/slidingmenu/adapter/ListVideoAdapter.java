package info.androidhive.slidingmenu.adapter;

import java.util.ArrayList;
import info.androidhive.slidingmenu.R;
import info.androidhive.slidingmenu.model.ListVideosItem;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListVideoAdapter extends ArrayAdapter<ListVideosItem> {

	private final Context context;
	private final ArrayList<ListVideosItem> itemsArrayList;
	public ImageView preview;
	
	public ListVideoAdapter(Context context, ArrayList<ListVideosItem> itemsArray){
		super(context, R.layout.item_list, itemsArray);
		this.context = context;
		this.itemsArrayList = itemsArray;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent){
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		View rowView = inflater.inflate(R.layout.item_list, parent, false);
		
		TextView titulo =(TextView) rowView.findViewById(R.id.itemListTitle);
		preview = (ImageView) rowView.findViewById(R.id.VideoListPrev);
		
		titulo.setText(itemsArrayList.get(position).getTitulo());
		if(position == 0)
			preview.setImageResource(R.drawable.bg_camera);
		if(position == 1)
			preview.setImageResource(R.drawable.bg_camera);
		if(position == 2)
			preview.setImageResource(R.drawable.bg_camera);
		if(position == 3)
			preview.setImageResource(R.drawable.bg_camera);
		if(position == 4)
			preview.setImageResource(R.drawable.bg_camera);
		
		return rowView;
		
	}

}
