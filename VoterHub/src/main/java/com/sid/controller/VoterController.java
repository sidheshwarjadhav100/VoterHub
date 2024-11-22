package com.sid.controller;

import java.util.List;

import com.sid.entity.Person;
import com.sid.service.VoterService;

public class VoterController {

	VoterService vs = null;

	public void addPerson(int adhar, String name, String voterid, String constituency, int houseno, String city,
			int pin) {
		vs = new VoterService();
		vs.addPerson(adhar, name, voterid, constituency, houseno, city, pin);

	}

	public String deletePerson(int adharno) {
		vs = new VoterService();

		String res = vs.deletePerson(adharno);
		return res;

	}

	public List<Person> viewAllPerson() {
		vs = new VoterService();
		List<Person> ls = vs.viewAllPerson();

		return ls;
	}

	public boolean checkAdharPresent(int adharno) {
		vs = new VoterService();
		boolean res = vs.checkAdharPresent(adharno);
		return res;
	}

	public String updatePerson(int adharno, String uname, String uconstituency, String ucity, int upin) {
		vs = new VoterService();
		String result = vs.updatePerson(adharno, uname, uconstituency, ucity, upin);
		return result;
	}

	public List<Person> viewPersonByConstituency(String constituency) {

		vs = new VoterService();
		List<Person> personByConstituency = vs.viewPersonByConstituency(constituency);
		return personByConstituency;
	}

	public List<Person> viewPersonByCity(String city) {
		vs = new VoterService();
		List<Person> candidatebycity = vs.viewPersonByCity(city);

		return candidatebycity;
	}

	public List<Person> viewPersonByPin(int pin) {
		List<Person> candidatebypin = vs.viewPersonByPin(pin);
		return candidatebypin;
	}

}
