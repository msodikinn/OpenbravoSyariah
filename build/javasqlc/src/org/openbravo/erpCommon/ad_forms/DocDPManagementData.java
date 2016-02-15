//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_forms;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class DocDPManagementData implements FieldProvider {
static Logger log4j = Logger.getLogger(DocDPManagementData.class);
  private String InitRecordNumber="0";
  public String adClientId;
  public String adOrgId;
  public String cCurrencyId;
  public String description;
  public String posted;
  public String dateacct;
  public String cProjectId;
  public String cCampaignId;
  public String cActivityId;
  public String user1Id;
  public String user2Id;
  public String acct;
  public String documentno;
  public String ismanual;
  public String isdirectposting;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("POSTED"))
      return posted;
    else if (fieldName.equalsIgnoreCase("DATEACCT"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("C_CAMPAIGN_ID") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("C_ACTIVITY_ID") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("USER1_ID") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("USER2_ID") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("ACCT"))
      return acct;
    else if (fieldName.equalsIgnoreCase("DOCUMENTNO"))
      return documentno;
    else if (fieldName.equalsIgnoreCase("ISMANUAL"))
      return ismanual;
    else if (fieldName.equalsIgnoreCase("ISDIRECTPOSTING"))
      return isdirectposting;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static DocDPManagementData[] select(ConnectionProvider connectionProvider, String c_DP_management_ID)    throws ServletException {
    return select(connectionProvider, c_DP_management_ID, 0, 0);
  }

  public static DocDPManagementData[] select(ConnectionProvider connectionProvider, String c_DP_management_ID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT AD_CLIENT_ID, AD_ORG_ID, C_CURRENCY_ID, DESCRIPTION, POSTED, DATEACCT," +
      "      C_PROJECT_ID, C_CAMPAIGN_ID, C_ACTIVITY_ID, USER1_ID, USER2_ID, '' AS ACCT, " +
      "      DOCUMENTNO, '' AS ISMANUAL, '' AS ISDIRECTPOSTING" +
      "      FROM c_DP_Management" +
      "      WHERE c_DP_management_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, c_DP_management_ID);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        DocDPManagementData objectDocDPManagementData = new DocDPManagementData();
        objectDocDPManagementData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocDPManagementData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocDPManagementData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectDocDPManagementData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocDPManagementData.posted = UtilSql.getValue(result, "POSTED");
        objectDocDPManagementData.dateacct = UtilSql.getDateValue(result, "DATEACCT", "dd-MM-yyyy");
        objectDocDPManagementData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocDPManagementData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocDPManagementData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocDPManagementData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocDPManagementData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocDPManagementData.acct = UtilSql.getValue(result, "ACCT");
        objectDocDPManagementData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectDocDPManagementData.ismanual = UtilSql.getValue(result, "ISMANUAL");
        objectDocDPManagementData.isdirectposting = UtilSql.getValue(result, "ISDIRECTPOSTING");
        objectDocDPManagementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocDPManagementData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    DocDPManagementData objectDocDPManagementData[] = new DocDPManagementData[vector.size()];
    vector.copyInto(objectDocDPManagementData);
    return(objectDocDPManagementData);
  }

  public static DocDPManagementData[] selectRegistro(ConnectionProvider connectionProvider, String client, String id)    throws ServletException {
    return selectRegistro(connectionProvider, client, id, 0, 0);
  }

  public static DocDPManagementData[] selectRegistro(ConnectionProvider connectionProvider, String client, String id, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "      SELECT AD_CLIENT_ID, AD_ORG_ID, C_CURRENCY_ID, DESCRIPTION, POSTED, DATEACCT," +
      "      C_PROJECT_ID, C_CAMPAIGN_ID, C_ACTIVITY_ID, USER1_ID, USER2_ID, DOCUMENTNO" +
      "      FROM c_DP_Management" +
      "      WHERE AD_Client_ID=? " +
      "        and c_DP_management_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, client);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        DocDPManagementData objectDocDPManagementData = new DocDPManagementData();
        objectDocDPManagementData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectDocDPManagementData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectDocDPManagementData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectDocDPManagementData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectDocDPManagementData.posted = UtilSql.getValue(result, "POSTED");
        objectDocDPManagementData.dateacct = UtilSql.getDateValue(result, "DATEACCT", "dd-MM-yyyy");
        objectDocDPManagementData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectDocDPManagementData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectDocDPManagementData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectDocDPManagementData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectDocDPManagementData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectDocDPManagementData.documentno = UtilSql.getValue(result, "DOCUMENTNO");
        objectDocDPManagementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocDPManagementData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    DocDPManagementData objectDocDPManagementData[] = new DocDPManagementData[vector.size()];
    vector.copyInto(objectDocDPManagementData);
    return(objectDocDPManagementData);
  }

  public static DocDPManagementData[] selectReceiptAcct(ConnectionProvider connectionProvider, String partnerID, String AcctSchema, String Status)    throws ServletException {
    return selectReceiptAcct(connectionProvider, partnerID, AcctSchema, Status, 0, 0);
  }

  public static DocDPManagementData[] selectReceiptAcct(ConnectionProvider connectionProvider, String partnerID, String AcctSchema, String Status, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select coalesce(" +
      "          (SELECT C_RECEIVABLE_ACCT " +
      "          FROM c_bp_customer_acct" +
      "          WHERE C_BPARTNER_ID = ?" +
      "          AND C_AcctSchema_ID = ?" +
      "          AND STATUS = ?)," +
      "          (SELECT C_RECEIVABLE_ACCT " +
      "          FROM c_bp_customer_acct" +
      "          WHERE C_BPARTNER_ID = ?" +
      "          AND C_AcctSchema_ID = ?" +
      "          AND STATUS is null)) as ACCT from dual";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, partnerID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AcctSchema);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, Status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, partnerID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AcctSchema);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        DocDPManagementData objectDocDPManagementData = new DocDPManagementData();
        objectDocDPManagementData.acct = UtilSql.getValue(result, "ACCT");
        objectDocDPManagementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocDPManagementData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    DocDPManagementData objectDocDPManagementData[] = new DocDPManagementData[vector.size()];
    vector.copyInto(objectDocDPManagementData);
    return(objectDocDPManagementData);
  }

  public static DocDPManagementData[] selectNoReceiptAcct(ConnectionProvider connectionProvider, String partnerID, String AcctSchema, String Status)    throws ServletException {
    return selectNoReceiptAcct(connectionProvider, partnerID, AcctSchema, Status, 0, 0);
  }

  public static DocDPManagementData[] selectNoReceiptAcct(ConnectionProvider connectionProvider, String partnerID, String AcctSchema, String Status, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        select coalesce (" +
      "          (SELECT V_LIABILITY_ACCT " +
      "          FROM c_bp_vendor_acct" +
      "          WHERE C_BPARTNER_ID = ?" +
      "          AND C_AcctSchema_ID = ?" +
      "          AND STATUS = ?)," +
      "          (SELECT V_LIABILITY_ACCT" +
      "          FROM c_bp_vendor_acct" +
      "          WHERE C_BPARTNER_ID = ?" +
      "          AND C_AcctSchema_ID = ?" +
      "          AND STATUS is null)) as ACCT from dual";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, partnerID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AcctSchema);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, Status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, partnerID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, AcctSchema);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        DocDPManagementData objectDocDPManagementData = new DocDPManagementData();
        objectDocDPManagementData.acct = UtilSql.getValue(result, "ACCT");
        objectDocDPManagementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocDPManagementData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    DocDPManagementData objectDocDPManagementData[] = new DocDPManagementData[vector.size()];
    vector.copyInto(objectDocDPManagementData);
    return(objectDocDPManagementData);
  }

  public static DocDPManagementData[] paymentInformation(ConnectionProvider connectionProvider, String paymentID)    throws ServletException {
    return paymentInformation(connectionProvider, paymentID, 0, 0);
  }

  public static DocDPManagementData[] paymentInformation(ConnectionProvider connectionProvider, String paymentID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "       SELECT DP.ISMANUAL, DP.ISDIRECTPOSTING" +
      "       FROM C_DP_MANAGEMENTLINE L, C_DEBT_PAYMENT DP" +
      "       WHERE DP.C_DEBT_PAYMENT_ID=L.C_DEBT_PAYMENT_ID" +
      "         AND L.C_DP_MANAGEMENT_ID = ?";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentID);

      result = st.executeQuery();
      long countRecord = 0;
      long countRecordSkip = 1;
      boolean continueResult = true;
      while(countRecordSkip < firstRegister && continueResult) {
        continueResult = result.next();
        countRecordSkip++;
      }
      while(continueResult && result.next()) {
        countRecord++;
        DocDPManagementData objectDocDPManagementData = new DocDPManagementData();
        objectDocDPManagementData.ismanual = UtilSql.getValue(result, "ISMANUAL");
        objectDocDPManagementData.isdirectposting = UtilSql.getValue(result, "ISDIRECTPOSTING");
        objectDocDPManagementData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectDocDPManagementData);
        if (countRecord >= numberRegisters && numberRegisters != 0) {
          continueResult = false;
        }
      }
      result.close();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releasePreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    DocDPManagementData objectDocDPManagementData[] = new DocDPManagementData[vector.size()];
    vector.copyInto(objectDocDPManagementData);
    return(objectDocDPManagementData);
  }
}