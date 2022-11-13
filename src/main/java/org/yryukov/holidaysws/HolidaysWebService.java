package org.yryukov.holidaysws;

//это аннотации, т.е. способ отметить наши классы и методы,
//как связанные с веб-сервисной технологией
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

//говорим, что наш интерфейс будет работать как веб-сервис
@WebService
//говорим, что веб-сервис будет использоваться для вызова методов
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HolidaysWebService {
	/**
//	 * Возвращает является ли дата праздничной
	 * 
	 * @param dateStr дата в формате yyy-mm-dd
	 * @return true/false
	 */
	// говорим, что этот метод можно вызывать удаленно
	@WebMethod
	public Boolean isHoliday(String dateStr);
}
