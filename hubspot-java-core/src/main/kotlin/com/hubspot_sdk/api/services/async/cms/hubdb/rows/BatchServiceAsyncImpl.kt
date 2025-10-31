// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.hubdb.rows

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
import com.hubspot_sdk.api.models.cms.hubdb.BatchResponseHubDbTableRowV3
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchCloneBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchCreateBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchGetBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchGetDraftBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchPurgeBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchReplaceBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchUpdateBatchParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BatchServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BatchServiceAsync {

    private val withRawResponse: BatchServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchServiceAsync =
        BatchServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun cloneBatch(
        params: BatchCloneBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        // post /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft/batch/clone
        withRawResponse().cloneBatch(params, requestOptions).thenApply { it.parse() }

    override fun createBatch(
        params: BatchCreateBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        // post /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft/batch/create
        withRawResponse().createBatch(params, requestOptions).thenApply { it.parse() }

    override fun getBatch(
        params: BatchGetBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        // post /cms/v3/hubdb/tables/{tableIdOrName}/rows/batch/read
        withRawResponse().getBatch(params, requestOptions).thenApply { it.parse() }

    override fun getDraftBatch(
        params: BatchGetDraftBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        // post /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft/batch/read
        withRawResponse().getDraftBatch(params, requestOptions).thenApply { it.parse() }

    override fun purgeBatch(
        params: BatchPurgeBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft/batch/purge
        withRawResponse().purgeBatch(params, requestOptions).thenAccept {}

    override fun replaceBatch(
        params: BatchReplaceBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        // post /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft/batch/replace
        withRawResponse().replaceBatch(params, requestOptions).thenApply { it.parse() }

    override fun updateBatch(
        params: BatchUpdateBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        // post /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft/batch/update
        withRawResponse().updateBatch(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchServiceAsync.WithRawResponse =
            BatchServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val cloneBatchHandler: Handler<BatchResponseHubDbTableRowV3> =
            jsonHandler<BatchResponseHubDbTableRowV3>(clientOptions.jsonMapper)

        override fun cloneBatch(
            params: BatchCloneBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tableIdOrName", params.tableIdOrName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "hubdb",
                        "tables",
                        params._pathParam(0),
                        "rows",
                        "draft",
                        "batch",
                        "clone",
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
                            .use { cloneBatchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createBatchHandler: Handler<BatchResponseHubDbTableRowV3> =
            jsonHandler<BatchResponseHubDbTableRowV3>(clientOptions.jsonMapper)

        override fun createBatch(
            params: BatchCreateBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tableIdOrName", params.tableIdOrName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "hubdb",
                        "tables",
                        params._pathParam(0),
                        "rows",
                        "draft",
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
                            .use { createBatchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getBatchHandler: Handler<BatchResponseHubDbTableRowV3> =
            jsonHandler<BatchResponseHubDbTableRowV3>(clientOptions.jsonMapper)

        override fun getBatch(
            params: BatchGetBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tableIdOrName", params.tableIdOrName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "hubdb",
                        "tables",
                        params._pathParam(0),
                        "rows",
                        "batch",
                        "read",
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
                            .use { getBatchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getDraftBatchHandler: Handler<BatchResponseHubDbTableRowV3> =
            jsonHandler<BatchResponseHubDbTableRowV3>(clientOptions.jsonMapper)

        override fun getDraftBatch(
            params: BatchGetDraftBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tableIdOrName", params.tableIdOrName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "hubdb",
                        "tables",
                        params._pathParam(0),
                        "rows",
                        "draft",
                        "batch",
                        "read",
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
                            .use { getDraftBatchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val purgeBatchHandler: Handler<Void?> = emptyHandler()

        override fun purgeBatch(
            params: BatchPurgeBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tableIdOrName", params.tableIdOrName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "hubdb",
                        "tables",
                        params._pathParam(0),
                        "rows",
                        "draft",
                        "batch",
                        "purge",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { purgeBatchHandler.handle(it) }
                    }
                }
        }

        private val replaceBatchHandler: Handler<BatchResponseHubDbTableRowV3> =
            jsonHandler<BatchResponseHubDbTableRowV3>(clientOptions.jsonMapper)

        override fun replaceBatch(
            params: BatchReplaceBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tableIdOrName", params.tableIdOrName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "hubdb",
                        "tables",
                        params._pathParam(0),
                        "rows",
                        "draft",
                        "batch",
                        "replace",
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
                            .use { replaceBatchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateBatchHandler: Handler<BatchResponseHubDbTableRowV3> =
            jsonHandler<BatchResponseHubDbTableRowV3>(clientOptions.jsonMapper)

        override fun updateBatch(
            params: BatchUpdateBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseHubDbTableRowV3>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tableIdOrName", params.tableIdOrName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "hubdb",
                        "tables",
                        params._pathParam(0),
                        "rows",
                        "draft",
                        "batch",
                        "update",
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
                            .use { updateBatchHandler.handle(it) }
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
