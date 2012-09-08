package de.no.ass1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ControlPanel extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_panel);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_control_panel, menu);
        return true;
    }
}
