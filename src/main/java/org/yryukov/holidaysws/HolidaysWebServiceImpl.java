package org.yryukov.holidaysws;

//таже аннотация, что и при описании интерфейса,
import javax.jws.WebService;

//но здесь используется с параметром endpointInterface,
//указывающим полное имя класса интерфейса нашего веб-сервиса
@WebService(endpointInterface = "org.yryukov.holidaysws.HolidaysWebService")
class HolidaysWebServiceImpl implements HolidaysWebService {

	@Override
	public Boolean isHoliday(String dateStr) {
		if (dateStr.equals("2022-12-31")) return true;
		return false;
	}

}
