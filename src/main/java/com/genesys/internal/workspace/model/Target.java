/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.workspace.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Target
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-30T12:58:43.688Z")
public class Target {
  @SerializedName("DBID")
  private Integer DBID = null;

  @SerializedName("name")
  private String name = null;

  /**
   * The type of the target - agent, agent-group, acd-queue, route-point, skill, custom-contact or contact.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    AGENT("agent"),
    
    AGENT_GROUP("agent-group"),
    
    ACD_QUEUE("acd-queue"),
    
    ROUTE_POINT("route-point"),
    
    SKILL("skill"),
    
    CUSTOM_CONTACT("custom-contact"),
    
    CONTACT("contact");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("employeeId")
  private String employeeId = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("number")
  private String number = null;

  @SerializedName("switchName")
  private String switchName = null;

  @SerializedName("availability")
  private Object availability = null;

  public Target DBID(Integer DBID) {
    this.DBID = DBID;
    return this;
  }

   /**
   * DBID of the object
   * @return DBID
  **/
  @ApiModelProperty(value = "DBID of the object")
  public Integer getDBID() {
    return DBID;
  }

  public void setDBID(Integer DBID) {
    this.DBID = DBID;
  }

  public Target name(String name) {
    this.name = name;
    return this;
  }

   /**
   * For agents firstname and lastname (or username if neither is defined), for other types the name field is used.
   * @return name
  **/
  @ApiModelProperty(value = "For agents firstname and lastname (or username if neither is defined), for other types the name field is used.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Target type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the target - agent, agent-group, acd-queue, route-point, skill, custom-contact or contact.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the target - agent, agent-group, acd-queue, route-point, skill, custom-contact or contact.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Target firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name - only applicable to agents.
   * @return firstName
  **/
  @ApiModelProperty(value = "First name - only applicable to agents.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Target lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name - only applicable to agents.
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name - only applicable to agents.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Target employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Employee id - only applicable to agents.
   * @return employeeId
  **/
  @ApiModelProperty(value = "Employee id - only applicable to agents.")
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public Target userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Username - only applicable to agents.
   * @return userName
  **/
  @ApiModelProperty(value = "Username - only applicable to agents.")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Target number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Only applicable to acd-queue and route-point
   * @return number
  **/
  @ApiModelProperty(value = "Only applicable to acd-queue and route-point")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Target switchName(String switchName) {
    this.switchName = switchName;
    return this;
  }

   /**
   * Only applicable to acd-queue and route-point
   * @return switchName
  **/
  @ApiModelProperty(value = "Only applicable to acd-queue and route-point")
  public String getSwitchName() {
    return switchName;
  }

  public void setSwitchName(String switchName) {
    this.switchName = switchName;
  }

  public Target availability(Object availability) {
    this.availability = availability;
    return this;
  }

   /**
   * The structure depends on the target type. For agents, availability includes channel details. For acd-queues and route-points, waiting calls. For agent-groups, the number of ready agents.
   * @return availability
  **/
  @ApiModelProperty(value = "The structure depends on the target type. For agents, availability includes channel details. For acd-queues and route-points, waiting calls. For agent-groups, the number of ready agents.")
  public Object getAvailability() {
    return availability;
  }

  public void setAvailability(Object availability) {
    this.availability = availability;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Target target = (Target) o;
    return Objects.equals(this.DBID, target.DBID) &&
        Objects.equals(this.name, target.name) &&
        Objects.equals(this.type, target.type) &&
        Objects.equals(this.firstName, target.firstName) &&
        Objects.equals(this.lastName, target.lastName) &&
        Objects.equals(this.employeeId, target.employeeId) &&
        Objects.equals(this.userName, target.userName) &&
        Objects.equals(this.number, target.number) &&
        Objects.equals(this.switchName, target.switchName) &&
        Objects.equals(this.availability, target.availability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DBID, name, type, firstName, lastName, employeeId, userName, number, switchName, availability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Target {\n");
    
    sb.append("    DBID: ").append(toIndentedString(DBID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    switchName: ").append(toIndentedString(switchName)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
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

