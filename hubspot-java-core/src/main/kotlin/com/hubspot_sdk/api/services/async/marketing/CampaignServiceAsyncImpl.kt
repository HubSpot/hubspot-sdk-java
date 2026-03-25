// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.emptyHandler
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.handlers.jsonHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.core.http.json
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignDeleteParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignGetParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignUpdateParams
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaign
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaignWithAssets
import com.hubspot_sdk.api.services.async.marketing.campaigns.AssetServiceAsync
import com.hubspot_sdk.api.services.async.marketing.campaigns.AssetServiceAsyncImpl
import com.hubspot_sdk.api.services.async.marketing.campaigns.BatchServiceAsync
import com.hubspot_sdk.api.services.async.marketing.campaigns.BatchServiceAsyncImpl
import com.hubspot_sdk.api.services.async.marketing.campaigns.BudgetServiceAsync
import com.hubspot_sdk.api.services.async.marketing.campaigns.BudgetServiceAsyncImpl
import com.hubspot_sdk.api.services.async.marketing.campaigns.MetricServiceAsync
import com.hubspot_sdk.api.services.async.marketing.campaigns.MetricServiceAsyncImpl
import com.hubspot_sdk.api.services.async.marketing.campaigns.SpendServiceAsync
import com.hubspot_sdk.api.services.async.marketing.campaigns.SpendServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CampaignServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CampaignServiceAsync {

    private val withRawResponse: CampaignServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val assets: AssetServiceAsync by lazy { AssetServiceAsyncImpl(clientOptions) }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    private val budget: BudgetServiceAsync by lazy { BudgetServiceAsyncImpl(clientOptions) }

    private val metrics: MetricServiceAsync by lazy { MetricServiceAsyncImpl(clientOptions) }

    private val spend: SpendServiceAsync by lazy { SpendServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CampaignServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignServiceAsync =
        CampaignServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun assets(): AssetServiceAsync = assets

    override fun batch(): BatchServiceAsync = batch

    override fun budget(): BudgetServiceAsync = budget

    override fun metrics(): MetricServiceAsync = metrics

    override fun spend(): SpendServiceAsync = spend

    override fun update(
        params: CampaignUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicCampaign> =
        // patch /marketing/campaigns/2026-03/{campaignGuid}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CampaignDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /marketing/campaigns/2026-03/{campaignGuid}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: CampaignGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicCampaignWithAssets> =
        // get /marketing/campaigns/2026-03/{campaignGuid}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CampaignServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val assets: AssetServiceAsync.WithRawResponse by lazy {
            AssetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val budget: BudgetServiceAsync.WithRawResponse by lazy {
            BudgetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val metrics: MetricServiceAsync.WithRawResponse by lazy {
            MetricServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val spend: SpendServiceAsync.WithRawResponse by lazy {
            SpendServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CampaignServiceAsync.WithRawResponse =
            CampaignServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun assets(): AssetServiceAsync.WithRawResponse = assets

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        override fun budget(): BudgetServiceAsync.WithRawResponse = budget

        override fun metrics(): MetricServiceAsync.WithRawResponse = metrics

        override fun spend(): SpendServiceAsync.WithRawResponse = spend

        private val updateHandler: Handler<PublicCampaign> =
            jsonHandler<PublicCampaign>(clientOptions.jsonMapper)

        override fun update(
            params: CampaignUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicCampaign>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignGuid", params.campaignGuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "campaigns", "2026-03", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CampaignDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignGuid", params.campaignGuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "campaigns", "2026-03", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<PublicCampaignWithAssets> =
            jsonHandler<PublicCampaignWithAssets>(clientOptions.jsonMapper)

        override fun get(
            params: CampaignGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicCampaignWithAssets>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignGuid", params.campaignGuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "campaigns", "2026-03", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
