package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ToggleButton;

public class HomeFragment extends Fragment {
	private ToggleButton tbSi,tbNo, tbU, tbCasa, tbCancha, tbBar;
	private int preg1, preg2;
	public HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        
        tbNo		= (ToggleButton) rootView.findViewById(R.id.ToggleButton01);
        tbNo.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					
					tbNo.setChecked(true);
					if(tbU.isChecked())
						tbU.setChecked(false);
					if(tbSi.isChecked())
						tbSi.setChecked(false);			
				
			}
        	
        });
        tbSi		= (ToggleButton) rootView.findViewById(R.id.ToggleButton02);
        tbSi.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
					tbNo.setChecked(false);
					tbU.setChecked(false);
					tbSi.setChecked(true);			
				
			}
        	
        });
        tbU			= (ToggleButton) rootView.findViewById(R.id.ToggleButton03);
        tbU.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
					tbNo.setChecked(false);
					tbU.setChecked(true);
					tbSi.setChecked(false);			
				
			}
        	
        });
        tbCasa		= (ToggleButton) rootView.findViewById(R.id.ToggleButton06);
        tbCasa.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
					tbCasa.setChecked(true);
					tbCancha.setChecked(false);
					tbBar.setChecked(false);			
				
			}
        	
        });
        tbCancha	= (ToggleButton) rootView.findViewById(R.id.ToggleButton05);
        tbCancha.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
					tbCasa.setChecked(false);
					tbCancha.setChecked(true);
					tbBar.setChecked(false);			
				
			}
        	
        });
        tbBar		= (ToggleButton) rootView.findViewById(R.id.ToggleButton04); 
        tbBar.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
					tbCasa.setChecked(false);
					tbCancha.setChecked(false);
					tbBar.setChecked(true);			
				
			}
        	
        });
        
        
        return rootView;
    }
	
	
	
	
}
