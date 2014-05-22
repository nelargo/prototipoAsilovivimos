package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ToggleButton;

public class PagesFragment extends Fragment {
	ToggleButton tbFacebook,tbGoogle, tbTwitter;
	public PagesFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_pages, container, false);
        tbFacebook = (ToggleButton)rootView.findViewById(R.id.tbChatFacebook);
        tbFacebook.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tbFacebook.setChecked(true);
				tbGoogle.setChecked(false);
				tbTwitter.setChecked(false);
			}
        	
        }) ;
        tbGoogle=(ToggleButton)rootView.findViewById(R.id.tbChatGoogle);
        tbGoogle.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tbFacebook.setChecked(false);
				tbGoogle.setChecked(true);
				tbTwitter.setChecked(false);
			}
        	
        }) ;
        tbTwitter=(ToggleButton)rootView.findViewById(R.id.tbChatTwitter);
        tbTwitter.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tbFacebook.setChecked(false);
				tbGoogle.setChecked(false);
				tbTwitter.setChecked(true);
			}
        	
        }) ;
        		
        		
        return rootView;
    }
}
