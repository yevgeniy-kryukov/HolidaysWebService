package org.ykryukov.holidaysws;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.jws.WebMethod;
import javax.jws.WebParam;
//таже аннотация, что и при описании интерфейса,
import javax.jws.WebService;

import org.ykryukov.holidaysws.model.holiday.Holiday;
import org.ykryukov.holidaysws.model.holiday.HolidayHibernateDao;

//но здесь используется с параметром endpointInterface,
//указывающим полное имя класса интерфейса нашего веб-сервиса
@WebService(endpointInterface = "org.ykryukov.holidaysws.HolidaysWebService")
public class HolidaysWebServiceImpl implements HolidaysWebService {

	@Override
	@WebMethod
	public Boolean isHoliday(@WebParam(name = "dateStr") String dateStr) {
//		System.out.print(dateStr);
		Date date1 = Date.valueOf(dateStr);
		Holiday holiday = new HolidayHibernateDao().findByDate(date1);
		if (holiday != null)
			return true;
		return false;
	}

}
