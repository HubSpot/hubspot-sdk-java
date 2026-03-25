// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
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
import com.hubspot_sdk.api.models.cms.auditlogs.AuditLogExportParams
import com.hubspot_sdk.api.models.cms.auditlogs.AuditLogListPageAsync
import com.hubspot_sdk.api.models.cms.auditlogs.AuditLogListParams
import com.hubspot_sdk.api.models.cms.auditlogs.CollectionResponsePublicAuditLog
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AuditLogServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AuditLogServiceAsync {

    private val withRawResponse: AuditLogServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuditLogServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuditLogServiceAsync =
        AuditLogServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: AuditLogListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuditLogListPageAsync> =
        // get /cms/audit-logs/2026-03
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun export(
        params: AuditLogExportParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/audit-logs/2026-03/export
        withRawResponse().export(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuditLogServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuditLogServiceAsync.WithRawResponse =
            AuditLogServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponsePublicAuditLog> =
            jsonHandler<CollectionResponsePublicAuditLog>(clientOptions.jsonMapper)

        override fun list(
            params: AuditLogListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuditLogListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "audit-logs", "2026-03")
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
                                AuditLogListPageAsync.builder()
                                    .service(AuditLogServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val exportHandler: Handler<Void?> = emptyHandler()

        override fun export(
            params: AuditLogExportParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "audit-logs", "2026-03", "export")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { exportHandler.handle(it) }
                    }
                }
        }
    }
}
