package org.musteat.adziki.adc.gallery;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import org.musteat.adziki.adc.gallery.adapters.*;
import java.util.*;
import android.graphics.drawable.*;

public class MainActivity extends Activity
{
	private GridView mGallery;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_display);
        /*
        setContentView(R.layout.main);

		mGallery=(GridView)findViewById(R.id.gallery);
		ArrayList<Drawable> images = new ArrayList<Drawable>();
		images.add(getResources().getDrawable(R.drawable.img_1));
		images.add(getResources().getDrawable(R.drawable.img_2));
		images.add(getResources().getDrawable(R.drawable.img_3));
		images.add(getResources().getDrawable(R.drawable.img_4));
		images.add(getResources().getDrawable(R.drawable.img_5));
		images.add(getResources().getDrawable(R.drawable.img_6));
		
		ImageAdapter imagesAdapter = new ImageAdapter(this,images);
		mGallery.setAdapter(imagesAdapter);      */
    }
}
