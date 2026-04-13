// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async

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
import com.hubspot.models.communicationpreferences.ActionResponseWithResultsPublicStatus
import com.hubspot.models.communicationpreferences.ActionResponseWithResultsPublicWideStatus
import com.hubspot.models.communicationpreferences.CommunicationPreferenceGenerateLinksParams
import com.hubspot.models.communicationpreferences.CommunicationPreferenceGetStatusesParams
import com.hubspot.models.communicationpreferences.CommunicationPreferenceGetUnsubscribeAllStatusParams
import com.hubspot.models.communicationpreferences.CommunicationPreferenceUnsubscribeAllParams
import com.hubspot.models.communicationpreferences.CommunicationPreferenceUpdateStatusParams
import com.hubspot.models.communicationpreferences.LinkGenerationResponse
import com.hubspot.services.async.communicationpreferences.DefinitionServiceAsync
import com.hubspot.services.async.communicationpreferences.DefinitionServiceAsyncImpl
import com.hubspot.services.async.communicationpreferences.StatusServiceAsync
import com.hubspot.services.async.communicationpreferences.StatusServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CommunicationPreferenceServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    CommunicationPreferenceServiceAsync {

    private val withRawResponse: CommunicationPreferenceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val definitions: DefinitionServiceAsync by lazy {
        DefinitionServiceAsyncImpl(clientOptions)
    }

    private val statuses: StatusServiceAsync by lazy { StatusServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CommunicationPreferenceServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): CommunicationPreferenceServiceAsync =
        CommunicationPreferenceServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun definitions(): DefinitionServiceAsync = definitions

    override fun statuses(): StatusServiceAsync = statuses

    override fun generateLinks(
        params: CommunicationPreferenceGenerateLinksParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LinkGenerationResponse> =
        // post /communication-preferences/2026-03/links/generate
        withRawResponse().generateLinks(params, requestOptions).thenApply { it.parse() }

    override fun getStatuses(
        params: CommunicationPreferenceGetStatusesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        // get /communication-preferences/2026-03/statuses/{subscriberIdString}
        withRawResponse().getStatuses(params, requestOptions).thenApply { it.parse() }

    override fun getUnsubscribeAllStatus(
        params: CommunicationPreferenceGetUnsubscribeAllStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionResponseWithResultsPublicWideStatus> =
        // get /communication-preferences/2026-03/statuses/{subscriberIdString}/unsubscribe-all
        withRawResponse().getUnsubscribeAllStatus(params, requestOptions).thenApply { it.parse() }

    override fun unsubscribeAll(
        params: CommunicationPreferenceUnsubscribeAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        // post /communication-preferences/2026-03/statuses/{subscriberIdString}/unsubscribe-all
        withRawResponse().unsubscribeAll(params, requestOptions).thenApply { it.parse() }

    override fun updateStatus(
        params: CommunicationPreferenceUpdateStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionResponseWithResultsPublicStatus> =
        // post /communication-preferences/2026-03/statuses/{subscriberIdString}
        withRawResponse().updateStatus(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommunicationPreferenceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val definitions: DefinitionServiceAsync.WithRawResponse by lazy {
            DefinitionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val statuses: StatusServiceAsync.WithRawResponse by lazy {
            StatusServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommunicationPreferenceServiceAsync.WithRawResponse =
            CommunicationPreferenceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun definitions(): DefinitionServiceAsync.WithRawResponse = definitions

        override fun statuses(): StatusServiceAsync.WithRawResponse = statuses

        private val generateLinksHandler: Handler<LinkGenerationResponse> =
            jsonHandler<LinkGenerationResponse>(clientOptions.jsonMapper)

        override fun generateLinks(
            params: CommunicationPreferenceGenerateLinksParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LinkGenerationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("communication-preferences", "2026-03", "links", "generate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { generateLinksHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getStatusesHandler: Handler<ActionResponseWithResultsPublicStatus> =
            jsonHandler<ActionResponseWithResultsPublicStatus>(clientOptions.jsonMapper)

        override fun getStatuses(
            params: CommunicationPreferenceGetStatusesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberIdString", params.subscriberIdString().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "2026-03",
                        "statuses",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getStatusesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getUnsubscribeAllStatusHandler:
            Handler<ActionResponseWithResultsPublicWideStatus> =
            jsonHandler<ActionResponseWithResultsPublicWideStatus>(clientOptions.jsonMapper)

        override fun getUnsubscribeAllStatus(
            params: CommunicationPreferenceGetUnsubscribeAllStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicWideStatus>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberIdString", params.subscriberIdString().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "2026-03",
                        "statuses",
                        params._pathParam(0),
                        "unsubscribe-all",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getUnsubscribeAllStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unsubscribeAllHandler: Handler<ActionResponseWithResultsPublicStatus> =
            jsonHandler<ActionResponseWithResultsPublicStatus>(clientOptions.jsonMapper)

        override fun unsubscribeAll(
            params: CommunicationPreferenceUnsubscribeAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberIdString", params.subscriberIdString().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "2026-03",
                        "statuses",
                        params._pathParam(0),
                        "unsubscribe-all",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { unsubscribeAllHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateStatusHandler: Handler<ActionResponseWithResultsPublicStatus> =
            jsonHandler<ActionResponseWithResultsPublicStatus>(clientOptions.jsonMapper)

        override fun updateStatus(
            params: CommunicationPreferenceUpdateStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsPublicStatus>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberIdString", params.subscriberIdString().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "2026-03",
                        "statuses",
                        params._pathParam(0),
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
                            .use { updateStatusHandler.handle(it) }
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
