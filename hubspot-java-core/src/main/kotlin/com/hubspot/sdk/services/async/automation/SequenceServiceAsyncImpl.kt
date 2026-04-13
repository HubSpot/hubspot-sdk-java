// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.automation

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
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
import com.hubspot.sdk.core.prepareAsync
import com.hubspot.sdk.models.automation.sequences.CollectionResponseWithTotalPublicSequenceLiteResponse
import com.hubspot.sdk.models.automation.sequences.PublicSequenceEnrollmentLiteResponse
import com.hubspot.sdk.models.automation.sequences.PublicSequenceEnrollmentResponse
import com.hubspot.sdk.models.automation.sequences.PublicSequenceResponse
import com.hubspot.sdk.models.automation.sequences.SequenceCreateEnrollmentParams
import com.hubspot.sdk.models.automation.sequences.SequenceGetEnrollmentByContactIdParams
import com.hubspot.sdk.models.automation.sequences.SequenceGetParams
import com.hubspot.sdk.models.automation.sequences.SequenceListPageAsync
import com.hubspot.sdk.models.automation.sequences.SequenceListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SequenceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SequenceServiceAsync {

    private val withRawResponse: SequenceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SequenceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SequenceServiceAsync =
        SequenceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: SequenceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SequenceListPageAsync> =
        // get /automation/sequences/2026-03
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun createEnrollment(
        params: SequenceCreateEnrollmentParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicSequenceEnrollmentLiteResponse> =
        // post /automation/sequences/2026-03/enrollments
        withRawResponse().createEnrollment(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: SequenceGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicSequenceResponse> =
        // get /automation/sequences/2026-03/{sequenceId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getEnrollmentByContactId(
        params: SequenceGetEnrollmentByContactIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicSequenceEnrollmentResponse> =
        // get /automation/sequences/2026-03/enrollments/contact/{contactId}
        withRawResponse().getEnrollmentByContactId(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SequenceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SequenceServiceAsync.WithRawResponse =
            SequenceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponseWithTotalPublicSequenceLiteResponse> =
            jsonHandler<CollectionResponseWithTotalPublicSequenceLiteResponse>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: SequenceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SequenceListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "sequences", "2026-03")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                SequenceListPageAsync.builder()
                                    .service(SequenceServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val createEnrollmentHandler: Handler<PublicSequenceEnrollmentLiteResponse> =
            jsonHandler<PublicSequenceEnrollmentLiteResponse>(clientOptions.jsonMapper)

        override fun createEnrollment(
            params: SequenceCreateEnrollmentParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentLiteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "sequences", "2026-03", "enrollments")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createEnrollmentHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getHandler: Handler<PublicSequenceResponse> =
            jsonHandler<PublicSequenceResponse>(clientOptions.jsonMapper)

        override fun get(
            params: SequenceGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicSequenceResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sequenceId", params.sequenceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "sequences", "2026-03", params._pathParam(0))
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

        private val getEnrollmentByContactIdHandler: Handler<PublicSequenceEnrollmentResponse> =
            jsonHandler<PublicSequenceEnrollmentResponse>(clientOptions.jsonMapper)

        override fun getEnrollmentByContactId(
            params: SequenceGetEnrollmentByContactIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("contactId", params.contactId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "sequences",
                        "2026-03",
                        "enrollments",
                        "contact",
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
                            .use { getEnrollmentByContactIdHandler.handle(it) }
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
