package info.androidhive.slidingmenu;

import info.androidhive.slidingmenu.adapter.ListVideoAdapter;
import info.androidhive.slidingmenu.model.ListVideosItem;

import java.util.ArrayList;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ToggleButton;

public class WhatsHotFragment extends Fragment {

	private ListView lv;
	private ArrayList<ListVideosItem> items;
	public WhatsHotFragment(){}
	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
    		Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_whats_hot, container, false);
        items = loadVideos();
        
        
		
		lv = (ListView)rootView.findViewById(R.id.whlistview);

    	ListVideoAdapter lva = new ListVideoAdapter(this.getActivity().getApplicationContext(), items);
    	lv.setFriction(0.01f);
    	lv.setVelocityScale(0.2f);
    	
    	lv.setAdapter(lva);
        
        
        return rootView;
    }
	
	public ArrayList<ListVideosItem> loadVideos(){
		ArrayList<ListVideosItem> i = new ArrayList<ListVideosItem>();
		ListVideosItem a = new ListVideosItem("Chile vs España", "1");
		ListVideosItem b = new ListVideosItem("Chile vs España", "2");
		ListVideosItem c = new ListVideosItem("Chile vs España", "3");
		ListVideosItem d = new ListVideosItem("Chile vs España", "4");
		ListVideosItem e = new ListVideosItem("Chile vs España", "5");
		
		for(int j = 0; j < 2; j++){
			i.add(a);
			i.add(b);
			i.add(c);
			i.add(d);
			i.add(e);
		}
		return i;
	}
}
