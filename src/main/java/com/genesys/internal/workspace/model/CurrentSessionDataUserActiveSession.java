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
import com.genesys.internal.workspace.model.Call;
import com.genesys.internal.workspace.model.Dn;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CurrentSessionDataUserActiveSession
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-15T15:04:23.751Z")
public class CurrentSessionDataUserActiveSession {
  @SerializedName("dn")
  private Dn dn = null;

  @SerializedName("calls")
  private List<Call> calls = null;

  public CurrentSessionDataUserActiveSession dn(Dn dn) {
    this.dn = dn;
    return this;
  }

   /**
   * Get dn
   * @return dn
  **/
  @ApiModelProperty(value = "")
  public Dn getDn() {
    return dn;
  }

  public void setDn(Dn dn) {
    this.dn = dn;
  }

  public CurrentSessionDataUserActiveSession calls(List<Call> calls) {
    this.calls = calls;
    return this;
  }

  public CurrentSessionDataUserActiveSession addCallsItem(Call callsItem) {
    if (this.calls == null) {
      this.calls = new ArrayList<Call>();
    }
    this.calls.add(callsItem);
    return this;
  }

   /**
   * An array containing any active calls.
   * @return calls
  **/
  @ApiModelProperty(value = "An array containing any active calls.")
  public List<Call> getCalls() {
    return calls;
  }

  public void setCalls(List<Call> calls) {
    this.calls = calls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentSessionDataUserActiveSession currentSessionDataUserActiveSession = (CurrentSessionDataUserActiveSession) o;
    return Objects.equals(this.dn, currentSessionDataUserActiveSession.dn) &&
        Objects.equals(this.calls, currentSessionDataUserActiveSession.calls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dn, calls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentSessionDataUserActiveSession {\n");
    
    sb.append("    dn: ").append(toIndentedString(dn)).append("\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
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

