package info.androidhive.slidingmenu;

import java.util.ArrayList;

import info.androidhive.slidingmenu.adapter.ListVideoAdapter;
import info.androidhive.slidingmenu.model.ListVideosItem;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class WhatsHotFragment extends Fragment {
	
	public WhatsHotFragment(){}
	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_whats_hot, container, false);
        
        
        
        return rootView;
    }
}
