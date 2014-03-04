package org.musteat.adziki.adc.gallery;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity
{
	private GridView mGallery;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		mGallery=(GridView)findViewById(R.id.gallery);
		
    }
}
