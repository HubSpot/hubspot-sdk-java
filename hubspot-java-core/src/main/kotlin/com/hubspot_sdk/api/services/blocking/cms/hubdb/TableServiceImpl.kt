// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.hubdb

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
import com.hubspot_sdk.api.core.http.multipartFormData
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.cms.hubdb.CollectionResponseWithTotalHubDbTableV3
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableV3
import com.hubspot_sdk.api.models.cms.hubdb.ImportResult
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableCloneDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableCreateParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableDeleteParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableDeleteVersionParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableExportDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableExportParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableGetDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableGetParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableImportDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableListDraftPage
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableListDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableListPage
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableListParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TablePublishDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableResetDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableUnpublishParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableUpdateDraftParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TableServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TableService {

    private val withRawResponse: TableService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TableService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TableService =
        TableServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: TableCreateParams, requestOptions: RequestOptions): HubDbTableV3 =
        // post /cms/hubdb/2026-03/tables
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: TableListParams, requestOptions: RequestOptions): TableListPage =
        // get /cms/hubdb/2026-03/tables
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: TableDeleteParams, requestOptions: RequestOptions) {
        // delete /cms/hubdb/2026-03/tables/{tableIdOrName}
        withRawResponse().delete(params, requestOptions)
    }

    override fun cloneDraft(
        params: TableCloneDraftParams,
        requestOptions: RequestOptions,
    ): HubDbTableV3 =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/draft/clone
        withRawResponse().cloneDraft(params, requestOptions).parse()

    override fun deleteVersion(params: TableDeleteVersionParams, requestOptions: RequestOptions) {
        // delete /cms/hubdb/2026-03/tables/{tableIdOrName}/versions/{versionId}
        withRawResponse().deleteVersion(params, requestOptions)
    }

    override fun export(params: TableExportParams, requestOptions: RequestOptions): HttpResponse =
        // get /cms/hubdb/2026-03/tables/{tableIdOrName}/export
        withRawResponse().export(params, requestOptions)

    override fun exportDraft(
        params: TableExportDraftParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/hubdb/2026-03/tables/{tableIdOrName}/draft/export
        withRawResponse().exportDraft(params, requestOptions)

    override fun get(params: TableGetParams, requestOptions: RequestOptions): HubDbTableV3 =
        // get /cms/hubdb/2026-03/tables/{tableIdOrName}
        withRawResponse().get(params, requestOptions).parse()

    override fun getDraft(
        params: TableGetDraftParams,
        requestOptions: RequestOptions,
    ): HubDbTableV3 =
        // get /cms/hubdb/2026-03/tables/{tableIdOrName}/draft
        withRawResponse().getDraft(params, requestOptions).parse()

    override fun importDraft(
        params: TableImportDraftParams,
        requestOptions: RequestOptions,
    ): ImportResult =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/draft/import
        withRawResponse().importDraft(params, requestOptions).parse()

    override fun listDraft(
        params: TableListDraftParams,
        requestOptions: RequestOptions,
    ): TableListDraftPage =
        // get /cms/hubdb/2026-03/tables/draft
        withRawResponse().listDraft(params, requestOptions).parse()

    override fun publishDraft(
        params: TablePublishDraftParams,
        requestOptions: RequestOptions,
    ): HubDbTableV3 =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/draft/publish
        withRawResponse().publishDraft(params, requestOptions).parse()

    override fun resetDraft(
        params: TableResetDraftParams,
        requestOptions: RequestOptions,
    ): HubDbTableV3 =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/draft/reset
        withRawResponse().resetDraft(params, requestOptions).parse()

    override fun unpublish(
        params: TableUnpublishParams,
        requestOptions: RequestOptions,
    ): HubDbTableV3 =
        // post /cms/hubdb/2026-03/tables/{tableIdOrName}/unpublish
        withRawResponse().unpublish(params, requestOptions).parse()

    override fun updateDraft(
        params: TableUpdateDraftParams,
        requestOptions: RequestOptions,
    ): HubDbTableV3 =
        // patch /cms/hubdb/2026-03/tables/{tableIdOrName}/draft
        withRawResponse().updateDraft(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TableService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TableService.WithRawResponse =
            TableServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<HubDbTableV3> =
            jsonHandler<HubDbTableV3>(clientOptions.jsonMapper)

        override fun create(
            params: TableCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HubDbTableV3> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "hubdb", "2026-03", "tables")
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

        private val listHandler: Handler<CollectionResponseWithTotalHubDbTableV3> =
            jsonHandler<CollectionResponseWithTotalHubDbTableV3>(clientOptions.jsonMapper)

        override fun list(
            params: TableListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TableListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "hubdb", "2026-03", "tables")
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
                        TableListPage.builder()
                            .service(TableServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TableDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val cloneDraftHandler: Handler<HubDbTableV3> =
            jsonHandler<HubDbTableV3>(clientOptions.jsonMapper)

        override fun cloneDraft(
            params: TableCloneDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HubDbTableV3> {
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

        private val deleteVersionHandler: Handler<Void?> = emptyHandler()

        override fun deleteVersion(
            params: TableDeleteVersionParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteVersionHandler.handle(it) }
            }
        }

        override fun export(
            params: TableExportParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun exportDraft(
            params: TableExportDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val getHandler: Handler<HubDbTableV3> =
            jsonHandler<HubDbTableV3>(clientOptions.jsonMapper)

        override fun get(
            params: TableGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HubDbTableV3> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tableIdOrName", params.tableIdOrName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "hubdb", "2026-03", "tables", params._pathParam(0))
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

        private val getDraftHandler: Handler<HubDbTableV3> =
            jsonHandler<HubDbTableV3>(clientOptions.jsonMapper)

        override fun getDraft(
            params: TableGetDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HubDbTableV3> {
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

        private val importDraftHandler: Handler<ImportResult> =
            jsonHandler<ImportResult>(clientOptions.jsonMapper)

        override fun importDraft(
            params: TableImportDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ImportResult> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { importDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listDraftHandler: Handler<CollectionResponseWithTotalHubDbTableV3> =
            jsonHandler<CollectionResponseWithTotalHubDbTableV3>(clientOptions.jsonMapper)

        override fun listDraft(
            params: TableListDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TableListDraftPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "hubdb", "2026-03", "tables", "draft")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        TableListDraftPage.builder()
                            .service(TableServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val publishDraftHandler: Handler<HubDbTableV3> =
            jsonHandler<HubDbTableV3>(clientOptions.jsonMapper)

        override fun publishDraft(
            params: TablePublishDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HubDbTableV3> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { publishDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val resetDraftHandler: Handler<HubDbTableV3> =
            jsonHandler<HubDbTableV3>(clientOptions.jsonMapper)

        override fun resetDraft(
            params: TableResetDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HubDbTableV3> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { resetDraftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unpublishHandler: Handler<HubDbTableV3> =
            jsonHandler<HubDbTableV3>(clientOptions.jsonMapper)

        override fun unpublish(
            params: TableUnpublishParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HubDbTableV3> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { unpublishHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateDraftHandler: Handler<HubDbTableV3> =
            jsonHandler<HubDbTableV3>(clientOptions.jsonMapper)

        override fun updateDraft(
            params: TableUpdateDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HubDbTableV3> {
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
