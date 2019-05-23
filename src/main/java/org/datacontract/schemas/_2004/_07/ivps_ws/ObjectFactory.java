
package org.datacontract.schemas._2004._07.ivps_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.ivps_ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfAlarmInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "ArrayOfAlarmInfo");
    private final static QName _AlarmInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "AlarmInfo");
    private final static QName _PersonScoreInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "PersonScoreInfo");
    private final static QName _ArrayOfReaFacelRecoInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "ArrayOfReaFacelRecoInfo");
    private final static QName _ArrayOfCameraInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "ArrayOfCameraInfo");
    private final static QName _ArrayOfPersonScoreInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "ArrayOfPersonScoreInfo");
    private final static QName _ReaFacelRecoInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "ReaFacelRecoInfo");
    private final static QName _ArrayOfRecoScoreInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "ArrayOfRecoScoreInfo");
    private final static QName _RecoScoreInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "RecoScoreInfo");
    private final static QName _CameraInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "CameraInfo");
    private final static QName _RecoScoreInfoPersonName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "PersonName");
    private final static QName _AlarmInfoCameraName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "CameraName");
    private final static QName _AlarmInfoPersonScoreList_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "PersonScoreList");
    private final static QName _AlarmInfoKeyId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "KeyId");
    private final static QName _AlarmInfoText_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "Text");
    private final static QName _AlarmInfoTakeFacePicFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "TakeFacePicFileName");
    private final static QName _CameraInfoXmlExtBody_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "XmlExtBody");
    private final static QName _CameraInfoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "Name");
    private final static QName _ReaFacelRecoInfoScoreList_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "ScoreList");
    private final static QName _ReaFacelRecoInfoTakeFaceJpegBytes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.WS.Models", "TakeFaceJpegBytes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.ivps_ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfCameraInfo }
     * 
     */
    public ArrayOfCameraInfo createArrayOfCameraInfo() {
        return new ArrayOfCameraInfo();
    }

    /**
     * Create an instance of {@link ArrayOfReaFacelRecoInfo }
     * 
     */
    public ArrayOfReaFacelRecoInfo createArrayOfReaFacelRecoInfo() {
        return new ArrayOfReaFacelRecoInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAlarmInfo }
     * 
     */
    public ArrayOfAlarmInfo createArrayOfAlarmInfo() {
        return new ArrayOfAlarmInfo();
    }

    /**
     * Create an instance of {@link AlarmInfo }
     * 
     */
    public AlarmInfo createAlarmInfo() {
        return new AlarmInfo();
    }

    /**
     * Create an instance of {@link ArrayOfPersonScoreInfo }
     * 
     */
    public ArrayOfPersonScoreInfo createArrayOfPersonScoreInfo() {
        return new ArrayOfPersonScoreInfo();
    }

    /**
     * Create an instance of {@link PersonScoreInfo }
     * 
     */
    public PersonScoreInfo createPersonScoreInfo() {
        return new PersonScoreInfo();
    }

    /**
     * Create an instance of {@link ReaFacelRecoInfo }
     * 
     */
    public ReaFacelRecoInfo createReaFacelRecoInfo() {
        return new ReaFacelRecoInfo();
    }

    /**
     * Create an instance of {@link ArrayOfRecoScoreInfo }
     * 
     */
    public ArrayOfRecoScoreInfo createArrayOfRecoScoreInfo() {
        return new ArrayOfRecoScoreInfo();
    }

    /**
     * Create an instance of {@link RecoScoreInfo }
     * 
     */
    public RecoScoreInfo createRecoScoreInfo() {
        return new RecoScoreInfo();
    }

    /**
     * Create an instance of {@link CameraInfo }
     * 
     */
    public CameraInfo createCameraInfo() {
        return new CameraInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlarmInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "ArrayOfAlarmInfo")
    public JAXBElement<ArrayOfAlarmInfo> createArrayOfAlarmInfo(ArrayOfAlarmInfo value) {
        return new JAXBElement<ArrayOfAlarmInfo>(_ArrayOfAlarmInfo_QNAME, ArrayOfAlarmInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlarmInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "AlarmInfo")
    public JAXBElement<AlarmInfo> createAlarmInfo(AlarmInfo value) {
        return new JAXBElement<AlarmInfo>(_AlarmInfo_QNAME, AlarmInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonScoreInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "PersonScoreInfo")
    public JAXBElement<PersonScoreInfo> createPersonScoreInfo(PersonScoreInfo value) {
        return new JAXBElement<PersonScoreInfo>(_PersonScoreInfo_QNAME, PersonScoreInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReaFacelRecoInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "ArrayOfReaFacelRecoInfo")
    public JAXBElement<ArrayOfReaFacelRecoInfo> createArrayOfReaFacelRecoInfo(ArrayOfReaFacelRecoInfo value) {
        return new JAXBElement<ArrayOfReaFacelRecoInfo>(_ArrayOfReaFacelRecoInfo_QNAME, ArrayOfReaFacelRecoInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCameraInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "ArrayOfCameraInfo")
    public JAXBElement<ArrayOfCameraInfo> createArrayOfCameraInfo(ArrayOfCameraInfo value) {
        return new JAXBElement<ArrayOfCameraInfo>(_ArrayOfCameraInfo_QNAME, ArrayOfCameraInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPersonScoreInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "ArrayOfPersonScoreInfo")
    public JAXBElement<ArrayOfPersonScoreInfo> createArrayOfPersonScoreInfo(ArrayOfPersonScoreInfo value) {
        return new JAXBElement<ArrayOfPersonScoreInfo>(_ArrayOfPersonScoreInfo_QNAME, ArrayOfPersonScoreInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReaFacelRecoInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "ReaFacelRecoInfo")
    public JAXBElement<ReaFacelRecoInfo> createReaFacelRecoInfo(ReaFacelRecoInfo value) {
        return new JAXBElement<ReaFacelRecoInfo>(_ReaFacelRecoInfo_QNAME, ReaFacelRecoInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRecoScoreInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "ArrayOfRecoScoreInfo")
    public JAXBElement<ArrayOfRecoScoreInfo> createArrayOfRecoScoreInfo(ArrayOfRecoScoreInfo value) {
        return new JAXBElement<ArrayOfRecoScoreInfo>(_ArrayOfRecoScoreInfo_QNAME, ArrayOfRecoScoreInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecoScoreInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "RecoScoreInfo")
    public JAXBElement<RecoScoreInfo> createRecoScoreInfo(RecoScoreInfo value) {
        return new JAXBElement<RecoScoreInfo>(_RecoScoreInfo_QNAME, RecoScoreInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CameraInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "CameraInfo")
    public JAXBElement<CameraInfo> createCameraInfo(CameraInfo value) {
        return new JAXBElement<CameraInfo>(_CameraInfo_QNAME, CameraInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "PersonName", scope = RecoScoreInfo.class)
    public JAXBElement<String> createRecoScoreInfoPersonName(String value) {
        return new JAXBElement<String>(_RecoScoreInfoPersonName_QNAME, String.class, RecoScoreInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "PersonName", scope = PersonScoreInfo.class)
    public JAXBElement<String> createPersonScoreInfoPersonName(String value) {
        return new JAXBElement<String>(_RecoScoreInfoPersonName_QNAME, String.class, PersonScoreInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "CameraName", scope = AlarmInfo.class)
    public JAXBElement<String> createAlarmInfoCameraName(String value) {
        return new JAXBElement<String>(_AlarmInfoCameraName_QNAME, String.class, AlarmInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPersonScoreInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "PersonScoreList", scope = AlarmInfo.class)
    public JAXBElement<ArrayOfPersonScoreInfo> createAlarmInfoPersonScoreList(ArrayOfPersonScoreInfo value) {
        return new JAXBElement<ArrayOfPersonScoreInfo>(_AlarmInfoPersonScoreList_QNAME, ArrayOfPersonScoreInfo.class, AlarmInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "KeyId", scope = AlarmInfo.class)
    public JAXBElement<String> createAlarmInfoKeyId(String value) {
        return new JAXBElement<String>(_AlarmInfoKeyId_QNAME, String.class, AlarmInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "Text", scope = AlarmInfo.class)
    public JAXBElement<String> createAlarmInfoText(String value) {
        return new JAXBElement<String>(_AlarmInfoText_QNAME, String.class, AlarmInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "TakeFacePicFileName", scope = AlarmInfo.class)
    public JAXBElement<String> createAlarmInfoTakeFacePicFileName(String value) {
        return new JAXBElement<String>(_AlarmInfoTakeFacePicFileName_QNAME, String.class, AlarmInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "XmlExtBody", scope = CameraInfo.class)
    public JAXBElement<String> createCameraInfoXmlExtBody(String value) {
        return new JAXBElement<String>(_CameraInfoXmlExtBody_QNAME, String.class, CameraInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "Name", scope = CameraInfo.class)
    public JAXBElement<String> createCameraInfoName(String value) {
        return new JAXBElement<String>(_CameraInfoName_QNAME, String.class, CameraInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRecoScoreInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "ScoreList", scope = ReaFacelRecoInfo.class)
    public JAXBElement<ArrayOfRecoScoreInfo> createReaFacelRecoInfoScoreList(ArrayOfRecoScoreInfo value) {
        return new JAXBElement<ArrayOfRecoScoreInfo>(_ReaFacelRecoInfoScoreList_QNAME, ArrayOfRecoScoreInfo.class, ReaFacelRecoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", name = "TakeFaceJpegBytes", scope = ReaFacelRecoInfo.class)
    public JAXBElement<byte[]> createReaFacelRecoInfoTakeFaceJpegBytes(byte[] value) {
        return new JAXBElement<byte[]>(_ReaFacelRecoInfoTakeFaceJpegBytes_QNAME, byte[].class, ReaFacelRecoInfo.class, ((byte[]) value));
    }

}
