package de.no.ass1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SearchInWikipedia extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_in_wikipedia);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_search_in_wikipedia, menu);
        return true;
    }
}
