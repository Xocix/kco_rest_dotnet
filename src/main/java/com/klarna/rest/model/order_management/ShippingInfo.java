/*
 * Klarna Order Managment API
 * API to handle order lifecycle
 *
 * OpenAPI spec version: 1.0
 * Contact: developers-experience@klarna.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.model.order_management;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * ShippingInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:24:04.099Z")
public class ShippingInfo {
  @JsonProperty("shipping_company")
  private String shippingCompany = null;

  @JsonProperty("shipping_method")
  private String shippingMethod = null;

  @JsonProperty("tracking_number")
  private String trackingNumber = null;

  @JsonProperty("tracking_uri")
  private String trackingUri = null;

  @JsonProperty("return_shipping_company")
  private String returnShippingCompany = null;

  @JsonProperty("return_tracking_number")
  private String returnTrackingNumber = null;

  @JsonProperty("return_tracking_uri")
  private String returnTrackingUri = null;

  public ShippingInfo shippingCompany(String shippingCompany) {
    this.shippingCompany = shippingCompany;
    return this;
  }

   /**
   * Name of the shipping company (as specific as possible). Maximum 100 characters. Example: &#39;DHL US&#39; and not only &#39;DHL&#39;
   * @return shippingCompany
  **/
  @ApiModelProperty(example = "DHL US", value = "Name of the shipping company (as specific as possible). Maximum 100 characters. Example: 'DHL US' and not only 'DHL'")
  public String getShippingCompany() {
    return shippingCompany;
  }

  public void setShippingCompany(String shippingCompany) {
    this.shippingCompany = shippingCompany;
  }

  public ShippingInfo shippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
    return this;
  }

   /**
   * Shipping method. Allowed values matches (PickUpStore|Home|BoxReg|BoxUnreg|PickUpPoint|Own)
   * @return shippingMethod
  **/
  @ApiModelProperty(example = "Home", value = "Shipping method. Allowed values matches (PickUpStore|Home|BoxReg|BoxUnreg|PickUpPoint|Own)")
  public String getShippingMethod() {
    return shippingMethod;
  }

  public void setShippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
  }

  public ShippingInfo trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * Tracking number for the shipment. Maximum 100 characters.
   * @return trackingNumber
  **/
  @ApiModelProperty(example = "63456415674545679874", value = "Tracking number for the shipment. Maximum 100 characters.")
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public ShippingInfo trackingUri(String trackingUri) {
    this.trackingUri = trackingUri;
    return this;
  }

   /**
   * URI where the customer can track their shipment. Maximum 1024 characters.
   * @return trackingUri
  **/
  @ApiModelProperty(example = "http://shipping.example/findmypackage?63456415674545679874", value = "URI where the customer can track their shipment. Maximum 1024 characters.")
  public String getTrackingUri() {
    return trackingUri;
  }

  public void setTrackingUri(String trackingUri) {
    this.trackingUri = trackingUri;
  }

  public ShippingInfo returnShippingCompany(String returnShippingCompany) {
    this.returnShippingCompany = returnShippingCompany;
    return this;
  }

   /**
   * Name of the shipping company for the return shipment (as specific as possible). Maximum 100 characters. Example: &#39;DHL US&#39; and not only &#39;DHL&#39;
   * @return returnShippingCompany
  **/
  @ApiModelProperty(example = "DHL US", value = "Name of the shipping company for the return shipment (as specific as possible). Maximum 100 characters. Example: 'DHL US' and not only 'DHL'")
  public String getReturnShippingCompany() {
    return returnShippingCompany;
  }

  public void setReturnShippingCompany(String returnShippingCompany) {
    this.returnShippingCompany = returnShippingCompany;
  }

  public ShippingInfo returnTrackingNumber(String returnTrackingNumber) {
    this.returnTrackingNumber = returnTrackingNumber;
    return this;
  }

   /**
   * Tracking number for the return shipment. Maximum 100 characters.
   * @return returnTrackingNumber
  **/
  @ApiModelProperty(example = "93456415674545679888", value = "Tracking number for the return shipment. Maximum 100 characters.")
  public String getReturnTrackingNumber() {
    return returnTrackingNumber;
  }

  public void setReturnTrackingNumber(String returnTrackingNumber) {
    this.returnTrackingNumber = returnTrackingNumber;
  }

  public ShippingInfo returnTrackingUri(String returnTrackingUri) {
    this.returnTrackingUri = returnTrackingUri;
    return this;
  }

   /**
   * URL where the customer can track the return shipment. Maximum 1024 characters.
   * @return returnTrackingUri
  **/
  @ApiModelProperty(example = "http://shipping.example/findmypackage?93456415674545679888", value = "URL where the customer can track the return shipment. Maximum 1024 characters.")
  public String getReturnTrackingUri() {
    return returnTrackingUri;
  }

  public void setReturnTrackingUri(String returnTrackingUri) {
    this.returnTrackingUri = returnTrackingUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingInfo shippingInfo = (ShippingInfo) o;
    return Objects.equals(this.shippingCompany, shippingInfo.shippingCompany) &&
        Objects.equals(this.shippingMethod, shippingInfo.shippingMethod) &&
        Objects.equals(this.trackingNumber, shippingInfo.trackingNumber) &&
        Objects.equals(this.trackingUri, shippingInfo.trackingUri) &&
        Objects.equals(this.returnShippingCompany, shippingInfo.returnShippingCompany) &&
        Objects.equals(this.returnTrackingNumber, shippingInfo.returnTrackingNumber) &&
        Objects.equals(this.returnTrackingUri, shippingInfo.returnTrackingUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingCompany, shippingMethod, trackingNumber, trackingUri, returnShippingCompany, returnTrackingNumber, returnTrackingUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingInfo {\n");
    
    sb.append("    shippingCompany: ").append(toIndentedString(shippingCompany)).append("\n");
    sb.append("    shippingMethod: ").append(toIndentedString(shippingMethod)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    trackingUri: ").append(toIndentedString(trackingUri)).append("\n");
    sb.append("    returnShippingCompany: ").append(toIndentedString(returnShippingCompany)).append("\n");
    sb.append("    returnTrackingNumber: ").append(toIndentedString(returnTrackingNumber)).append("\n");
    sb.append("    returnTrackingUri: ").append(toIndentedString(returnTrackingUri)).append("\n");
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

