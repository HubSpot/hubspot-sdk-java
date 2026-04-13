// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.handlers.jsonHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepareAsync
import com.hubspot.sdk.models.account.AccountGetDailyPrivateAppsUsageParams
import com.hubspot.sdk.models.account.AccountGetParams
import com.hubspot.sdk.models.account.CollectionResponseApiUsageNoPaging
import com.hubspot.sdk.models.account.PortalInformationResponse
import com.hubspot.sdk.services.async.account.ActivityServiceAsync
import com.hubspot.sdk.services.async.account.ActivityServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AccountServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountServiceAsync {

    private val withRawResponse: AccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val activity: ActivityServiceAsync by lazy { ActivityServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountServiceAsync =
        AccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun activity(): ActivityServiceAsync = activity

    override fun get(
        params: AccountGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortalInformationResponse> =
        // get /account-info/2026-03/details
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getDailyPrivateAppsUsage(
        params: AccountGetDailyPrivateAppsUsageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseApiUsageNoPaging> =
        // get /account-info/2026-03/api-usage/daily/private-apps
        withRawResponse().getDailyPrivateAppsUsage(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val activity: ActivityServiceAsync.WithRawResponse by lazy {
            ActivityServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse =
            AccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun activity(): ActivityServiceAsync.WithRawResponse = activity

        private val getHandler: Handler<PortalInformationResponse> =
            jsonHandler<PortalInformationResponse>(clientOptions.jsonMapper)

        override fun get(
            params: AccountGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortalInformationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account-info", "2026-03", "details")
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

        private val getDailyPrivateAppsUsageHandler: Handler<CollectionResponseApiUsageNoPaging> =
            jsonHandler<CollectionResponseApiUsageNoPaging>(clientOptions.jsonMapper)

        override fun getDailyPrivateAppsUsage(
            params: AccountGetDailyPrivateAppsUsageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseApiUsageNoPaging>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "account-info",
                        "2026-03",
                        "api-usage",
                        "daily",
                        "private-apps",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getDailyPrivateAppsUsageHandler.handle(it) }
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
