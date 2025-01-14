// File generated from our OpenAPI spec
package com.stripe.model.billing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.billing.MeterEventAdjustmentCreateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A billing meter event adjustment is a resource that allows you to cancel a meter event. For
 * example, you might create a billing meter event adjustment to cancel a meter event that was
 * created in error or attached to the wrong customer.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class MeterEventAdjustment extends ApiResource {
  /** Specifies which event to cancel. */
  @SerializedName("cancel")
  Cancel cancel;

  /** The name of the meter event. Corresponds with the {@code event_name} field on a meter. */
  @SerializedName("event_name")
  String eventName;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code billing.meter_event_adjustment}.
   */
  @SerializedName("object")
  String object;

  /**
   * The meter event adjustment's status.
   *
   * <p>One of {@code complete}, or {@code pending}.
   */
  @SerializedName("status")
  String status;

  /**
   * Specifies whether to cancel a single event or a range of events for a time period. Time period
   * cancellation is not supported yet.
   *
   * <p>Equal to {@code cancel}.
   */
  @SerializedName("type")
  String type;

  /** Creates a billing meter event adjustment. */
  public static MeterEventAdjustment create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a billing meter event adjustment. */
  public static MeterEventAdjustment create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/billing/meter_event_adjustments";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, MeterEventAdjustment.class);
  }

  /** Creates a billing meter event adjustment. */
  public static MeterEventAdjustment create(MeterEventAdjustmentCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a billing meter event adjustment. */
  public static MeterEventAdjustment create(
      MeterEventAdjustmentCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/billing/meter_event_adjustments";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, MeterEventAdjustment.class);
  }

  /**
   * For more details about Cancel, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Cancel extends StripeObject {
    /** Unique identifier for the event. */
    @SerializedName("identifier")
    String identifier;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(cancel, responseGetter);
  }
}
