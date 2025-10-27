// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing

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
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignCreateParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignDeleteParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignGetParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignListPage
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignListParams
import com.hubspot_sdk.api.models.marketing.campaigns.CampaignUpdateParams
import com.hubspot_sdk.api.models.marketing.campaigns.CollectionResponseWithTotalPublicCampaignForwardPaging
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaign
import com.hubspot_sdk.api.models.marketing.campaigns.PublicCampaignWithAssets
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.AssetService
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.AssetServiceImpl
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.BatchService
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.BatchServiceImpl
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.BudgetService
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.BudgetServiceImpl
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.ReportService
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.ReportServiceImpl
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.SpendService
import com.hubspot_sdk.api.services.blocking.marketing.campaigns.SpendServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CampaignServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CampaignService {

    private val withRawResponse: CampaignService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val assets: AssetService by lazy { AssetServiceImpl(clientOptions) }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    private val budget: BudgetService by lazy { BudgetServiceImpl(clientOptions) }

    private val reports: ReportService by lazy { ReportServiceImpl(clientOptions) }

    private val spend: SpendService by lazy { SpendServiceImpl(clientOptions) }

    override fun withRawResponse(): CampaignService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CampaignService =
        CampaignServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun assets(): AssetService = assets

    override fun batch(): BatchService = batch

    override fun budget(): BudgetService = budget

    override fun reports(): ReportService = reports

    override fun spend(): SpendService = spend

    override fun create(
        params: CampaignCreateParams,
        requestOptions: RequestOptions,
    ): PublicCampaign =
        // post /marketing/v3/campaigns/
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: CampaignUpdateParams,
        requestOptions: RequestOptions,
    ): PublicCampaign =
        // patch /marketing/v3/campaigns/{campaignGuid}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CampaignListParams,
        requestOptions: RequestOptions,
    ): CampaignListPage =
        // get /marketing/v3/campaigns/
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: CampaignDeleteParams, requestOptions: RequestOptions) {
        // delete /marketing/v3/campaigns/{campaignGuid}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(
        params: CampaignGetParams,
        requestOptions: RequestOptions,
    ): PublicCampaignWithAssets =
        // get /marketing/v3/campaigns/{campaignGuid}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CampaignService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val assets: AssetService.WithRawResponse by lazy {
            AssetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val budget: BudgetService.WithRawResponse by lazy {
            BudgetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val reports: ReportService.WithRawResponse by lazy {
            ReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val spend: SpendService.WithRawResponse by lazy {
            SpendServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CampaignService.WithRawResponse =
            CampaignServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun assets(): AssetService.WithRawResponse = assets

        override fun batch(): BatchService.WithRawResponse = batch

        override fun budget(): BudgetService.WithRawResponse = budget

        override fun reports(): ReportService.WithRawResponse = reports

        override fun spend(): SpendService.WithRawResponse = spend

        private val createHandler: Handler<PublicCampaign> =
            jsonHandler<PublicCampaign>(clientOptions.jsonMapper)

        override fun create(
            params: CampaignCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicCampaign> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "campaigns", "")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<PublicCampaign> =
            jsonHandler<PublicCampaign>(clientOptions.jsonMapper)

        override fun update(
            params: CampaignUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicCampaign> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignGuid", params.campaignGuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "campaigns", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CollectionResponseWithTotalPublicCampaignForwardPaging> =
            jsonHandler<CollectionResponseWithTotalPublicCampaignForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: CampaignListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CampaignListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "campaigns", "")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CampaignListPage.builder()
                            .service(CampaignServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CampaignDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignGuid", params.campaignGuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "campaigns", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<PublicCampaignWithAssets> =
            jsonHandler<PublicCampaignWithAssets>(clientOptions.jsonMapper)

        override fun get(
            params: CampaignGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicCampaignWithAssets> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignGuid", params.campaignGuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "v3", "campaigns", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
