package com.chucho.biblioastro;
import android.app.*;
import android.os.*;
import android.webkit.*;

public class WebActivity extends Activity
{
	
	WebView web;
	MainActivity actividad;
	String direccion;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
	
		super.onCreate(savedInstanceState);
		
		
		web=new WebView(this);
		setContentView(web);
		web.getSettings().setJavaScriptEnabled(true);
		
		Bundle bundle= getIntent().getExtras();
		String entrada= bundle.getString("direccion");
		web.loadUrl("http://www.astronomiafascinante.tk/entradas/"+entrada+".html");

		
	}
	
	
	
	
}
