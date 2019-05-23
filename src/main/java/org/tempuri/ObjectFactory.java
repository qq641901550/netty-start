
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.ivps_ws.ArrayOfAlarmInfo;
import org.datacontract.schemas._2004._07.ivps_ws.ArrayOfCameraInfo;
import org.datacontract.schemas._2004._07.ivps_ws.ArrayOfReaFacelRecoInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _GetCameraListToken_QNAME = new QName("http://tempuri.org/", "token");
    private final static QName _GetReaFacelRecoInfoListFilterIds_QNAME = new QName("http://tempuri.org/", "filterIds");
    private final static QName _SearchPersonReturnJosnResponseSearchPersonReturnJosnResult_QNAME = new QName("http://tempuri.org/", "SearchPersonReturnJosnResult");
    private final static QName _LoginResponseLoginResult_QNAME = new QName("http://tempuri.org/", "LoginResult");
    private final static QName _GetRealAlarmListResponseGetRealAlarmListResult_QNAME = new QName("http://tempuri.org/", "GetRealAlarmListResult");
    private final static QName _GetReaFacelRecoInfoListResponseGetReaFacelRecoInfoListResult_QNAME = new QName("http://tempuri.org/", "GetReaFacelRecoInfoListResult");
    private final static QName _SearchPersonReturnJosnJpegPicBytes_QNAME = new QName("http://tempuri.org/", "jpegPicBytes");
    private final static QName _LoginUid_QNAME = new QName("http://tempuri.org/", "uid");
    private final static QName _LoginPwd_QNAME = new QName("http://tempuri.org/", "pwd");
    private final static QName _GetCameraListResponseGetCameraListResult_QNAME = new QName("http://tempuri.org/", "GetCameraListResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemovePersonInfo }
     * 
     */
    public RemovePersonInfo createRemovePersonInfo() {
        return new RemovePersonInfo();
    }

    /**
     * Create an instance of {@link GetPersonCountExResponse }
     * 
     */
    public GetPersonCountExResponse createGetPersonCountExResponse() {
        return new GetPersonCountExResponse();
    }

    /**
     * Create an instance of {@link GetPersonFirstFacePicBytes }
     * 
     */
    public GetPersonFirstFacePicBytes createGetPersonFirstFacePicBytes() {
        return new GetPersonFirstFacePicBytes();
    }

    /**
     * Create an instance of {@link GetRealAlarmList }
     * 
     */
    public GetRealAlarmList createGetRealAlarmList() {
        return new GetRealAlarmList();
    }

    /**
     * Create an instance of {@link HasExistClientsQuestRealVideoStream }
     * 
     */
    public HasExistClientsQuestRealVideoStream createHasExistClientsQuestRealVideoStream() {
        return new HasExistClientsQuestRealVideoStream();
    }

    /**
     * Create an instance of {@link GetAllPersonInfoListByPersonTypeResponse }
     * 
     */
    public GetAllPersonInfoListByPersonTypeResponse createGetAllPersonInfoListByPersonTypeResponse() {
        return new GetAllPersonInfoListByPersonTypeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPersonInfo }
     * 
     */
    public ArrayOfPersonInfo createArrayOfPersonInfo() {
        return new ArrayOfPersonInfo();
    }

    /**
     * Create an instance of {@link UpRealVideoStream }
     * 
     */
    public UpRealVideoStream createUpRealVideoStream() {
        return new UpRealVideoStream();
    }

    /**
     * Create an instance of {@link GetReaFacelRecoInfoList }
     * 
     */
    public GetReaFacelRecoInfoList createGetReaFacelRecoInfoList() {
        return new GetReaFacelRecoInfoList();
    }

    /**
     * Create an instance of {@link ExistPersonInfoResponse }
     * 
     */
    public ExistPersonInfoResponse createExistPersonInfoResponse() {
        return new ExistPersonInfoResponse();
    }

    /**
     * Create an instance of {@link ControlIOOutputResponse }
     * 
     */
    public ControlIOOutputResponse createControlIOOutputResponse() {
        return new ControlIOOutputResponse();
    }

    /**
     * Create an instance of {@link CheckPersonHasAuthorizationPolicyAuth }
     * 
     */
    public CheckPersonHasAuthorizationPolicyAuth createCheckPersonHasAuthorizationPolicyAuth() {
        return new CheckPersonHasAuthorizationPolicyAuth();
    }

    /**
     * Create an instance of {@link GetPersonListByPageResponse }
     * 
     */
    public GetPersonListByPageResponse createGetPersonListByPageResponse() {
        return new GetPersonListByPageResponse();
    }

    /**
     * Create an instance of {@link SearchPersonByPersonId }
     * 
     */
    public SearchPersonByPersonId createSearchPersonByPersonId() {
        return new SearchPersonByPersonId();
    }

    /**
     * Create an instance of {@link GetPersonCount }
     * 
     */
    public GetPersonCount createGetPersonCount() {
        return new GetPersonCount();
    }

    /**
     * Create an instance of {@link GetPersonListByPageExResponse }
     * 
     */
    public GetPersonListByPageExResponse createGetPersonListByPageExResponse() {
        return new GetPersonListByPageExResponse();
    }

    /**
     * Create an instance of {@link RemoveVisitorPersonInfo }
     * 
     */
    public RemoveVisitorPersonInfo createRemoveVisitorPersonInfo() {
        return new RemoveVisitorPersonInfo();
    }

    /**
     * Create an instance of {@link DetectObjects }
     * 
     */
    public DetectObjects createDetectObjects() {
        return new DetectObjects();
    }

    /**
     * Create an instance of {@link ControlIOOutput }
     * 
     */
    public ControlIOOutput createControlIOOutput() {
        return new ControlIOOutput();
    }

    /**
     * Create an instance of {@link RemoveVisitorPersonInfoResponse }
     * 
     */
    public RemoveVisitorPersonInfoResponse createRemoveVisitorPersonInfoResponse() {
        return new RemoveVisitorPersonInfoResponse();
    }

    /**
     * Create an instance of {@link AddRecoScuessRecordToDbResponse }
     * 
     */
    public AddRecoScuessRecordToDbResponse createAddRecoScuessRecordToDbResponse() {
        return new AddRecoScuessRecordToDbResponse();
    }

    /**
     * Create an instance of {@link AddPersonInfoExResponse }
     * 
     */
    public AddPersonInfoExResponse createAddPersonInfoExResponse() {
        return new AddPersonInfoExResponse();
    }

    /**
     * Create an instance of {@link VipPersonLogin }
     * 
     */
    public VipPersonLogin createVipPersonLogin() {
        return new VipPersonLogin();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link GetPersonCountResponse }
     * 
     */
    public GetPersonCountResponse createGetPersonCountResponse() {
        return new GetPersonCountResponse();
    }

    /**
     * Create an instance of {@link SearchPersonByPersonIdResponse }
     * 
     */
    public SearchPersonByPersonIdResponse createSearchPersonByPersonIdResponse() {
        return new SearchPersonByPersonIdResponse();
    }

    /**
     * Create an instance of {@link GetPersonInfoResponse }
     * 
     */
    public GetPersonInfoResponse createGetPersonInfoResponse() {
        return new GetPersonInfoResponse();
    }

    /**
     * Create an instance of {@link PersonInfo }
     * 
     */
    public PersonInfo createPersonInfo() {
        return new PersonInfo();
    }

    /**
     * Create an instance of {@link GetMediaHistoryDataListPersonIDResponse }
     * 
     */
    public GetMediaHistoryDataListPersonIDResponse createGetMediaHistoryDataListPersonIDResponse() {
        return new GetMediaHistoryDataListPersonIDResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMediaEventRecordInfo }
     * 
     */
    public ArrayOfMediaEventRecordInfo createArrayOfMediaEventRecordInfo() {
        return new ArrayOfMediaEventRecordInfo();
    }

    /**
     * Create an instance of {@link SearchPersonReturnJosn }
     * 
     */
    public SearchPersonReturnJosn createSearchPersonReturnJosn() {
        return new SearchPersonReturnJosn();
    }

    /**
     * Create an instance of {@link AddIDCardAndFaceRecoRecordToDbResponse }
     * 
     */
    public AddIDCardAndFaceRecoRecordToDbResponse createAddIDCardAndFaceRecoRecordToDbResponse() {
        return new AddIDCardAndFaceRecoRecordToDbResponse();
    }

    /**
     * Create an instance of {@link GetCurDateTime }
     * 
     */
    public GetCurDateTime createGetCurDateTime() {
        return new GetCurDateTime();
    }

    /**
     * Create an instance of {@link AddIDCardAndFaceRecoRecordToDb }
     * 
     */
    public AddIDCardAndFaceRecoRecordToDb createAddIDCardAndFaceRecoRecordToDb() {
        return new AddIDCardAndFaceRecoRecordToDb();
    }

    /**
     * Create an instance of {@link IDCardInfo }
     * 
     */
    public IDCardInfo createIDCardInfo() {
        return new IDCardInfo();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link HasExistClientsQuestRealVideoStreamResponse }
     * 
     */
    public HasExistClientsQuestRealVideoStreamResponse createHasExistClientsQuestRealVideoStreamResponse() {
        return new HasExistClientsQuestRealVideoStreamResponse();
    }

    /**
     * Create an instance of {@link GetGlobalPersonLastUpdateFlagResponse }
     * 
     */
    public GetGlobalPersonLastUpdateFlagResponse createGetGlobalPersonLastUpdateFlagResponse() {
        return new GetGlobalPersonLastUpdateFlagResponse();
    }

    /**
     * Create an instance of {@link GetCameraListResponse }
     * 
     */
    public GetCameraListResponse createGetCameraListResponse() {
        return new GetCameraListResponse();
    }

    /**
     * Create an instance of {@link UpFacePicReco }
     * 
     */
    public UpFacePicReco createUpFacePicReco() {
        return new UpFacePicReco();
    }

    /**
     * Create an instance of {@link GetMediaHistoryDataCountResponse }
     * 
     */
    public GetMediaHistoryDataCountResponse createGetMediaHistoryDataCountResponse() {
        return new GetMediaHistoryDataCountResponse();
    }

    /**
     * Create an instance of {@link GetPersonKeyInfoListByCameraIDResponse }
     * 
     */
    public GetPersonKeyInfoListByCameraIDResponse createGetPersonKeyInfoListByCameraIDResponse() {
        return new GetPersonKeyInfoListByCameraIDResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPersonKeyInfo }
     * 
     */
    public ArrayOfPersonKeyInfo createArrayOfPersonKeyInfo() {
        return new ArrayOfPersonKeyInfo();
    }

    /**
     * Create an instance of {@link GetPicFileBytesResponse }
     * 
     */
    public GetPicFileBytesResponse createGetPicFileBytesResponse() {
        return new GetPicFileBytesResponse();
    }

    /**
     * Create an instance of {@link DetectObjectsResponse }
     * 
     */
    public DetectObjectsResponse createDetectObjectsResponse() {
        return new DetectObjectsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfObjectDetectInfo }
     * 
     */
    public ArrayOfObjectDetectInfo createArrayOfObjectDetectInfo() {
        return new ArrayOfObjectDetectInfo();
    }

    /**
     * Create an instance of {@link GetVisitorInfoListByCreateVipPersonID }
     * 
     */
    public GetVisitorInfoListByCreateVipPersonID createGetVisitorInfoListByCreateVipPersonID() {
        return new GetVisitorInfoListByCreateVipPersonID();
    }

    /**
     * Create an instance of {@link GetMediaHistoryDataList }
     * 
     */
    public GetMediaHistoryDataList createGetMediaHistoryDataList() {
        return new GetMediaHistoryDataList();
    }

    /**
     * Create an instance of {@link GetPersonListXmlByPageResponse }
     * 
     */
    public GetPersonListXmlByPageResponse createGetPersonListXmlByPageResponse() {
        return new GetPersonListXmlByPageResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonInfoResponse }
     * 
     */
    public UpdatePersonInfoResponse createUpdatePersonInfoResponse() {
        return new UpdatePersonInfoResponse();
    }

    /**
     * Create an instance of {@link GetMediaHistoryDataCount }
     * 
     */
    public GetMediaHistoryDataCount createGetMediaHistoryDataCount() {
        return new GetMediaHistoryDataCount();
    }

    /**
     * Create an instance of {@link GetAllPersonInfoListByPersonType }
     * 
     */
    public GetAllPersonInfoListByPersonType createGetAllPersonInfoListByPersonType() {
        return new GetAllPersonInfoListByPersonType();
    }

    /**
     * Create an instance of {@link GetPersonInfo }
     * 
     */
    public GetPersonInfo createGetPersonInfo() {
        return new GetPersonInfo();
    }

    /**
     * Create an instance of {@link SearchPerson }
     * 
     */
    public SearchPerson createSearchPerson() {
        return new SearchPerson();
    }

    /**
     * Create an instance of {@link GetReaFacelRecoInfoListResponse }
     * 
     */
    public GetReaFacelRecoInfoListResponse createGetReaFacelRecoInfoListResponse() {
        return new GetReaFacelRecoInfoListResponse();
    }

    /**
     * Create an instance of {@link AddPersonInfo }
     * 
     */
    public AddPersonInfo createAddPersonInfo() {
        return new AddPersonInfo();
    }

    /**
     * Create an instance of {@link GetPicMaxFaceFeatrueInfo }
     * 
     */
    public GetPicMaxFaceFeatrueInfo createGetPicMaxFaceFeatrueInfo() {
        return new GetPicMaxFaceFeatrueInfo();
    }

    /**
     * Create an instance of {@link UpFacePicRecoResponse }
     * 
     */
    public UpFacePicRecoResponse createUpFacePicRecoResponse() {
        return new UpFacePicRecoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUpFacePicRecoResult }
     * 
     */
    public ArrayOfUpFacePicRecoResult createArrayOfUpFacePicRecoResult() {
        return new ArrayOfUpFacePicRecoResult();
    }

    /**
     * Create an instance of {@link GetDoorActionCode }
     * 
     */
    public GetDoorActionCode createGetDoorActionCode() {
        return new GetDoorActionCode();
    }

    /**
     * Create an instance of {@link GetVisitorInfo }
     * 
     */
    public GetVisitorInfo createGetVisitorInfo() {
        return new GetVisitorInfo();
    }

    /**
     * Create an instance of {@link AddPersonInfoEx }
     * 
     */
    public AddPersonInfoEx createAddPersonInfoEx() {
        return new AddPersonInfoEx();
    }

    /**
     * Create an instance of {@link GetMediaHistoryDataListEx }
     * 
     */
    public GetMediaHistoryDataListEx createGetMediaHistoryDataListEx() {
        return new GetMediaHistoryDataListEx();
    }

    /**
     * Create an instance of {@link GetMediaHistoryDataListExResponse }
     * 
     */
    public GetMediaHistoryDataListExResponse createGetMediaHistoryDataListExResponse() {
        return new GetMediaHistoryDataListExResponse();
    }

    /**
     * Create an instance of {@link CheckPersonHasAuthorizationPolicyAuthResponse }
     * 
     */
    public CheckPersonHasAuthorizationPolicyAuthResponse createCheckPersonHasAuthorizationPolicyAuthResponse() {
        return new CheckPersonHasAuthorizationPolicyAuthResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonInfo }
     * 
     */
    public UpdatePersonInfo createUpdatePersonInfo() {
        return new UpdatePersonInfo();
    }

    /**
     * Create an instance of {@link GetPicMaxFaceFeatrueInfoResponse }
     * 
     */
    public GetPicMaxFaceFeatrueInfoResponse createGetPicMaxFaceFeatrueInfoResponse() {
        return new GetPicMaxFaceFeatrueInfoResponse();
    }

    /**
     * Create an instance of {@link FaceInfo }
     * 
     */
    public FaceInfo createFaceInfo() {
        return new FaceInfo();
    }

    /**
     * Create an instance of {@link AddPersonInfoResponse }
     * 
     */
    public AddPersonInfoResponse createAddPersonInfoResponse() {
        return new AddPersonInfoResponse();
    }

    /**
     * Create an instance of {@link SearchPersonByIDNo }
     * 
     */
    public SearchPersonByIDNo createSearchPersonByIDNo() {
        return new SearchPersonByIDNo();
    }

    /**
     * Create an instance of {@link GetXmlSystemConfigureResponse }
     * 
     */
    public GetXmlSystemConfigureResponse createGetXmlSystemConfigureResponse() {
        return new GetXmlSystemConfigureResponse();
    }

    /**
     * Create an instance of {@link AddRecoFailureRecordToDbResponse }
     * 
     */
    public AddRecoFailureRecordToDbResponse createAddRecoFailureRecordToDbResponse() {
        return new AddRecoFailureRecordToDbResponse();
    }

    /**
     * Create an instance of {@link AddRecoFailureRecordToDb }
     * 
     */
    public AddRecoFailureRecordToDb createAddRecoFailureRecordToDb() {
        return new AddRecoFailureRecordToDb();
    }

    /**
     * Create an instance of {@link SearchPersonResponse }
     * 
     */
    public SearchPersonResponse createSearchPersonResponse() {
        return new SearchPersonResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSearchReturnPersonInfo }
     * 
     */
    public ArrayOfSearchReturnPersonInfo createArrayOfSearchReturnPersonInfo() {
        return new ArrayOfSearchReturnPersonInfo();
    }

    /**
     * Create an instance of {@link GetVisitorInfoResponse }
     * 
     */
    public GetVisitorInfoResponse createGetVisitorInfoResponse() {
        return new GetVisitorInfoResponse();
    }

    /**
     * Create an instance of {@link VisitorInfo }
     * 
     */
    public VisitorInfo createVisitorInfo() {
        return new VisitorInfo();
    }

    /**
     * Create an instance of {@link VipPersonLoginResponse }
     * 
     */
    public VipPersonLoginResponse createVipPersonLoginResponse() {
        return new VipPersonLoginResponse();
    }

    /**
     * Create an instance of {@link GetVisitorInfoListByCreateVipPersonIDResponse }
     * 
     */
    public GetVisitorInfoListByCreateVipPersonIDResponse createGetVisitorInfoListByCreateVipPersonIDResponse() {
        return new GetVisitorInfoListByCreateVipPersonIDResponse();
    }

    /**
     * Create an instance of {@link ArrayOfVisitorInfo }
     * 
     */
    public ArrayOfVisitorInfo createArrayOfVisitorInfo() {
        return new ArrayOfVisitorInfo();
    }

    /**
     * Create an instance of {@link GetGlobalPersonLastUpdateFlag }
     * 
     */
    public GetGlobalPersonLastUpdateFlag createGetGlobalPersonLastUpdateFlag() {
        return new GetGlobalPersonLastUpdateFlag();
    }

    /**
     * Create an instance of {@link GetCameraList }
     * 
     */
    public GetCameraList createGetCameraList() {
        return new GetCameraList();
    }

    /**
     * Create an instance of {@link StoreVisitorPersonInfoResponse }
     * 
     */
    public StoreVisitorPersonInfoResponse createStoreVisitorPersonInfoResponse() {
        return new StoreVisitorPersonInfoResponse();
    }

    /**
     * Create an instance of {@link SearchPersonByIDNoResponse }
     * 
     */
    public SearchPersonByIDNoResponse createSearchPersonByIDNoResponse() {
        return new SearchPersonByIDNoResponse();
    }

    /**
     * Create an instance of {@link AddRecoScuessRecordToDb }
     * 
     */
    public AddRecoScuessRecordToDb createAddRecoScuessRecordToDb() {
        return new AddRecoScuessRecordToDb();
    }

    /**
     * Create an instance of {@link GetDoorActionCodeResponse }
     * 
     */
    public GetDoorActionCodeResponse createGetDoorActionCodeResponse() {
        return new GetDoorActionCodeResponse();
    }

    /**
     * Create an instance of {@link ExistPersonInfo }
     * 
     */
    public ExistPersonInfo createExistPersonInfo() {
        return new ExistPersonInfo();
    }

    /**
     * Create an instance of {@link GetRealAlarmListResponse }
     * 
     */
    public GetRealAlarmListResponse createGetRealAlarmListResponse() {
        return new GetRealAlarmListResponse();
    }

    /**
     * Create an instance of {@link StoreVisitorPersonInfo }
     * 
     */
    public StoreVisitorPersonInfo createStoreVisitorPersonInfo() {
        return new StoreVisitorPersonInfo();
    }

    /**
     * Create an instance of {@link UpRealVideoStreamResponse }
     * 
     */
    public UpRealVideoStreamResponse createUpRealVideoStreamResponse() {
        return new UpRealVideoStreamResponse();
    }

    /**
     * Create an instance of {@link GetPicFileBytes }
     * 
     */
    public GetPicFileBytes createGetPicFileBytes() {
        return new GetPicFileBytes();
    }

    /**
     * Create an instance of {@link RemovePersonInfoResponse }
     * 
     */
    public RemovePersonInfoResponse createRemovePersonInfoResponse() {
        return new RemovePersonInfoResponse();
    }

    /**
     * Create an instance of {@link GetPersonListByPageEx }
     * 
     */
    public GetPersonListByPageEx createGetPersonListByPageEx() {
        return new GetPersonListByPageEx();
    }

    /**
     * Create an instance of {@link SearchPersonExResponse }
     * 
     */
    public SearchPersonExResponse createSearchPersonExResponse() {
        return new SearchPersonExResponse();
    }

    /**
     * Create an instance of {@link GetPersonCountEx }
     * 
     */
    public GetPersonCountEx createGetPersonCountEx() {
        return new GetPersonCountEx();
    }

    /**
     * Create an instance of {@link GetCurDateTimeResponse }
     * 
     */
    public GetCurDateTimeResponse createGetCurDateTimeResponse() {
        return new GetCurDateTimeResponse();
    }

    /**
     * Create an instance of {@link GetMediaHistoryDataListPersonID }
     * 
     */
    public GetMediaHistoryDataListPersonID createGetMediaHistoryDataListPersonID() {
        return new GetMediaHistoryDataListPersonID();
    }

    /**
     * Create an instance of {@link SearchPersonEx }
     * 
     */
    public SearchPersonEx createSearchPersonEx() {
        return new SearchPersonEx();
    }

    /**
     * Create an instance of {@link GetMediaHistoryDataListResponse }
     * 
     */
    public GetMediaHistoryDataListResponse createGetMediaHistoryDataListResponse() {
        return new GetMediaHistoryDataListResponse();
    }

    /**
     * Create an instance of {@link GetPersonListByPage }
     * 
     */
    public GetPersonListByPage createGetPersonListByPage() {
        return new GetPersonListByPage();
    }

    /**
     * Create an instance of {@link GetPersonKeyInfoListByCameraID }
     * 
     */
    public GetPersonKeyInfoListByCameraID createGetPersonKeyInfoListByCameraID() {
        return new GetPersonKeyInfoListByCameraID();
    }

    /**
     * Create an instance of {@link GetXmlSystemConfigure }
     * 
     */
    public GetXmlSystemConfigure createGetXmlSystemConfigure() {
        return new GetXmlSystemConfigure();
    }

    /**
     * Create an instance of {@link SearchPersonReturnJosnResponse }
     * 
     */
    public SearchPersonReturnJosnResponse createSearchPersonReturnJosnResponse() {
        return new SearchPersonReturnJosnResponse();
    }

    /**
     * Create an instance of {@link GetPersonListXmlByPage }
     * 
     */
    public GetPersonListXmlByPage createGetPersonListXmlByPage() {
        return new GetPersonListXmlByPage();
    }

    /**
     * Create an instance of {@link GetPersonFirstFacePicBytesResponse }
     * 
     */
    public GetPersonFirstFacePicBytesResponse createGetPersonFirstFacePicBytesResponse() {
        return new GetPersonFirstFacePicBytesResponse();
    }

    /**
     * Create an instance of {@link MediaEventRecordInfo }
     * 
     */
    public MediaEventRecordInfo createMediaEventRecordInfo() {
        return new MediaEventRecordInfo();
    }

    /**
     * Create an instance of {@link ObjectDetectInfo }
     * 
     */
    public ObjectDetectInfo createObjectDetectInfo() {
        return new ObjectDetectInfo();
    }

    /**
     * Create an instance of {@link ArrayOfFaceInfo }
     * 
     */
    public ArrayOfFaceInfo createArrayOfFaceInfo() {
        return new ArrayOfFaceInfo();
    }

    /**
     * Create an instance of {@link SearchReturnPersonInfo }
     * 
     */
    public SearchReturnPersonInfo createSearchReturnPersonInfo() {
        return new SearchReturnPersonInfo();
    }

    /**
     * Create an instance of {@link ArrayOfPersonCameraData }
     * 
     */
    public ArrayOfPersonCameraData createArrayOfPersonCameraData() {
        return new ArrayOfPersonCameraData();
    }

    /**
     * Create an instance of {@link PersonCameraData }
     * 
     */
    public PersonCameraData createPersonCameraData() {
        return new PersonCameraData();
    }

    /**
     * Create an instance of {@link UpFacePicRecoResult }
     * 
     */
    public UpFacePicRecoResult createUpFacePicRecoResult() {
        return new UpFacePicRecoResult();
    }

    /**
     * Create an instance of {@link ArrayOfInt }
     * 
     */
    public ArrayOfInt createArrayOfInt() {
        return new ArrayOfInt();
    }

    /**
     * Create an instance of {@link PersonKeyInfo }
     * 
     */
    public PersonKeyInfo createPersonKeyInfo() {
        return new PersonKeyInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = GetCameraList.class)
    public JAXBElement<String> createGetCameraListToken(String value) {
        return new JAXBElement<String>(_GetCameraListToken_QNAME, String.class, GetCameraList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filterIds", scope = GetReaFacelRecoInfoList.class)
    public JAXBElement<ArrayOfint> createGetReaFacelRecoInfoListFilterIds(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetReaFacelRecoInfoListFilterIds_QNAME, ArrayOfint.class, GetReaFacelRecoInfoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = GetReaFacelRecoInfoList.class)
    public JAXBElement<String> createGetReaFacelRecoInfoListToken(String value) {
        return new JAXBElement<String>(_GetCameraListToken_QNAME, String.class, GetReaFacelRecoInfoList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SearchPersonReturnJosnResult", scope = SearchPersonReturnJosnResponse.class)
    public JAXBElement<String> createSearchPersonReturnJosnResponseSearchPersonReturnJosnResult(String value) {
        return new JAXBElement<String>(_SearchPersonReturnJosnResponseSearchPersonReturnJosnResult_QNAME, String.class, SearchPersonReturnJosnResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LoginResult", scope = LoginResponse.class)
    public JAXBElement<String> createLoginResponseLoginResult(String value) {
        return new JAXBElement<String>(_LoginResponseLoginResult_QNAME, String.class, LoginResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlarmInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRealAlarmListResult", scope = GetRealAlarmListResponse.class)
    public JAXBElement<ArrayOfAlarmInfo> createGetRealAlarmListResponseGetRealAlarmListResult(ArrayOfAlarmInfo value) {
        return new JAXBElement<ArrayOfAlarmInfo>(_GetRealAlarmListResponseGetRealAlarmListResult_QNAME, ArrayOfAlarmInfo.class, GetRealAlarmListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReaFacelRecoInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetReaFacelRecoInfoListResult", scope = GetReaFacelRecoInfoListResponse.class)
    public JAXBElement<ArrayOfReaFacelRecoInfo> createGetReaFacelRecoInfoListResponseGetReaFacelRecoInfoListResult(ArrayOfReaFacelRecoInfo value) {
        return new JAXBElement<ArrayOfReaFacelRecoInfo>(_GetReaFacelRecoInfoListResponseGetReaFacelRecoInfoListResult_QNAME, ArrayOfReaFacelRecoInfo.class, GetReaFacelRecoInfoListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "filterIds", scope = GetRealAlarmList.class)
    public JAXBElement<ArrayOfstring> createGetRealAlarmListFilterIds(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetReaFacelRecoInfoListFilterIds_QNAME, ArrayOfstring.class, GetRealAlarmList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = GetRealAlarmList.class)
    public JAXBElement<String> createGetRealAlarmListToken(String value) {
        return new JAXBElement<String>(_GetCameraListToken_QNAME, String.class, GetRealAlarmList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = SearchPersonReturnJosn.class)
    public JAXBElement<String> createSearchPersonReturnJosnToken(String value) {
        return new JAXBElement<String>(_GetCameraListToken_QNAME, String.class, SearchPersonReturnJosn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "jpegPicBytes", scope = SearchPersonReturnJosn.class)
    public JAXBElement<byte[]> createSearchPersonReturnJosnJpegPicBytes(byte[] value) {
        return new JAXBElement<byte[]>(_SearchPersonReturnJosnJpegPicBytes_QNAME, byte[].class, SearchPersonReturnJosn.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "uid", scope = Login.class)
    public JAXBElement<String> createLoginUid(String value) {
        return new JAXBElement<String>(_LoginUid_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pwd", scope = Login.class)
    public JAXBElement<String> createLoginPwd(String value) {
        return new JAXBElement<String>(_LoginPwd_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCameraInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCameraListResult", scope = GetCameraListResponse.class)
    public JAXBElement<ArrayOfCameraInfo> createGetCameraListResponseGetCameraListResult(ArrayOfCameraInfo value) {
        return new JAXBElement<ArrayOfCameraInfo>(_GetCameraListResponseGetCameraListResult_QNAME, ArrayOfCameraInfo.class, GetCameraListResponse.class, value);
    }

}
