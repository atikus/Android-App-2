package tr.com.dna360.myapplication2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager man = getFragmentManager();
                FragmentTransaction ft = man.beginTransaction();

                FragmentA a = new FragmentA();

                ft.add(R.id.layout1, a, "FragA");

                ft.commit();

            }
        });
    }
}
