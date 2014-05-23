package info.androidhive.slidingmenu;

import java.util.ArrayList;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class WhatsHotFragment extends Fragment {

	private ListView lv;
	private ArrayList<ListVideosItem> items;
	public WhatsHotFragment(){}
	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
    		Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_whats_hot, container, false);
        items = new ArrayList<ListVideosItem>();
        ListVideosItem a = new ListVideosItem("Chile vs España 22:30", "0");
		items.add(a);
		items.add(a);
		items.add(a);
		items.add(a);
		items.add(a);
		items.add(a);
		items.add(a);
		
		lv = (ListView)rootView.findViewById(R.id.whlistview);
    	ListVideoAdapter lva = new ListVideoAdapter(this.getActivity().getApplicationContext(), items);
    	lv.setAdapter(lva);
        
        
        return rootView;
    }
}
