package com.filrouge.poe.lyon.JPAPOE;

import java.util.Date;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.Test;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.Dao;
import com.filrouge.poe.lyon.JPAPOE.model.Vehicule;
//import com.filrouge.poe.lyon.JPAPOE.model.Client;
import com.filrouge.poe.lyon.JPAPOE.service.IClientService;
import com.filrouge.poe.lyon.JPAPOE.service.IVehciculeService;
import com.filrouge.poe.lyon.JPAPOE.service.impl.ClientService;
import com.filrouge.poe.lyon.JPAPOE.service.impl.VehiculeService;

public class TestDao {
	private static Dao dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = new Dao();
		dao.init();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		dao.close();
	}

//	@Test
//	public void testfindClient() {
//		IClientService clientservice = new ClientService(dao);
//		System.out.println(clientservice.findClient(1));
//	}
//	
//	@Test
//	public void testfindAllClients() {
//		IClientService clientservice = new ClientService(dao);
//		System.out.println(clientservice.listClients());
//	}
	
//	@Test
//	public void addClient() {
//		IClientService clientservice = new ClientService(dao);
//	    Client c = new Client();
//	    c.setName("Bassel");
//	    c.setFirstname("Gaied");
//	    c.setAdresse("Rue Rene");
//	    c.setVille("Lyon");
//	    c.setMobile("0766706720");
//	    c.setTelephone("72465985");
//	    c.setPortable("1234567");
//	    c.setCodepostal("");
//	    
//	    clientservice.ajouterClient(c);
//	    System.out.println(c.toString());
//	  
//	}

//	@Test
//	public void deleteClient() {
//		IClientService clientservice = new ClientService(dao);
//		
//		clientservice.supprimerClient(c);
//	}
	
//	@Test
//	public void testfindAllVehicule() {
//		IVehciculeService vehciculeservice = new VehiculeService(dao);
//		System.out.println(vehciculeservice.listVehicules());
//	}
	
	@Test
	public void testfindVehicule() {
		IVehciculeService vehciculeservice = new VehiculeService(dao);
		System.out.println(vehciculeservice.findVehicule(2));
	}
	
	@Test
	public void addVehciule() {
		IVehciculeService vehciculeservice = new VehiculeService(dao);
		Vehicule v = new Vehicule(); 
		
		v.setModele("Ferrari");
		v.setPrixHT(70000);
		v.setQuantite(10);
		v.setDate_creation(new Date());
		
		vehciculeservice.ajouterVehicule(v);
		System.out.println(v.toString());
	}
	
}
