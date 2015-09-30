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

    public native String getStringFromNativeEJ();
    public native String getStringFromNativeNDK();
    public native String getAddedStringFromNative();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TextView에 Native Method를 호출한 결과를 표시한다.

        TextView view1 = (TextView) findViewById(R.id.textView1);
        TextView view2 = (TextView) findViewById(R.id.textView2);
        TextView view3 = (TextView) findViewById(R.id.textView3);

        view1.setText(getStringFromNativeEJ());
        view2.setText(getStringFromNativeNDK());
        view3.setText(getAddedStringFromNative());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
