package com.sid.service;

import java.util.ArrayList;
import java.util.List;

import com.sid.dao.VoterDao;
import com.sid.entity.Person;

public class VoterService {

	VoterDao vd = null;

	/*
	 * this method Register any new person. this method returns String depending on
	 * operation its successfull or not.
	 */
	public void addPerson(int adhar, String name, String voterid, String constituency, int houseno, String city,
			int pin) {
		vd = new VoterDao();
		vd.addPerson(adhar, name, voterid, constituency, houseno, city, pin);

	}

	/*
	 * this method take a adhar no as an input and delete specific matched person.
	 * // returns string result successfull or not.
	 */
	public String deletePerson(int adharno) {
		vd = new VoterDao();
		String res = null;

		for (Person person : this.viewAllPerson()) {

			if (person.getAdhar() == adharno) {
				res = vd.deletePerson(adharno);

			} else {
				res = "Adhar not found";
			}

		}
		return res;

	}

	/*
	 * this method read all present person data from the database and returns all
	 * person data list.
	 */
	public List<Person> viewAllPerson() {
		vd = new VoterDao();
		List<Person> ls = vd.viewAllPerson();
		return ls;
	}

	/*
	 * this method gives person adhar no as parameter check is that adhar no is
	 * present or not if adhar no is matched with any person then it returns true
	 * otherwise false
	 */
	public boolean checkAdharPresent(int adharno) {

		List<Person> allPerson = this.viewAllPerson();

		boolean res = false;
		for (Person person : allPerson) {
			if (person.getAdhar() == adharno) {
				res = true;

			}

		}
		return res;

	}

	/*
	 * this method gives required parameter as input and update the existing adhar
	 * matched person this metod returns String as operation successfull or not.
	 */
	public String updatePerson(int adharno, String uname, String uconstituency, String ucity, int upin) {
		vd = new VoterDao();
		String result = null;
		List<Person> allPerson = this.viewAllPerson();
		for (Person person : allPerson) {
			if (person.getAdhar() == adharno) {

				result = vd.updatePerson(adharno, uname, person.getVoter_id().getVoter_id(), uconstituency,
						person.getAddress().getHouseNo(), ucity, upin);

			}

		}

		return result;
	}

	/*
	 * this method short present person by constituency if matched then that person
	 * add into list and return that list
	 */
	public List<Person> viewPersonByConstituency(String constituency) {

		List<Person> personByConstituency = new ArrayList<Person>();

		for (Person person : this.viewAllPerson()) {

			if (person.getVoter_id().getConstituency().equalsIgnoreCase(constituency)) {

				personByConstituency.add(person);

			}

		}
		return personByConstituency;
	}

	/*
	 * this method short present person by city if matched then that person add into
	 * list and return that list
	 */
	public List<Person> viewPersonByCity(String city) {
		List<Person> candidatebycity = new ArrayList<Person>();
		for (Person person : this.viewAllPerson()) {

			if (person.getAddress().getCityname().equalsIgnoreCase(city)) {
				candidatebycity.add(person);

			}

		}

		return candidatebycity;
	}

	/*
	 * this method short present person by pin if matched then that person add into
	 * list and return that list
	 */
	public List<Person> viewPersonByPin(int pin) {
		List<Person> candidatebypin = new ArrayList<Person>();
		for (Person person : this.viewAllPerson()) {
			if (person.getAddress().getPin() == pin) {

				candidatebypin.add(person);
			}

		}

		return candidatebypin;
	}

}
