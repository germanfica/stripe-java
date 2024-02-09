// File generated from our OpenAPI spec
package com.stripe.model;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.TransferCollectionCreateTransferReversalParams;
import com.stripe.param.TransferCollectionRetrieveTransferReversalParams;
import com.stripe.param.TransferCollectionTransferReversalsParams;
import java.util.Map;

public class TransferCollection extends StripeCollection<Transfer> {
  /**
   * When you create a new reversal, you must specify a transfer to create it on.
   *
   * <p>When reversing transfers, you can optionally reverse part of the transfer. You can do so as
   * many times as you wish until the entire transfer has been reversed.
   *
   * <p>Once entirely reversed, a transfer can’t be reversed again. This method will return an error
   * when called on an already-reversed transfer, or when trying to reverse more money than is left
   * on a transfer.
   */
  public TransferReversal createTransferReversal(Map<String, Object> params)
      throws StripeException {
    return createTransferReversal(params, (RequestOptions) null);
  }

  /**
   * When you create a new reversal, you must specify a transfer to create it on.
   *
   * <p>When reversing transfers, you can optionally reverse part of the transfer. You can do so as
   * many times as you wish until the entire transfer has been reversed.
   *
   * <p>Once entirely reversed, a transfer can’t be reversed again. This method will return an error
   * when called on an already-reversed transfer, or when trying to reverse more money than is left
   * on a transfer.
   */
  public TransferReversal createTransferReversal(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, TransferReversal.class);
  }

  /**
   * When you create a new reversal, you must specify a transfer to create it on.
   *
   * <p>When reversing transfers, you can optionally reverse part of the transfer. You can do so as
   * many times as you wish until the entire transfer has been reversed.
   *
   * <p>Once entirely reversed, a transfer can’t be reversed again. This method will return an error
   * when called on an already-reversed transfer, or when trying to reverse more money than is left
   * on a transfer.
   */
  public TransferReversal createTransferReversal(
      TransferCollectionCreateTransferReversalParams params) throws StripeException {
    return createTransferReversal(params, (RequestOptions) null);
  }

  /**
   * When you create a new reversal, you must specify a transfer to create it on.
   *
   * <p>When reversing transfers, you can optionally reverse part of the transfer. You can do so as
   * many times as you wish until the entire transfer has been reversed.
   *
   * <p>Once entirely reversed, a transfer can’t be reversed again. This method will return an error
   * when called on an already-reversed transfer, or when trying to reverse more money than is left
   * on a transfer.
   */
  public TransferReversal createTransferReversal(
      TransferCollectionCreateTransferReversalParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, TransferReversal.class);
  }

  /**
   * By default, you can see the 10 most recent reversals stored directly on the transfer object,
   * but you can also retrieve details about a specific reversal stored on the transfer.
   */
  public TransferReversal retrieveTransferReversal(String id) throws StripeException {
    return retrieveTransferReversal(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * By default, you can see the 10 most recent reversals stored directly on the transfer object,
   * but you can also retrieve details about a specific reversal stored on the transfer.
   */
  public TransferReversal retrieveTransferReversal(String id, RequestOptions options)
      throws StripeException {
    return retrieveTransferReversal(id, (Map<String, Object>) null, options);
  }

  /**
   * By default, you can see the 10 most recent reversals stored directly on the transfer object,
   * but you can also retrieve details about a specific reversal stored on the transfer.
   */
  public TransferReversal retrieveTransferReversal(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, TransferReversal.class);
  }

  /**
   * By default, you can see the 10 most recent reversals stored directly on the transfer object,
   * but you can also retrieve details about a specific reversal stored on the transfer.
   */
  public TransferReversal retrieveTransferReversal(
      String id, TransferCollectionRetrieveTransferReversalParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("%s/%s", this.getUrl(), ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, TransferReversal.class);
  }

  /**
   * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most
   * recent reversals are always available by default on the transfer object. If you need more than
   * those 10, you can use this API method and the {@code limit} and {@code starting_after}
   * parameters to page through additional reversals.
   */
  public TransferReversalCollection transferReversals(Map<String, Object> params)
      throws StripeException {
    return transferReversals(params, (RequestOptions) null);
  }

  /**
   * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most
   * recent reversals are always available by default on the transfer object. If you need more than
   * those 10, you can use this API method and the {@code limit} and {@code starting_after}
   * parameters to page through additional reversals.
   */
  public TransferReversalCollection transferReversals(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = this.getUrl();
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, TransferReversalCollection.class);
  }

  /**
   * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most
   * recent reversals are always available by default on the transfer object. If you need more than
   * those 10, you can use this API method and the {@code limit} and {@code starting_after}
   * parameters to page through additional reversals.
   */
  public TransferReversalCollection transferReversals(
      TransferCollectionTransferReversalsParams params) throws StripeException {
    return transferReversals(params, (RequestOptions) null);
  }

  /**
   * You can see a list of the reversals belonging to a specific transfer. Note that the 10 most
   * recent reversals are always available by default on the transfer object. If you need more than
   * those 10, you can use this API method and the {@code limit} and {@code starting_after}
   * parameters to page through additional reversals.
   */
  public TransferReversalCollection transferReversals(
      TransferCollectionTransferReversalsParams params, RequestOptions options)
      throws StripeException {
    String path = this.getUrl();
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, TransferReversalCollection.class);
  }
}
