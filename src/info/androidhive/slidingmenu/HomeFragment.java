package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.app.FragmentManager;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class HomeFragment extends Fragment {
	private ToggleButton tbSi,tbNo, tbU, tbCasa, tbCancha, tbBar, tbCrowd;
	private TextView p1,p2,subir;
	private Button btn_subir;
	public HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        RelativeLayout bg = (RelativeLayout)rootView.findViewById(R.id.home_fragment_background);
        bg.setBackgroundResource(R.drawable.anim_list_homebg);
        AnimationDrawable aniFrame = (AnimationDrawable) bg.getBackground();
        aniFrame.start();
        
        btn_subir = (Button)rootView.findViewById(R.id.buttonUploadHome);
        btn_subir.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					
				FragmentManager fragmentManager = getFragmentManager();
				fragmentManager.beginTransaction()
						.replace(R.id.frame_container, new WhatsHotFragment()).commit();	
				Toast.makeText(getActivity(), "Subiendo Video", Toast.LENGTH_LONG).show();
				
			}
        	
        });
        
        p1 = (TextView)rootView.findViewById(R.id.txt_home_p1);
        p2 = (TextView)rootView.findViewById(R.id.txt_home_p2);
        subir = (TextView)rootView.findViewById(R.id.txt_home_subir);
        
        //--Typeface TextView
        p1.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "din_regular.ttf"));
        p2.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "din_regular.ttf"));
        subir.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "bauhaus_93.ttf"));
        
        
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
					tbCrowd.setChecked(false);
				
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
					tbCrowd.setChecked(false);
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
					tbCrowd.setChecked(false);
				
			}
        	
        });
        tbCrowd		= (ToggleButton) rootView.findViewById(R.id.ToggleButton07);
        tbCrowd.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					tbCrowd.setChecked(true);
					tbCasa.setChecked(false);
					tbCancha.setChecked(false);
					tbBar.setChecked(false);			
				
			}
        	
        });
        
        
        return rootView;
    }
	
	
	
	
}
