package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class FindPeopleFragment extends Fragment {
	private Button salir;
	public FindPeopleFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_find_people, container, false);
        
        salir = (Button)rootView.findViewById(R.id.legal_salir);
        salir.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
//				Intent i = new Intent(getActivity().getApplicationContext(),MainActivity.class);
//				i.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
//				startActivity(i);
//				
				FragmentManager fragmentManager = getFragmentManager();
				fragmentManager.beginTransaction()
						.replace(R.id.frame_container, new HomeFragment()).commit();
			}
        	
        });
        return rootView;
    }
}
