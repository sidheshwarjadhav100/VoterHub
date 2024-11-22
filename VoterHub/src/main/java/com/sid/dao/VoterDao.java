package com.sid.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sid.entity.Address;
import com.sid.entity.Person;
import com.sid.entity.VotingCard;
import com.sid.utility.Utility;

public class VoterDao {

	/*
	 * this method Register any new person. this method returns String depending on
	 * operation its successfull or not.
	 */
	public String addPerson(int adhar, String name, String voterid, String constituency, int houseno, String city,
			int pin) {

		String res = null;
		Session session = Utility.sessionObj();
		Transaction tx = session.beginTransaction();

		Person p = new Person(adhar, name);
		VotingCard v = new VotingCard(voterid, constituency);
		Address a = new Address(houseno, city, pin);
		p.setVoter_id(v);
		p.setAddress(a);
		session.save(p);
		tx.commit();
		session.close();
		res = "Person Added Successfully";

		return res;

	}

	/*
	 * this method read all present person data from the database and returns all
	 * person data list.
	 */
	public List<Person> viewAllPerson() {

		Session session = Utility.sessionObj();
		Criteria criteria = session.createCriteria(Person.class);
		List<Person> allCandidateList = criteria.list();

		return allCandidateList;
	}

	/*
	 * this method take a adhar no as an input and delete specific matched person.
	 * // returns string result successfull or not.
	 */
	public String deletePerson(int adharno) {

		String res = "person deleted successfully";

		Session session = Utility.sessionObj();
		Transaction tx = session.beginTransaction();

		for (Person person : this.viewAllPerson()) {

			if (person.getAdhar() == adharno) {

				session.delete(person);
				tx.commit();
				session.close();
			}

		}

		return res;

	}

	/*
	 * this method gives required parameter as input and update the existing adhar
	 * matched person this metod returns String as operation successfull or not.
	 */
	public String updatePerson(int adharno, String uname, String voter_id, String uconstituency, int uhouseno,
			String ucity, int upin) {
		Session session = Utility.sessionObj();
		Transaction tx = session.beginTransaction();
		Person p = new Person(adharno, uname, new VotingCard(voter_id, uconstituency),
				new Address(uhouseno, ucity, upin));
		session.update(p);
		tx.commit();
		session.close();
		String res = "Person Updated Successfully.";
		return res;
	}

}
