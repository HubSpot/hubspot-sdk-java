// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.hubdb.rows

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
import com.hubspot_sdk.api.models.cms.hubdb.BatchResponseHubDbTableRowV3
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchCloneBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchCreateBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchGetBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchGetDraftBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchPurgeBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchReplaceBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchUpdateBatchParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BatchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BatchService {

    private val withRawResponse: BatchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchService =
        BatchServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun cloneBatch(
        params: BatchCloneBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseHubDbTableRowV3 =
        // post /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft/batch/clone
        withRawResponse().cloneBatch(params, requestOptions).parse()

    override fun createBatch(
        params: BatchCreateBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseHubDbTableRowV3 =
        // post /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft/batch/create
        withRawResponse().createBatch(params, requestOptions).parse()

    override fun getBatch(
        params: BatchGetBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseHubDbTableRowV3 =
        // post /cms/v3/hubdb/tables/{tableIdOrName}/rows/batch/read
        withRawResponse().getBatch(params, requestOptions).parse()

    override fun getDraftBatch(
        params: BatchGetDraftBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseHubDbTableRowV3 =
        // post /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft/batch/read
        withRawResponse().getDraftBatch(params, requestOptions).parse()

    override fun purgeBatch(params: BatchPurgeBatchParams, requestOptions: RequestOptions) {
        // post /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft/batch/purge
        withRawResponse().purgeBatch(params, requestOptions)
    }

    override fun replaceBatch(
        params: BatchReplaceBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseHubDbTableRowV3 =
        // post /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft/batch/replace
        withRawResponse().replaceBatch(params, requestOptions).parse()

    override fun updateBatch(
        params: BatchUpdateBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseHubDbTableRowV3 =
        // post /cms/v3/hubdb/tables/{tableIdOrName}/rows/draft/batch/update
        withRawResponse().updateBatch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchService.WithRawResponse =
            BatchServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val cloneBatchHandler: Handler<BatchResponseHubDbTableRowV3> =
            jsonHandler<BatchResponseHubDbTableRowV3>(clientOptions.jsonMapper)

        override fun cloneBatch(
            params: BatchCloneBatchParams,
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

        private val createBatchHandler: Handler<BatchResponseHubDbTableRowV3> =
            jsonHandler<BatchResponseHubDbTableRowV3>(clientOptions.jsonMapper)

        override fun createBatch(
            params: BatchCreateBatchParams,
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

        private val getBatchHandler: Handler<BatchResponseHubDbTableRowV3> =
            jsonHandler<BatchResponseHubDbTableRowV3>(clientOptions.jsonMapper)

        override fun getBatch(
            params: BatchGetBatchParams,
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

        private val getDraftBatchHandler: Handler<BatchResponseHubDbTableRowV3> =
            jsonHandler<BatchResponseHubDbTableRowV3>(clientOptions.jsonMapper)

        override fun getDraftBatch(
            params: BatchGetDraftBatchParams,
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
            params: BatchPurgeBatchParams,
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
            params: BatchReplaceBatchParams,
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

        private val updateBatchHandler: Handler<BatchResponseHubDbTableRowV3> =
            jsonHandler<BatchResponseHubDbTableRowV3>(clientOptions.jsonMapper)

        override fun updateBatch(
            params: BatchUpdateBatchParams,
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
    }
}
