
package uk.co.listpoint.codelist;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CodeList6ServiceSoap", targetNamespace = "http://www.listpoint.co.uk/webservices")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CodeList6ServiceSoap {


    /**
     * Download the contents of a Code List as an XML document
     * 
     * @param codeListName
     * @param userName
     * @param password
     * @param version
     * @return
     *     returns uk.co.listpoint.codelist.CodeList6Structure
     */
    @WebMethod(operationName = "Download", action = "http://www.listpoint.co.uk/soapAction/v6-1/CodeList/Download")
    @WebResult(name = "CodeList", targetNamespace = "http://www.listpoint.co.uk/schemas/v6")
    @RequestWrapper(localName = "Download", targetNamespace = "http://www.listpoint.co.uk/webservices", className = "uk.co.listpoint.codelist.Download")
    @ResponseWrapper(localName = "CodeList", targetNamespace = "http://www.listpoint.co.uk/webservices", className = "uk.co.listpoint.codelist.CodeList")
    public CodeList6Structure download(
        @WebParam(name = "CodeListName", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String codeListName,
        @WebParam(name = "version", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String version,
        @WebParam(name = "UserName", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String userName,
        @WebParam(name = "Password", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String password);

    /**
     * Get the status of a Code List
     * 
     * @param existingCodeListName
     * @param userName
     * @param password
     * @param version
     * @return
     *     returns uk.co.listpoint.codelist.CodeListStatusResponse6Type
     */
    @WebMethod(operationName = "Status", action = "http://www.listpoint.co.uk/soapAction/v6-1/CodeList/Status")
    @WebResult(name = "CodeListStatusResponse", targetNamespace = "http://www.listpoint.co.uk/messages/CodeList")
    @RequestWrapper(localName = "Status", targetNamespace = "http://www.listpoint.co.uk/webservices", className = "uk.co.listpoint.codelist.Status")
    @ResponseWrapper(localName = "CodeListStatusResponse", targetNamespace = "http://www.listpoint.co.uk/webservices", className = "uk.co.listpoint.codelist.CodeListStatusResponse")
    public CodeListStatusResponse6Type status(
        @WebParam(name = "ExistingCodeListName", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String existingCodeListName,
        @WebParam(name = "version", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String version,
        @WebParam(name = "UserName", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String userName,
        @WebParam(name = "Password", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String password);

    /**
     * Start a new draft of an existing Code List
     * 
     * @param existingCodeListName
     * @param userName
     * @param password
     * @param version
     * @return
     *     returns uk.co.listpoint.codelist.CodeListStartNewDraftResponse6Type
     */
    @WebMethod(operationName = "StartNewDraft", action = "http://www.listpoint.co.uk/soapAction/v6-1/CodeList/StartNewDraft")
    @WebResult(name = "CodeListStartNewDraftResponse", targetNamespace = "http://www.listpoint.co.uk/messages/CodeList")
    @RequestWrapper(localName = "StartNewDraft", targetNamespace = "http://www.listpoint.co.uk/webservices", className = "uk.co.listpoint.codelist.StartNewDraft")
    @ResponseWrapper(localName = "CodeListStartNewDraftResponse", targetNamespace = "http://www.listpoint.co.uk/webservices", className = "uk.co.listpoint.codelist.CodeListStartNewDraftResponse")
    public CodeListStartNewDraftResponse6Type startNewDraft(
        @WebParam(name = "ExistingCodeListName", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String existingCodeListName,
        @WebParam(name = "version", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String version,
        @WebParam(name = "UserName", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String userName,
        @WebParam(name = "Password", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String password);

    /**
     * Delete an existing draft Code List
     * 
     * @param userName
     * @param password
     * @param draftCodeListName
     * @param version
     * @return
     *     returns uk.co.listpoint.codelist.CodeListDeleteDraftResponse6Type
     */
    @WebMethod(operationName = "DeleteDraft", action = "http://www.listpoint.co.uk/soapAction/v6-1/CodeList/DeleteDraft")
    @WebResult(name = "CodeListDeleteResponse", targetNamespace = "http://www.listpoint.co.uk/messages/CodeList")
    @RequestWrapper(localName = "DeleteDraft", targetNamespace = "http://www.listpoint.co.uk/webservices", className = "uk.co.listpoint.codelist.DeleteDraft")
    @ResponseWrapper(localName = "CodeListDeleteResponse", targetNamespace = "http://www.listpoint.co.uk/webservices", className = "uk.co.listpoint.codelist.CodeListDeleteResponse")
    public CodeListDeleteDraftResponse6Type deleteDraft(
        @WebParam(name = "DraftCodeListName", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String draftCodeListName,
        @WebParam(name = "version", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String version,
        @WebParam(name = "UserName", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String userName,
        @WebParam(name = "Password", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String password);

    /**
     * Find all draft Code Lists based on an existing published Code List
     * 
     * @param publishedCodeListName
     * @param userName
     * @param password
     * @param version
     * @return
     *     returns uk.co.listpoint.codelist.CodeListFindDraftsResponse6Type
     */
    @WebMethod(operationName = "FindDrafts", action = "http://www.listpoint.co.uk/soapAction/v6-1/CodeList/FindDrafts")
    @WebResult(name = "CodeListFindDraftsResponse", targetNamespace = "http://www.listpoint.co.uk/messages/CodeList")
    @RequestWrapper(localName = "FindDrafts", targetNamespace = "http://www.listpoint.co.uk/webservices", className = "uk.co.listpoint.codelist.FindDrafts")
    @ResponseWrapper(localName = "CodeListFindDraftsResponse", targetNamespace = "http://www.listpoint.co.uk/webservices", className = "uk.co.listpoint.codelist.CodeListFindDraftsResponse")
    public CodeListFindDraftsResponse6Type findDrafts(
        @WebParam(name = "PublishedCodeListName", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String publishedCodeListName,
        @WebParam(name = "version", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String version,
        @WebParam(name = "UserName", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String userName,
        @WebParam(name = "Password", targetNamespace = "http://www.listpoint.co.uk/webservices")
        String password);

    /**
     * Upload an XML document to replace the contents of an existing draft Code List
     * 
     * @param request
     * @return
     *     returns uk.co.listpoint.codelist.CodeListUploadResponse6Type
     */
    @WebMethod(operationName = "Upload", action = "http://www.listpoint.co.uk/soapAction/v6-1/CodeList/Upload")
    @WebResult(name = "CodeListUploadResponse", targetNamespace = "http://www.listpoint.co.uk/messages/CodeList")
    @RequestWrapper(localName = "Upload", targetNamespace = "http://www.listpoint.co.uk/webservices", className = "uk.co.listpoint.codelist.Upload")
    @ResponseWrapper(localName = "CodeListUploadResponse", targetNamespace = "http://www.listpoint.co.uk/webservices", className = "uk.co.listpoint.codelist.CodeListUploadResponse")
    public CodeListUploadResponse6Type upload(
        @WebParam(name = "request", targetNamespace = "http://www.listpoint.co.uk/webservices")
        CodeListUploadRequest6Type request);

}
