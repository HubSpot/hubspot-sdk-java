// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.handlers.jsonHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.automation.sequences.CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceResponse
import com.hubspot_sdk.api.models.automation.sequences.SequenceGetParams
import com.hubspot_sdk.api.models.automation.sequences.SequenceListPageAsync
import com.hubspot_sdk.api.models.automation.sequences.SequenceListParams
import com.hubspot_sdk.api.services.async.automation.sequences.EnrollmentServiceAsync
import com.hubspot_sdk.api.services.async.automation.sequences.EnrollmentServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SequenceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SequenceServiceAsync {

    private val withRawResponse: SequenceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val enrollments: EnrollmentServiceAsync by lazy {
        EnrollmentServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): SequenceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SequenceServiceAsync =
        SequenceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun enrollments(): EnrollmentServiceAsync = enrollments

    override fun list(
        params: SequenceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SequenceListPageAsync> =
        // get /automation/v4/sequences/
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: SequenceGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicSequenceResponse> =
        // get /automation/v4/sequences/{sequenceId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SequenceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val enrollments: EnrollmentServiceAsync.WithRawResponse by lazy {
            EnrollmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SequenceServiceAsync.WithRawResponse =
            SequenceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun enrollments(): EnrollmentServiceAsync.WithRawResponse = enrollments

        private val listHandler:
            Handler<CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging> =
            jsonHandler<CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging>(
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
                    .addPathSegments("automation", "v4", "sequences", "")
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
                    .addPathSegments("automation", "v4", "sequences", params._pathParam(0))
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
