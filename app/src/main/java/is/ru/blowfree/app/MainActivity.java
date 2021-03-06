package is.ru.blowfree.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    public String EXTRA_MESSAGE = "level 1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void newGame(View view){
        Intent myIntent = new Intent(this, LevelActivity.class);
        startActivity(myIntent);
    }

    public void continueGame(View view){
        Intent myIntent = new Intent(this, GameInstances.class);
        startActivity(myIntent);
    }
    public void gameSettings(View view){
        Intent myIntent = new Intent(this, Settings.class);
        startActivity(myIntent);
    }
}
