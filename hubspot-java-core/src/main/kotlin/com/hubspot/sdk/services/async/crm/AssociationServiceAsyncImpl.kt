// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.handlers.emptyHandler
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
import com.hubspot.sdk.models.crm.BatchResponsePublicDefaultAssociation
import com.hubspot.sdk.models.crm.CollectionResponseMultiAssociatedObjectWithLabelForwardPaging
import com.hubspot.sdk.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.sdk.models.crm.LabelsBetweenObjectPair
import com.hubspot.sdk.models.crm.ReportCreationResponse
import com.hubspot.sdk.models.crm.associations.AssociationCreateParams
import com.hubspot.sdk.models.crm.associations.AssociationDeleteParams
import com.hubspot.sdk.models.crm.associations.AssociationListPageAsync
import com.hubspot.sdk.models.crm.associations.AssociationListParams
import com.hubspot.sdk.models.crm.associations.AssociationRequestHighUsageReportParams
import com.hubspot.sdk.models.crm.associations.AssociationSearchParams
import com.hubspot.sdk.models.crm.associations.AssociationUpdateLabelsParams
import com.hubspot.sdk.services.async.crm.associations.BatchServiceAsync
import com.hubspot.sdk.services.async.crm.associations.BatchServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AssociationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AssociationServiceAsync {

    private val withRawResponse: AssociationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AssociationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationServiceAsync =
        AssociationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchServiceAsync = batch

    override fun create(
        params: AssociationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        // put
        // /crm/objects/2026-03/{fromObjectType}/{fromObjectId}/associations/default/{toObjectType}/{toObjectId}
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AssociationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssociationListPageAsync> =
        // get /crm/objects/2026-03/{objectType}/{objectId}/associations/{toObjectType}
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AssociationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete
        // /crm/objects/2026-03/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun requestHighUsageReport(
        params: AssociationRequestHighUsageReportParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReportCreationResponse> =
        // post /crm/associations/2026-03/usage/high-usage-report/{userId}
        withRawResponse().requestHighUsageReport(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: AssociationSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        // post /crm/objects/2026-03/{objectType}/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    override fun updateLabels(
        params: AssociationUpdateLabelsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LabelsBetweenObjectPair> =
        // put /crm/objects/2026-03/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}
        withRawResponse().updateLabels(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AssociationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssociationServiceAsync.WithRawResponse =
            AssociationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        private val createHandler: Handler<BatchResponsePublicDefaultAssociation> =
            jsonHandler<BatchResponsePublicDefaultAssociation>(clientOptions.jsonMapper)

        override fun create(
            params: AssociationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectId", params.toObjectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "objects",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "associations",
                        "default",
                        params._pathParam(2),
                        params._pathParam(3),
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
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler:
            Handler<CollectionResponseMultiAssociatedObjectWithLabelForwardPaging> =
            jsonHandler<CollectionResponseMultiAssociatedObjectWithLabelForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: AssociationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssociationListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "objects",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "associations",
                        params._pathParam(2),
                    )
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
                                AssociationListPageAsync.builder()
                                    .service(AssociationServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: AssociationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectId", params.toObjectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "objects",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "associations",
                        params._pathParam(2),
                        params._pathParam(3),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val requestHighUsageReportHandler: Handler<ReportCreationResponse> =
            jsonHandler<ReportCreationResponse>(clientOptions.jsonMapper)

        override fun requestHighUsageReport(
            params: AssociationRequestHighUsageReportParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReportCreationResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "associations",
                        "2026-03",
                        "usage",
                        "high-usage-report",
                        params._pathParam(0),
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
                            .use { requestHighUsageReportHandler.handle(it) }
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
            params: AssociationSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "objects", "2026-03", params._pathParam(0), "search")
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

        private val updateLabelsHandler: Handler<LabelsBetweenObjectPair> =
            jsonHandler<LabelsBetweenObjectPair>(clientOptions.jsonMapper)

        override fun updateLabels(
            params: AssociationUpdateLabelsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LabelsBetweenObjectPair>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectId", params.toObjectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "objects",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "associations",
                        params._pathParam(2),
                        params._pathParam(3),
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
                            .use { updateLabelsHandler.handle(it) }
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
