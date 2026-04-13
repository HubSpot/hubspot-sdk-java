// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.automation

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
import com.hubspot.core.prepare
import com.hubspot.models.automation.sequences.CollectionResponseWithTotalPublicSequenceLiteResponse
import com.hubspot.models.automation.sequences.PublicSequenceEnrollmentLiteResponse
import com.hubspot.models.automation.sequences.PublicSequenceEnrollmentResponse
import com.hubspot.models.automation.sequences.PublicSequenceResponse
import com.hubspot.models.automation.sequences.SequenceCreateEnrollmentParams
import com.hubspot.models.automation.sequences.SequenceGetEnrollmentByContactIdParams
import com.hubspot.models.automation.sequences.SequenceGetParams
import com.hubspot.models.automation.sequences.SequenceListPage
import com.hubspot.models.automation.sequences.SequenceListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SequenceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SequenceService {

    private val withRawResponse: SequenceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SequenceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SequenceService =
        SequenceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: SequenceListParams,
        requestOptions: RequestOptions,
    ): SequenceListPage =
        // get /automation/sequences/2026-03
        withRawResponse().list(params, requestOptions).parse()

    override fun createEnrollment(
        params: SequenceCreateEnrollmentParams,
        requestOptions: RequestOptions,
    ): PublicSequenceEnrollmentLiteResponse =
        // post /automation/sequences/2026-03/enrollments
        withRawResponse().createEnrollment(params, requestOptions).parse()

    override fun get(
        params: SequenceGetParams,
        requestOptions: RequestOptions,
    ): PublicSequenceResponse =
        // get /automation/sequences/2026-03/{sequenceId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getEnrollmentByContactId(
        params: SequenceGetEnrollmentByContactIdParams,
        requestOptions: RequestOptions,
    ): PublicSequenceEnrollmentResponse =
        // get /automation/sequences/2026-03/enrollments/contact/{contactId}
        withRawResponse().getEnrollmentByContactId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SequenceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SequenceService.WithRawResponse =
            SequenceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponseWithTotalPublicSequenceLiteResponse> =
            jsonHandler<CollectionResponseWithTotalPublicSequenceLiteResponse>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: SequenceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SequenceListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "sequences", "2026-03")
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
                        SequenceListPage.builder()
                            .service(SequenceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val createEnrollmentHandler: Handler<PublicSequenceEnrollmentLiteResponse> =
            jsonHandler<PublicSequenceEnrollmentLiteResponse>(clientOptions.jsonMapper)

        override fun createEnrollment(
            params: SequenceCreateEnrollmentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicSequenceEnrollmentLiteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "sequences", "2026-03", "enrollments")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createEnrollmentHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<PublicSequenceResponse> =
            jsonHandler<PublicSequenceResponse>(clientOptions.jsonMapper)

        override fun get(
            params: SequenceGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicSequenceResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("sequenceId", params.sequenceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("automation", "sequences", "2026-03", params._pathParam(0))
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

        private val getEnrollmentByContactIdHandler: Handler<PublicSequenceEnrollmentResponse> =
            jsonHandler<PublicSequenceEnrollmentResponse>(clientOptions.jsonMapper)

        override fun getEnrollmentByContactId(
            params: SequenceGetEnrollmentByContactIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicSequenceEnrollmentResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
