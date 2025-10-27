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
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableRowV3
import com.hubspot_sdk.api.models.cms.hubdb.UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCloneDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCreateParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowDeleteDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowListDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowListPage
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowListParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowReplaceDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowUpdateDraftParams
import com.hubspot_sdk.api.services.blocking.cms.hubdb.rows.BatchService
import com.hubspot_sdk.api.services.blocking.cms.hubdb.rows.BatchServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RowServiceImpl internal constructor(private val clientOptions: ClientOptions) : RowService {

    private val withRawResponse: RowService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): RowService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RowService =
        RowServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun create(params: RowCreateParams, requestOptions: RequestOptions): HubDbTableRowV3 =
        // post /cms/v3/hubdb/tables/{tableIdOrName}/rows
        withRawResponse().create(params, requestOptions).parse()

    override fun list(params: RowListParams, requestOptions: RequestOptions): RowListPage =
        // get /cms/v3/hubdb/tables/{tableIdOrName}/rows
        withRawResponse().list(params, requestOptions).parse()

    override fun cloneDraft(
        params: RowCloneDraftParams,
        requestOptions: RequestOptions,
    ): HubDbTableRowV3 =
        // post /cms/v3/hubdb/tables/{tableIdOrName}/rows/{rowId}/draft/clone
        withRawResponse().cloneDraft(params, requestOptions).parse()

    override fun deleteDraft(params: RowDeleteDraftParams, requestOptions: RequestOptions) {
        // delete /cms/v3/hubdb/tables/{tableIdOrName}/rows/{rowId}/draft
        withRawResponse().deleteDraft(params, requestOptions)
    }

    override fun get(params: RowGetParams, requestOptions: RequestOptions): HubDbTableRowV3 =
        // get /cms/v3/hubdb/tables/{tableIdOrName}/rows/{rowId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getDraft(
        params: RowGetDraftParams,
        requestOptions: RequestOptions,
    ): HubDbTableRowV3 =
        // get /cms/v3/hubdb/tables/{tableIdOrName}/rows/{rowId}/draft
        withRawResponse().getDraft(params, requestOptions).parse()

    override fun listDraft(
        params: RowListDraftParams,
        requestOptions: RequestOptions,
    ): UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
        // get /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft
        withRawResponse().listDraft(params, requestOptions).parse()

    override fun replaceDraft(
        params: RowReplaceDraftParams,
        requestOptions: RequestOptions,
    ): HubDbTableRowV3 =
        // put /cms/v3/hubdb/tables/{tableIdOrName}/rows/{rowId}/draft
        withRawResponse().replaceDraft(params, requestOptions).parse()

    override fun updateDraft(
        params: RowUpdateDraftParams,
        requestOptions: RequestOptions,
    ): HubDbTableRowV3 =
        // patch /cms/v3/hubdb/tables/{tableIdOrName}/rows/{rowId}/draft
        withRawResponse().updateDraft(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RowService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RowService.WithRawResponse =
            RowServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

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
                    .addPathSegments("cms", "v3", "hubdb", "tables", params._pathParam(0), "rows")
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
        ): HttpResponseFor<RowListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tableIdOrName", params.tableIdOrName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "hubdb", "tables", params._pathParam(0), "rows")
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
                        RowListPage.builder()
                            .service(RowServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
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
                        "v3",
                        "hubdb",
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
                        "v3",
                        "hubdb",
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
                        "v3",
                        "hubdb",
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
                        "v3",
                        "hubdb",
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

        private val listDraftHandler:
            Handler<UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3> =
            jsonHandler<UnifiedCollectionResponseWithTotalBaseHubDbTableRowV3>(
                clientOptions.jsonMapper
            )

        override fun listDraft(
            params: RowListDraftParams,
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
                        "v3",
                        "hubdb",
                        "tables",
                        params._pathParam(0),
                        "rows",
                        "draft",
                    )
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
                        "v3",
                        "hubdb",
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
                        "v3",
                        "hubdb",
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
