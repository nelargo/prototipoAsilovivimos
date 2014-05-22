package info.androidhive.slidingmenu;

import java.util.ArrayList;

import info.androidhive.slidingmenu.adapter.ListVideoAdapter;
import info.androidhive.slidingmenu.model.ListVideosItem;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ListView;

public class ListActivity extends Activity{
	private ListView lv;
	private ArrayList<ListVideosItem> items;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Activity sin parte superior
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.list_activity);
		items.add(new ListVideosItem("Chile vs España 22:30", "asd"));
		items.add(new ListVideosItem("Chile vs España 22:30", "asd"));
		items.add(new ListVideosItem("Chile vs España 22:30", "asd"));
		items.add(new ListVideosItem("Chile vs España 22:30", "asd"));
		items.add(new ListVideosItem("Chile vs España 22:30", "asd"));
		lv = (ListView)findViewById(R.id.listView1);
        ListVideoAdapter lva = new ListVideoAdapter(this, items);
        lv.setAdapter(lva);
		
	}
}
