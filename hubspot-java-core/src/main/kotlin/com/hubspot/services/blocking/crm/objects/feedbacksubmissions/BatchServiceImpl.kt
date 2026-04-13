// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.objects.feedbacksubmissions

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
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
import com.hubspot.models.crm.objects.BatchResponseSimplePublicObject
import com.hubspot.models.crm.objects.feedbacksubmissions.batch.BatchGetParams
import java.util.function.Consumer

class BatchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BatchService {

    private val withRawResponse: BatchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService =
        BatchServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun get(
        params: BatchGetParams,
        requestOptions: RequestOptions,
    ): BatchResponseSimplePublicObject =
        // post /crm/objects/2026-03/feedback_submissions/batch/read
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchService.WithRawResponse =
            BatchServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getHandler: Handler<BatchResponseSimplePublicObject> =
            jsonHandler<BatchResponseSimplePublicObject>(clientOptions.jsonMapper)

        override fun get(
            params: BatchGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseSimplePublicObject> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "objects",
                        "2026-03",
                        "feedback_submissions",
                        "batch",
                        "read",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
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
