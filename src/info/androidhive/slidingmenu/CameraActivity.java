package info.androidhive.slidingmenu;


import java.io.File;
import java.io.IOException;

import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class CameraActivity extends Activity implements SurfaceHolder.Callback {
    private SurfaceHolder surfaceHolder;
    private SurfaceView surfaceView;
    public MediaRecorder mrec = new MediaRecorder();
    private Button startRecording = null;
    private Button rec, play, upload, menu;
    private Boolean recording = false;
    private ImageView fondo;
    private int state = 0;
    //private Button stopRecording = null;
    File video;
    private Camera mCamera;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_camera);
        
        Log.i(null , "Video starting");
        
        /** IMAGEN DE FONDO **/
        fondo = (ImageView)findViewById(R.id.camera_bg);
		fondo.setVisibility(View.VISIBLE);
		        
		/** SURFACE PARA MOSTRAR EL PREVIEW DE LA CAMARA**/
        surfaceView = (SurfaceView) findViewById(R.id.surface_camera);
        surfaceView.setVisibility(View.VISIBLE);        

        /** BOTONES DE LA VISTA **/
        play = (Button)findViewById(R.id.btnCameraPlay);
        play.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
        	
        });
        upload = (Button)findViewById(R.id.btnCameraSubir);
        upload.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent returnIntent = new Intent();
				returnIntent.putExtra("result","result");
				setResult(7,returnIntent);  //muestra la vista HOME
				CameraActivity.this.finish();
			}
        	
        });
        menu = (Button)findViewById(R.id.btnCameraMenu);
        menu.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent returnIntent = new Intent();
				returnIntent.putExtra("result","result");
				setResult(2,returnIntent); //Muestra la vista Listado
				CameraActivity.this.finish();
			}
        	
        });
        startRecording = (Button)findViewById(R.id.btnCameraRec);
        startRecording.setOnClickListener(new OnClickListener(){
  
  			@Override
  			public void onClick(View arg0) {
  				// TODO Auto-generated method stub
  					if(state == 0){
  						
	  					
	  					
	  					try {
	  						mCamera = Camera.open();	  						
	  				        surfaceHolder = surfaceView.getHolder();
//	  				        surfaceHolder.addCallback(this);
	  				        surfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
		  					mCamera.setPreviewDisplay(surfaceHolder);		  					
		  					mCamera.startPreview();
//	  		                surfaceView.setVisibility(View.VISIBLE);
	  		                fondo.setVisibility(View.GONE);
	  		                state = 1;
//	  		                Toast.makeText(getApplicationContext(), "REC", Toast.LENGTH_SHORT).show();
	  		            } catch (Exception e) {
	  		                String message = e.getMessage();
	  		                Log.i(null, "Problem Start"+message);
	  		                state = 0;
	  		                mCamera.release();
	  		            }
  					}
  					else if(state == 1){
  						state = 0;
  						mCamera.stopPreview();
  						mCamera.release();
  						surfaceHolder = null;
  		                fondo.setVisibility(View.VISIBLE);
//  						Toast.makeText(getApplicationContext(), "STOP", Toast.LENGTH_SHORT).show();
	  					
  					}
  	            
  			}
          	
    	});
        
//      mCamera = Camera.open();
        
//      surfaceHolder = surfaceView.getHolder();
//      surfaceHolder.addCallback(this);
//      surfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu)
//    {
//        menu.add(0, 0, 0, "StartRecording");
//        menu.add(0, 1, 0, "StopRecording");
//        return super.onCreateOptionsMenu(menu);
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
        case 0:
            try {
                startRecording();
                surfaceView.setVisibility(View.VISIBLE);
            } catch (Exception e) {
                String message = e.getMessage();
                Log.i(null, "Problem Start"+message);
                mrec.release();
            }
            break;

        case 1: //GoToAllNotes
        	surfaceView.setVisibility(View.INVISIBLE);
            mrec.stop();
            mrec.release();
            mrec = null;
            break;

        default:
            break;
        }
        return super.onOptionsItemSelected(item);
    }

    protected void startRecording() throws IOException 
    {
        mrec = new MediaRecorder();  // Works well
        mCamera.unlock();

        mrec.setCamera(mCamera);

        mrec.setPreviewDisplay(surfaceHolder.getSurface());
        mrec.setVideoSource(MediaRecorder.VideoSource.CAMERA);
        mrec.setAudioSource(MediaRecorder.AudioSource.MIC); 

        mrec.setProfile(CamcorderProfile.get(CamcorderProfile.QUALITY_HIGH));
        mrec.setPreviewDisplay(surfaceHolder.getSurface());
        mrec.setOutputFile(Environment.getExternalStorageDirectory().getPath()+"/zzzz.3gp"); 

        mrec.prepare();
        mrec.start();
    }

    protected void stopRecording() {
        mrec.stop();
        mrec.release();
        mCamera.release();
    }

    private void releaseMediaRecorder(){
        if (mrec != null) {
            mrec.reset();   // clear recorder configuration
            mrec.release(); // release the recorder object
            mrec = null;
            mCamera.lock();           // lock camera for later use
        }
    }

    private void releaseCamera(){
        if (mCamera != null){
            mCamera.release();        // release the camera for other applications
            mCamera = null;
        }
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width,
            int height) {
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        if (mCamera != null){
            Parameters params = mCamera.getParameters();
            mCamera.setParameters(params);
        }
        else {
            Toast.makeText(getApplicationContext(), "Camera not available!", Toast.LENGTH_LONG).show();
            //finish();
        }
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        mCamera.stopPreview();
        mCamera.release();
    }
}