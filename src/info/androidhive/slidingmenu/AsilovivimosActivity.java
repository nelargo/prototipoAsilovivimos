package info.androidhive.slidingmenu;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class AsilovivimosActivity extends Activity{
	private ImageView fondo;
	private Button play, menu;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Activity sin parte superior
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.fragment_photos);
		
		fondo = (ImageView)findViewById(R.id.reproductor_fondo);
		play = (Button)findViewById(R.id.reproductor_plays);
		menu = (Button)findViewById(R.id.legal_salir);
//		final String posicion = getIntent().getExtras().getString("P");
		
//		play.setOnClickListener(new OnClickListener(){
//			
//			@Override
//			public void onClick(View arg0) {
//				// TODO Auto-generated method stub
//				if(posicion != null){
//					
//					
//					String path = "";
//					
//					Toast.makeText(getApplicationContext(), posicion, Toast.LENGTH_LONG).show();
//					if(posicion.compareTo("0")==0){
//						path = Environment.getExternalStorageDirectory().getPath()+"/ASILOVIVIMOS/cancha.mp4";
//					}
//					else if(posicion.compareTo("1")==0){
//						path = Environment.getExternalStorageDirectory().getPath()+"ASILOVIVIMOS/cancha.mp4";
//					}
//					else if(posicion.compareTo("2")==0){
//						path = Environment.getExternalStorageDirectory().getPath()+"ASILOVIVIMOS/cancha.mp4";
//					}
//					else if(posicion.compareTo("3")==0){
//						path = Environment.getExternalStorageDirectory().getPath()+"ASILOVIVIMOS/cancha.mp4";
//					}
//					else if(posicion.compareTo("4")==0){
//						path = Environment.getExternalStorageDirectory().getPath()+"ASILOVIVIMOS/cancha.mp4";
//					}
//					else if(posicion.compareTo("5")==0){
//						path = Environment.getExternalStorageDirectory().getPath()+"ASILOVIVIMOS/cancha.mp4";
//					}
//					else if(posicion.compareTo("6")==0){
//						path = Environment.getExternalStorageDirectory().getPath()+"ASILOVIVIMOS/cancha.mp4";
//					}
//					
//					if(path.compareTo("") != 0){
//						VideoView vv = (VideoView)findViewById(R.id.reproductor_vv);
//						vv.setVideoPath(path);
//						vv.setMediaController(new MediaController(AsilovivimosActivity.this));
//						vv.start();
//						vv.requestFocus();
//						play.setVisibility(View.GONE);
//						fondo.setVisibility(View.GONE);
//					}
//					
//				}
//			}
//			
//		});
		
		menu.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AsilovivimosActivity.this.finish();
			}
			
		});
	}
}
