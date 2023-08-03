// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.PaymentMethodConfigurationCreateParams;
import com.stripe.param.PaymentMethodConfigurationListParams;
import com.stripe.param.PaymentMethodConfigurationRetrieveParams;
import com.stripe.param.PaymentMethodConfigurationUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** An object detailing payment method configurations. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentMethodConfiguration extends ApiResource implements HasId {
  @SerializedName("acss_debit")
  AcssDebit acssDebit;

  /** Whether the configuration can be used for new payments. */
  @SerializedName("active")
  Boolean active;

  @SerializedName("affirm")
  Affirm affirm;

  @SerializedName("afterpay_clearpay")
  AfterpayClearpay afterpayClearpay;

  @SerializedName("alipay")
  Alipay alipay;

  @SerializedName("apple_pay")
  ApplePay applePay;

  /** The Connect application associated with this configuration. */
  @SerializedName("application")
  String application;

  @SerializedName("au_becs_debit")
  AuBecsDebit auBecsDebit;

  @SerializedName("bacs_debit")
  BacsDebit bacsDebit;

  @SerializedName("bancontact")
  Bancontact bancontact;

  @SerializedName("blik")
  Blik blik;

  @SerializedName("boleto")
  Boleto boleto;

  @SerializedName("card")
  Card card;

  @SerializedName("cartes_bancaires")
  CartesBancaires cartesBancaires;

  @SerializedName("cashapp")
  Cashapp cashapp;

  @SerializedName("eps")
  Eps eps;

  @SerializedName("fpx")
  Fpx fpx;

  @SerializedName("giropay")
  Giropay giropay;

  @SerializedName("google_pay")
  GooglePay googlePay;

  @SerializedName("grabpay")
  Grabpay grabpay;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("id_bank_transfer")
  IdBankTransfer idBankTransfer;

  @SerializedName("ideal")
  Ideal ideal;

  /** The default configuration is used whenever no payment method configuration is specified. */
  @SerializedName("is_default")
  Boolean isDefault;

  @SerializedName("jcb")
  Jcb jcb;

  @SerializedName("klarna")
  Klarna klarna;

  @SerializedName("konbini")
  Konbini konbini;

  @SerializedName("link")
  Link link;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  @SerializedName("multibanco")
  Multibanco multibanco;

  /** Configuration name. */
  @SerializedName("name")
  String name;

  @SerializedName("netbanking")
  Netbanking netbanking;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code payment_method_configuration}.
   */
  @SerializedName("object")
  String object;

  @SerializedName("oxxo")
  Oxxo oxxo;

  @SerializedName("p24")
  P24 p24;

  /** The configuration's parent configuration. */
  @SerializedName("parent")
  String parent;

  @SerializedName("pay_by_bank")
  PayByBank payByBank;

  @SerializedName("paynow")
  Paynow paynow;

  @SerializedName("promptpay")
  Promptpay promptpay;

  @SerializedName("sepa_debit")
  SepaDebit sepaDebit;

  @SerializedName("sofort")
  Sofort sofort;

  @SerializedName("upi")
  Upi upi;

  @SerializedName("us_bank_account")
  UsBankAccount usBankAccount;

  @SerializedName("wechat_pay")
  WechatPay wechatPay;

  /** Creates a payment method configuration. */
  public static PaymentMethodConfiguration create(Map<String, Object> params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a payment method configuration. */
  public static PaymentMethodConfiguration create(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/payment_method_configurations");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, PaymentMethodConfiguration.class, options);
  }

  /** Creates a payment method configuration. */
  public static PaymentMethodConfiguration create(PaymentMethodConfigurationCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a payment method configuration. */
  public static PaymentMethodConfiguration create(
      PaymentMethodConfigurationCreateParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/payment_method_configurations");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, PaymentMethodConfiguration.class, options);
  }

  /** List payment method configurations. */
  public static PaymentMethodConfigurationCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List payment method configurations. */
  public static PaymentMethodConfigurationCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/payment_method_configurations");
    return ApiResource.request(
        ApiResource.RequestMethod.GET,
        url,
        params,
        PaymentMethodConfigurationCollection.class,
        options);
  }

  /** List payment method configurations. */
  public static PaymentMethodConfigurationCollection list(
      PaymentMethodConfigurationListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** List payment method configurations. */
  public static PaymentMethodConfigurationCollection list(
      PaymentMethodConfigurationListParams params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/payment_method_configurations");
    return ApiResource.request(
        ApiResource.RequestMethod.GET,
        url,
        params,
        PaymentMethodConfigurationCollection.class,
        options);
  }

  /** Retrieve payment method configuration. */
  public static PaymentMethodConfiguration retrieve(String configuration) throws StripeException {
    return retrieve(configuration, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieve payment method configuration. */
  public static PaymentMethodConfiguration retrieve(String configuration, RequestOptions options)
      throws StripeException {
    return retrieve(configuration, (Map<String, Object>) null, options);
  }

  /** Retrieve payment method configuration. */
  public static PaymentMethodConfiguration retrieve(
      String configuration, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/payment_method_configurations/%s", ApiResource.urlEncodeId(configuration)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, PaymentMethodConfiguration.class, options);
  }

  /** Retrieve payment method configuration. */
  public static PaymentMethodConfiguration retrieve(
      String configuration, PaymentMethodConfigurationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/payment_method_configurations/%s", ApiResource.urlEncodeId(configuration)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, PaymentMethodConfiguration.class, options);
  }

  /** Update payment method configuration. */
  public PaymentMethodConfiguration update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Update payment method configuration. */
  public PaymentMethodConfiguration update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/payment_method_configurations/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, PaymentMethodConfiguration.class, options);
  }

  /** Update payment method configuration. */
  public PaymentMethodConfiguration update(PaymentMethodConfigurationUpdateParams params)
      throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Update payment method configuration. */
  public PaymentMethodConfiguration update(
      PaymentMethodConfigurationUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/payment_method_configurations/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, PaymentMethodConfiguration.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AcssDebit extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Affirm extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AfterpayClearpay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Alipay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ApplePay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AuBecsDebit extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BacsDebit extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Bancontact extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Blik extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Boleto extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Card extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CartesBancaires extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Cashapp extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Eps extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Fpx extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Giropay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class GooglePay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Grabpay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class IdBankTransfer extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Ideal extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Jcb extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Klarna extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Konbini extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Link extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Multibanco extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Netbanking extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Oxxo extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class P24 extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PayByBank extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Paynow extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Promptpay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SepaDebit extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Sofort extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Upi extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class UsBankAccount extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class WechatPay extends StripeObject {
    /**
     * Whether this payment method may be offered at checkout. True if {@code display_preference} is
     * {@code on} and the payment method's capability is active.
     */
    @SerializedName("available")
    Boolean available;

    @SerializedName("display_preference")
    DisplayPreference displayPreference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class DisplayPreference extends StripeObject {
      /**
       * For child configurations, whether or not the account's preference will be observed. If
       * {@code false}, the parent configuration's preference is used.
       */
      @SerializedName("overridable")
      Boolean overridable;

      /**
       * The account's display preference.
       *
       * <p>One of {@code none}, {@code off}, or {@code on}.
       */
      @SerializedName("preference")
      String preference;

      /**
       * The effective display preference value.
       *
       * <p>One of {@code off}, or {@code on}.
       */
      @SerializedName("value")
      String value;
    }
  }
}