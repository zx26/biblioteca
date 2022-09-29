package com.chucho.biblioastro;
import java.util.*;

public class ItemDataList 
{
	public static HashMap<String,List<String>>getData(){
		
		LinkedHashMap<String,List<String>> detallesExpandibles= new LinkedHashMap<String,List<String>>();
		
		List<String> sisSolar= new ArrayList<String>();
		sisSolar.add("El Sol");
		sisSolar.add("Mercurio");
		sisSolar.add("Venus");
		sisSolar.add("La Tierra");
		sisSolar.add("Marte");
		sisSolar.add("Cinturon de Asterioides");
		sisSolar.add("Júpirer");
		sisSolar.add("Saturno");
		sisSolar.add("Urano");
		sisSolar.add("Neptuno");
		sisSolar.add("Cinturon de Kuiper");
		sisSolar.add("Ceres");
		sisSolar.add("Plutón");
		sisSolar.add("Sedna");
		
		
		List<String> definiciones= new ArrayList<String>();
		definiciones.add("Agujero Blanco");
		definiciones.add("Agujero Negro");
		definiciones.add("Años luz");
		definiciones.add("Asteroide");
		definiciones.add("Astronomía");
		definiciones.add("Atmosfera");
		definiciones.add("Constelaciones");
		definiciones.add("Estrella");
		definiciones.add("Exoplaneta");
		definiciones.add("Eclipse Lunar");
		definiciones.add("Eclipse Solar");
		definiciones.add("Galaxia");
		definiciones.add("Gravedad");
		definiciones.add("Heliosfera");
		definiciones.add("Hipernova");
		definiciones.add("Manchas Solares");
		definiciones.add("Meteroide");
		definiciones.add("Nebulosa");
		definiciones.add("Orbita");
		definiciones.add("Planeta");
		definiciones.add("Polvo Cosmico");
		definiciones.add("Rotación");
		definiciones.add("Satélite Artificial");
		definiciones.add("Satelite Natural");
		definiciones.add("Sistema Solar");
		definiciones.add("Supernova");
		definiciones.add("Tormenta Geomagnética");
		definiciones.add("Unidad Astronómica");
		definiciones.add("Universo");
		definiciones.add("Viento Solar");
		
		
		List<String> estrellas= new ArrayList<String>();
		estrellas.add("Enana Blanca");
		estrellas.add("Enana Marrón");
		estrellas.add("Enana Negra");
		estrellas.add("Estrella de Neutrones");
		estrellas.add("Estrella Wolf Rayet");
		estrellas.add("Stephenson 218");
		estrellas.add("R136a1");
		estrellas.add("UY Scuty");
		
		List<String> exoPlanetas= new ArrayList<String>();
		exoPlanetas.add("55 Cancri e");
		exoPlanetas.add("GJ 504 b");
		exoPlanetas.add("J1407");
		exoPlanetas.add("Kepler 7b");
		exoPlanetas.add("Kepler 10c");
		exoPlanetas.add("Kepler 62f");
		exoPlanetas.add("Kepler 438b");
		exoPlanetas.add("Matusalen");
		exoPlanetas.add("Ngts 1b");
		exoPlanetas.add("Osiris");
		exoPlanetas.add("Tres 2b");
		exoPlanetas.add("Wasp 12b");
		
		List<String> galaxias= new ArrayList<String>();
		galaxias.add("Andrómeda");
		galaxias.add("Gran Nube de Magallanes");
		galaxias.add("Lactomeda");
		galaxias.add("Vía Láctea");
		
		List<String> herramientas= new ArrayList<String>();
		herramientas.add("Radiotelescopio");
		herramientas.add("Telescopio");
		herramientas.add("Telescopio Cassegrain");
		herramientas.add("Telescopio Reflector");
		herramientas.add("Telescopio Refractor");
		
		List<String> nebulosas= new ArrayList<String>();
		nebulosas.add("Nebulosa Cabeza de Caballo");
		nebulosas.add("Nebulosa de Araña Roja");
		nebulosas.add("Nebulosa del Águila");
		nebulosas.add("Nebulosa Ojo de Gato");
		nebulosas.add("Nebulosa de la Pipa");
		nebulosas.add("Nube de Oort");
		nebulosas.add("Pilares de la Creación");
		
		List<String> satelites= new ArrayList<String>();
		satelites.add("Encelado");
		satelites.add("Europa");
		satelites.add("Ganimedes");
		satelites.add("Io");
		satelites.add("Luna");
		satelites.add("Mimas");
		satelites.add("Miranda");
		satelites.add("Titán");
		satelites.add("Titania");
		satelites.add("Tritón");
		
		List<String> tiposPlanetas= new ArrayList<String>();
		tiposPlanetas.add("Gigante Gaseoso");
		tiposPlanetas.add("Gigante Helado");
		tiposPlanetas.add("Júpiter Caliente");
		tiposPlanetas.add("Júpiter Frio");
		tiposPlanetas.add("Neptuno Caliente");
		tiposPlanetas.add("Planeta Enano");
		tiposPlanetas.add("Planeta Océano");
		tiposPlanetas.add("Planeta Rocoso");
		tiposPlanetas.add("Subtierra");
		tiposPlanetas.add("Supertierra");
		
		
		
		
		
		
		
		
		
		detallesExpandibles.put("Conceptos",definiciones);
		detallesExpandibles.put("Estrellas",estrellas);
		detallesExpandibles.put("Exoplanetas",exoPlanetas);
		detallesExpandibles.put("Galaxias",galaxias);
		detallesExpandibles.put("Herramientas",herramientas);
		detallesExpandibles.put("Nebulosas",nebulosas);
		detallesExpandibles.put("Satelites",satelites);
		detallesExpandibles.put("Sistema Solar",sisSolar);
		detallesExpandibles.put("Tipos de Planetas",tiposPlanetas);
		
		return detallesExpandibles;
	}
}
