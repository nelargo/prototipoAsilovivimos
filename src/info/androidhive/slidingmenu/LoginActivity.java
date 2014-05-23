package info.androidhive.slidingmenu;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends Activity{
	TextView user,pass,forget;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Activity sin parte superior
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.activity_login);
		
		user = (TextView)findViewById(R.id.login_user);
		pass = (TextView)findViewById(R.id.login_pass);
		forget = (TextView)findViewById(R.id.login_forget);
		
		user.setHint(Html.fromHtml("<small><small><small>"+
				getString(R.string.user_hint)+
				"</small></small></small>"));
		pass.setHint(Html.fromHtml("<small><small>"+
				getString(R.string.pass_hint)+
				"</small></small>"));
		forget.setTypeface(Typeface.createFromAsset(getAssets(), "bauhaus_93.ttf"));
		
		
		Button b = (Button)findViewById(R.id.buttonUpload1);
		
		b.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				try{
				Intent i = new Intent(getApplicationContext(), MainActivity.class);
				startActivity(i);
				}catch(Exception e){}
			}
			
		});
	}
}
