// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation.sequences

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
import com.hubspot_sdk.api.core.http.json
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceEnrollmentLiteResponse
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceEnrollmentResponse
import com.hubspot_sdk.api.models.automation.sequences.enrollments.EnrollmentEnrollParams
import com.hubspot_sdk.api.models.automation.sequences.enrollments.EnrollmentGetByContactIdParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EnrollmentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EnrollmentServiceAsync {

    private val withRawResponse: EnrollmentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EnrollmentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnrollmentServiceAsync =
        EnrollmentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun enroll(
        params: EnrollmentEnrollParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicSequenceEnrollmentLiteResponse> =
        // post /automation/v4/sequences/enrollments
        withRawResponse().enroll(params, requestOptions).thenApply { it.parse() }

    override fun getByContactId(
        params: EnrollmentGetByContactIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicSequenceEnrollmentResponse> =
        // get /automation/v4/sequences/enrollments/contact/{contactId}
        withRawResponse().getByContactId(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EnrollmentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EnrollmentServiceAsync.WithRawResponse =
            EnrollmentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val enrollHandler: Handler<PublicSequenceEnrollmentLiteResponse> =
            jsonHandler<PublicSequenceEnrollmentLiteResponse>(clientOptions.jsonMapper)

        override fun enroll(
            params: EnrollmentEnrollParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicSequenceEnrollmentLiteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "v4", "sequences", "enrollments")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { enrollHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getByContactIdHandler: Handler<PublicSequenceEnrollmentResponse> =
            jsonHandler<PublicSequenceEnrollmentResponse>(clientOptions.jsonMapper)

        override fun getByContactId(
            params: EnrollmentGetByContactIdParams,
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
                        "v4",
                        "sequences",
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
                            .use { getByContactIdHandler.handle(it) }
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
