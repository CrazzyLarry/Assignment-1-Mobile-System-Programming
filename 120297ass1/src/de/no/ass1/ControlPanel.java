package de.no.ass1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ControlPanel extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_panel);
        
        //Button "sent to git.hig.no
        Button sendToHigButton = (Button)findViewById(R.id.sendToHigButton);
        sendToHigButton.getBackground().setAlpha(0);
        
        //Button "get Logo form Hig.no
        Button getLogoFromHig = (Button)findViewById(R.id.getLogoFromHig);
        getLogoFromHig.getBackground().setAlpha(0);
        
        //Button "search in Wikipedia"
        Button searchInWikipedia= (Button)findViewById(R.id.searchInWikipedia);
        searchInWikipedia.getBackground().setAlpha(0);
    }
    
    
    public void onClickSendToHig(View view) {
    	Intent intent = new Intent(this, SentToHig.class);
    	startActivity(intent);
    }
    
    public void onClickGetLogoFromHig(View view) {
    	Intent intent = new Intent(this, GetLogoFromHig.class);
    	startActivity(intent);
    }
    
    public void onClicksearchInWikipedia(View view) {
    	Intent intent = new Intent(this,SearchInWikipedia.class );
    	startActivity(intent);
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_control_panel, menu);
        return true;
    }
    
   
}
