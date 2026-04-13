// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.marketing.marketingevents

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.handlers.jsonHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepareAsync
import com.hubspot.models.marketing.marketingevents.EventDetailSettings
import com.hubspot.models.marketing.marketingevents.settings.SettingCreateOrUpdateParams
import com.hubspot.models.marketing.marketingevents.settings.SettingGetParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SettingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SettingServiceAsync {

    private val withRawResponse: SettingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SettingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingServiceAsync =
        SettingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createOrUpdate(
        params: SettingCreateOrUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventDetailSettings> =
        // post /marketing/marketing-events/2026-03/{appId}/settings
        withRawResponse().createOrUpdate(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: SettingGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventDetailSettings> =
        // get /marketing/marketing-events/2026-03/{appId}/settings
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SettingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettingServiceAsync.WithRawResponse =
            SettingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createOrUpdateHandler: Handler<EventDetailSettings> =
            jsonHandler<EventDetailSettings>(clientOptions.jsonMapper)

        override fun createOrUpdate(
            params: SettingCreateOrUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventDetailSettings>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "marketing-events",
                        "2026-03",
                        params._pathParam(0),
                        "settings",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createOrUpdateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<EventDetailSettings> =
            jsonHandler<EventDetailSettings>(clientOptions.jsonMapper)

        override fun get(
            params: SettingGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventDetailSettings>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "marketing-events",
                        "2026-03",
                        params._pathParam(0),
                        "settings",
                    )
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
