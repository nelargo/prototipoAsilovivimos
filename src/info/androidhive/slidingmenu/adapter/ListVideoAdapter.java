package info.androidhive.slidingmenu;

import java.util.ArrayList;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ListVideoAdapter extends ArrayAdapter<ListVideosItem> {

	private final Context context;
	private final ArrayList<ListVideosItem> itemsArrayList;
	public ImageView preview;
	private int cont = -1;
	
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
		ToggleButton tb = (ToggleButton)rowView.findViewById(R.id.btnItemState);
		tb.setOnClickListener(new OnClickListener(){
        	

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Fragment f = new HomeFragment();
			}
        });
		String estado = itemsArrayList.get(position).getEstado();
		titulo.setText(itemsArrayList.get(position).getTitulo());
		
		if(estado.compareTo("1")==0){
			tb.setBackgroundDrawable(rowView.getResources().getDrawable(R.drawable.upload_red));			
			}
		if(estado.compareTo("2")==0){
			tb.setBackgroundDrawable(rowView.getResources().getDrawable(R.drawable.upload_bar));
			preview.setImageResource(R.drawable.cocacola);			
		}
		if(estado.compareTo("3")==0){
			preview.setImageResource(R.drawable.abbg1);
		}
		if(estado.compareTo("4")==0){
			preview.setImageResource(R.drawable.bg_camera);
		}
		if(estado.compareTo("5")==0){
			preview.setImageResource(R.drawable.bg_camera);
			
		}
		
		return rowView;
		
	}

}
