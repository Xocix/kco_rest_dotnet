/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.checkout.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.klarna.rest.api.checkout.model.CheckoutCheckbox;
import com.klarna.rest.api.checkout.model.CheckoutCheckboxV2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * CheckoutOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-25T11:03:40.852Z")
public class CheckoutOptions {
  @JsonProperty("acquiring_channel")
  private String acquiringChannel = null;

  @JsonProperty("allow_separate_shipping_address")
  private Boolean allowSeparateShippingAddress = false;

  @JsonProperty("color_button")
  private String colorButton = null;

  @JsonProperty("color_button_text")
  private String colorButtonText = null;

  @JsonProperty("color_checkbox")
  private String colorCheckbox = null;

  @JsonProperty("color_checkbox_checkmark")
  private String colorCheckboxCheckmark = null;

  @JsonProperty("color_header")
  private String colorHeader = null;

  @JsonProperty("color_link")
  private String colorLink = null;

  @JsonProperty("date_of_birth_mandatory")
  private Boolean dateOfBirthMandatory = false;

  @JsonProperty("shipping_details")
  private String shippingDetails = null;

  @JsonProperty("phone_mandatory")
  private Boolean phoneMandatory = false;

  @JsonProperty("title_mandatory")
  private Boolean titleMandatory = false;

  @JsonProperty("additional_checkbox")
  private CheckoutCheckbox additionalCheckbox = null;

  @JsonProperty("national_identification_number_mandatory")
  private Boolean nationalIdentificationNumberMandatory = false;

  @JsonProperty("additional_merchant_terms")
  private String additionalMerchantTerms = null;

  @JsonProperty("radius_border")
  private String radiusBorder = null;

  @JsonProperty("allowed_customer_types")
  private List<String> allowedCustomerTypes = null;

  @JsonProperty("show_subtotal_detail")
  private Boolean showSubtotalDetail = false;

  @JsonProperty("additional_checkboxes")
  private List<CheckoutCheckboxV2> additionalCheckboxes = null;

  @JsonProperty("require_validate_callback_success")
  private Boolean requireValidateCallbackSuccess = false;

  @JsonProperty("vat_removed")
  private Boolean vatRemoved = false;

  public CheckoutOptions acquiringChannel(String acquiringChannel) {
    this.acquiringChannel = acquiringChannel;
    return this;
  }

   /**
   * Acquiring channel for the order. Use MOTO for \&quot;Mail Order Telephone Order\&quot; or ECOMMERCE for \&quot;E-commerce\&quot; or IN_STORE for \&quot;Purchase in boutique\&quot;. Default : ECOMMERCE
   * @return acquiringChannel
  **/
  @ApiModelProperty(example = "eCommerce", value = "Acquiring channel for the order. Use MOTO for \"Mail Order Telephone Order\" or ECOMMERCE for \"E-commerce\" or IN_STORE for \"Purchase in boutique\". Default : ECOMMERCE")
  public String getAcquiringChannel() {
    return acquiringChannel;
  }

  public void setAcquiringChannel(String acquiringChannel) {
    this.acquiringChannel = acquiringChannel;
  }

  public CheckoutOptions allowSeparateShippingAddress(Boolean allowSeparateShippingAddress) {
    this.allowSeparateShippingAddress = allowSeparateShippingAddress;
    return this;
  }

   /**
   * If true, the consumer can enter different billing and shipping addresses. Default: false
   * @return allowSeparateShippingAddress
  **/
  @ApiModelProperty(value = "If true, the consumer can enter different billing and shipping addresses. Default: false")
  public Boolean isAllowSeparateShippingAddress() {
    return allowSeparateShippingAddress;
  }

  public void setAllowSeparateShippingAddress(Boolean allowSeparateShippingAddress) {
    this.allowSeparateShippingAddress = allowSeparateShippingAddress;
  }

  public CheckoutOptions colorButton(String colorButton) {
    this.colorButton = colorButton;
    return this;
  }

   /**
   * CSS hex color, e.g. \&quot;#FF9900\&quot;
   * @return colorButton
  **/
  @ApiModelProperty(example = "#FF9900", value = "CSS hex color, e.g. \"#FF9900\"")
  public String getColorButton() {
    return colorButton;
  }

  public void setColorButton(String colorButton) {
    this.colorButton = colorButton;
  }

  public CheckoutOptions colorButtonText(String colorButtonText) {
    this.colorButtonText = colorButtonText;
    return this;
  }

   /**
   * CSS hex color, e.g. \&quot;#FF9900\&quot;
   * @return colorButtonText
  **/
  @ApiModelProperty(example = "#FF9900", value = "CSS hex color, e.g. \"#FF9900\"")
  public String getColorButtonText() {
    return colorButtonText;
  }

  public void setColorButtonText(String colorButtonText) {
    this.colorButtonText = colorButtonText;
  }

  public CheckoutOptions colorCheckbox(String colorCheckbox) {
    this.colorCheckbox = colorCheckbox;
    return this;
  }

   /**
   * CSS hex color, e.g. \&quot;#FF9900\&quot;
   * @return colorCheckbox
  **/
  @ApiModelProperty(example = "#FF9900", value = "CSS hex color, e.g. \"#FF9900\"")
  public String getColorCheckbox() {
    return colorCheckbox;
  }

  public void setColorCheckbox(String colorCheckbox) {
    this.colorCheckbox = colorCheckbox;
  }

  public CheckoutOptions colorCheckboxCheckmark(String colorCheckboxCheckmark) {
    this.colorCheckboxCheckmark = colorCheckboxCheckmark;
    return this;
  }

   /**
   * CSS hex color, e.g. \&quot;#FF9900\&quot;
   * @return colorCheckboxCheckmark
  **/
  @ApiModelProperty(example = "#FF9900", value = "CSS hex color, e.g. \"#FF9900\"")
  public String getColorCheckboxCheckmark() {
    return colorCheckboxCheckmark;
  }

  public void setColorCheckboxCheckmark(String colorCheckboxCheckmark) {
    this.colorCheckboxCheckmark = colorCheckboxCheckmark;
  }

  public CheckoutOptions colorHeader(String colorHeader) {
    this.colorHeader = colorHeader;
    return this;
  }

   /**
   * CSS hex color, e.g. \&quot;#FF9900\&quot;
   * @return colorHeader
  **/
  @ApiModelProperty(example = "#FF9900", value = "CSS hex color, e.g. \"#FF9900\"")
  public String getColorHeader() {
    return colorHeader;
  }

  public void setColorHeader(String colorHeader) {
    this.colorHeader = colorHeader;
  }

  public CheckoutOptions colorLink(String colorLink) {
    this.colorLink = colorLink;
    return this;
  }

   /**
   * CSS hex color, e.g. \&quot;#FF9900\&quot;
   * @return colorLink
  **/
  @ApiModelProperty(example = "#FF9900", value = "CSS hex color, e.g. \"#FF9900\"")
  public String getColorLink() {
    return colorLink;
  }

  public void setColorLink(String colorLink) {
    this.colorLink = colorLink;
  }

  public CheckoutOptions dateOfBirthMandatory(Boolean dateOfBirthMandatory) {
    this.dateOfBirthMandatory = dateOfBirthMandatory;
    return this;
  }

   /**
   * If true, the consumer cannot skip date of birth. Default: false
   * @return dateOfBirthMandatory
  **/
  @ApiModelProperty(value = "If true, the consumer cannot skip date of birth. Default: false")
  public Boolean isDateOfBirthMandatory() {
    return dateOfBirthMandatory;
  }

  public void setDateOfBirthMandatory(Boolean dateOfBirthMandatory) {
    this.dateOfBirthMandatory = dateOfBirthMandatory;
  }

  public CheckoutOptions shippingDetails(String shippingDetails) {
    this.shippingDetails = shippingDetails;
    return this;
  }

   /**
   * A message that will be presented on the confirmation page under the headline \&quot;Delivery\&quot;.
   * @return shippingDetails
  **/
  @ApiModelProperty(example = "Delivered within 1-3 working days", value = "A message that will be presented on the confirmation page under the headline \"Delivery\".")
  public String getShippingDetails() {
    return shippingDetails;
  }

  public void setShippingDetails(String shippingDetails) {
    this.shippingDetails = shippingDetails;
  }

  public CheckoutOptions phoneMandatory(Boolean phoneMandatory) {
    this.phoneMandatory = phoneMandatory;
    return this;
  }

  /**
   * Checks phone is mandatory
   * @return phoneMandatory
   **/
  @ApiModelProperty(value = "Checks phone is mandatory")
  public Boolean isPhoneMandatory() {
    return phoneMandatory;
  }

  public void setPhoneMandatory(Boolean phoneMandatory) {
    this.phoneMandatory = phoneMandatory;
  }

  public CheckoutOptions titleMandatory(Boolean titleMandatory) {
    this.titleMandatory = titleMandatory;
    return this;
  }

   /**
   * If specified to false, title becomes optional. Only available for orders for country GB.
   * @return titleMandatory
  **/
  @ApiModelProperty(value = "If specified to false, title becomes optional. Only available for orders for country GB.")
  public Boolean isTitleMandatory() {
    return titleMandatory;
  }

  public void setTitleMandatory(Boolean titleMandatory) {
    this.titleMandatory = titleMandatory;
  }

  public CheckoutOptions additionalCheckbox(CheckoutCheckbox additionalCheckbox) {
    this.additionalCheckbox = additionalCheckbox;
    return this;
  }

   /**
   * Additional merchant defined checkbox. e.g. for Newsletter opt-in.
   * @return additionalCheckbox
  **/
  @ApiModelProperty(value = "Additional merchant defined checkbox. e.g. for Newsletter opt-in.")
  public CheckoutCheckbox getAdditionalCheckbox() {
    return additionalCheckbox;
  }

  public void setAdditionalCheckbox(CheckoutCheckbox additionalCheckbox) {
    this.additionalCheckbox = additionalCheckbox;
  }

  public CheckoutOptions nationalIdentificationNumberMandatory(Boolean nationalIdentificationNumberMandatory) {
    this.nationalIdentificationNumberMandatory = nationalIdentificationNumberMandatory;
    return this;
  }

   /**
   * Additional merchant defined field. e.g. for purchases that MUST have a national insurance number.
   * @return nationalIdentificationNumberMandatory
  **/
  @ApiModelProperty(value = "Additional merchant defined field. e.g. for purchases that MUST have a national insurance number.")
  public Boolean isNationalIdentificationNumberMandatory() {
    return nationalIdentificationNumberMandatory;
  }

  public void setNationalIdentificationNumberMandatory(Boolean nationalIdentificationNumberMandatory) {
    this.nationalIdentificationNumberMandatory = nationalIdentificationNumberMandatory;
  }

  public CheckoutOptions additionalMerchantTerms(String additionalMerchantTerms) {
    this.additionalMerchantTerms = additionalMerchantTerms;
    return this;
  }

   /**
   * Additional merchant defined field. e.g. Extra terms and conditions to show.
   * @return additionalMerchantTerms
  **/
  @ApiModelProperty(value = "Additional merchant defined field. e.g. Extra terms and conditions to show.")
  public String getAdditionalMerchantTerms() {
    return additionalMerchantTerms;
  }

  public void setAdditionalMerchantTerms(String additionalMerchantTerms) {
    this.additionalMerchantTerms = additionalMerchantTerms;
  }

  public CheckoutOptions radiusBorder(String radiusBorder) {
    this.radiusBorder = radiusBorder;
    return this;
  }

   /**
   * Border radius in pixels
   * @return radiusBorder
  **/
  @ApiModelProperty(example = "5", value = "Border radius in pixels")
  public String getRadiusBorder() {
    return radiusBorder;
  }

  public void setRadiusBorder(String radiusBorder) {
    this.radiusBorder = radiusBorder;
  }

  public CheckoutOptions allowedCustomerTypes(List<String> allowedCustomerTypes) {
    this.allowedCustomerTypes = allowedCustomerTypes;
    return this;
  }

  public CheckoutOptions addAllowedCustomerTypesItem(String allowedCustomerTypesItem) {
    if (this.allowedCustomerTypes == null) {
      this.allowedCustomerTypes = new ArrayList<String>();
    }
    this.allowedCustomerTypes.add(allowedCustomerTypesItem);
    return this;
  }

   /**
   * A list of allowed customer types. Supported types: &lt;b&gt;person&lt;/b&gt; &amp; &lt;b&gt;organization&lt;/b&gt;.
   * @return allowedCustomerTypes
  **/
  @ApiModelProperty(example = "\"[\\\"person\\\", \\\"organization\\\"]\"", value = "A list of allowed customer types. Supported types: <b>person</b> & <b>organization</b>.")
  public List<String> getAllowedCustomerTypes() {
    return allowedCustomerTypes;
  }

  public void setAllowedCustomerTypes(List<String> allowedCustomerTypes) {
    this.allowedCustomerTypes = allowedCustomerTypes;
  }

  public CheckoutOptions showSubtotalDetail(Boolean showSubtotalDetail) {
    this.showSubtotalDetail = showSubtotalDetail;
    return this;
  }

   /**
   * If true, the Order Detail subtotals view is expanded. Default: false
   * @return showSubtotalDetail
  **/
  @ApiModelProperty(value = "If true, the Order Detail subtotals view is expanded. Default: false")
  public Boolean isShowSubtotalDetail() {
    return showSubtotalDetail;
  }

  public void setShowSubtotalDetail(Boolean showSubtotalDetail) {
    this.showSubtotalDetail = showSubtotalDetail;
  }

  public CheckoutOptions additionalCheckboxes(List<CheckoutCheckboxV2> additionalCheckboxes) {
    this.additionalCheckboxes = additionalCheckboxes;
    return this;
  }

  public CheckoutOptions addAdditionalCheckboxesItem(CheckoutCheckboxV2 additionalCheckboxesItem) {
    if (this.additionalCheckboxes == null) {
      this.additionalCheckboxes = new ArrayList<CheckoutCheckboxV2>();
    }
    this.additionalCheckboxes.add(additionalCheckboxesItem);
    return this;
  }

   /**
   * Additional merchant defined checkboxes. e.g. for Newsletter opt-in.
   * @return additionalCheckboxes
  **/
  @ApiModelProperty(value = "Additional merchant defined checkboxes. e.g. for Newsletter opt-in.")
  public List<CheckoutCheckboxV2> getAdditionalCheckboxes() {
    return additionalCheckboxes;
  }

  public void setAdditionalCheckboxes(List<CheckoutCheckboxV2> additionalCheckboxes) {
    this.additionalCheckboxes = additionalCheckboxes;
  }

  public CheckoutOptions requireValidateCallbackSuccess(Boolean requireValidateCallbackSuccess) {
    this.requireValidateCallbackSuccess = requireValidateCallbackSuccess;
    return this;
  }

   /**
   * If true, validate callback must get a positive response to not stop purchase. Default: false.
   * @return requireValidateCallbackSuccess
  **/
  @ApiModelProperty(value = "If true, validate callback must get a positive response to not stop purchase. Default: false.")
  public Boolean isRequireValidateCallbackSuccess() {
    return requireValidateCallbackSuccess;
  }

  public void setRequireValidateCallbackSuccess(Boolean requireValidateCallbackSuccess) {
    this.requireValidateCallbackSuccess = requireValidateCallbackSuccess;
  }

  public CheckoutOptions vatRemoved(Boolean vatRemoved) {
    this.vatRemoved = vatRemoved;
    return this;
  }

   /**
   * If true, VAT is not included in total price
   * @return vatRemoved
  **/
  @ApiModelProperty(value = "If true, VAT is not included in total price")
  public Boolean isVatRemoved() {
    return vatRemoved;
  }

  public void setVatRemoved(Boolean vatRemoved) {
    this.vatRemoved = vatRemoved;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutOptions options = (CheckoutOptions) o;
    return Objects.equals(this.acquiringChannel, options.acquiringChannel) &&
        Objects.equals(this.allowSeparateShippingAddress, options.allowSeparateShippingAddress) &&
        Objects.equals(this.colorButton, options.colorButton) &&
        Objects.equals(this.colorButtonText, options.colorButtonText) &&
        Objects.equals(this.colorCheckbox, options.colorCheckbox) &&
        Objects.equals(this.colorCheckboxCheckmark, options.colorCheckboxCheckmark) &&
        Objects.equals(this.colorHeader, options.colorHeader) &&
        Objects.equals(this.colorLink, options.colorLink) &&
        Objects.equals(this.dateOfBirthMandatory, options.dateOfBirthMandatory) &&
        Objects.equals(this.shippingDetails, options.shippingDetails) &&
        Objects.equals(this.phoneMandatory, options.phoneMandatory) &&
        Objects.equals(this.titleMandatory, options.titleMandatory) &&
        Objects.equals(this.additionalCheckbox, options.additionalCheckbox) &&
        Objects.equals(this.nationalIdentificationNumberMandatory, options.nationalIdentificationNumberMandatory) &&
        Objects.equals(this.additionalMerchantTerms, options.additionalMerchantTerms) &&
        Objects.equals(this.radiusBorder, options.radiusBorder) &&
        Objects.equals(this.allowedCustomerTypes, options.allowedCustomerTypes) &&
        Objects.equals(this.showSubtotalDetail, options.showSubtotalDetail) &&
        Objects.equals(this.additionalCheckboxes, options.additionalCheckboxes) &&
        Objects.equals(this.requireValidateCallbackSuccess, options.requireValidateCallbackSuccess) &&
        Objects.equals(this.vatRemoved, options.vatRemoved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquiringChannel, allowSeparateShippingAddress, colorButton, colorButtonText, colorCheckbox, colorCheckboxCheckmark, colorHeader, colorLink, dateOfBirthMandatory, shippingDetails, titleMandatory, additionalCheckbox, nationalIdentificationNumberMandatory, additionalMerchantTerms, radiusBorder, allowedCustomerTypes, showSubtotalDetail, additionalCheckboxes, requireValidateCallbackSuccess, vatRemoved);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutOptions {\n");
    
    sb.append("    acquiringChannel: ").append(toIndentedString(acquiringChannel)).append("\n");
    sb.append("    allowSeparateShippingAddress: ").append(toIndentedString(allowSeparateShippingAddress)).append("\n");
    sb.append("    colorButton: ").append(toIndentedString(colorButton)).append("\n");
    sb.append("    colorButtonText: ").append(toIndentedString(colorButtonText)).append("\n");
    sb.append("    colorCheckbox: ").append(toIndentedString(colorCheckbox)).append("\n");
    sb.append("    colorCheckboxCheckmark: ").append(toIndentedString(colorCheckboxCheckmark)).append("\n");
    sb.append("    colorHeader: ").append(toIndentedString(colorHeader)).append("\n");
    sb.append("    colorLink: ").append(toIndentedString(colorLink)).append("\n");
    sb.append("    dateOfBirthMandatory: ").append(toIndentedString(dateOfBirthMandatory)).append("\n");
    sb.append("    shippingDetails: ").append(toIndentedString(shippingDetails)).append("\n");
    sb.append("    phoneMandatory: ").append(toIndentedString(phoneMandatory)).append("\n");
    sb.append("    titleMandatory: ").append(toIndentedString(titleMandatory)).append("\n");
    sb.append("    additionalCheckbox: ").append(toIndentedString(additionalCheckbox)).append("\n");
    sb.append("    nationalIdentificationNumberMandatory: ").append(toIndentedString(nationalIdentificationNumberMandatory)).append("\n");
    sb.append("    additionalMerchantTerms: ").append(toIndentedString(additionalMerchantTerms)).append("\n");
    sb.append("    radiusBorder: ").append(toIndentedString(radiusBorder)).append("\n");
    sb.append("    allowedCustomerTypes: ").append(toIndentedString(allowedCustomerTypes)).append("\n");
    sb.append("    showSubtotalDetail: ").append(toIndentedString(showSubtotalDetail)).append("\n");
    sb.append("    additionalCheckboxes: ").append(toIndentedString(additionalCheckboxes)).append("\n");
    sb.append("    requireValidateCallbackSuccess: ").append(toIndentedString(requireValidateCallbackSuccess)).append("\n");
    sb.append("    vatRemoved: ").append(toIndentedString(vatRemoved)).append("\n");
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
