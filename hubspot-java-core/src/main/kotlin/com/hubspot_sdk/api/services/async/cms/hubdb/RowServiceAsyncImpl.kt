// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.hubdb

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
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableRowV3
import com.hubspot_sdk.api.models.cms.hubdb.UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCloneBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCloneDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCreateBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCreateParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowDeleteDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetDraftBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowListPageAsync
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowListParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowPurgeBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowReplaceBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowReplaceDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowUpdateBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowUpdateDraftParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RowServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RowServiceAsync {

    private val withRawResponse: RowServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RowServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RowServiceAsync =
        RowServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RowCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HubDbTableRowV3> =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/rows
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: RowListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RowListPageAsync> =
        // get /cms/hubdb/2026-03/tables/{tableIdOrName}/rows
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun cloneBatch(
        params: RowCloneBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/draft/batch/clone
        withRawResponse().cloneBatch(params, requestOptions).thenApply { it.parse() }

    override fun cloneDraft(
        params: RowCloneDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HubDbTableRowV3> =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/{rowId}/draft/clone
        withRawResponse().cloneDraft(params, requestOptions).thenApply { it.parse() }

    override fun createBatch(
        params: RowCreateBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/draft/batch/create
        withRawResponse().createBatch(params, requestOptions).thenApply { it.parse() }

    override fun deleteDraft(
        params: RowDeleteDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/{rowId}/draft
        withRawResponse().deleteDraft(params, requestOptions).thenAccept {}

    override fun get(
        params: RowGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HubDbTableRowV3> =
        // get /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/{rowId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getBatch(
        params: RowGetBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/batch/read
        withRawResponse().getBatch(params, requestOptions).thenApply { it.parse() }

    override fun getDraft(
        params: RowGetDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HubDbTableRowV3> =
        // get /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/{rowId}/draft
        withRawResponse().getDraft(params, requestOptions).thenApply { it.parse() }

    override fun getDraftBatch(
        params: RowGetDraftBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/draft/batch/read
        withRawResponse().getDraftBatch(params, requestOptions).thenApply { it.parse() }

    override fun purgeBatch(
        params: RowPurgeBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/draft/batch/purge
        withRawResponse().purgeBatch(params, requestOptions).thenAccept {}

    override fun replaceBatch(
        params: RowReplaceBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/draft/batch/replace
        withRawResponse().replaceBatch(params, requestOptions).thenApply { it.parse() }

    override fun replaceDraft(
        params: RowReplaceDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HubDbTableRowV3> =
        // put /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/{rowId}/draft
        withRawResponse().replaceDraft(params, requestOptions).thenApply { it.parse() }

    override fun updateBatch(
        params: RowUpdateBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseHubDbTableRowV3> =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/draft/batch/update
        withRawResponse().updateBatch(params, requestOptions).thenApply { it.parse() }

    override fun updateDraft(
        params: RowUpdateDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HubDbTableRowV3> =
        // patch /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/{rowId}/draft
        withRawResponse().updateDraft(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RowServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RowServiceAsync.WithRawResponse =
            RowServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<HubDbTableRowV3> =
            jsonHandler<HubDbTableRowV3>(clientOptions.jsonMapper)

        override fun create(
            params: RowCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tableIdOrName", params.tableIdOrName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "hubdb",
                        "2026-03",
                        "tables",
                        params._pathParam(0),
                        "rows",
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
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3> =
            jsonHandler<UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: RowListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RowListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tableIdOrName", params.tableIdOrName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "hubdb",
                        "2026-03",
                        "tables",
                        params._pathParam(0),
                        "rows",
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
                                RowListPageAsync.builder()
                                    .service(RowServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val cloneBatchHandler: Handler<BatchResponseHubDbTableRowV3> =
            jsonHandler<BatchResponseHubDbTableRowV3>(clientOptions.jsonMapper)

        override fun cloneBatch(
            params: RowCloneBatchParams,
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
                        "hubdb",
                        "2026-03",
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

        private val cloneDraftHandler: Handler<HubDbTableRowV3> =
            jsonHandler<HubDbTableRowV3>(clientOptions.jsonMapper)

        override fun cloneDraft(
            params: RowCloneDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("rowId", params.rowId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "hubdb",
                        "2026-03",
                        "tables",
                        params._pathParam(0),
                        "rows",
                        params._pathParam(1),
                        "draft",
                        "clone",
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
                            .use { cloneDraftHandler.handle(it) }
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
            params: RowCreateBatchParams,
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
                        "hubdb",
                        "2026-03",
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

        private val deleteDraftHandler: Handler<Void?> = emptyHandler()

        override fun deleteDraft(
            params: RowDeleteDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("rowId", params.rowId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "hubdb",
                        "2026-03",
                        "tables",
                        params._pathParam(0),
                        "rows",
                        params._pathParam(1),
                        "draft",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteDraftHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<HubDbTableRowV3> =
            jsonHandler<HubDbTableRowV3>(clientOptions.jsonMapper)

        override fun get(
            params: RowGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("rowId", params.rowId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "hubdb",
                        "2026-03",
                        "tables",
                        params._pathParam(0),
                        "rows",
                        params._pathParam(1),
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

        private val getBatchHandler: Handler<BatchResponseHubDbTableRowV3> =
            jsonHandler<BatchResponseHubDbTableRowV3>(clientOptions.jsonMapper)

        override fun getBatch(
            params: RowGetBatchParams,
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
                        "hubdb",
                        "2026-03",
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

        private val getDraftHandler: Handler<HubDbTableRowV3> =
            jsonHandler<HubDbTableRowV3>(clientOptions.jsonMapper)

        override fun getDraft(
            params: RowGetDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("rowId", params.rowId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "hubdb",
                        "2026-03",
                        "tables",
                        params._pathParam(0),
                        "rows",
                        params._pathParam(1),
                        "draft",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getDraftHandler.handle(it) }
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
            params: RowGetDraftBatchParams,
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
                        "hubdb",
                        "2026-03",
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
            params: RowPurgeBatchParams,
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
                        "hubdb",
                        "2026-03",
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
            params: RowReplaceBatchParams,
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
                        "hubdb",
                        "2026-03",
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

        private val replaceDraftHandler: Handler<HubDbTableRowV3> =
            jsonHandler<HubDbTableRowV3>(clientOptions.jsonMapper)

        override fun replaceDraft(
            params: RowReplaceDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("rowId", params.rowId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "hubdb",
                        "2026-03",
                        "tables",
                        params._pathParam(0),
                        "rows",
                        params._pathParam(1),
                        "draft",
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
                            .use { replaceDraftHandler.handle(it) }
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
            params: RowUpdateBatchParams,
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
                        "hubdb",
                        "2026-03",
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

        private val updateDraftHandler: Handler<HubDbTableRowV3> =
            jsonHandler<HubDbTableRowV3>(clientOptions.jsonMapper)

        override fun updateDraft(
            params: RowUpdateDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HubDbTableRowV3>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("rowId", params.rowId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "hubdb",
                        "2026-03",
                        "tables",
                        params._pathParam(0),
                        "rows",
                        params._pathParam(1),
                        "draft",
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
                            .use { updateDraftHandler.handle(it) }
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
