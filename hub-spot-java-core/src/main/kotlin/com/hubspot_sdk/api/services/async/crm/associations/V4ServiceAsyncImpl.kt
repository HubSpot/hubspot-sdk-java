// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.emptyHandler
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
import com.hubspot_sdk.api.models.crm.BatchResponsePublicDefaultAssociation
import com.hubspot_sdk.api.models.crm.CollectionResponseMultiAssociatedObjectWithLabel
import com.hubspot_sdk.api.models.crm.CreatedResponseLabelsBetweenObjectPair
import com.hubspot_sdk.api.models.crm.associations.v4.V4CreateDefaultAssociationParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4DeleteAssociationParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4ListAssociationsByTypeParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4UpdateAssociationLabelsParams
import com.hubspot_sdk.api.services.async.crm.associations.v4.BatchServiceAsync
import com.hubspot_sdk.api.services.async.crm.associations.v4.BatchServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.associations.v4.ReportServiceAsync
import com.hubspot_sdk.api.services.async.crm.associations.v4.ReportServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class V4ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V4ServiceAsync {

    private val withRawResponse: V4ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    private val report: ReportServiceAsync by lazy { ReportServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V4ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4ServiceAsync =
        V4ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchServiceAsync = batch

    override fun report(): ReportServiceAsync = report

    override fun createDefaultAssociation(
        params: V4CreateDefaultAssociationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        // put
        // /crm/v4/objects/{fromObjectType}/{fromObjectId}/associations/default/{toObjectType}/{toObjectId}
        withRawResponse().createDefaultAssociation(params, requestOptions).thenApply { it.parse() }

    override fun deleteAssociation(
        params: V4DeleteAssociationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}
        withRawResponse().deleteAssociation(params, requestOptions).thenAccept {}

    override fun listAssociationsByType(
        params: V4ListAssociationsByTypeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseMultiAssociatedObjectWithLabel> =
        // get /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}
        withRawResponse().listAssociationsByType(params, requestOptions).thenApply { it.parse() }

    override fun updateAssociationLabels(
        params: V4UpdateAssociationLabelsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreatedResponseLabelsBetweenObjectPair> =
        // put /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}
        withRawResponse().updateAssociationLabels(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V4ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val report: ReportServiceAsync.WithRawResponse by lazy {
            ReportServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V4ServiceAsync.WithRawResponse =
            V4ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        override fun report(): ReportServiceAsync.WithRawResponse = report

        private val createDefaultAssociationHandler:
            Handler<BatchResponsePublicDefaultAssociation> =
            jsonHandler<BatchResponsePublicDefaultAssociation>(clientOptions.jsonMapper)

        override fun createDefaultAssociation(
            params: V4CreateDefaultAssociationParams,
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
                        "v4",
                        "objects",
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
                            .use { createDefaultAssociationHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteAssociationHandler: Handler<Void?> = emptyHandler()

        override fun deleteAssociation(
            params: V4DeleteAssociationParams,
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
                        "v4",
                        "objects",
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
                        response.use { deleteAssociationHandler.handle(it) }
                    }
                }
        }

        private val listAssociationsByTypeHandler:
            Handler<CollectionResponseMultiAssociatedObjectWithLabel> =
            jsonHandler<CollectionResponseMultiAssociatedObjectWithLabel>(clientOptions.jsonMapper)

        override fun listAssociationsByType(
            params: V4ListAssociationsByTypeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseMultiAssociatedObjectWithLabel>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v4",
                        "objects",
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
                            .use { listAssociationsByTypeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateAssociationLabelsHandler:
            Handler<CreatedResponseLabelsBetweenObjectPair> =
            jsonHandler<CreatedResponseLabelsBetweenObjectPair>(clientOptions.jsonMapper)

        override fun updateAssociationLabels(
            params: V4UpdateAssociationLabelsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreatedResponseLabelsBetweenObjectPair>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectId", params.toObjectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "v4",
                        "objects",
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
                            .use { updateAssociationLabelsHandler.handle(it) }
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
