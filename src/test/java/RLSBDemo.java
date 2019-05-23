import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import org.datacontract.schemas._2004._07.ivps.AlarmType;

import org.datacontract.schemas._2004._07.ivps_ws.ArrayOfCameraInfo;
import org.datacontract.schemas._2004._07.ivps_ws.CameraInfo;
import org.tempuri.*;


import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

public class RLSBDemo {
    public static void main(String[] ar){
        //创建一个用于产生WebServiceImpl实例的工厂，WebServiceImplService类是wsimport工具生成的
        ObjectFactory objectFactory = new ObjectFactory();
        WebService webService =new WebService();
        IWebService basicHttpBindingIWebService = webService.getBasicHttpBindingIWebService();
        String login = basicHttpBindingIWebService.login("00043", "12345");
        login = basicHttpBindingIWebService.login("admin", "admin");
        System.out.println(login);
        XMLGregorianCalendar start =XMLGregorianCalendarImpl.createDate(2019,3,13,0);
        XMLGregorianCalendar end =XMLGregorianCalendarImpl.createDate(2019,3,13,0);
        ArrayOfCameraInfo cameraList = basicHttpBindingIWebService.getCameraList(login);
        List<CameraInfo> cameraInfo = cameraList.getCameraInfo();
        ArrayOfMediaEventRecordInfo mediaHistoryDataList = basicHttpBindingIWebService.getMediaHistoryDataList(login, 2019, 3, 13, 10, 0, true, 0, null,null, null, null);
        List<MediaEventRecordInfo> mediaEventRecordInfo = mediaHistoryDataList.getMediaEventRecordInfo();
        //通过工厂生成一个WebServiceImpl实例，WebServiceImpl是wsimport工具生成的
        /*JAXBElement<String> loginPwd = objectFactory.createLoginPwd("");
        JAXBElement<String> loginUid = objectFactory.createLoginUid("");
        Login login = objectFactory.createLogin();*/
        //login.setPwd(loginPwd);
        //login.setUid(loginUid);

    }
}
