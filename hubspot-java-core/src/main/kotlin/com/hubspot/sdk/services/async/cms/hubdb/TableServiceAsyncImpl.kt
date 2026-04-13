// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.hubdb

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
import com.hubspot.sdk.core.http.multipartFormData
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepareAsync
import com.hubspot.sdk.models.cms.hubdb.CollectionResponseWithTotalHubDbTableV3
import com.hubspot.sdk.models.cms.hubdb.HubDbTableV3
import com.hubspot.sdk.models.cms.hubdb.ImportResult
import com.hubspot.sdk.models.cms.hubdb.tables.TableCloneDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableCreateParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableDeleteParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableDeleteVersionParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableExportDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableExportParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableGetDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableGetParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableImportDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableListDraftPageAsync
import com.hubspot.sdk.models.cms.hubdb.tables.TableListDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableListPageAsync
import com.hubspot.sdk.models.cms.hubdb.tables.TableListParams
import com.hubspot.sdk.models.cms.hubdb.tables.TablePublishDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableResetDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableUnpublishParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableUpdateDraftParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TableServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TableServiceAsync {

    private val withRawResponse: TableServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TableServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TableServiceAsync =
        TableServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TableCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HubDbTableV3> =
        // post /cms/hubdb/2026-03/tables
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TableListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TableListPageAsync> =
        // get /cms/hubdb/2026-03/tables
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TableDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /cms/hubdb/2026-03/tables/{tableIdOrName}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun cloneDraft(
        params: TableCloneDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HubDbTableV3> =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/draft/clone
        withRawResponse().cloneDraft(params, requestOptions).thenApply { it.parse() }

    override fun deleteVersion(
        params: TableDeleteVersionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /cms/hubdb/2026-03/tables/{tableIdOrName}/versions/{versionId}
        withRawResponse().deleteVersion(params, requestOptions).thenAccept {}

    override fun export(
        params: TableExportParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /cms/hubdb/2026-03/tables/{tableIdOrName}/export
        withRawResponse().export(params, requestOptions)

    override fun exportDraft(
        params: TableExportDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /cms/hubdb/2026-03/tables/{tableIdOrName}/draft/export
        withRawResponse().exportDraft(params, requestOptions)

    override fun get(
        params: TableGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HubDbTableV3> =
        // get /cms/hubdb/2026-03/tables/{tableIdOrName}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getDraft(
        params: TableGetDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HubDbTableV3> =
        // get /cms/hubdb/2026-03/tables/{tableIdOrName}/draft
        withRawResponse().getDraft(params, requestOptions).thenApply { it.parse() }

    override fun importDraft(
        params: TableImportDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ImportResult> =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/draft/import
        withRawResponse().importDraft(params, requestOptions).thenApply { it.parse() }

    override fun listDraft(
        params: TableListDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TableListDraftPageAsync> =
        // get /cms/hubdb/2026-03/tables/draft
        withRawResponse().listDraft(params, requestOptions).thenApply { it.parse() }

    override fun publishDraft(
        params: TablePublishDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HubDbTableV3> =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/draft/publish
        withRawResponse().publishDraft(params, requestOptions).thenApply { it.parse() }

    override fun resetDraft(
        params: TableResetDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HubDbTableV3> =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/draft/reset
        withRawResponse().resetDraft(params, requestOptions).thenApply { it.parse() }

    override fun unpublish(
        params: TableUnpublishParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HubDbTableV3> =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/unpublish
        withRawResponse().unpublish(params, requestOptions).thenApply { it.parse() }

    override fun updateDraft(
        params: TableUpdateDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HubDbTableV3> =
        // patch /cms/hubdb/2026-03/tables/{tableIdOrName}/draft
        withRawResponse().updateDraft(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TableServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TableServiceAsync.WithRawResponse =
            TableServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<HubDbTableV3> =
            jsonHandler<HubDbTableV3>(clientOptions.jsonMapper)

        override fun create(
            params: TableCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "hubdb", "2026-03", "tables")
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

        private val listHandler: Handler<CollectionResponseWithTotalHubDbTableV3> =
            jsonHandler<CollectionResponseWithTotalHubDbTableV3>(clientOptions.jsonMapper)

        override fun list(
            params: TableListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TableListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "hubdb", "2026-03", "tables")
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
                                TableListPageAsync.builder()
                                    .service(TableServiceAsyncImpl(clientOptions))
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
            params: TableDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tableIdOrName", params.tableIdOrName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "hubdb", "2026-03", "tables", params._pathParam(0))
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

        private val cloneDraftHandler: Handler<HubDbTableV3> =
            jsonHandler<HubDbTableV3>(clientOptions.jsonMapper)

        override fun cloneDraft(
            params: TableCloneDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> {
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
                        "draft",
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
                            .use { cloneDraftHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteVersionHandler: Handler<Void?> = emptyHandler()

        override fun deleteVersion(
            params: TableDeleteVersionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("versionId", params.versionId().getOrNull())
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
                        "versions",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteVersionHandler.handle(it) }
                    }
                }
        }

        override fun export(
            params: TableExportParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                        "export",
                    )
                    .putHeader("Accept", "application/vnd.ms-excel")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun exportDraft(
            params: TableExportDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                        "draft",
                        "export",
                    )
                    .putHeader("Accept", "application/vnd.ms-excel")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        private val getHandler: Handler<HubDbTableV3> =
            jsonHandler<HubDbTableV3>(clientOptions.jsonMapper)

        override fun get(
            params: TableGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tableIdOrName", params.tableIdOrName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "hubdb", "2026-03", "tables", params._pathParam(0))
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

        private val getDraftHandler: Handler<HubDbTableV3> =
            jsonHandler<HubDbTableV3>(clientOptions.jsonMapper)

        override fun getDraft(
            params: TableGetDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> {
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

        private val importDraftHandler: Handler<ImportResult> =
            jsonHandler<ImportResult>(clientOptions.jsonMapper)

        override fun importDraft(
            params: TableImportDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ImportResult>> {
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
                        "draft",
                        "import",
                    )
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { importDraftHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listDraftHandler: Handler<CollectionResponseWithTotalHubDbTableV3> =
            jsonHandler<CollectionResponseWithTotalHubDbTableV3>(clientOptions.jsonMapper)

        override fun listDraft(
            params: TableListDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TableListDraftPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "hubdb", "2026-03", "tables", "draft")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listDraftHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                TableListDraftPageAsync.builder()
                                    .service(TableServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val publishDraftHandler: Handler<HubDbTableV3> =
            jsonHandler<HubDbTableV3>(clientOptions.jsonMapper)

        override fun publishDraft(
            params: TablePublishDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> {
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
                        "draft",
                        "publish",
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
                            .use { publishDraftHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val resetDraftHandler: Handler<HubDbTableV3> =
            jsonHandler<HubDbTableV3>(clientOptions.jsonMapper)

        override fun resetDraft(
            params: TableResetDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> {
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
                        "draft",
                        "reset",
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
                            .use { resetDraftHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unpublishHandler: Handler<HubDbTableV3> =
            jsonHandler<HubDbTableV3>(clientOptions.jsonMapper)

        override fun unpublish(
            params: TableUnpublishParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> {
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
                        "unpublish",
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
                            .use { unpublishHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateDraftHandler: Handler<HubDbTableV3> =
            jsonHandler<HubDbTableV3>(clientOptions.jsonMapper)

        override fun updateDraft(
            params: TableUpdateDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tableIdOrName", params.tableIdOrName().getOrNull())
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
