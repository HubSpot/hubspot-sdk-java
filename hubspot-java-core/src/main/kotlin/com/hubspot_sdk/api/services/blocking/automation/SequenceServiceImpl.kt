// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation

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
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.automation.sequences.CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging
import com.hubspot_sdk.api.models.automation.sequences.PublicSequenceResponse
import com.hubspot_sdk.api.models.automation.sequences.SequenceGetParams
import com.hubspot_sdk.api.models.automation.sequences.SequenceListPage
import com.hubspot_sdk.api.models.automation.sequences.SequenceListParams
import com.hubspot_sdk.api.services.blocking.automation.sequences.EnrollmentService
import com.hubspot_sdk.api.services.blocking.automation.sequences.EnrollmentServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SequenceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SequenceService {

    private val withRawResponse: SequenceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val enrollments: EnrollmentService by lazy { EnrollmentServiceImpl(clientOptions) }

    override fun withRawResponse(): SequenceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SequenceService =
        SequenceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun enrollments(): EnrollmentService = enrollments

    override fun list(
        params: SequenceListParams,
        requestOptions: RequestOptions,
    ): SequenceListPage =
        // get /automation/v4/sequences/
        withRawResponse().list(params, requestOptions).parse()

    override fun get(
        params: SequenceGetParams,
        requestOptions: RequestOptions,
    ): PublicSequenceResponse =
        // get /automation/v4/sequences/{sequenceId}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SequenceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val enrollments: EnrollmentService.WithRawResponse by lazy {
            EnrollmentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SequenceService.WithRawResponse =
            SequenceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun enrollments(): EnrollmentService.WithRawResponse = enrollments

        private val listHandler:
            Handler<CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging> =
            jsonHandler<CollectionResponseWithTotalPublicSequenceLiteResponseForwardPaging>(
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
                    .addPathSegments("automation", "v4", "sequences", "")
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
                    .addPathSegments("automation", "v4", "sequences", params._pathParam(0))
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
