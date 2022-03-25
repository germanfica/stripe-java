// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class SetupIntentVerifyMicrodepositsParams extends ApiRequestParams {
  /**
   * Two positive integers, in <em>cents</em>, equal to the values of the microdeposits sent to the
   * bank account.
   */
  @SerializedName("amounts")
  List<Long> amounts;

  /** A six-character code starting with SM present in the microdeposit sent to the bank account. */
  @SerializedName("descriptor_code")
  String descriptorCode;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  private SetupIntentVerifyMicrodepositsParams(
      List<Long> amounts,
      String descriptorCode,
      List<String> expand,
      Map<String, Object> extraParams) {
    this.amounts = amounts;
    this.descriptorCode = descriptorCode;
    this.expand = expand;
    this.extraParams = extraParams;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<Long> amounts;

    private String descriptorCode;

    private List<String> expand;

    private Map<String, Object> extraParams;

    /** Finalize and obtain parameter instance from this builder. */
    public SetupIntentVerifyMicrodepositsParams build() {
      return new SetupIntentVerifyMicrodepositsParams(
          this.amounts, this.descriptorCode, this.expand, this.extraParams);
    }

    /**
     * Add an element to `amounts` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SetupIntentVerifyMicrodepositsParams#amounts} for the field documentation.
     */
    public Builder addAmount(Long element) {
      if (this.amounts == null) {
        this.amounts = new ArrayList<>();
      }
      this.amounts.add(element);
      return this;
    }

    /**
     * Add all elements to `amounts` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * SetupIntentVerifyMicrodepositsParams#amounts} for the field documentation.
     */
    public Builder addAllAmount(List<Long> elements) {
      if (this.amounts == null) {
        this.amounts = new ArrayList<>();
      }
      this.amounts.addAll(elements);
      return this;
    }

    /**
     * A six-character code starting with SM present in the microdeposit sent to the bank account.
     */
    public Builder setDescriptorCode(String descriptorCode) {
      this.descriptorCode = descriptorCode;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SetupIntentVerifyMicrodepositsParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SetupIntentVerifyMicrodepositsParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * SetupIntentVerifyMicrodepositsParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link SetupIntentVerifyMicrodepositsParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }
  }
}
