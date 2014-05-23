package info.androidhive.slidingmenu;

import android.app.ActionBar;
import android.app.Fragment;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class PhotosFragment extends Fragment {
	
	public PhotosFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		//getActivity().requestWindowFeature(Window.FEATURE_ACTION_BAR_OVERLAY);

		getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        View rootView = inflater.inflate(R.layout.fragment_photos, container, false);
        
        ActionBar ab = getActivity().getActionBar();
        ab.hide();
        //ab.setBackgroundDrawable(getResources().getDrawable(R.drawable.abbg_asilovivimos));
        
       
        return rootView;
    }
}
