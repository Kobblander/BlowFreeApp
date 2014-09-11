package is.ru.blowfree.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class LevelActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        Intent intent = getIntent();

    }

    public void LevelOne(View view){
        Intent myIntent = new Intent(this, GameActivity.class);
        startActivity(myIntent);
    }

}
