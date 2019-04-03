package ma.adil.elmansouri.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BasicFragment basicFragment = new BasicFragment();
        // Fragment manager allows you to create,delete,replace a fragment in an activity at runtime.
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager
                    .beginTransaction()
                        .add(R.id.fragment_container,basicFragment)
                        .commit();
    }
}
