// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.hubdb

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
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.cms.hubdb.BatchResponseHubDbTableRowV3
import com.hubspot.sdk.models.cms.hubdb.HubDbTableRowV3
import com.hubspot.sdk.models.cms.hubdb.UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3
import com.hubspot.sdk.models.cms.hubdb.rows.RowCloneBatchParams
import com.hubspot.sdk.models.cms.hubdb.rows.RowCloneDraftParams
import com.hubspot.sdk.models.cms.hubdb.rows.RowCreateBatchParams
import com.hubspot.sdk.models.cms.hubdb.rows.RowCreateParams
import com.hubspot.sdk.models.cms.hubdb.rows.RowDeleteDraftParams
import com.hubspot.sdk.models.cms.hubdb.rows.RowGetBatchParams
import com.hubspot.sdk.models.cms.hubdb.rows.RowGetDraftBatchParams
import com.hubspot.sdk.models.cms.hubdb.rows.RowGetDraftParams
import com.hubspot.sdk.models.cms.hubdb.rows.RowGetParams
import com.hubspot.sdk.models.cms.hubdb.rows.RowListParams
import com.hubspot.sdk.models.cms.hubdb.rows.RowPurgeBatchParams
import com.hubspot.sdk.models.cms.hubdb.rows.RowReplaceBatchParams
import com.hubspot.sdk.models.cms.hubdb.rows.RowReplaceDraftParams
import com.hubspot.sdk.models.cms.hubdb.rows.RowUpdateBatchParams
import com.hubspot.sdk.models.cms.hubdb.rows.RowUpdateDraftParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RowServiceImpl internal constructor(private val clientOptions: ClientOptions) : RowService {

    private val withRawResponse: RowService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RowService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RowService =
        RowServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: RowCreateParams, requestOptions: RequestOptions): HubDbTableRowV3 =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/rows
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: RowListParams,
        requestOptions: RequestOptions,
    ): UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
        // get /cms/hubdb/2026-03/tables/{tableIdOrName}/rows
        withRawResponse().list(params, requestOptions).parse()

    override fun cloneBatch(
        params: RowCloneBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseHubDbTableRowV3 =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/draft/batch/clone
        withRawResponse().cloneBatch(params, requestOptions).parse()

    override fun cloneDraft(
        params: RowCloneDraftParams,
        requestOptions: RequestOptions,
    ): HubDbTableRowV3 =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/{rowId}/draft/clone
        withRawResponse().cloneDraft(params, requestOptions).parse()

    override fun createBatch(
        params: RowCreateBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseHubDbTableRowV3 =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/draft/batch/create
        withRawResponse().createBatch(params, requestOptions).parse()

    override fun deleteDraft(params: RowDeleteDraftParams, requestOptions: RequestOptions) {
        // delete /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/{rowId}/draft
        withRawResponse().deleteDraft(params, requestOptions)
    }

    override fun get(params: RowGetParams, requestOptions: RequestOptions): HubDbTableRowV3 =
        // get /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/{rowId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getBatch(
        params: RowGetBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseHubDbTableRowV3 =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/batch/read
        withRawResponse().getBatch(params, requestOptions).parse()

    override fun getDraft(
        params: RowGetDraftParams,
        requestOptions: RequestOptions,
    ): HubDbTableRowV3 =
        // get /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/{rowId}/draft
        withRawResponse().getDraft(params, requestOptions).parse()

    override fun getDraftBatch(
        params: RowGetDraftBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseHubDbTableRowV3 =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/draft/batch/read
        withRawResponse().getDraftBatch(params, requestOptions).parse()

    override fun purgeBatch(params: RowPurgeBatchParams, requestOptions: RequestOptions) {
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/draft/batch/purge
        withRawResponse().purgeBatch(params, requestOptions)
    }

    override fun replaceBatch(
        params: RowReplaceBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseHubDbTableRowV3 =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/draft/batch/replace
        withRawResponse().replaceBatch(params, requestOptions).parse()

    override fun replaceDraft(
        params: RowReplaceDraftParams,
        requestOptions: RequestOptions,
    ): HubDbTableRowV3 =
        // put /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/{rowId}/draft
        withRawResponse().replaceDraft(params, requestOptions).parse()

    override fun updateBatch(
        params: RowUpdateBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseHubDbTableRowV3 =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/draft/batch/update
        withRawResponse().updateBatch(params, requestOptions).parse()

    override fun updateDraft(
        params: RowUpdateDraftParams,
        requestOptions: RequestOptions,
    ): HubDbTableRowV3 =
        // patch /cms/hubdb/2026-03/tables/{tableIdOrName}/rows/{rowId}/draft
        withRawResponse().updateDraft(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RowService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RowService.WithRawResponse =
            RowServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<HubDbTableRowV3> =
            jsonHandler<HubDbTableRowV3>(clientOptions.jsonMapper)

        override fun create(
            params: RowCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HubDbTableRowV3> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3> {
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
            }
        }

        private val cloneBatchHandler: Handler<BatchResponseHubDbTableRowV3> =
            jsonHandler<BatchResponseHubDbTableRowV3>(clientOptions.jsonMapper)

        override fun cloneBatch(
            params: RowCloneBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cloneBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val cloneDraftHandler: Handler<HubDbTableRowV3> =
            jsonHandler<HubDbTableRowV3>(clientOptions.jsonMapper)

        override fun cloneDraft(
            params: RowCloneDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HubDbTableRowV3> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cloneDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createBatchHandler: Handler<BatchResponseHubDbTableRowV3> =
            jsonHandler<BatchResponseHubDbTableRowV3>(clientOptions.jsonMapper)

        override fun createBatch(
            params: RowCreateBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteDraftHandler: Handler<Void?> = emptyHandler()

        override fun deleteDraft(
            params: RowDeleteDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteDraftHandler.handle(it) }
            }
        }

        private val getHandler: Handler<HubDbTableRowV3> =
            jsonHandler<HubDbTableRowV3>(clientOptions.jsonMapper)

        override fun get(
            params: RowGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HubDbTableRowV3> {
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

        private val getBatchHandler: Handler<BatchResponseHubDbTableRowV3> =
            jsonHandler<BatchResponseHubDbTableRowV3>(clientOptions.jsonMapper)

        override fun getBatch(
            params: RowGetBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getDraftHandler: Handler<HubDbTableRowV3> =
            jsonHandler<HubDbTableRowV3>(clientOptions.jsonMapper)

        override fun getDraft(
            params: RowGetDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HubDbTableRowV3> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getDraftBatchHandler: Handler<BatchResponseHubDbTableRowV3> =
            jsonHandler<BatchResponseHubDbTableRowV3>(clientOptions.jsonMapper)

        override fun getDraftBatch(
            params: RowGetDraftBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getDraftBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val purgeBatchHandler: Handler<Void?> = emptyHandler()

        override fun purgeBatch(
            params: RowPurgeBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { purgeBatchHandler.handle(it) }
            }
        }

        private val replaceBatchHandler: Handler<BatchResponseHubDbTableRowV3> =
            jsonHandler<BatchResponseHubDbTableRowV3>(clientOptions.jsonMapper)

        override fun replaceBatch(
            params: RowReplaceBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { replaceBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val replaceDraftHandler: Handler<HubDbTableRowV3> =
            jsonHandler<HubDbTableRowV3>(clientOptions.jsonMapper)

        override fun replaceDraft(
            params: RowReplaceDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HubDbTableRowV3> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { replaceDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateBatchHandler: Handler<BatchResponseHubDbTableRowV3> =
            jsonHandler<BatchResponseHubDbTableRowV3>(clientOptions.jsonMapper)

        override fun updateBatch(
            params: RowUpdateBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseHubDbTableRowV3> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateDraftHandler: Handler<HubDbTableRowV3> =
            jsonHandler<HubDbTableRowV3>(clientOptions.jsonMapper)

        override fun updateDraft(
            params: RowUpdateDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HubDbTableRowV3> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
