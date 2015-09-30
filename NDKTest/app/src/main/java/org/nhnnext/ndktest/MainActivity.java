package org.nhnnext.ndktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("NDKTest");
    }

    public native String getStringFromNativeYG();
    public native String getStringFromNativeNDK();
    public native String getAddedStringFromNative();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView view1 = (TextView) findViewById(R.id.textView1);
        TextView view2 = (TextView) findViewById(R.id.textView2);
        TextView view3 = (TextView) findViewById(R.id.textView3);

        view1.setText(getStringFromNativeEJ());
        view2.setText(getStringFromNativeNDK());
        view3.setText(getAddedStringFromNative());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
