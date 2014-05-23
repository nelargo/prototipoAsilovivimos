package info.androidhive.slidingmenu;

import java.io.File;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Window;
import android.widget.ListView;

public class ListActivity extends Activity{
	private ListView lv;
	private ArrayList<ListVideosItem> items;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Activity sin parte superior
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		
		setContentView(R.layout.list_activity);
		items = new ArrayList<ListVideosItem>();
		
		
//		listarVideos();
		ListVideosItem a = new ListVideosItem("Chile vs España 22:30", "0");
		items.add(a);
		items.add(a);
		items.add(a);
		items.add(a);
		items.add(a);
		items.add(a);
		items.add(a);
		a = new ListVideosItem("Chile vs Australia 22:30", "0");
		items.add(a);
		items.add(a);
		items.add(a);
		items.add(a);
		items.add(a);
		items.add(a);
		items.add(a);
		items.add(a);
		
		lv = (ListView)findViewById(R.id.whlistview);
    	ListVideoAdapter lva = new ListVideoAdapter(this, items);
    	lv.setVelocityScale(0.005f);
//    	lv.setFriction(10f);
    	lv.setAdapter(lva);

    	
    	
    	//lv.setOnItemClickListener(new OnItemClickListener);
		
	}
	
	public void listarVideos(){
		
//		File path = new File(Environment.getExternalStorageDirectory(),"/ASILOVIVIMOS");
		
//		ListVideosItem a = new ListVideosItem("Chile vs España 22:30", "0");
//		items.add(a);
//		items.add(a);
//		items.add(a);
//		items.add(a);
//		items.add(a);
//		items.add(a);
//		items.add(a);
//		items.add(a);
//		items.add(a);
//		items.add(a);
//		items.add(a);
//		items.add(a);
//		items.add(a);
//		items.add(a);
//		items.add(a);
	}
}
