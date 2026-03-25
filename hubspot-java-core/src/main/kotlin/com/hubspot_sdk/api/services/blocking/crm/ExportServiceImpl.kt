// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
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
import com.hubspot_sdk.api.models.TaskLocator
import com.hubspot_sdk.api.models.crm.exports.ActionResponseWithSingleResultUri
import com.hubspot_sdk.api.models.crm.exports.ExportCreateAsyncParams
import com.hubspot_sdk.api.models.crm.exports.ExportGetParams
import com.hubspot_sdk.api.models.crm.exports.ExportGetStatusParams
import com.hubspot_sdk.api.models.crm.exports.PublicExportResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExportService {

    private val withRawResponse: ExportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExportService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExportService =
        ExportServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createAsync(
        params: ExportCreateAsyncParams,
        requestOptions: RequestOptions,
    ): TaskLocator =
        // post /crm/exports/2026-03/export/async
        withRawResponse().createAsync(params, requestOptions).parse()

    override fun get(
        params: ExportGetParams,
        requestOptions: RequestOptions,
    ): PublicExportResponse =
        // get /crm/exports/2026-03/export/{exportId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getStatus(
        params: ExportGetStatusParams,
        requestOptions: RequestOptions,
    ): ActionResponseWithSingleResultUri =
        // get /crm/exports/2026-03/export/async/tasks/{taskId}/status
        withRawResponse().getStatus(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExportService.WithRawResponse =
            ExportServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createAsyncHandler: Handler<TaskLocator> =
            jsonHandler<TaskLocator>(clientOptions.jsonMapper)

        override fun createAsync(
            params: ExportCreateAsyncParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TaskLocator> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "exports", "2026-03", "export", "async")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createAsyncHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getHandler: Handler<PublicExportResponse> =
            jsonHandler<PublicExportResponse>(clientOptions.jsonMapper)

        override fun get(
            params: ExportGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicExportResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("exportId", params.exportId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("crm", "exports", "2026-03", "export", params._pathParam(0))
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

        private val getStatusHandler: Handler<ActionResponseWithSingleResultUri> =
            jsonHandler<ActionResponseWithSingleResultUri>(clientOptions.jsonMapper)

        override fun getStatus(
            params: ExportGetStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionResponseWithSingleResultUri> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taskId", params.taskId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "exports",
                        "2026-03",
                        "export",
                        "async",
                        "tasks",
                        params._pathParam(0),
                        "status",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
