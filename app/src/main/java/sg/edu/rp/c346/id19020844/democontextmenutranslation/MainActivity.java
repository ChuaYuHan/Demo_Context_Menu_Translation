package sg.edu.rp.c346.id19020844.democontextmenutranslation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText = findViewById(R.id.textViewTranslatedText);

        registerForContextMenu(tvTranslatedText);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0, 0, 0, "English");
        menu.add(0, 1, 1, "Italian");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId() == 0) { // check whether the selected menu item ID is 0
            Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(item.getItemId() == 1) { // check whether the selected menu item ID is 1
            Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onContextItemSelected(item);
    }
}
