package com.facebook.scrumptious;

import android.app.ListActivity;
import android.os.Bundle;

public class MyListActivity extends ListActivity {
  public void onCreate(Bundle icicle) {
    super.onCreate(icicle);
    String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
        "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
        "Linux", "OS/2" };
    MySimpleArrayAdapter adapter = new MySimpleArrayAdapter(this, values);
    setListAdapter(adapter);
  }

} 