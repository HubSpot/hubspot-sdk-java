// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm.objects

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
import com.hubspot.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.models.crm.objects.CollectionResponseSimplePublicObjectWithAssociationsForwardPaging
import com.hubspot.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot.models.crm.objects.feedbacksubmissions.FeedbackSubmissionGetParams
import com.hubspot.models.crm.objects.feedbacksubmissions.FeedbackSubmissionListPageAsync
import com.hubspot.models.crm.objects.feedbacksubmissions.FeedbackSubmissionListParams
import com.hubspot.models.crm.objects.feedbacksubmissions.FeedbackSubmissionSearchParams
import com.hubspot.services.async.crm.objects.feedbacksubmissions.BatchServiceAsync
import com.hubspot.services.async.crm.objects.feedbacksubmissions.BatchServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FeedbackSubmissionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : FeedbackSubmissionServiceAsync {

    private val withRawResponse: FeedbackSubmissionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): FeedbackSubmissionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): FeedbackSubmissionServiceAsync =
        FeedbackSubmissionServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun batch(): BatchServiceAsync = batch

    override fun list(
        params: FeedbackSubmissionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FeedbackSubmissionListPageAsync> =
        // get /crm/objects/2026-03/feedback_submissions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: FeedbackSubmissionGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimplePublicObjectWithAssociations> =
        // get /crm/objects/2026-03/feedback_submissions/{feedbackSubmissionId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: FeedbackSubmissionSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        // post /crm/objects/2026-03/feedback_submissions/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FeedbackSubmissionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeedbackSubmissionServiceAsync.WithRawResponse =
            FeedbackSubmissionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        private val listHandler:
            Handler<CollectionResponseSimplePublicObjectWithAssociationsForwardPaging> =
            jsonHandler<CollectionResponseSimplePublicObjectWithAssociationsForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: FeedbackSubmissionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FeedbackSubmissionListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "feedback_submissions")
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
                                FeedbackSubmissionListPageAsync.builder()
                                    .service(FeedbackSubmissionServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val getHandler: Handler<SimplePublicObjectWithAssociations> =
            jsonHandler<SimplePublicObjectWithAssociations>(clientOptions.jsonMapper)

        override fun get(
            params: FeedbackSubmissionGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimplePublicObjectWithAssociations>> {
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

        private val searchHandler: Handler<CollectionResponseWithTotalSimplePublicObject> =
            jsonHandler<CollectionResponseWithTotalSimplePublicObject>(clientOptions.jsonMapper)

        override fun search(
            params: FeedbackSubmissionSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", "feedback_submissions", "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
