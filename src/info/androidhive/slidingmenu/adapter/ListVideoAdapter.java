package info.androidhive.slidingmenu.adapter;


import info.androidhive.slidingmenu.AsilovivimosActivity;
import info.androidhive.slidingmenu.CameraActivity;
import info.androidhive.slidingmenu.MainActivity;
import info.androidhive.slidingmenu.R;
import info.androidhive.slidingmenu.WhatsHotFragment;
import info.androidhive.slidingmenu.model.ListVideosItem;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

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
		
		final int p = position;
		TextView titulo =(TextView) rowView.findViewById(R.id.itemListTitle);
		TextView subtitulo = (TextView) rowView.findViewById(R.id.txtItemTipo);
		preview = (ImageView) rowView.findViewById(R.id.VideoListPrev);
		ToggleButton tb = (ToggleButton)rowView.findViewById(R.id.btnItemState);
		tb.setOnClickListener(new OnClickListener(){
        	

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
//				Fragment f = new HomeFragment();
//				FragmentManager fragmentManager = getSupportFragmentManager();
//				fragmentManager.beginTransaction()
//						.replace(R.id.frame_container, f).commit();
				Intent i = new Intent(getContext().getApplicationContext(), MainActivity.class);
				i.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
				i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				getContext().startActivity(i);
			}
        });
		Button play = (Button)rowView.findViewById(R.id.btn_listPlay);
		play.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getContext().getApplicationContext(), AsilovivimosActivity.class);
				i.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
				i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				i.putExtra("P", String.valueOf(p));
				getContext().startActivity(i);
			}
			
		});
		
		
		
		String estado = itemsArrayList.get(position).getEstado();
		titulo.setText(itemsArrayList.get(position).getTitulo());
		
		if(estado.compareTo("1")==0){
			subtitulo.setText("Llegada");
			tb.setBackgroundDrawable(rowView.getResources().getDrawable(R.drawable.upload_red));	
			preview.setImageResource(R.drawable.thumb1);
			}
		if(estado.compareTo("2")==0){
			subtitulo.setText("22:30");
			tb.setBackgroundDrawable(rowView.getResources().getDrawable(R.drawable.upload_bar));
			preview.setImageResource(R.drawable.thumb2);			
		}
		if(estado.compareTo("3")==0){
			subtitulo.setText("23:47");
			preview.setImageResource(R.drawable.thumb3);
		}
		if(estado.compareTo("4")==0){
			subtitulo.setText("23:15");
			tb.setBackgroundDrawable(rowView.getResources().getDrawable(R.drawable.upload_red));
			preview.setImageResource(R.drawable.thumb4);
		}
		if(estado.compareTo("5")==0){
			subtitulo.setText("Salida");
			preview.setImageResource(R.drawable.thumb5);
			
		}
		
		return rowView;
		
	}

}
