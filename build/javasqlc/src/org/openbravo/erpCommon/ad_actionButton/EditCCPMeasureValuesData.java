//Sqlc generated V1.O00-1
package org.openbravo.erpCommon.ad_actionButton;

import java.sql.*;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;

import org.openbravo.data.FieldProvider;
import org.openbravo.database.ConnectionProvider;
import org.openbravo.data.UtilSql;
import org.openbravo.service.db.QueryTimeOutUtil;
import org.openbravo.database.SessionInfo;
import java.util.*;

class EditCCPMeasureValuesData implements FieldProvider {
static Logger log4j = Logger.getLogger(EditCCPMeasureValuesData.class);
  private String InitRecordNumber="0";
  public String groupid;
  public String groupname;
  public String name;
  public String type;

  public String getInitRecordNumber() {
    return InitRecordNumber;
  }

  public String getField(String fieldName) {
    if (fieldName.equalsIgnoreCase("GROUPID"))
      return groupid;
    else if (fieldName.equalsIgnoreCase("GROUPNAME"))
      return groupname;
    else if (fieldName.equalsIgnoreCase("NAME"))
      return name;
    else if (fieldName.equalsIgnoreCase("TYPE"))
      return type;
   else {
     log4j.debug("Field does not exist: " + fieldName);
     return null;
   }
 }

  public static EditCCPMeasureValuesData[] select(ConnectionProvider connectionProvider, String maMeasureShiftID)    throws ServletException {
    return select(connectionProvider, maMeasureShiftID, 0, 0);
  }

  public static EditCCPMeasureValuesData[] select(ConnectionProvider connectionProvider, String maMeasureShiftID, int firstRegister, int numberRegisters)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT g.MA_MEASURE_GROUP_ID as groupid, cg.NAME as groupname, '' AS name, '' as Type" +
      "        FROM MA_Measure_Shift s, MA_Measure_Group g, MA_CCP_Group cg" +
      "        WHERE g.MA_CCP_GROUP_ID = cg.MA_CCP_GROUP_ID" +
      "          AND s.MA_Measure_Shift_ID = g.MA_Measure_Shift_ID" +
      "          AND s.MA_Measure_Shift_ID = ?" +
      "        ORDER BY g.MA_MEASURE_GROUP_ID, cg.seqno";

    ResultSet result;
    Vector<java.lang.Object> vector = new Vector<java.lang.Object>(0);
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maMeasureShiftID);

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
        EditCCPMeasureValuesData objectEditCCPMeasureValuesData = new EditCCPMeasureValuesData();
        objectEditCCPMeasureValuesData.groupid = UtilSql.getValue(result, "GROUPID");
        objectEditCCPMeasureValuesData.groupname = UtilSql.getValue(result, "GROUPNAME");
        objectEditCCPMeasureValuesData.name = UtilSql.getValue(result, "NAME");
        objectEditCCPMeasureValuesData.type = UtilSql.getValue(result, "TYPE");
        objectEditCCPMeasureValuesData.InitRecordNumber = Integer.toString(firstRegister);
        vector.addElement(objectEditCCPMeasureValuesData);
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
    EditCCPMeasureValuesData objectEditCCPMeasureValuesData[] = new EditCCPMeasureValuesData[vector.size()];
    vector.copyInto(objectEditCCPMeasureValuesData);
    return(objectEditCCPMeasureValuesData);
  }

  public static String selectShift(ConnectionProvider connectionProvider, String shift)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT NAME FROM AD_REF_LIST" +
      "        WHERE AD_REFERENCE_ID = '800038'" +
      "          AND value = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, shift);

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

  public static String selectShiftTrl(ConnectionProvider connectionProvider, String maMeasureShiftID, String language)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT NAME" +
      "        FROM AD_REF_LIST_TRL" +
      "        WHERE AD_REF_LIST_ID IN (SELECT AD_REF_LIST_ID FROM AD_REF_LIST" +
      "                WHERE AD_REFERENCE_ID = '800038'" +
      "                  AND value = ?)" +
      "          AND AD_LANGUAGE = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maMeasureShiftID);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, language);

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

  public static String selectType(ConnectionProvider connectionProvider, String maMeasureValueID)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        SELECT VALUETYPE AS TYPE" +
      "        FROM MA_MEASURE_VALUES" +
      "        WHERE MA_MEASURE_VALUES_ID = ?";

    ResultSet result;
    String strReturn = null;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maMeasureValueID);

      result = st.executeQuery();
      if(result.next()) {
        strReturn = UtilSql.getValue(result, "TYPE");
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

  public static int update(Connection conn, ConnectionProvider connectionProvider, String vnumber, String vstring, String vchar, String maMeasureValueId)    throws ServletException {
    String strSql = "";
    strSql = strSql + 
      "        UPDATE MA_MEASURE_VALUES" +
      "        SET V_NUMBER = TO_NUMBER(?)," +
      "            V_STRING = ?," +
      "            V_CHAR = ?" +
      "        WHERE MA_MEASURE_VALUES_ID = ?";

    int updateCount = 0;
    PreparedStatement st = null;

    int iParameter = 0;
    try {
    st = connectionProvider.getPreparedStatement(conn, strSql);
      QueryTimeOutUtil.getInstance().setQueryTimeOut(st, SessionInfo.getQueryProfile());
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vnumber);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vstring);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, vchar);
      iParameter++; UtilSql.setValue(st, iParameter, 12, null, maMeasureValueId);

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
}