// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associationsschema

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
import com.hubspot_sdk.api.models.crm.associationsschema.BatchResponsePublicAssociationDefinitionUserConfiguration
import com.hubspot_sdk.api.models.crm.associationsschema.CollectionResponseAssociationSpecWithLabelNoPaging
import com.hubspot_sdk.api.models.crm.associationsschema.labels.LabelBatchCreateParams
import com.hubspot_sdk.api.models.crm.associationsschema.labels.LabelCreateLabelParams
import com.hubspot_sdk.api.models.crm.associationsschema.labels.LabelDeleteLabelParams
import com.hubspot_sdk.api.models.crm.associationsschema.labels.LabelListLabelsParams
import com.hubspot_sdk.api.models.crm.associationsschema.labels.LabelUpdateLabelParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LabelServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LabelServiceAsync {

    private val withRawResponse: LabelServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LabelServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LabelServiceAsync =
        LabelServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batchCreate(
        params: LabelBatchCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponsePublicAssociationDefinitionUserConfiguration> =
        // post
        // /crm/associations/2026-03/definitions/configurations/{fromObjectType}/{toObjectType}/batch/create
        withRawResponse().batchCreate(params, requestOptions).thenApply { it.parse() }

    override fun createLabel(
        params: LabelCreateLabelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabelNoPaging> =
        // post /crm/associations/2026-03/{fromObjectType}/{toObjectType}/labels
        withRawResponse().createLabel(params, requestOptions).thenApply { it.parse() }

    override fun deleteLabel(
        params: LabelDeleteLabelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete
        // /crm/associations/2026-03/{fromObjectType}/{toObjectType}/labels/{associationTypeId}
        withRawResponse().deleteLabel(params, requestOptions).thenAccept {}

    override fun listLabels(
        params: LabelListLabelsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseAssociationSpecWithLabelNoPaging> =
        // get /crm/associations/2026-03/{fromObjectType}/{toObjectType}/labels
        withRawResponse().listLabels(params, requestOptions).thenApply { it.parse() }

    override fun updateLabel(
        params: LabelUpdateLabelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /crm/associations/2026-03/{fromObjectType}/{toObjectType}/labels
        withRawResponse().updateLabel(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LabelServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LabelServiceAsync.WithRawResponse =
            LabelServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val batchCreateHandler:
            Handler<BatchResponsePublicAssociationDefinitionUserConfiguration> =
            jsonHandler<BatchResponsePublicAssociationDefinitionUserConfiguration>(
                clientOptions.jsonMapper
            )

        override fun batchCreate(
            params: LabelBatchCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<BatchResponsePublicAssociationDefinitionUserConfiguration>
        > {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "associations",
                        "2026-03",
                        "definitions",
                        "configurations",
                        params._pathParam(0),
                        params._pathParam(1),
                        "batch",
                        "create",
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
                            .use { batchCreateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createLabelHandler:
            Handler<CollectionResponseAssociationSpecWithLabelNoPaging> =
            jsonHandler<CollectionResponseAssociationSpecWithLabelNoPaging>(
                clientOptions.jsonMapper
            )

        override fun createLabel(
            params: LabelCreateLabelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "associations",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "labels",
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
                            .use { createLabelHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteLabelHandler: Handler<Void?> = emptyHandler()

        override fun deleteLabel(
            params: LabelDeleteLabelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("associationTypeId", params.associationTypeId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "associations",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "labels",
                        params._pathParam(2),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteLabelHandler.handle(it) }
                    }
                }
        }

        private val listLabelsHandler: Handler<CollectionResponseAssociationSpecWithLabelNoPaging> =
            jsonHandler<CollectionResponseAssociationSpecWithLabelNoPaging>(
                clientOptions.jsonMapper
            )

        override fun listLabels(
            params: LabelListLabelsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseAssociationSpecWithLabelNoPaging>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "associations",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "labels",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listLabelsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateLabelHandler: Handler<Void?> = emptyHandler()

        override fun updateLabel(
            params: LabelUpdateLabelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("toObjectType", params.toObjectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "associations",
                        "2026-03",
                        params._pathParam(0),
                        params._pathParam(1),
                        "labels",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { updateLabelHandler.handle(it) }
                    }
                }
        }
    }
}
