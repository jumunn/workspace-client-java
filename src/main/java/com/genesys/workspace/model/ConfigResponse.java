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
import com.genesys.workspace.model.ConfigResponseData;
import com.genesys.workspace.model.InlineResponse200Status;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ConfigResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-16T14:56:01.421Z")
public class ConfigResponse {
  @SerializedName("data")
  private ConfigResponseData data = null;

  @SerializedName("status")
  private InlineResponse200Status status = null;

  public ConfigResponse data(ConfigResponseData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public ConfigResponseData getData() {
    return data;
  }

  public void setData(ConfigResponseData data) {
    this.data = data;
  }

  public ConfigResponse status(InlineResponse200Status status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public InlineResponse200Status getStatus() {
    return status;
  }

  public void setStatus(InlineResponse200Status status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigResponse configResponse = (ConfigResponse) o;
    return Objects.equals(this.data, configResponse.data) &&
        Objects.equals(this.status, configResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

