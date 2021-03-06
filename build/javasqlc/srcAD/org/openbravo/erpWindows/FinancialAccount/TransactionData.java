//Sqlc generated V1.O00-1
package org.openbravo.erpWindows.FinancialAccount;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

/**
WAD Generated class
 */
class TransactionData implements FieldProvider {
static Logger log4j = Logger.getLogger(TransactionData.class);
  private String InitRecordNumber="0";
  public String created;
  public String createdbyr;
  public String updated;
  public String updatedTimeStamp;
  public String updatedby;
  public String updatedbyr;
  public String line;
  public String trxtype;
  public String trxtyper;
  public String status;
  public String statusr;
  public String createdbyalgorithm;
  public String isactive;
  public String statementdate;
  public String dateacct;
  public String emAprmModify;
  public String finFinancialAccountId;
  public String finReconciliationId;
  public String finReconciliationIdr;
  public String finPaymentId;
  public String description;
  public String cGlitemId;
  public String cGlitemIdr;
  public String cCurrencyId;
  public String cCurrencyIdr;
  public String depositamt;
  public String paymentamt;
  public String processed;
  public String foreignCurrencyId;
  public String foreignCurrencyIdr;
  public String processing;
  public String foreignAmount;
  public String posted;
  public String postedBtn;
  public String emAprmDelete;
  public String foreignConvertRate;
  public String adOrgId;
  public String adOrgIdr;
  public String cBpartnerId;
  public String cBpartnerIdr;
  public String mProductId;
  public String mProductIdr;
  public String cProjectId;
  public String cProjectIdr;
  public String cCostcenterId;
  public String cCampaignId;
  public String cCampaignIdr;
  public String cActivityId;
  public String cActivityIdr;
  public String cSalesregionId;
  public String cSalesregionIdr;
  public String user1Id;
  public String user2Id;
  public String adClientId;
  public String finFinaccTransactionId;
  public String language;
  public String adUserClient;
  public String adOrgClient;
  public String createdby;
  public String trBgcolor;
  public String totalCount;
  public String dateTimeFormat;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("CREATED"))
      return created;
    else if (fieldName.equalsIgnoreCase("CREATEDBYR"))
      return createdbyr;
    else if (fieldName.equalsIgnoreCase("UPDATED"))
      return updated;
    else if (fieldName.equalsIgnoreCase("UPDATED_TIME_STAMP") || fieldName.equals("updatedTimeStamp"))
      return updatedTimeStamp;
    else if (fieldName.equalsIgnoreCase("UPDATEDBY"))
      return updatedby;
    else if (fieldName.equalsIgnoreCase("UPDATEDBYR"))
      return updatedbyr;
    else if (fieldName.equalsIgnoreCase("LINE"))
      return line;
    else if (fieldName.equalsIgnoreCase("TRXTYPE"))
      return trxtype;
    else if (fieldName.equalsIgnoreCase("TRXTYPER"))
      return trxtyper;
    else if (fieldName.equalsIgnoreCase("STATUS"))
      return status;
    else if (fieldName.equalsIgnoreCase("STATUSR"))
      return statusr;
    else if (fieldName.equalsIgnoreCase("CREATEDBYALGORITHM"))
      return createdbyalgorithm;
    else if (fieldName.equalsIgnoreCase("ISACTIVE"))
      return isactive;
    else if (fieldName.equalsIgnoreCase("STATEMENTDATE"))
      return statementdate;
    else if (fieldName.equalsIgnoreCase("DATEACCT"))
      return dateacct;
    else if (fieldName.equalsIgnoreCase("EM_APRM_MODIFY") || fieldName.equals("emAprmModify"))
      return emAprmModify;
    else if (fieldName.equalsIgnoreCase("FIN_FINANCIAL_ACCOUNT_ID") || fieldName.equals("finFinancialAccountId"))
      return finFinancialAccountId;
    else if (fieldName.equalsIgnoreCase("FIN_RECONCILIATION_ID") || fieldName.equals("finReconciliationId"))
      return finReconciliationId;
    else if (fieldName.equalsIgnoreCase("FIN_RECONCILIATION_IDR") || fieldName.equals("finReconciliationIdr"))
      return finReconciliationIdr;
    else if (fieldName.equalsIgnoreCase("FIN_PAYMENT_ID") || fieldName.equals("finPaymentId"))
      return finPaymentId;
    else if (fieldName.equalsIgnoreCase("DESCRIPTION"))
      return description;
    else if (fieldName.equalsIgnoreCase("C_GLITEM_ID") || fieldName.equals("cGlitemId"))
      return cGlitemId;
    else if (fieldName.equalsIgnoreCase("C_GLITEM_IDR") || fieldName.equals("cGlitemIdr"))
      return cGlitemIdr;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_ID") || fieldName.equals("cCurrencyId"))
      return cCurrencyId;
    else if (fieldName.equalsIgnoreCase("C_CURRENCY_IDR") || fieldName.equals("cCurrencyIdr"))
      return cCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("DEPOSITAMT"))
      return depositamt;
    else if (fieldName.equalsIgnoreCase("PAYMENTAMT"))
      return paymentamt;
    else if (fieldName.equalsIgnoreCase("PROCESSED"))
      return processed;
    else if (fieldName.equalsIgnoreCase("FOREIGN_CURRENCY_ID") || fieldName.equals("foreignCurrencyId"))
      return foreignCurrencyId;
    else if (fieldName.equalsIgnoreCase("FOREIGN_CURRENCY_IDR") || fieldName.equals("foreignCurrencyIdr"))
      return foreignCurrencyIdr;
    else if (fieldName.equalsIgnoreCase("PROCESSING"))
      return processing;
    else if (fieldName.equalsIgnoreCase("FOREIGN_AMOUNT") || fieldName.equals("foreignAmount"))
      return foreignAmount;
    else if (fieldName.equalsIgnoreCase("POSTED"))
      return posted;
    else if (fieldName.equalsIgnoreCase("POSTED_BTN") || fieldName.equals("postedBtn"))
      return postedBtn;
    else if (fieldName.equalsIgnoreCase("EM_APRM_DELETE") || fieldName.equals("emAprmDelete"))
      return emAprmDelete;
    else if (fieldName.equalsIgnoreCase("FOREIGN_CONVERT_RATE") || fieldName.equals("foreignConvertRate"))
      return foreignConvertRate;
    else if (fieldName.equalsIgnoreCase("AD_ORG_ID") || fieldName.equals("adOrgId"))
      return adOrgId;
    else if (fieldName.equalsIgnoreCase("AD_ORG_IDR") || fieldName.equals("adOrgIdr"))
      return adOrgIdr;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_ID") || fieldName.equals("cBpartnerId"))
      return cBpartnerId;
    else if (fieldName.equalsIgnoreCase("C_BPARTNER_IDR") || fieldName.equals("cBpartnerIdr"))
      return cBpartnerIdr;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_ID") || fieldName.equals("mProductId"))
      return mProductId;
    else if (fieldName.equalsIgnoreCase("M_PRODUCT_IDR") || fieldName.equals("mProductIdr"))
      return mProductIdr;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_ID") || fieldName.equals("cProjectId"))
      return cProjectId;
    else if (fieldName.equalsIgnoreCase("C_PROJECT_IDR") || fieldName.equals("cProjectIdr"))
      return cProjectIdr;
    else if (fieldName.equalsIgnoreCase("C_COSTCENTER_ID") || fieldName.equals("cCostcenterId"))
      return cCostcenterId;
    else if (fieldName.equalsIgnoreCase("C_CAMPAIGN_ID") || fieldName.equals("cCampaignId"))
      return cCampaignId;
    else if (fieldName.equalsIgnoreCase("C_CAMPAIGN_IDR") || fieldName.equals("cCampaignIdr"))
      return cCampaignIdr;
    else if (fieldName.equalsIgnoreCase("C_ACTIVITY_ID") || fieldName.equals("cActivityId"))
      return cActivityId;
    else if (fieldName.equalsIgnoreCase("C_ACTIVITY_IDR") || fieldName.equals("cActivityIdr"))
      return cActivityIdr;
    else if (fieldName.equalsIgnoreCase("C_SALESREGION_ID") || fieldName.equals("cSalesregionId"))
      return cSalesregionId;
    else if (fieldName.equalsIgnoreCase("C_SALESREGION_IDR") || fieldName.equals("cSalesregionIdr"))
      return cSalesregionIdr;
    else if (fieldName.equalsIgnoreCase("USER1_ID") || fieldName.equals("user1Id"))
      return user1Id;
    else if (fieldName.equalsIgnoreCase("USER2_ID") || fieldName.equals("user2Id"))
      return user2Id;
    else if (fieldName.equalsIgnoreCase("AD_CLIENT_ID") || fieldName.equals("adClientId"))
      return adClientId;
    else if (fieldName.equalsIgnoreCase("FIN_FINACC_TRANSACTION_ID") || fieldName.equals("finFinaccTransactionId"))
      return finFinaccTransactionId;
    else if (fieldName.equalsIgnoreCase("LANGUAGE"))
      return language;
    else if (fieldName.equals("adUserClient"))
      return adUserClient;
    else if (fieldName.equals("adOrgClient"))
      return adOrgClient;
    else if (fieldName.equals("createdby"))
      return createdby;
    else if (fieldName.equals("trBgcolor"))
      return trBgcolor;
    else if (fieldName.equals("totalCount"))
      return totalCount;
    else if (fieldName.equals("dateTimeFormat"))
      return dateTimeFormat;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

/**
Select for edit
 */
  public static TransactionData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String finFinancialAccountId, String key, String adUserClient, String adOrgClient)    throws ServletException {
    return selectEdit(connectionProvider, dateTimeFormat, paramLanguage, finFinancialAccountId, key, adUserClient, adOrgClient, 0, 0);
  }

/**
Select for edit
 */
  public static TransactionData[] selectEdit(ConnectionProvider connectionProvider, String dateTimeFormat, String paramLanguage, String finFinancialAccountId, String key, String adUserClient, String adOrgClient, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(FIN_Finacc_Transaction.Created, ?) as created, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = FIN_Finacc_Transaction.CreatedBy) as CreatedByR, " +
      "        to_char(FIN_Finacc_Transaction.Updated, ?) as updated, " +
      "        to_char(FIN_Finacc_Transaction.Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp,  " +
      "        FIN_Finacc_Transaction.UpdatedBy, " +
      "        (SELECT NAME FROM AD_USER u WHERE AD_USER_ID = FIN_Finacc_Transaction.UpdatedBy) as UpdatedByR," +
      "        FIN_Finacc_Transaction.Line, " +
      "FIN_Finacc_Transaction.Trxtype, " +
      "(CASE WHEN FIN_Finacc_Transaction.Trxtype IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list1.name),'') ) END) AS TrxtypeR, " +
      "FIN_Finacc_Transaction.Status, " +
      "(CASE WHEN FIN_Finacc_Transaction.Status IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(list2.name),'') ) END) AS StatusR, " +
      "COALESCE(FIN_Finacc_Transaction.CreatedByAlgorithm, 'N') AS CreatedByAlgorithm, " +
      "COALESCE(FIN_Finacc_Transaction.Isactive, 'N') AS Isactive, " +
      "FIN_Finacc_Transaction.Statementdate, " +
      "FIN_Finacc_Transaction.DateAcct, " +
      "FIN_Finacc_Transaction.EM_APRM_Modify, " +
      "FIN_Finacc_Transaction.Fin_Financial_Account_ID, " +
      "FIN_Finacc_Transaction.FIN_Reconciliation_ID, " +
      "(CASE WHEN FIN_Finacc_Transaction.FIN_Reconciliation_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table1.DocumentNo), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(table1.Statementdate, 'DD-MM-YYYY')),'') ) END) AS FIN_Reconciliation_IDR, " +
      "FIN_Finacc_Transaction.Fin_Payment_ID, " +
      "FIN_Finacc_Transaction.Description, " +
      "FIN_Finacc_Transaction.C_Glitem_ID, " +
      "(CASE WHEN FIN_Finacc_Transaction.C_Glitem_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))),'') ) END) AS C_Glitem_IDR, " +
      "FIN_Finacc_Transaction.C_Currency_ID, " +
      "(CASE WHEN FIN_Finacc_Transaction.C_Currency_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table3.ISO_Code), ''))),'') ) END) AS C_Currency_IDR, " +
      "FIN_Finacc_Transaction.Depositamt, " +
      "FIN_Finacc_Transaction.Paymentamt, " +
      "COALESCE(FIN_Finacc_Transaction.Processed, 'N') AS Processed, " +
      "FIN_Finacc_Transaction.Foreign_Currency_ID, " +
      "(CASE WHEN FIN_Finacc_Transaction.Foreign_Currency_ID IS NULL THEN '' ELSE  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table4.ISO_Code), ''))),'') ) END) AS Foreign_Currency_IDR, " +
      "COALESCE(FIN_Finacc_Transaction.Processing, 'N') AS Processing, " +
      "FIN_Finacc_Transaction.Foreign_Amount, " +
      "FIN_Finacc_Transaction.Posted, " +
      "list3.name as Posted_BTN, " +
      "FIN_Finacc_Transaction.EM_APRM_Delete, " +
      "FIN_Finacc_Transaction.Foreign_Convert_Rate, " +
      "FIN_Finacc_Transaction.AD_Org_ID, " +
      "(CASE WHEN FIN_Finacc_Transaction.AD_Org_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table5.Value), ''))),'') ) END) AS AD_Org_IDR, " +
      "FIN_Finacc_Transaction.C_Bpartner_ID, " +
      "(CASE WHEN FIN_Finacc_Transaction.C_Bpartner_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table6.Name), ''))),'') ) END) AS C_Bpartner_IDR, " +
      "FIN_Finacc_Transaction.M_Product_ID, " +
      "(CASE WHEN FIN_Finacc_Transaction.M_Product_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL7.Name IS NULL THEN TO_CHAR(table7.Name) ELSE TO_CHAR(tableTRL7.Name) END)), ''))),'') ) END) AS M_Product_IDR, " +
      "FIN_Finacc_Transaction.C_Project_ID, " +
      "(CASE WHEN FIN_Finacc_Transaction.C_Project_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table9.Value), ''))),'')  || ' - ' || COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table9.Name), ''))),'') ) END) AS C_Project_IDR, " +
      "FIN_Finacc_Transaction.C_Costcenter_ID, " +
      "FIN_Finacc_Transaction.C_Campaign_ID, " +
      "(CASE WHEN FIN_Finacc_Transaction.C_Campaign_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table10.Name), ''))),'') ) END) AS C_Campaign_IDR, " +
      "FIN_Finacc_Transaction.C_Activity_ID, " +
      "(CASE WHEN FIN_Finacc_Transaction.C_Activity_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table11.Name), ''))),'') ) END) AS C_Activity_IDR, " +
      "FIN_Finacc_Transaction.C_Salesregion_ID, " +
      "(CASE WHEN FIN_Finacc_Transaction.C_Salesregion_ID IS NULL THEN '' ELSE  (COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table12.Name), ''))),'') ) END) AS C_Salesregion_IDR, " +
      "FIN_Finacc_Transaction.User1_ID, " +
      "FIN_Finacc_Transaction.User2_ID, " +
      "FIN_Finacc_Transaction.AD_Client_ID, " +
      "FIN_Finacc_Transaction.Fin_Finacc_Transaction_ID, " +
      "        ? AS LANGUAGE " +
      "        FROM FIN_Finacc_Transaction left join ad_ref_list_v list1 on (FIN_Finacc_Transaction.Trxtype = list1.value and list1.ad_reference_id = '4EFC9773F30B4ACE97D225BD13CFF8CB' and list1.ad_language = ?)  left join ad_ref_list_v list2 on (FIN_Finacc_Transaction.Status = list2.value and list2.ad_reference_id = '575BCB88A4694C27BC013DE9C73E6FE7' and list2.ad_language = ?)  left join (select FIN_Reconciliation_ID, DocumentNo, Statementdate from FIN_Reconciliation) table1 on (FIN_Finacc_Transaction.FIN_Reconciliation_ID = table1.FIN_Reconciliation_ID) left join (select C_Glitem_ID, Name from C_Glitem) table2 on (FIN_Finacc_Transaction.C_Glitem_ID = table2.C_Glitem_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table3 on (FIN_Finacc_Transaction.C_Currency_ID = table3.C_Currency_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table4 on (FIN_Finacc_Transaction.Foreign_Currency_ID =  table4.C_Currency_ID) left join ad_ref_list_v list3 on (list3.ad_reference_id = '234' and list3.ad_language = ?  AND FIN_Finacc_Transaction.Posted = TO_CHAR(list3.value)) left join (select AD_Org_ID, Value from AD_Org) table5 on (FIN_Finacc_Transaction.AD_Org_ID = table5.AD_Org_ID) left join (select C_BPartner_ID, Name from C_BPartner) table6 on (FIN_Finacc_Transaction.C_Bpartner_ID = table6.C_BPartner_ID) left join (select M_Product_ID, Name from M_Product) table7 on (FIN_Finacc_Transaction.M_Product_ID = table7.M_Product_ID) left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL7 on (table7.M_Product_ID = tableTRL7.M_Product_ID and tableTRL7.AD_Language = ?)  left join (select C_Project_ID, Value, Name from C_Project) table9 on (FIN_Finacc_Transaction.C_Project_ID = table9.C_Project_ID) left join (select C_Campaign_ID, Name from C_Campaign) table10 on (FIN_Finacc_Transaction.C_Campaign_ID = table10.C_Campaign_ID) left join (select C_Activity_ID, Name from C_Activity) table11 on (FIN_Finacc_Transaction.C_Activity_ID = table11.C_Activity_ID) left join (select C_Salesregion_ID, Name from C_Salesregion) table12 on (FIN_Finacc_Transaction.C_Salesregion_ID = table12.C_Salesregion_ID)" +
      "        WHERE 2=2 " +
      "        AND 1=1 ";
    strSql = strSql + ((finFinancialAccountId==null || finFinancialAccountId.equals(""))?"":"  AND FIN_Finacc_Transaction.Fin_Financial_Account_ID = ?  ");
    strSql = strSql + 
      "        AND FIN_Finacc_Transaction.Fin_Finacc_Transaction_ID = ? " +
      "        AND FIN_Finacc_Transaction.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "           AND FIN_Finacc_Transaction.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateTimeFormat);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      if (finFinancialAccountId != null && !(finFinancialAccountId.equals(""))) {
        iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
      }
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

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
        TransactionData objectTransactionData = new TransactionData();
        objectTransactionData.created = UtilSql.getValue(result, "CREATED");
        objectTransactionData.createdbyr = UtilSql.getValue(result, "CREATEDBYR");
        objectTransactionData.updated = UtilSql.getValue(result, "UPDATED");
        objectTransactionData.updatedTimeStamp = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
        objectTransactionData.updatedby = UtilSql.getValue(result, "UPDATEDBY");
        objectTransactionData.updatedbyr = UtilSql.getValue(result, "UPDATEDBYR");
        objectTransactionData.line = UtilSql.getValue(result, "LINE");
        objectTransactionData.trxtype = UtilSql.getValue(result, "TRXTYPE");
        objectTransactionData.trxtyper = UtilSql.getValue(result, "TRXTYPER");
        objectTransactionData.status = UtilSql.getValue(result, "STATUS");
        objectTransactionData.statusr = UtilSql.getValue(result, "STATUSR");
        objectTransactionData.createdbyalgorithm = UtilSql.getValue(result, "CREATEDBYALGORITHM");
        objectTransactionData.isactive = UtilSql.getValue(result, "ISACTIVE");
        objectTransactionData.statementdate = UtilSql.getDateValue(result, "STATEMENTDATE", "dd-MM-yyyy");
        objectTransactionData.dateacct = UtilSql.getDateValue(result, "DATEACCT", "dd-MM-yyyy");
        objectTransactionData.emAprmModify = UtilSql.getValue(result, "EM_APRM_MODIFY");
        objectTransactionData.finFinancialAccountId = UtilSql.getValue(result, "FIN_FINANCIAL_ACCOUNT_ID");
        objectTransactionData.finReconciliationId = UtilSql.getValue(result, "FIN_RECONCILIATION_ID");
        objectTransactionData.finReconciliationIdr = UtilSql.getValue(result, "FIN_RECONCILIATION_IDR");
        objectTransactionData.finPaymentId = UtilSql.getValue(result, "FIN_PAYMENT_ID");
        objectTransactionData.description = UtilSql.getValue(result, "DESCRIPTION");
        objectTransactionData.cGlitemId = UtilSql.getValue(result, "C_GLITEM_ID");
        objectTransactionData.cGlitemIdr = UtilSql.getValue(result, "C_GLITEM_IDR");
        objectTransactionData.cCurrencyId = UtilSql.getValue(result, "C_CURRENCY_ID");
        objectTransactionData.cCurrencyIdr = UtilSql.getValue(result, "C_CURRENCY_IDR");
        objectTransactionData.depositamt = UtilSql.getValue(result, "DEPOSITAMT");
        objectTransactionData.paymentamt = UtilSql.getValue(result, "PAYMENTAMT");
        objectTransactionData.processed = UtilSql.getValue(result, "PROCESSED");
        objectTransactionData.foreignCurrencyId = UtilSql.getValue(result, "FOREIGN_CURRENCY_ID");
        objectTransactionData.foreignCurrencyIdr = UtilSql.getValue(result, "FOREIGN_CURRENCY_IDR");
        objectTransactionData.processing = UtilSql.getValue(result, "PROCESSING");
        objectTransactionData.foreignAmount = UtilSql.getValue(result, "FOREIGN_AMOUNT");
        objectTransactionData.posted = UtilSql.getValue(result, "POSTED");
        objectTransactionData.postedBtn = UtilSql.getValue(result, "POSTED_BTN");
        objectTransactionData.emAprmDelete = UtilSql.getValue(result, "EM_APRM_DELETE");
        objectTransactionData.foreignConvertRate = UtilSql.getValue(result, "FOREIGN_CONVERT_RATE");
        objectTransactionData.adOrgId = UtilSql.getValue(result, "AD_ORG_ID");
        objectTransactionData.adOrgIdr = UtilSql.getValue(result, "AD_ORG_IDR");
        objectTransactionData.cBpartnerId = UtilSql.getValue(result, "C_BPARTNER_ID");
        objectTransactionData.cBpartnerIdr = UtilSql.getValue(result, "C_BPARTNER_IDR");
        objectTransactionData.mProductId = UtilSql.getValue(result, "M_PRODUCT_ID");
        objectTransactionData.mProductIdr = UtilSql.getValue(result, "M_PRODUCT_IDR");
        objectTransactionData.cProjectId = UtilSql.getValue(result, "C_PROJECT_ID");
        objectTransactionData.cProjectIdr = UtilSql.getValue(result, "C_PROJECT_IDR");
        objectTransactionData.cCostcenterId = UtilSql.getValue(result, "C_COSTCENTER_ID");
        objectTransactionData.cCampaignId = UtilSql.getValue(result, "C_CAMPAIGN_ID");
        objectTransactionData.cCampaignIdr = UtilSql.getValue(result, "C_CAMPAIGN_IDR");
        objectTransactionData.cActivityId = UtilSql.getValue(result, "C_ACTIVITY_ID");
        objectTransactionData.cActivityIdr = UtilSql.getValue(result, "C_ACTIVITY_IDR");
        objectTransactionData.cSalesregionId = UtilSql.getValue(result, "C_SALESREGION_ID");
        objectTransactionData.cSalesregionIdr = UtilSql.getValue(result, "C_SALESREGION_IDR");
        objectTransactionData.user1Id = UtilSql.getValue(result, "USER1_ID");
        objectTransactionData.user2Id = UtilSql.getValue(result, "USER2_ID");
        objectTransactionData.adClientId = UtilSql.getValue(result, "AD_CLIENT_ID");
        objectTransactionData.finFinaccTransactionId = UtilSql.getValue(result, "FIN_FINACC_TRANSACTION_ID");
        objectTransactionData.language = UtilSql.getValue(result, "LANGUAGE");
        objectTransactionData.adUserClient = "";
        objectTransactionData.adOrgClient = "";
        objectTransactionData.createdby = "";
        objectTransactionData.trBgcolor = "";
        objectTransactionData.totalCount = "";
        objectTransactionData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectTransactionData);
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
    TransactionData objectTransactionData[] = new TransactionData[vector.size()];
    vector.copyInto(objectTransactionData);
    return(objectTransactionData);
  }

/**
Create a registry
 */
  public static TransactionData[] set(String finFinancialAccountId, String createdbyalgorithm, String foreignCurrencyId, String foreignAmount, String cBpartnerId, String cBpartnerIdr, String mProductId, String mProductIdr, String finFinaccTransactionId, String adClientId, String adOrgId, String createdby, String createdbyr, String updatedby, String updatedbyr, String isactive, String cCurrencyId, String finPaymentId, String cGlitemId, String status, String paymentamt, String depositamt, String processed, String processing, String posted, String postedBtn, String cSalesregionId, String dateacct, String foreignConvertRate, String cProjectId, String cCampaignId, String cActivityId, String user1Id, String user2Id, String trxtype, String statementdate, String description, String finReconciliationId, String emAprmDelete, String emAprmModify, String cCostcenterId, String line)    throws ServletException {
    TransactionData objectTransactionData[] = new TransactionData[1];
    objectTransactionData[0] = new TransactionData();
    objectTransactionData[0].created = "";
    objectTransactionData[0].createdbyr = createdbyr;
    objectTransactionData[0].updated = "";
    objectTransactionData[0].updatedTimeStamp = "";
    objectTransactionData[0].updatedby = updatedby;
    objectTransactionData[0].updatedbyr = updatedbyr;
    objectTransactionData[0].line = line;
    objectTransactionData[0].trxtype = trxtype;
    objectTransactionData[0].trxtyper = "";
    objectTransactionData[0].status = status;
    objectTransactionData[0].statusr = "";
    objectTransactionData[0].createdbyalgorithm = createdbyalgorithm;
    objectTransactionData[0].isactive = isactive;
    objectTransactionData[0].statementdate = statementdate;
    objectTransactionData[0].dateacct = dateacct;
    objectTransactionData[0].emAprmModify = emAprmModify;
    objectTransactionData[0].finFinancialAccountId = finFinancialAccountId;
    objectTransactionData[0].finReconciliationId = finReconciliationId;
    objectTransactionData[0].finReconciliationIdr = "";
    objectTransactionData[0].finPaymentId = finPaymentId;
    objectTransactionData[0].description = description;
    objectTransactionData[0].cGlitemId = cGlitemId;
    objectTransactionData[0].cGlitemIdr = "";
    objectTransactionData[0].cCurrencyId = cCurrencyId;
    objectTransactionData[0].cCurrencyIdr = "";
    objectTransactionData[0].depositamt = depositamt;
    objectTransactionData[0].paymentamt = paymentamt;
    objectTransactionData[0].processed = processed;
    objectTransactionData[0].foreignCurrencyId = foreignCurrencyId;
    objectTransactionData[0].foreignCurrencyIdr = "";
    objectTransactionData[0].processing = processing;
    objectTransactionData[0].foreignAmount = foreignAmount;
    objectTransactionData[0].posted = posted;
    objectTransactionData[0].postedBtn = postedBtn;
    objectTransactionData[0].emAprmDelete = emAprmDelete;
    objectTransactionData[0].foreignConvertRate = foreignConvertRate;
    objectTransactionData[0].adOrgId = adOrgId;
    objectTransactionData[0].adOrgIdr = "";
    objectTransactionData[0].cBpartnerId = cBpartnerId;
    objectTransactionData[0].cBpartnerIdr = cBpartnerIdr;
    objectTransactionData[0].mProductId = mProductId;
    objectTransactionData[0].mProductIdr = mProductIdr;
    objectTransactionData[0].cProjectId = cProjectId;
    objectTransactionData[0].cProjectIdr = "";
    objectTransactionData[0].cCostcenterId = cCostcenterId;
    objectTransactionData[0].cCampaignId = cCampaignId;
    objectTransactionData[0].cCampaignIdr = "";
    objectTransactionData[0].cActivityId = cActivityId;
    objectTransactionData[0].cActivityIdr = "";
    objectTransactionData[0].cSalesregionId = cSalesregionId;
    objectTransactionData[0].cSalesregionIdr = "";
    objectTransactionData[0].user1Id = user1Id;
    objectTransactionData[0].user2Id = user2Id;
    objectTransactionData[0].adClientId = adClientId;
    objectTransactionData[0].finFinaccTransactionId = finFinaccTransactionId;
    objectTransactionData[0].language = "";
    return objectTransactionData;
  }

/**
Select for auxiliar field
 */
  public static String selectAux0E3BC489C55F423BAB4B45F144DFFAF1(ConnectionProvider connectionProvider, String FIN_Financial_Account_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "         SELECT AD_ORG_ID" +
      "FROM FIN_Financial_Account" +
      "WHERE FIN_Financial_Account_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, FIN_Financial_Account_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "AD_ORG_ID");
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
    return(strReturn);
  }

/**
Select for auxiliar field
 */
  public static String selectAuxDCA04CBCB2454C7690E5F131326F06EF(ConnectionProvider connectionProvider, String FIN_PAYMENT_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(ISRECEIPT,'Y') AS ISRECEIPT FROM FIN_PAYMENT WHERE FIN_PAYMENT_ID = ? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, FIN_PAYMENT_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "ISRECEIPT");
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
    return(strReturn);
  }

/**
Select for auxiliar field
 */
  public static String selectActP15C8708DFC464C2D91286E59624FDD18_C_GLItem_ID(ConnectionProvider connectionProvider, String C_GLItem_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT name FROM C_GLItem WHERE C_GLItem_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_GLItem_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "NAME");
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
    return(strReturn);
  }

/**
Select for auxiliar field
 */
  public static String selectDef50C572BF5B0E46319FC8F32201A8408E_0(ConnectionProvider connectionProvider, String C_Bpartner_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as C_Bpartner_ID FROM C_BPartner left join (select C_BPartner_ID, Name from C_BPartner) table2 on (C_BPartner.C_BPartner_ID = table2.C_BPartner_ID) WHERE C_BPartner.isActive='Y' AND C_BPartner.C_BPartner_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, C_Bpartner_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "C_BPARTNER_ID");
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
    return(strReturn);
  }

/**
Select for auxiliar field
 */
  public static String selectDef5170629668EC427DBABD5D9A6B2C15DA_1(ConnectionProvider connectionProvider, String paramLanguage, String M_Product_IDR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR((CASE WHEN tableTRL2.Name IS NULL THEN TO_CHAR(table2.Name) ELSE TO_CHAR(tableTRL2.Name) END)), ''))), '') ) as M_Product_ID FROM M_Product left join (select M_Product_ID, Name from M_Product) table2 on (M_Product.M_Product_ID = table2.M_Product_ID)left join (select M_Product_ID,AD_Language, Name from M_Product_TRL) tableTRL2 on (table2.M_Product_ID = tableTRL2.M_Product_ID and tableTRL2.AD_Language = ?)  WHERE M_Product.isActive='Y' AND M_Product.M_Product_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paramLanguage);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, M_Product_IDR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "M_PRODUCT_ID");
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
    return(strReturn);
  }

/**
Select for auxiliar field
 */
  public static String selectDef7891269C8412655DE040007F010155CE_2(ConnectionProvider connectionProvider, String CreatedbyR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as Createdby FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, CreatedbyR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "CREATEDBY");
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
    return(strReturn);
  }

/**
Select for auxiliar field
 */
  public static String selectDef7891269C8414655DE040007F010155CE_3(ConnectionProvider connectionProvider, String UpdatedbyR)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT  ( COALESCE(TO_CHAR(TO_CHAR(COALESCE(TO_CHAR(table2.Name), ''))), '') ) as Updatedby FROM AD_User left join (select AD_User_ID, Name from AD_User) table2 on (AD_User.AD_User_ID = table2.AD_User_ID) WHERE AD_User.isActive='Y' AND AD_User.AD_User_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, UpdatedbyR);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "UPDATEDBY");
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
    return(strReturn);
  }

/**
Select for auxiliar field
 */
  public static String selectDefE16BB81D95984DF08700A8940683A636(ConnectionProvider connectionProvider, String FIN_Financial_Account_ID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT COALESCE(MAX(LINE),0)+10 AS DefaultValue FROM FIN_FINACC_TRANSACTION WHERE FIN_Financial_Account_ID=? ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, FIN_Financial_Account_ID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "DEFAULTVALUE");
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
    return(strReturn);
  }

/**
return the parent ID
 */
  public static String selectParentID(ConnectionProvider connectionProvider, String key)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT FIN_Finacc_Transaction.Fin_Financial_Account_ID AS NAME" +
      "        FROM FIN_Finacc_Transaction" +
      "        WHERE FIN_Finacc_Transaction.Fin_Finacc_Transaction_ID = ?";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, key);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "NAME");
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
    return(strReturn);
  }

/**
Select for parent field
 */
  public static String selectParent(ConnectionProvider connectionProvider, String finFinancialAccountId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table2.ISO_Code), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.EM_Gac_Noperkiraan), ''))) AS NAME FROM FIN_Financial_Account left join (select Fin_Financial_Account_ID, Name, C_Currency_ID, EM_Gac_Noperkiraan from Fin_Financial_Account) table1 on (FIN_Financial_Account.Fin_Financial_Account_ID = table1.Fin_Financial_Account_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table2 on (table1.C_Currency_ID = table2.C_Currency_ID) WHERE FIN_Financial_Account.Fin_Financial_Account_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "NAME");
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
    return(strReturn);
  }

/**
Select for parent field
 */
  public static String selectParentTrl(ConnectionProvider connectionProvider, String finFinancialAccountId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT (TO_CHAR(COALESCE(TO_CHAR(table1.Name), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table2.ISO_Code), '')) || ' - ' || TO_CHAR(COALESCE(TO_CHAR(table1.EM_Gac_Noperkiraan), ''))) AS NAME FROM FIN_Financial_Account left join (select Fin_Financial_Account_ID, Name, C_Currency_ID, EM_Gac_Noperkiraan from Fin_Financial_Account) table1 on (FIN_Financial_Account.Fin_Financial_Account_ID = table1.Fin_Financial_Account_ID) left join (select C_Currency_ID, ISO_Code from C_Currency) table2 on (table1.C_Currency_ID = table2.C_Currency_ID) WHERE FIN_Financial_Account.Fin_Financial_Account_ID = ?  ";

    ResultSet result;
    String strReturn = "";
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "NAME");
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
    return(strReturn);
  }

  public int update(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE FIN_Finacc_Transaction" +
      "        SET Line = TO_NUMBER(?) , Trxtype = (?) , Status = (?) , CreatedByAlgorithm = (?) , Isactive = (?) , Statementdate = TO_DATE(?) , DateAcct = TO_DATE(?) , EM_APRM_Modify = (?) , Fin_Financial_Account_ID = (?) , FIN_Reconciliation_ID = (?) , Fin_Payment_ID = (?) , Description = (?) , C_Glitem_ID = (?) , C_Currency_ID = (?) , Depositamt = TO_NUMBER(?) , Paymentamt = TO_NUMBER(?) , Processed = (?) , Foreign_Currency_ID = (?) , Processing = (?) , Foreign_Amount = TO_NUMBER(?) , Posted = (?) , EM_APRM_Delete = (?) , Foreign_Convert_Rate = TO_NUMBER(?) , AD_Org_ID = (?) , C_Bpartner_ID = (?) , M_Product_ID = (?) , C_Project_ID = (?) , C_Costcenter_ID = (?) , C_Campaign_ID = (?) , C_Activity_ID = (?) , C_Salesregion_ID = (?) , User1_ID = (?) , User2_ID = (?) , AD_Client_ID = (?) , Fin_Finacc_Transaction_ID = (?) , updated = now(), updatedby = ? " +
      "        WHERE FIN_Finacc_Transaction.Fin_Finacc_Transaction_ID = ? " +
      "                 AND FIN_Finacc_Transaction.Fin_Financial_Account_ID = ? " +
      "        AND FIN_Finacc_Transaction.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND FIN_Finacc_Transaction.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, trxtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdbyalgorithm);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, statementdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmModify);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finReconciliationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cGlitemId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, depositamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, foreignCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, foreignAmount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmDelete);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, foreignConvertRate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cSalesregionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinaccTransactionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinaccTransactionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public int insert(Connection conn, ConnectionProvider connectionProvider)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        INSERT INTO FIN_Finacc_Transaction " +
      "        (Line, Trxtype, Status, CreatedByAlgorithm, Isactive, Statementdate, DateAcct, EM_APRM_Modify, Fin_Financial_Account_ID, FIN_Reconciliation_ID, Fin_Payment_ID, Description, C_Glitem_ID, C_Currency_ID, Depositamt, Paymentamt, Processed, Foreign_Currency_ID, Processing, Foreign_Amount, Posted, EM_APRM_Delete, Foreign_Convert_Rate, AD_Org_ID, C_Bpartner_ID, M_Product_ID, C_Project_ID, C_Costcenter_ID, C_Campaign_ID, C_Activity_ID, C_Salesregion_ID, User1_ID, User2_ID, AD_Client_ID, Fin_Finacc_Transaction_ID, created, createdby, updated, updatedBy)" +
      "        VALUES (TO_NUMBER(?), (?), (?), (?), (?), TO_DATE(?), TO_DATE(?), (?), (?), (?), (?), (?), (?), (?), TO_NUMBER(?), TO_NUMBER(?), (?), (?), (?), TO_NUMBER(?), (?), (?), TO_NUMBER(?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), (?), now(), ?, now(), ?)";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, line);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, trxtype);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, status);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdbyalgorithm);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, isactive);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, statementdate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, dateacct);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmModify);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finReconciliationId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finPaymentId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, description);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cGlitemId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, depositamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, paymentamt);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processed);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, foreignCurrencyId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, processing);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, foreignAmount);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, posted);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, emAprmDelete);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, foreignConvertRate);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adOrgId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cBpartnerId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, mProductId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cProjectId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCostcenterId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cCampaignId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cActivityId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, cSalesregionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user1Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, user2Id);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, adClientId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinaccTransactionId);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, createdby);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, updatedby);

      updateCount = st.executeUpdate();
    } catch(SQLException e){
      log4j.error("SQL error in query: " + strSql + "Exception:"+ e);
      throw new ServletException("@CODE=" + Integer.toString(e.getErrorCode()) + "@" + e.getMessage());
    } catch(Exception ex){
      log4j.error("Exception in query: " + strSql + "Exception:"+ ex);
      throw new ServletException("@CODE=@" + ex.getMessage());
    } finally {
      try {
        connectionProvider.releaseTransactionalPreparedStatement(st);
      } catch(Exception ignore){
        ignore.printStackTrace();
      }
    }
    return(updateCount);
  }

  public static int delete(ConnectionProvider connectionProvider, String param1, String finFinancialAccountId, String adUserClient, String adOrgClient)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        DELETE FROM FIN_Finacc_Transaction" +
      "        WHERE FIN_Finacc_Transaction.Fin_Finacc_Transaction_ID = ? " +
      "                 AND FIN_Finacc_Transaction.Fin_Financial_Account_ID = ? " +
      "        AND FIN_Finacc_Transaction.AD_Client_ID IN (";
    strSql = strSql + ((adUserClient==null || adUserClient.equals(""))?"":adUserClient);
    strSql = strSql + 
      ") " +
      "        AND FIN_Finacc_Transaction.AD_Org_ID IN (";
    strSql = strSql + ((adOrgClient==null || adOrgClient.equals(""))?"":adOrgClient);
    strSql = strSql + 
      ") ";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, param1);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, finFinancialAccountId);
      if (adUserClient != null && !(adUserClient.equals(""))) {
        }
      if (adOrgClient != null && !(adOrgClient.equals(""))) {
        }

      updateCount = st.executeUpdate();
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
    return(updateCount);
  }

/**
Select for relation
 */
  public static String selectOrg(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT AD_ORG_ID" +
      "          FROM FIN_Finacc_Transaction" +
      "         WHERE FIN_Finacc_Transaction.Fin_Finacc_Transaction_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "AD_ORG_ID");
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
    return(strReturn);
  }

  public static String getCurrentDBTimestamp(ConnectionProvider connectionProvider, String id)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT to_char(Updated, 'YYYYMMDDHH24MISS') as Updated_Time_Stamp" +
      "          FROM FIN_Finacc_Transaction" +
      "         WHERE FIN_Finacc_Transaction.Fin_Finacc_Transaction_ID = ? ";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, id);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "UPDATED_TIME_STAMP");
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
    return(strReturn);
  }
}
