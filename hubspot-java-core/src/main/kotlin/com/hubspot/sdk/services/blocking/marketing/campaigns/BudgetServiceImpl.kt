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
import com.hubspot.sdk.models.marketing.campaigns.PublicBudgetItem
import com.hubspot.sdk.models.marketing.campaigns.PublicBudgetTotals
import com.hubspot.sdk.models.marketing.campaigns.budget.BudgetCreateParams
import com.hubspot.sdk.models.marketing.campaigns.budget.BudgetDeleteParams
import com.hubspot.sdk.models.marketing.campaigns.budget.BudgetGetParams
import com.hubspot.sdk.models.marketing.campaigns.budget.BudgetGetTotalsParams
import com.hubspot.sdk.models.marketing.campaigns.budget.BudgetUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BudgetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BudgetService {

    private val withRawResponse: BudgetService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BudgetService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BudgetService =
        BudgetServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: BudgetCreateParams,
        requestOptions: RequestOptions,
    ): PublicBudgetItem =
        // post /marketing/campaigns/2026-03/{campaignGuid}/budget
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: BudgetUpdateParams,
        requestOptions: RequestOptions,
    ): PublicBudgetItem =
        // put /marketing/campaigns/2026-03/{campaignGuid}/budget/{budgetId}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(params: BudgetDeleteParams, requestOptions: RequestOptions) {
        // delete /marketing/campaigns/2026-03/{campaignGuid}/budget/{budgetId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: BudgetGetParams, requestOptions: RequestOptions): PublicBudgetItem =
        // get /marketing/campaigns/2026-03/{campaignGuid}/budget/{budgetId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getTotals(
        params: BudgetGetTotalsParams,
        requestOptions: RequestOptions,
    ): PublicBudgetTotals =
        // get /marketing/campaigns/2026-03/{campaignGuid}/budget/totals
        withRawResponse().getTotals(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BudgetService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BudgetService.WithRawResponse =
            BudgetServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PublicBudgetItem> =
            jsonHandler<PublicBudgetItem>(clientOptions.jsonMapper)

        override fun create(
            params: BudgetCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicBudgetItem> {
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
                        "budget",
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

        private val updateHandler: Handler<PublicBudgetItem> =
            jsonHandler<PublicBudgetItem>(clientOptions.jsonMapper)

        override fun update(
            params: BudgetUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicBudgetItem> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("budgetId", params.budgetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "campaigns",
                        "2026-03",
                        params._pathParam(0),
                        "budget",
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
            params: BudgetDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("budgetId", params.budgetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "campaigns",
                        "2026-03",
                        params._pathParam(0),
                        "budget",
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

        private val getHandler: Handler<PublicBudgetItem> =
            jsonHandler<PublicBudgetItem>(clientOptions.jsonMapper)

        override fun get(
            params: BudgetGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicBudgetItem> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("budgetId", params.budgetId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "campaigns",
                        "2026-03",
                        params._pathParam(0),
                        "budget",
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

        private val getTotalsHandler: Handler<PublicBudgetTotals> =
            jsonHandler<PublicBudgetTotals>(clientOptions.jsonMapper)

        override fun getTotals(
            params: BudgetGetTotalsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicBudgetTotals> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("campaignGuid", params.campaignGuid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "campaigns",
                        "2026-03",
                        params._pathParam(0),
                        "budget",
                        "totals",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getTotalsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
