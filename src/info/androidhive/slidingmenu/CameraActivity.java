package info.androidhive.slidingmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class CameraActivity extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Activity sin parte superior
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.activity_camera);
	}
}
