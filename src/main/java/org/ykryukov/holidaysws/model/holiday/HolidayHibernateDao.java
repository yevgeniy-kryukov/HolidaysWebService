package org.ykryukov.holidaysws.model.holiday;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.ykryukov.holidaysws.model.ConnHibernate;

public class HolidayHibernateDao implements Dao<Holiday> {

	@Override
	public Holiday findByDate(Date dt) {
		Session session = ConnHibernate.getInstance().getSession();
		Transaction t = null;
		Holiday holiday = null;

		try {
			t = session.beginTransaction();
			holiday = session.get(Holiday.class, dt);		
			t.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			t.rollback();
		} finally {
			if (session != null)
				session.close();
		}

		return holiday;
	}

}
