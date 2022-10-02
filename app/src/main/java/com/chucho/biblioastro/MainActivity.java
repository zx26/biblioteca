package com.chucho.biblioastro;

import android.app.*;
import android.os.*;
import android.widget.*;
import java.util.*;
import android.view.*;
import android.content.*;
import com.startapp.sdk.adsbase.*;
import com.startapp.sdk.ads.banner.*;

public class MainActivity extends Activity 
{
	ExpandableListView ex;
	ExpandableListAdapter expandableListAdapter;
	List<String> expandableTitleList;
	HashMap<String,List<String>> expandableDetailList;
	WebActivity web;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		
		//StartAppSDK.init(this,"208698859",true);
		StartAppSDK.setTestAdsEnabled(BuildConfig.DEBUG);
		
        setContentView(R.layout.main);
		
		StartAppAd.disableSplash();
		StartAppAd.setAutoInterstitialPreferences(
		                   new AutoInterstitialPreferences().setActivitiesBetweenAds(3));
						   
						   
		StartAppAd.showAd(this);
		
		//ad = new StartAppAd(this);
		
		//ad.setAutoInterstitialPreferences(new AutoInterstitialPreferences().setActivitiesBetweenAds(3));
		//ad.showAd();
        //ad.loadAd();
		ex = (ExpandableListView)findViewById(R.id.ex);
		expandableDetailList=ItemDataList.getData();
		expandableTitleList=new ArrayList<String>(expandableDetailList.keySet());
		expandableListAdapter=new ExpandableListAdapter(this,expandableTitleList,expandableDetailList);
		ex.setAdapter(expandableListAdapter);
		
		ex.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener(){
			public void onGroupExpand(int groupPosition){
				Toast.makeText(getApplicationContext(),expandableTitleList.get(groupPosition),Toast.LENGTH_SHORT).show();
			}
		});
		
		ex.setOnChildClickListener(new ExpandableListView.OnChildClickListener(){
	     public boolean onChildClick(ExpandableListView parent,View v,
			             int groupPosition,int childPosition, long id){
							 
							 
							 switch(groupPosition){
								 case 0:
									 switch(childPosition){
										 case 0:
											 
											 setView("agujeroblanco");																	 									
											 break;
									     case 1:
											 setView("agujeronegro");
											 break;
									     case 2:
											 setView("anosluz");
											 break;
										 case 3:
											 setView("asteroide");
											 break;
									     case 4:
											 setView("astronomia");
											 break;
										 case 5:
											 setView("atmosfera");
											 break;
										 case 6:
											 setView("constelaciones");
											 break;
										 case 7:
											 setView("estrella");
											 break;
									     case 8:
											 setView("exoplaneta");
											 break;
										 case 9:
											 setView("eclipselunar");
											 break;
									     case 10:
											 setView("eclipsesolar");
											 break;
										 case 11:
											 setView("galaxia");
											 break;	 
										 case 12:
											 setView("gravedad");
											 break;
										 case 13:
											 setView("heliosfera");
											 break;
									     case 14:
											 setView("hipernova");
											 break;
										 case 15:
											 setView("manchassolares");
											 break;
									     case 16:
											 setView("meteroide");
											 break;
										 case 17:
											 setView("nebulosa");
											 break;
										 case 18:
											 setView("orbita");
											 break;
									     case 19:
											 setView("planeta");
											 break;
										 case 20:
											 setView("polvocosmico");
											 break;
									     case 21:
											 setView("rotacion");
											 break;
										 case 22:
											 setView("sateliteartificial");
											 break;
										 case 23:
											 setView("satelitenatural");
											 break;
									     case 24:
											 setView("sistemasolar");
											 break;
										 case 25:
											 setView("supernova");
											 break;
									     case 26:
											 setView("tormentageomagnetica");
											 break;
										 case 27:
											 setView("unidadastronomica");
											 break;
										 case 28:
											 setView("universo");
											 break;
									     case 29:
											 setView("vientosolar");
											 break;
										 
										 
									 }break;
								case 1:
									switch(childPosition){
										case 0:
											setView("enanablanca");
											break;
									    case 1:
											setView("enanamarron");
											break;
										case 2:
											setView("enananegra");
											break;
										case 3:
											setView("estrellasdeneutrones");
											break;
										case 4:
											setView("estrellawolfrayet");
											break;
										case 5:
											setView("stephenson218");
											break;
										case 6:
											setView("r136a1");
											break;
										case 7:
											setView("uyscuti");
											break;
									
											
							 }break;
								 case 2:
									 switch(childPosition){
										 case 0:
											 setView("55cancrie");
											 break;
										 case 1:
											 setView("gj504b");
											 break;
										 case 2:
											 setView("j1407b");
											 break;
										 case 3:
											 setView("kepler7b");
											 break;
										 case 4:
											 setView("kepler10c");
											 break;
										 case 5:
											 setView("kepler62f");
											 break;
										 case 6:
											 setView("kepler438b");
											 break;
										 case 7:
											 setView("matusalen");
											 break;
										 case 8:
											 setView("ngts1b");
											 break;
										 case 9:
											 setView("osiris");
											 break;
										 case 10:
											 setView("tres2b");
											 break;
										 case 11:
											 setView("wasp12b");
											 break;
									 }
									 break;
									 case 3:
										 switch(childPosition){
											 case 0:
												 setView("andromeda");
												 break;
											 case 1:
												 setView("grannubedemagallanes");
												 break;
											 case 2:
												 setView("lactomeda");
												 break;
											 case 3:
												 setView("vialactea");
												 break;
										 }
										 break;
									 case 4:
										 switch(childPosition){
											 case 0:
												 setView("radiotelescopio");
												 break;
											 case 1:
												 setView("telescopio");
												 break;
											 case 2:
												 setView("telescopiocassegrain");
												 break;
											 case 3:
												 setView("telescopioreflector");
												 break;
											 case 4:
												 setView("telescopiorefractor");
												 break;
										 }
										 break;
									 case 5:
										 switch(childPosition){
											 case 0:
												 setView("nebulosacabezadecaballo");
												 break;
											 case 1:
												 setView("nebulosadearenaroja");
												 break;
											 case 2:
												 setView("nebulosadelaguila");
												 break;
											 case 3:
												 setView("nebulosaojodegato");
												 break;
											 case 4:
												 setView("nebulosadelapipa");
												 break;
											 case 5:
												 setView("nubedeoort");
												 break;
											 case 6:
												 setView("pilaresdelacreacion");
												 break;
											 
										 }
										 break;
									 case 6:
										 switch(childPosition){
											 case 0:
												 setView("encelado");
												 break;
											 case 1:
												 setView("europa");
												 break;
											 case 2:
												 setView("ganimedes");
												 break;
											 case 3:
												 setView("io");
												 break;
											 case 4:
												 setView("luna");
												 break;
											 case 5:
												 setView("mimas");
												 break;
										     case 6:
												 setView("miranda");
												 break;
											 case 7:
												 setView("titan");
												 break;
										     case 8:
												 setView("titania");
												 break;
											 case 9:
												 setView("triton");
												 break;
										 }
										 break;
									 case 7:
										 switch(childPosition){
											 case 0:

												 setView("sol");																	 									
												 break;
											 case 1:
												 setView("mercurio");
												 break;
											 case 2:
												 setView("venus");
												 break;
											 case 3:
												 setView("tierra");
												 break;
											 case 4:
												 setView("marte");
												 break;
											 case 5:
												 setView("cinturondeasteroides");
												 break;
											 case 6:
												 setView("jupiter");
												 break;
											 case 7:
												 setView("saturno");
												 break;
											 case 8:
												 setView("urano");
												 break;
											 case 9:
												 setView("neptuno");
												 break;
											 case 10:
												 setView("cinturondekuiper");
												 break;
											 case 11:
												 setView("ceres");
												 break;	 
											 case 12:
												 setView("pluton");
												 break;
											 case 13:
												 setView("sedna");
												 break;
										 }
										 break;
									 case 8:
										 switch(childPosition){
											 case 0:

												 setView("gigantesgaseosos");																	 									
												 break;
											 case 1:
												 setView("giganteshelados");
												 break;
											 case 2:
												 setView("jupitercaliente");
												 break;
											 case 3:
												 setView("jupiterfrio");
												 break;
											 case 4:
												 setView("neptunocaliente");
												 break;
											 case 5:
												 setView("planetaenano");
												 break;
											 case 6:
												 setView("planetaoceano");
												 break;
											 case 7:
												 setView("planetarocoso");
												 break;
											 case 8:
												 setView("subtierra");
												 break;
											 case 9:
												 setView("supertierra");
												 break;
											 
										 }
										 break;
									 case 9:
										switch(childPosition){
											
										} 
										break;
									 
							 }
		
						 return false;	 
						 }
		});

    }
	
	public void setView(String direccion){
		Intent intent= new Intent(getBaseContext(),WebActivity.class);
		intent.putExtra("direccion",direccion);
		startActivity(intent);
		//StartAppAd.showAd(this);
	}
	
	public String getDireccion(String direccion){
		return web.direccion;
	}
}
