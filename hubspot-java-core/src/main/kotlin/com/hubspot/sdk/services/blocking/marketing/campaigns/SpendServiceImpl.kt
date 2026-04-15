// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.marketing.campaigns

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.handlers.emptyHandler
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.handlers.jsonHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.core.http.json
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.marketing.campaigns.PublicSpendItem
import com.hubspot.sdk.models.marketing.campaigns.spend.SpendCreateParams
import com.hubspot.sdk.models.marketing.campaigns.spend.SpendDeleteParams
import com.hubspot.sdk.models.marketing.campaigns.spend.SpendGetParams
import com.hubspot.sdk.models.marketing.campaigns.spend.SpendUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SpendServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SpendService {

    private val withRawResponse: SpendService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SpendService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpendService =
        SpendServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SpendCreateParams,
        requestOptions: RequestOptions,
    ): PublicSpendItem =
        // post /marketing/campaigns/2026-03/{campaignGuid}/spend
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: SpendUpdateParams,
        requestOptions: RequestOptions,
    ): PublicSpendItem =
        // put /marketing/campaigns/2026-03/{campaignGuid}/spend/{spendId}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(params: SpendDeleteParams, requestOptions: RequestOptions) {
        // delete /marketing/campaigns/2026-03/{campaignGuid}/spend/{spendId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: SpendGetParams, requestOptions: RequestOptions): PublicSpendItem =
        // get /marketing/campaigns/2026-03/{campaignGuid}/spend/{spendId}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SpendService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpendService.WithRawResponse =
            SpendServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PublicSpendItem> =
            jsonHandler<PublicSpendItem>(clientOptions.jsonMapper)

        override fun create(
            params: SpendCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicSpendItem> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignGuid", params.campaignGuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "campaigns",
                        "2026-03",
                        params._pathParam(0),
                        "spend",
                    )
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

        private val updateHandler: Handler<PublicSpendItem> =
            jsonHandler<PublicSpendItem>(clientOptions.jsonMapper)

        override fun update(
            params: SpendUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicSpendItem> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("spendId", params.spendId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "campaigns",
                        "2026-03",
                        params._pathParam(0),
                        "spend",
                        params._pathParam(1),
                    )
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SpendDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("spendId", params.spendId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "campaigns",
                        "2026-03",
                        params._pathParam(0),
                        "spend",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<PublicSpendItem> =
            jsonHandler<PublicSpendItem>(clientOptions.jsonMapper)

        override fun get(
            params: SpendGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicSpendItem> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("spendId", params.spendId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "campaigns",
                        "2026-03",
                        params._pathParam(0),
                        "spend",
                        params._pathParam(1),
                    )
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
