/*
 * Workspace API
 * Application API used by Workspace Web Edition
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.workspace.model;

import java.util.Objects;
import com.genesys.workspace.model.CurrentUserDataUserActiveSession;
import com.genesys.workspace.model.Kvpair;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * CurrentUserDataUser
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-16T14:45:40.536Z")
public class CurrentUserDataUser {
  @SerializedName("dbid")
  private Integer dbid = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("employeeId")
  private String employeeId = null;

  @SerializedName("defaultPlace")
  private String defaultPlace = null;

  @SerializedName("agentLogin")
  private String agentLogin = null;

  @SerializedName("userProperties")
  private List<Kvpair> userProperties = new ArrayList<Kvpair>();

  @SerializedName("activeSession")
  private CurrentUserDataUserActiveSession activeSession = null;

  public CurrentUserDataUser dbid(Integer dbid) {
    this.dbid = dbid;
    return this;
  }

   /**
   * Get dbid
   * @return dbid
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getDbid() {
    return dbid;
  }

  public void setDbid(Integer dbid) {
    this.dbid = dbid;
  }

  public CurrentUserDataUser firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CurrentUserDataUser lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CurrentUserDataUser userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public CurrentUserDataUser employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Get employeeId
   * @return employeeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public CurrentUserDataUser defaultPlace(String defaultPlace) {
    this.defaultPlace = defaultPlace;
    return this;
  }

   /**
   * Get defaultPlace
   * @return defaultPlace
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDefaultPlace() {
    return defaultPlace;
  }

  public void setDefaultPlace(String defaultPlace) {
    this.defaultPlace = defaultPlace;
  }

  public CurrentUserDataUser agentLogin(String agentLogin) {
    this.agentLogin = agentLogin;
    return this;
  }

   /**
   * Get agentLogin
   * @return agentLogin
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAgentLogin() {
    return agentLogin;
  }

  public void setAgentLogin(String agentLogin) {
    this.agentLogin = agentLogin;
  }

  public CurrentUserDataUser userProperties(List<Kvpair> userProperties) {
    this.userProperties = userProperties;
    return this;
  }

  public CurrentUserDataUser addUserPropertiesItem(Kvpair userPropertiesItem) {
    this.userProperties.add(userPropertiesItem);
    return this;
  }

   /**
   * Get userProperties
   * @return userProperties
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Kvpair> getUserProperties() {
    return userProperties;
  }

  public void setUserProperties(List<Kvpair> userProperties) {
    this.userProperties = userProperties;
  }

  public CurrentUserDataUser activeSession(CurrentUserDataUserActiveSession activeSession) {
    this.activeSession = activeSession;
    return this;
  }

   /**
   * Get activeSession
   * @return activeSession
  **/
  @ApiModelProperty(example = "null", value = "")
  public CurrentUserDataUserActiveSession getActiveSession() {
    return activeSession;
  }

  public void setActiveSession(CurrentUserDataUserActiveSession activeSession) {
    this.activeSession = activeSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentUserDataUser currentUserDataUser = (CurrentUserDataUser) o;
    return Objects.equals(this.dbid, currentUserDataUser.dbid) &&
        Objects.equals(this.firstName, currentUserDataUser.firstName) &&
        Objects.equals(this.lastName, currentUserDataUser.lastName) &&
        Objects.equals(this.userName, currentUserDataUser.userName) &&
        Objects.equals(this.employeeId, currentUserDataUser.employeeId) &&
        Objects.equals(this.defaultPlace, currentUserDataUser.defaultPlace) &&
        Objects.equals(this.agentLogin, currentUserDataUser.agentLogin) &&
        Objects.equals(this.userProperties, currentUserDataUser.userProperties) &&
        Objects.equals(this.activeSession, currentUserDataUser.activeSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbid, firstName, lastName, userName, employeeId, defaultPlace, agentLogin, userProperties, activeSession);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentUserDataUser {\n");
    
    sb.append("    dbid: ").append(toIndentedString(dbid)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    defaultPlace: ").append(toIndentedString(defaultPlace)).append("\n");
    sb.append("    agentLogin: ").append(toIndentedString(agentLogin)).append("\n");
    sb.append("    userProperties: ").append(toIndentedString(userProperties)).append("\n");
    sb.append("    activeSession: ").append(toIndentedString(activeSession)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

