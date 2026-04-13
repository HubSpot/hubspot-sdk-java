// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm.objects

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
import com.hubspot.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.models.crm.objects.CollectionResponseSimplePublicObjectWithAssociationsForwardPaging
import com.hubspot.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.models.crm.objects.feedbacksubmissions.FeedbackSubmissionGetParams
import com.hubspot.models.crm.objects.feedbacksubmissions.FeedbackSubmissionListPage
import com.hubspot.models.crm.objects.feedbacksubmissions.FeedbackSubmissionListParams
import com.hubspot.models.crm.objects.feedbacksubmissions.FeedbackSubmissionSearchParams
import com.hubspot.services.blocking.crm.objects.feedbacksubmissions.BatchService
import com.hubspot.services.blocking.crm.objects.feedbacksubmissions.BatchServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FeedbackSubmissionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FeedbackSubmissionService {

    private val withRawResponse: FeedbackSubmissionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): FeedbackSubmissionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeedbackSubmissionService =
        FeedbackSubmissionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun list(
        params: FeedbackSubmissionListParams,
        requestOptions: RequestOptions,
    ): FeedbackSubmissionListPage =
        // get /crm/objects/2026-03/feedback_submissions
        withRawResponse().list(params, requestOptions).parse()

    override fun get(
        params: FeedbackSubmissionGetParams,
        requestOptions: RequestOptions,
    ): SimplePublicObjectWithAssociations =
        // get /crm/objects/2026-03/feedback_submissions/{feedbackSubmissionId}
        withRawResponse().get(params, requestOptions).parse()

    override fun search(
        params: FeedbackSubmissionSearchParams,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalSimplePublicObject =
        // post /crm/objects/2026-03/feedback_submissions/search
        withRawResponse().search(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FeedbackSubmissionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeedbackSubmissionService.WithRawResponse =
            FeedbackSubmissionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        private val listHandler:
            Handler<CollectionResponseSimplePublicObjectWithAssociationsForwardPaging> =
            jsonHandler<CollectionResponseSimplePublicObjectWithAssociationsForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: FeedbackSubmissionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FeedbackSubmissionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "feedback_submissions")
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
                        FeedbackSubmissionListPage.builder()
                            .service(FeedbackSubmissionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getHandler: Handler<SimplePublicObjectWithAssociations> =
            jsonHandler<SimplePublicObjectWithAssociations>(clientOptions.jsonMapper)

        override fun get(
            params: FeedbackSubmissionGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("feedbackSubmissionId", params.feedbackSubmissionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "objects",
                        "2026-03",
                        "feedback_submissions",
                        params._pathParam(0),
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

        private val searchHandler: Handler<CollectionResponseWithTotalSimplePublicObject> =
            jsonHandler<CollectionResponseWithTotalSimplePublicObject>(clientOptions.jsonMapper)

        override fun search(
            params: FeedbackSubmissionSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "feedback_submissions", "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { searchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
